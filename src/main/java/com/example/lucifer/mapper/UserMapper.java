package com.example.lucifer.mapper;

import com.example.lucifer.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * user的db层mapper
 *
 * @author Lucifer
 * @date 2019/01/25 10:58
 */
@Mapper
public interface UserMapper {

    /**
     * 根据用户名查询对应的用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    @Select("SELECT * FROM T_USER WHERE USER_NAME = #{username}")
    User query(@Param("username") String username);

}
