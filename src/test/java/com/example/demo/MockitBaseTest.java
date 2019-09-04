package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @project: demo-1
 * @packageName: com.example.demo
 * @author: Administrator
 * @date: 2019/9/4 20:53
 * @description：TODO
 */
public class MockitBaseTest {


	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}


	@Test
	public void test_with_mock_list () {
		//mock 一个list对象
		List<String> list = mock(ArrayList.class);
		// 设置get(0)的预期值
		when(list.get(0)).thenReturn("hello");
		// 调用get(0)
		String result = list.get(0);
		// 验证是否调用了get(0)
		verify(list, times(1)).get(0);

		// 使用junit的断言判断
		Assert.assertEquals("hello", result);

		// 对方法设定抛出异常
		when(list.get(1)).thenThrow(new RuntimeException("can not get index"));
		//list.get(1);
	}

	@Test
	public void test_with_mock_a_void_method() {
		//mock 一个list对象
		List<String> list = mock(ArrayList.class);
		// 设置: 第一次调用clear, donothing; 第二次调用clear, 抛出异常"void method"
		doNothing().doThrow(new RuntimeException("void method")).when(list).clear();
		list.clear();
		verify(list, times(1)).clear();
		list.clear();
		verify(list, times(1)).clear();
	}

	@Test
	public void test_with_mock_matcher_parameter () {
		//mock 一个list对象
		List<String> list = mock(ArrayList.class);

		when(list.get(anyInt())).thenReturn("hello", "world");
		String parameter1 = list.get(0);
		Assert.assertEquals("hello", parameter1);

		String parameter2 = list.get(1);
		verify(list, times(2)).get(anyInt());
		Assert.assertEquals("world", parameter2);
	}

}
