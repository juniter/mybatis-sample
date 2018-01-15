package jtr.mybatis.sample;

import java.util.List;

import jtr.mybatis.sample.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jtr.mybatis.sample.domain.User;
import jtr.mybatis.sample.service.UserService;

@SpringBootApplication
public class MybatisSampleApplication implements CommandLineRunner{
    @Autowired
    private UserService userService;
    @Autowired
    private TeacherService teacherService;

    public static void main(String[] args ) {
        SpringApplication.run(MybatisSampleApplication.class, args); 
    }

    @Override
    public void run(String... args) throws Exception {
        // this.testInit();
        this.testJoin();
    }

    void testInit() throws Exception{
        List<User> users = this.userService.listAllUsers();
        users.forEach(user -> System.out.println("User :"+user.toString()));

        Thread.sleep(10000);
        this.userService.insertUsers();
        this.userService.selectUser();
    }

    void testJoin() throws Exception {
        this.teacherService.selectStudentById();
    }
}
