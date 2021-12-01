import java.util.Objects;

public class School {
    private String name;
    private int limit;

    private Student[] students;
    private int studentCount;

    public String toString() {
        String msg = "School Name: " + name + " Student Count: " + studentCount + "\n";
        for (int i=0; i< studentCount; i++) {
            msg += "\t" + students[i] + "\n";
        }
        return msg;
    }

    public School(String name, int limit) {
        this.name = name;
        this.limit = limit;
        this.studentCount = 0;
        this.students = new Student[limit];
    }

    public void addStudent(Student student) {
        students[studentCount] = student;
        studentCount += 1;
    }

    public void removeAllStudent() {
        studentCount = 0;
        return;
    }

    public Student findStudent(String studentName, int schoolYear) {
        Student target = new Student(studentName, schoolYear);
        for(int i=0; i<studentCount; i++) {
            Student student = students[i];
            if (target.equals(student))
                return student;
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int ret = 1;
        ret = ret + Objects.hashCode(name);
        ret = ret * 31 + Objects.hashCode(limit);
        return ret;
    }
}
