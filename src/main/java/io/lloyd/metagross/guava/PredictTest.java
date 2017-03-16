package io.lloyd.metagross.guava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

/**
 * Google Guava Predice And Collections2 Test
 * 
 * @author LilyBlooper blooper@163.com
 * 
 */
public class PredictTest {
	@Test
	public void testPredict() throws Exception {
		List<String> rawList = new ArrayList<String>();
		rawList.add("foo");
		rawList.add("bar");
		rawList.add("baz");
		rawList.add("matched");
		rawList.add("Lorem");
		rawList.add("islutn");

		Predicate<String> condition = new Predicate<String>() {
			public boolean apply(String input) {
				if ("matched".equals(input)) {
					return true;
				}
				return false;
			}
		};
		Collection<String> resCollections = Collections2.filter(rawList, condition);
		Iterator<String> iter = resCollections.iterator();
		while (iter.hasNext()) {
			String res = iter.next();
			System.out.println(res);
		}
	}
}
