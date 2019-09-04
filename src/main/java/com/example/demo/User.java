package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @project: demo-1
 * @packageName: com.example.demo
 * @author: Administrator
 * @date: 2019/9/4 20:45
 * @description：TODO
 */

@Component
@Data
public class User {
	private String id;
	private int age;
}
