package cn.ekgc.dms.util;
/**
 * 常亮工具类
 * @author User
 * @since 2019-5-2
 */

import java.io.IOException;
import java.util.Properties;

public class ConstantUtil {
	private static Properties properties = new Properties();
	static {
		//加载dms.properties文件
		try {
			properties.load(ConstantUtil.class.getClassLoader().getResourceAsStream("dms.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static final Long PAGE_NUM = Long.parseLong(properties.getProperty("page.num"));
	
	public static final Long PAGE_SIZE = Long.parseLong(properties.getProperty("page.size"));
}
