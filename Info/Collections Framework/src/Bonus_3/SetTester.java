package Bonus_3;

import java.util.*;

public class SetTester {
    public static void main(String[] args) {

        RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
        Random random = new Random();
        Set<Student> mengeUnsortiert = new HashSet<>();
        Set<Student> mengeSortiert = new TreeSet<>(Collections.reverseOrder());

        addStudentsSorted(mengeSortiert);
        System.out.println(mengeSortiert);

        printStudents(mengeSortiert);

    }

    private static void printStudents(Set<Student> set) {
        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static void addStudents(Set<Student> set) {
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
        for(int i = 0; i<100; i++){
            set.add(new Student(i, String.valueOf(i),String.valueOf(i),i));
        }
    }
    private static void addStudentsSorted(Set<Student> set) {
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            System.out.println("HERE");
            Student student = new Student(
                    giveMatNr(set),
                    randomStringGenerator.generateRandomString(10),
                    randomStringGenerator.generateRandomString(6),
                    random.nextInt(1, 2));
            set.add(student);
        }
    }

    private static int giveMatNr(Set<Student> set) {
        System.out.println("THERE");
        Random random = new Random();
        int randomNr = random.nextInt(Integer.MAX_VALUE);

        for(Student student : set ) {
            if (student.hashCode() == randomNr) giveMatNr(set);
        }
        return randomNr;
    }
}
