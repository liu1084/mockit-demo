package com.example.demo.service.impl;

import com.example.demo.entity.Group;
import com.example.demo.service.GroupMapper;
import com.example.demo.service.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @project: demo-1
 * @packageName: com.example.demo.service.impl
 * @author: Administrator
 * @date: 2019/9/4 22:04
 * @description：TODO
 */

@Service
public class GroupServiceImpl implements IGroupService {

	@Autowired
	private GroupMapper groupMapper;

	@Override
	public Group findGroupById(Long id) {
		return groupMapper.findGroupById(id);
	}
}
