package io.lloyd.metagross.guava;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * Guava Lists Utility Test
 * 
 * @author LilyBlooper blooper@163.com
 * 
 */
public class ListsTest {

	@Test
	public void testPartition() throws Exception {
		List<String> strList = new ArrayList<String>();
		int total = 233;
		for (int i = 0; i < total; i++) {
			strList.add(i + "");
		}
		System.out.println("raw list size: " + strList.size());

		List<List<String>> subList = Lists.partition(strList, 100);
		for (List<String> list : subList) {
			System.out.println("each sublist size is :" + list.size());
		}
	}

}
