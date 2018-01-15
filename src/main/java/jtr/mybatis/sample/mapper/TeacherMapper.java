package jtr.mybatis.sample.mapper;

import jtr.mybatis.sample.domain.Student;
import jtr.mybatis.sample.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    Student selectStudent(int id);
    Teacher selectTeacher(int id);
}
