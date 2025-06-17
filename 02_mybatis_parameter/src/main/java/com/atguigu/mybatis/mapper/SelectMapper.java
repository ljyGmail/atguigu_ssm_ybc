package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectMapper {

    /**
     * 若sql语句查询的结果为多条时，一定不能以实体类类型作为方法的返回值
     * 否则会抛出异常: TooManyResultsException
     * 若sql语句查询的结果为一条时，此时可以使用实体类类型或list集合类型作为方法的返回值
     */

    /**
     * 根据id查询用户信息
     *
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     *
     * @return
     */
    List<User> getAllUsers();

    /**
     * 查询用户的总数量
     *
     * @return
     */
    Integer getCount();
}
