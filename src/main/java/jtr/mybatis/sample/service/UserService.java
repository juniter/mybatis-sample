package jtr.mybatis.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtr.mybatis.sample.domain.User;
import jtr.mybatis.sample.mapper.UserMapper;

@Service
public class UserService{ 
  private static final Logger logger = LoggerFactory.getLogger(UserService.class.getCanonicalName());

  @Autowired
  private UserMapper userMapper;

  public List<User> listAllUsers(){
    return this.userMapper.selectAllUser();
  }

  public void generateUsers(){
    Integer count = this.userMapper.batchInsertUser(this.autoGenerate());
    System.out.println("总计："+count);
    logger.info("总计：{} 条",count);
  }

  private List<User> autoGenerate(){
    List<User> users = new ArrayList<>();

    for(int i =0;i<=10000;i++){
      users.add(new User(this.generateName(),this.generateName()));
    }
    return users;
  }

  private String generateName(){
    int randomNumber = Integer.parseInt(Double.toString(Math.random()*52+65));
    StringBuffer sb = new StringBuffer((char)randomNumber);
    sb.append(Math.random()*10000);
    return sb.toString();
  }
}