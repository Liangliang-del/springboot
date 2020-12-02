package com.chl.test;

import com.chl.Application;
import com.chl.dao.UsersRepository;
import com.chl.dao.UsersRepositoryByName;
import com.chl.dao.UsersRepositoryQueryAnnotation;
import com.chl.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
 * @title UsersRepositoryTest
 * @Author: u
 * @Date: 2020/11/22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UsersRepositoryTest {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersRepositoryByName usersRepositoryByName;

    @Autowired
    private UsersRepositoryQueryAnnotation usersRepositoryQueryAnnotation;

    @Test
    public void testSave(){
        Users users = new Users();
        users.setName("SpringBootJpa");
        users.setAge(1);
        users.setAddress("BeiJin");
        this.usersRepository.save(users);
    }

    @Test
    public void testFindByName(){
        List<Users> list = this.usersRepositoryByName.findByName("SpringBootJpa");
        System.out.println(list.get(0));
    }

    @Test
    public void testFindByNameAndAge(){
        List<Users> list = this.usersRepositoryByName.findByNameAndAge("SpringBootJpa", 1);
        for ( Users users : list ){
            System.out.println(users);
        }
    }

    @Test
    public void testQueryByName(){
        List<Users> list = this.usersRepositoryQueryAnnotation.queryByNameUseHQL("SpringBootJpa");
        for ( Users users : list ){
            System.out.println(users);
        }
    }

    @Test
    public void testQueryByName2(){
        List<Users> list = this.usersRepositoryQueryAnnotation.queryByNameUseSQL("SpringBootJpa");
        for ( Users users : list ){
            System.out.println(users);
        }
    }

    @Test
    @Transactional
    @Rollback(false)
    public void testUpdateNameById(){
        this.usersRepositoryQueryAnnotation.updateUsersNameById("Shanxuetan", 1);
    }

    @Test
    public void testDateFormat() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date time = format.parse("2020-12-02 10:19:12.2222222");
        System.out.println(time);
    }
}
