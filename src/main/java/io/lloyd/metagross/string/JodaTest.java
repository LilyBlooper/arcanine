package io.lloyd.metagross.string;

import io.lloyd.metagross.util.JodaUtils;

import java.util.Date;

public class JodaTest {
	public static void main(String[] args) {
		System.out.println(JodaUtils.calcDays(1 , new Date() , JodaUtils.BASE_FORMAT));
	}
}
