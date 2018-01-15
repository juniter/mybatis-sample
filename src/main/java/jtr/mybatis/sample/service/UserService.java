package jtr.mybatis.sample.service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtr.mybatis.sample.domain.User;
import jtr.mybatis.sample.mapper.UserMapper;

@Service
public class UserService{ 
  private static final Logger logger = LoggerFactory.getLogger(UserService.class);

  @Autowired
  private UserMapper userMapper;

  public List<User> listAllUsers(){
    return this.userMapper.selectAllUser();
  }

  public void insertUsers() {
    Integer conut = userMapper.batchInsertUser(this.generateUsers());
    System.out.printf("-****************************-插入条数：%d \n",conut);
  }

  public void selectUser() {
    User user = new User();
    user.setUid(1).setName("zxf");
    Map<String,Object> map = new HashMap<>();
    System.out.println("所有值都是空时");
    this.userMapper.selectUser(map).forEach(u->{
      System.out.println(u.toString());
    });
    map.put("uid",null);
    map.put("u",user);
    System.out.println("只有名字参数时");
    this.userMapper.selectUser(map).forEach(u->{
      System.out.println(u.toString());
    });
    user.setPassport("ykl123");
    System.out.println("密码和名字参数时");
    this.userMapper.selectUser(map).forEach(u->{
      System.out.println(u.toString());
    });
    map.put("uid",1);
    System.out.println("UID参数时");
    this.userMapper.selectUser(map).forEach(u->{
      System.out.println(u.toString());
    });
  }

  private List<User> generateUsers(){
    List<User> users = new ArrayList<>(3);
    for (int i=0;i<=2;i++) {
      users.add(new User("pgg"+i,"pggpass"+i));
    }
    return users;
  }
}