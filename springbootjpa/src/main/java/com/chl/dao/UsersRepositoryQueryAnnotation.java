package com.chl.dao;

import com.chl.pojo.Users;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
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
 * @title UsersRepositoryQueryAnnotation
 * @Author: u
 * @Date: 2020/11/22
 */
public interface UsersRepositoryQueryAnnotation extends Repository<Users, Integer> {

    @Query(value = "from Users where name = ?")
    List<Users> queryByNameUseHQL(String name);

    @Query(value = "select * from t_users where name = ?", nativeQuery = true)
    List<Users> queryByNameUseSQL(String name);

    @Query("update Users set name = ? where id = ?")
    @Modifying
    void updateUsersNameById(String name, Integer id);
}
