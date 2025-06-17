package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据id查询用户信息为map集合
     *
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为map
     * 若查询的数据有多条时，并且要将每条数据转换为map集合
     * 此时有两种解决方案:
     * 1. 将mapper接口方法的返回值设置为泛型是map的list集合
     * List<Map<String. Object>> getAllUsersToMap();
     * 结果:
     * [{password=123456, gender=男, id=1, age=23, email=123@qq.com, username=admin}
     * {password=654321, gender=女, id=2, age=44, email=ybc@atgugu.com, username=root}
     * {password=445566, id=3, username=ljy}]
     * 2. 将每条数据转换的map集合放在一个大的map集合中，但是必须通过@MapKey注解
     * 将查询的某个字段的值作为大的map集合的键
     * \@MapKey("id")
     * Map<String, Object> getAllUsersToMap(); @return
     * 结果: {
     * 1={password=123456, gender=男, id=1, age=23, email=123@qq.com, username=admin},
     * 2={password=654321, gender=女, id=2, age=44, email=ybc@atgugu.com, username=root},
     * 3={password=445566, id=3, username=ljy}}
     */
    // List<Map<String, Object>> getAllUsersToMap();
    // 将id列作为map集合的key
    @MapKey("id")
    Map<String, Object> getAllUsersToMap();
}
