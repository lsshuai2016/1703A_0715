package com.liushaoshuai.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AssertUtilTest {

	@Test
	public void testIsTrue() {
		int a = 1;
		int b = 2;
		AssertUtil.isTrue(3<2, "结果不对");
	}

	@Test
	public void testIsFalse() {
		int a = 1;
		int b = 2;
		AssertUtil.isFalse(4>2, "结果正确");
	}

	@Test
	public void testNotNull() {
		AssertUtil.notNull(null, "对象为空");
	}

	@Test
	public void testIsNull() {
		AssertUtil.isNull(2, "对象有值");
	}

	@Test
	public void testNotEmptyCollectionOfQString() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		AssertUtil.notEmpty(list, "集合为空");
	}

	@Test
	public void testNotEmptyMapOfQQString() {
		Map<String,Object> map = new HashMap<>();
		map.put("1", 1);
		AssertUtil.notEmpty(map, "map集合为空");
	}

	@Test
	public void testHasText() {
		String str1 = "";
		String str2 = " ";
		String str3 = " 1";
//		AssertUtil.hasText(str1, "字符串没有值");
//		AssertUtil.hasText(str2, "字符串没有值");
		AssertUtil.hasText(str3, "字符串没有值");
	}

	@Test
	public void testGreaterThanZero() {
		int a = 1;
		double b = 1.2;
		AssertUtil.greaterThanZero(BigDecimal.valueOf(b), "值必须大于0");
//		AssertUtil.greaterThanZero(BigDecimal.valueOf((double)a), "值必须大于0");
	}

}
