package com.heal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author by jiaxu
 * @Classname BootActionApp
 * @Date 2023/3/30 19:34
 */
@MapperScan("com.heal.mapper")
@SpringBootApplication
public class BootActionApp {
	public static void main(String[] args) {
		SpringApplication.run(BootActionApp.class, args);
	}
}