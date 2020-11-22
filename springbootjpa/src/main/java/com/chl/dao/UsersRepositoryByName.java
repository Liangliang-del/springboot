package com.chl.dao;

import com.chl.pojo.Users;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * 功能描述：
 * 修改记录:
 * <pre>
 * 修改时间：
 * 修改人：
 * 修改内容：
 * </pre>
 *
 * @title UsersRepositoryByName
 * @Author: u
 * @Date: 2020/11/22
 */

/**
 * Repository接口的方法名称命名查询
 *
 *
 */
public interface UsersRepositoryByName extends Repository<Users, Integer> {

    //方法的名称必须要遵循驼峰式命名规则。findBy(关键字)+属性名称(首字母要大写)+查询条件(首字母大写)
    List<Users> findByName(String name);

    List<Users> findByNameAndAge(String name, Integer age);
}
