package com.heal.domain;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 *
 * @author by jiaxu
 * @Classname User
 * @Date 2023/3/30 19:32
 */
@Table(name="user")
public class User implements Serializable {

	private Long id;

	/**
	 * 项目整合好通用mapper后，dao接口自动新增的增删改查方法就使用了 jpa的@Column注解，
	 * 你在不使用 mybatis.configuration.map-underscore-to-camel-case=true 配置的情况下，
	 * 你实体类中的 @Column（name="nick_name"） 注解修饰了一个字段 nickName，此时，你将 nick_name 改成 nick_name_aa，
	 * 然后你启动项目调用 mapper提供给dao接口的 getAll（）方法，此时肯定会报错。
	 * 原理是 通用mapper需要根据你实体类中的注解信息生成执行的sql语句。之所以手写sql没起作用，是因为手写时，走的纯mybatis，
	 * 没有经过通用mapper，固然实体类中的jpa注解就没用了。
	 * 你使用 mybatis.configuration.map-underscore-to-camel-case=true 配置则是 mybatis的配置，固然能起作用。
	 */
	@Column(name = "department_id")
	private int departmentId;

	private String username;

	private String mobile;

	public Long getId() {
		return id;
	}

	public User setId(Long id) {
		this.id = id;
		return this;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public User setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
		return this;
	}

	public String getUsername() {
		return username;
	}

	public User setUsername(String username) {
		this.username = username;
		return this;
	}

	public String getMobile() {
		return mobile;
	}

	public User setMobile(String mobile) {
		this.mobile = mobile;
		return this;
	}
}