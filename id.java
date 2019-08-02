package com.cat.demo;

public class id {
    private Long id;
    private String StudentName;

    public id(String StudentName) {
        this.StudentName = StudentName;
    }

    private id() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id=" + id +
                ", StudentName='" + StudentName + '\'' +
                '}';
    }
}
