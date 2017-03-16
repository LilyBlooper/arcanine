package io.lloyd.metagross.plain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertyLoadTest {
	/**
	 * 3.Properties 读取例子
	 */
	static {
		Properties props = new Properties();
		File file = new File(Thread.currentThread().getContextClassLoader()
				.getResource("transcodeFile.properties").getPath());
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			props.load(fis);
			Enumeration enums = props.propertyNames();
			while (enums.hasMoreElements()) {
				String key = (String) enums.nextElement();
				String value = props.getProperty(key);
				// transCodeMap.put(key, value);
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
}
