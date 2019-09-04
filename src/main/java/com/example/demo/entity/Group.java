package com.example.demo.entity;

import lombok.Data;

/**
 * @project: demo-1
 * @packageName: com.example.demo.entity
 * @author: Administrator
 * @date: 2019/9/4 22:01
 * @description：TODO
 */

@Data
public class Group {
	private long id;
	private String name;

	public Group(long id, String name) {
		this.id = id;
		this.name = name;
	}
}
