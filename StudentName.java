package com.cat.demo;

public class StudentName {
    private Long id;
    private String Unitname;

    public StudentName(Long id, String unitname) {
        this.id = id;
        Unitname = unitname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitname() {
        return Unitname;
    }

    public void setUnitname(String unitname) {
        Unitname = unitname;
    }

    @Override
    public String toString() {
        return "StudentName{" +
                "id=" + id +

    }
}
