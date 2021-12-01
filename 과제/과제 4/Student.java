import java.util.Objects;

public class Student {
    private String name;
    private int year;

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d학년]", name, year);
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
        int ret = 0;
        ret = ret + Objects.hashCode(name);
        ret = ret + Objects.hashCode(year);
        return ret;
    }

}
