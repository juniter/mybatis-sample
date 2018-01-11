package jtr.mybatis.sample.mapper; 

import org.apache.ibatis.annotations.Mapper; 
import java.util.List; 
import jtr.mybatis.sample.domain.User; 

@Mapper
public interface UserMapper {
  List<User> selectAllUser();
  Integer batchInsertUser(List<User> users);
}