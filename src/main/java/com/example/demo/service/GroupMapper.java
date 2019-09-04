package com.example.demo.service;

import com.example.demo.entity.Group;
import org.springframework.stereotype.Repository;

/**
 * @project: demo-1
 * @packageName: com.example.demo.service
 * @author: Administrator
 * @date: 2019/9/4 21:56
 * @description：TODO
 */

@Repository
public interface GroupMapper {
	Group findGroupById(Long id);
}
