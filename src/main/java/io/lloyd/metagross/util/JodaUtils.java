package io.lloyd.metagross.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;

/**
 * 利用joda-time，提供常见日期相关方法
 * 
 * @author LilyBlooper blooper@163.com
 * 
 */
public class JodaUtils {

	/**
	 * 默认时区为东8区中华人民共和国
	 */
	private static DateTimeZone PRC = DateTimeZone.forID("PRC");

	public static String BASE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static String BASE_FORMAT_Y = "yyyy";
	public static String BASE_FORMAT_YM = "yyyy-MM";
	public static String BASE_FORMAT_YMD = "yyyy-MM-dd";
	public static String BASE_FORMAT_YMDH = "yyyy-MM-dd HH";
	public static String BASE_FORMAT_YMDHM = "yyyy-MM-dd HH:mm";

	/*-------------------------------------------
	|             时间差                                                                                  |
	============================================*/

	/**
	 * 获取指定日期间的天数差
	 * 
	 * @param start
	 *            joda时间
	 * @param end
	 *            joda时间
	 * @return
	 */
	public static int daysBetween(DateTime start, DateTime end) {
		return Days.daysBetween(start.toLocalDate(), end.toLocalDate()).getDays();
	}

	/**
	 * 获取指定日期间的天数差
	 * 
	 * @param start
	 *            jdk的时间
	 * @param end
	 *            jdk的时间
	 * @return
	 */
	public static int daysBetween(Date start, Date end) {
		DateTime startD = new DateTime(start, PRC);
		DateTime endD = new DateTime(end, PRC);
		return Days.daysBetween(startD.toLocalDate(), endD.toLocalDate()).getDays();
	}

	/*-------------------------------------------
	|             获取时间                                                                              |
	============================================*/

	private static String format(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	/**
	 * 获取与基准日期相隔指定天数的日期，格式可以指定
	 * 
	 * @param days
	 *            天间隔
	 * @param base
	 *            基准日期
	 * @param datePattern
	 * @return
	 */
	public static String calcDays(int days, Date base, String datePattern) {
		DateTime baseDate = new DateTime(base, PRC);
		Date targetDate = null;
		if (days == 0) {
			targetDate = baseDate.toDate();
		} else if (days > 0) {
			targetDate = baseDate.plusDays(days).toDate();
		} else {
			days = Math.abs(days);
			targetDate = baseDate.minusDays(days).toDate();
		}
		return format(targetDate, datePattern);
	}

	/**
	 * 获取与基准日期相隔指定天数的日期，格式可以指定
	 * 
	 * @param months
	 *            月间隔
	 * @param base
	 *            基准日期
	 * @param datePattern
	 * @return
	 */
	public static String calcMonths(int months, Date base, String datePattern) {
		DateTime baseDate = new DateTime(base, PRC);
		Date targetDate = null;
		if (months == 0) {
			targetDate = baseDate.toDate();
		} else if (months > 0) {
			targetDate = baseDate.plusMonths(months).toDate();
		} else {
			months = Math.abs(months);
			targetDate = baseDate.minusMonths(months).toDate();
		}
		return format(targetDate, datePattern);
	}

	/**
	 * 获取与基准日期相隔指定天数的日期，格式可以指定
	 * 
	 * @param years
	 *            年间隔
	 * @param base
	 *            基准日期
	 * @param datePattern
	 * @return
	 */
	public static String calcYears(int years, Date base, String datePattern) {
		DateTime baseDate = new DateTime(base, PRC);
		Date targetDate = null;
		if (years == 0) {
			targetDate = baseDate.toDate();
		} else if (years > 0) {
			targetDate = baseDate.plusYears(years).toDate();
		} else {
			years = Math.abs(years);
			targetDate = baseDate.minusYears(years).toDate();
		}
		return format(targetDate, datePattern);
	}

	/**
	 * 获取与基准日期相隔指定天数的日期，格式可以指定
	 * 
	 * @param weeks
	 *            周间隔
	 * @param base
	 *            基准日期
	 * @param datePattern
	 * @return
	 */
	public static String calcWeeks(int weeks, Date base, String datePattern) {
		DateTime baseDate = new DateTime(base, PRC);
		Date targetDate = null;
		if (weeks == 0) {
			targetDate = baseDate.toDate();
		} else if (weeks > 0) {
			targetDate = baseDate.plusWeeks(weeks).toDate();
		} else {
			weeks = Math.abs(weeks);
			targetDate = baseDate.minusWeeks(weeks).toDate();
		}
		return format(targetDate, datePattern);
	}

	/**
	 * 获取与基准日期相隔指定天数的日期，格式可以指定
	 * 
	 * @param secs
	 *            秒间隔
	 * @param base
	 *            基准日期
	 * @param datePattern
	 * @return
	 */
	public static String calcSeconds(int secs, Date base, String datePattern) {
		DateTime baseDate = new DateTime(base, PRC);
		Date targetDate = null;
		if (secs == 0) {
			targetDate = baseDate.toDate();
		} else if (secs > 0) {
			targetDate = baseDate.plusSeconds(secs).toDate();
		} else {
			secs = Math.abs(secs);
			targetDate = baseDate.minusSeconds(secs).toDate();
		}
		return format(targetDate, datePattern);
	}

	/**
	 * 获取与基准日期相隔指定天数的日期，格式可以指定
	 * 
	 * @param hours
	 *            小时间隔
	 * @param base
	 *            基准日期
	 * @param datePattern
	 * @return
	 */
	public static String calcHours(int hours, Date base, String datePattern) {
		DateTime baseDate = new DateTime(base, PRC);
		Date targetDate = null;
		if (hours == 0) {
			targetDate = baseDate.toDate();
		} else if (hours > 0) {
			targetDate = baseDate.plusHours(hours).toDate();
		} else {
			hours = Math.abs(hours);
			targetDate = baseDate.minusHours(hours).toDate();
		}
		return format(targetDate, datePattern);
	}

	/**
	 * 获取与基准日期相隔指定天数的日期，格式可以指定
	 * 
	 * @param minutes
	 *            分间隔
	 * @param base
	 *            基准日期
	 * @param datePattern
	 * @return
	 */
	public static String calcMinutes(int minutes, Date base, String datePattern) {
		DateTime baseDate = new DateTime(base, PRC);
		Date targetDate = null;
		if (minutes == 0) {
			targetDate = baseDate.toDate();
		} else if (minutes > 0) {
			targetDate = baseDate.plusMinutes(minutes).toDate();
		} else {
			minutes = Math.abs(minutes);
			targetDate = baseDate.minusMinutes(minutes).toDate();
		}
		return format(targetDate, datePattern);
	}

	public static String calcDays(int days) {
		return calcDays(days, new Date(), BASE_FORMAT_YMD);
	}

	public static String calcYears(int years) {
		return calcYears(years, new Date(), BASE_FORMAT_Y);
	}

	public static String calcMonths(int months) {
		return calcMonths(months, new Date(), BASE_FORMAT_YM);
	}

	public static String calcMinutes(int minutes) {
		return calcMinutes(minutes, new Date(), BASE_FORMAT_YMDHM);
	}

	public static String calcHours(int hours) {
		return calcHours(hours, new Date(), BASE_FORMAT_YMDH);
	}

	public static String calcSeconds(int secs) {
		return calcSeconds(secs, new Date(), BASE_FORMAT);
	}

	public static String calcWeeks(int weeks) {
		return calcWeeks(weeks, new Date(), BASE_FORMAT_YMD);
	}

	/*-------------------------------------------
	|             Main                           |
	============================================*/

	/**
	 * 获取上个月的日期，格式可以指定，例如：2016-09或者是201609等
	 */

	public static void main(String[] args) {
		System.out.println(daysBetween(new Date(), new Date()));
		System.out.println(calcDays(2, new Date(), JodaUtils.BASE_FORMAT));
		System.out.println(calcDays(-5, new Date(), JodaUtils.BASE_FORMAT));
		System.out.println(calcYears(1, new Date(), JodaUtils.BASE_FORMAT));
		System.out.println(calcWeeks(-3, new Date(), JodaUtils.BASE_FORMAT));
		System.out.println(calcMonths(-1, new Date(), JodaUtils.BASE_FORMAT));
		System.out.println(calcMonths(-1));
		System.out.println(calcWeeks(-2));
		System.out.println(calcMonths(-1, new Date(), JodaUtils.BASE_FORMAT));

	}
}
