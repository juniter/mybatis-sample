package jtr.mybatis.sample.service;

import jtr.mybatis.sample.domain.Student;
import jtr.mybatis.sample.domain.Teacher;
import jtr.mybatis.sample.mapper.TeacherMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);

    @Autowired
    private TeacherMapper teacherMapper;

    public void selectStudentById(){
        int id = 1;
        Student student = this.teacherMapper.selectStudent(id);
        logger.info("学生信息:{}",student.toString());
    }

    public void selectTeacherById(){
        int id = 1;
        Teacher student = this.teacherMapper.selectTeacher(id);
        logger.info("教师信息:{}",student.toString());
    }
}
