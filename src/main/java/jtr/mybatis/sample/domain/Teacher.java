package jtr.mybatis.sample.domain;

import java.util.List;

public class Teacher {
    private Integer id;
    private String name;
    private List<Student> students;

    public Integer getId() {
        return id;
    }

    public Teacher setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher setStudents(List<Student> students) {
        this.students = students;
        return this;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
