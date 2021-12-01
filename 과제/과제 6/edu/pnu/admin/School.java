package edu.pnu.admin;

import edu.pnu.collection.GenericList;

public class School {
    private final String name;
    private int size;
    private int count;
    private GenericList<Student> students = new GenericList<Student>();

    public School(String schoolName, int size) {
        this.name = schoolName;
        this.size = size;
    }

    public void addStudent(Student student) {
        students.add(student);
        count++;
        return;
    }

    public void removeAllStudent() {
        students.removeAll();
        count = 0;
        return;
    }

    public Student findStudent(String name, int year) {
        Student target = new Student(name, year);
        return students.findStudent(target);
    }

    @Override
    public String toString() {
        String ret = String.format("School Name: %s Student Count: %d", name, count);
        return ret + students.toString();
    }
}
