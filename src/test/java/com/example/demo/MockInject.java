package com.example.demo;

import com.example.demo.entity.Group;
import com.example.demo.service.GroupMapper;
import com.example.demo.service.IGroupService;
import com.example.demo.service.impl.GroupServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

/**
 * @project: demo-1
 * @packageName: com.example.demo
 * @author: Administrator
 * @date: 2019/9/4 21:54
 * @description：https://www.cnblogs.com/csonezp/p/7868127.html
 */
public class MockInject {

	@InjectMocks
	private IGroupService userService = new GroupServiceImpl();

	@Mock
	private GroupMapper userMapper;

	@Before
	public void init () {
		MockitoAnnotations.initMocks(this);
		when(userMapper.findGroupById(1L)).thenReturn(new Group(1L, "liujun"));
	}

	@Test
	public void testFindGroupById() {
		Group group = userService.findGroupById(1L);
		Assert.assertEquals("liujun", group.getName());
		Assert.assertEquals(1L, group.getId());
	}
}
