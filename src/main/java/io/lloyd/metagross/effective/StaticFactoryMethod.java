package io.lloyd.metagross.effective;

/**
 * Effective Java Chp2 Item1
 * 
 * @author LilyBlooper blooper@163.com
 * 
 */
public class StaticFactoryMethod {
	public static StaticFactoryMethod newInstance() {
		return new StaticFactoryMethod();
	}
}
