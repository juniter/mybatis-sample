package jtr.mybatis.sample.domain;

public class Student {
    private Integer id;
    private String name;
    private Integer teacherId;
    private Teacher teacher;

    public Integer getId() {
        return id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public Student setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
        return this;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherId=" + teacherId +
                '}'+"Teacher{" +
                "id=" + this.teacher.getId() +
                ", name='" + this.teacher.getName() + '\'' +
                ", students=" + this.teacher.getStudents() +
                '}';
    }
}
