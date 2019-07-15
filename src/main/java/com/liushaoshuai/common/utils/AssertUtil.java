package com.liushaoshuai.common.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/**
 * @ClassName: AssertUtil 
 * @Description: 断言工具类
 * @author:鄙人：刘某 
 * @date: 2019年7月15日 上午8:49:01
 */
public class AssertUtil {
	
	/**
	 * @Title: isTrue 
	 * @Description: 方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 * @return: void
	 */
	public static void isTrue(boolean condition, String message){
		if(!condition) {
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * @Title: isFalse 
	 * @Description: 方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 * @return: void
	 */
	public static void isFalse(boolean condition, String message){
		if(condition) {
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * 
	 * @Title: notNull 
	 * @Description: 方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void notNull(Object obj, String message){
		if(obj==null) {
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * @Title: isNull 
	 * @Description: 方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNull(Object obj, String message){
		if(obj!=null) {
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * @Title: notEmpty 
	 * @Description: 方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param coll
	 * @param message
	 * @return: void
	 */
	public static void notEmpty(Collection<?> coll, String message){
		if(coll==null || coll.size()==0) {
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * @Title: notEmpty 
	 * @Description: 方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param map
	 * @param message
	 * @return: void
	 */
	public static void notEmpty(Map<?,?> map, String message){
		if(map==null || map.size()==0) {
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * @Title: hasText 
	 * @Description: 方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 * @return: void
	 */
	public static void hasText(String condition, String message){
		if(condition==null || condition.trim().length()==0) {
			throw new CMSRuntimeException(message);
		}
	}
	
	/**
	 * @Title: greaterThanZero 
	 * @Description: 方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param value
	 * @param message
	 * @return: void
	 */
	public static void greaterThanZero(BigDecimal value, String message){
		if(value.intValue()<=0) {
			throw new CMSRuntimeException(message);
		}
	}
	
	
	
}
