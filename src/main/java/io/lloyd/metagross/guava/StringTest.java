package io.lloyd.metagross.guava;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.CaseFormat;

public class StringTest {

	@Test
	public void testCaseFormat() throws Exception {
		/**
		 * 1.Convert Underscore String (Database Column Metadata) to Lower Camel
		 * using Google Guava
		 */
		String actual = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "column_name");
		String expected = "columnName";
		Assert.assertEquals(expected, actual);
	}
}
