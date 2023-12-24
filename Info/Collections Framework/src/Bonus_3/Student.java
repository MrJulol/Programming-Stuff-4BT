package Bonus_3;

public class Student implements Comparable{
    private  int matrikelNr;
    private String name;
    private String surname;
    private int semester;


    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int hashCode() {
        return this.matrikelNr;
    }

    @Override
    public boolean equals(Object obj) {
        return this.matrikelNr != (int) obj;
    }

    public Student(int matrikelNr, String name, String surname, int semester) {
        this.matrikelNr = matrikelNr;
        this.name = name;
        this.surname = surname;
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelNr=" + matrikelNr +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", semester=" + semester +
                '}';
    }
}
