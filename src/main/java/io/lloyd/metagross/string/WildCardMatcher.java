package io.lloyd.metagross.string;

public class WildCardMatcher {
	public void test1(){
		String key = "MAP_20170118_88888";
		String exp = "20170118";
		System.out.println(key.contains(exp));
		System.out.println(key.matches("\\"+exp+""));
		
	}
	
	
	
	public static void main(String[] args) {
		// wildcard matcher
		
		
		
		
	}
}
