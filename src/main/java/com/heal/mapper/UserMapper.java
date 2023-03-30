package com.heal.mapper;

import com.heal.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author by jiaxu
 * @Classname UserMapper
 * @Date 2023/3/30 19:39
 */
@Mapper
public interface UserMapper {

	@Select("select * from user where id=#{id}")
	User findUserById(int id);
}