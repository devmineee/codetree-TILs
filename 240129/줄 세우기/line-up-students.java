import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student> {

    int height;

    int weight;

    int idx;

    public Student(int height, int weight, int idx) {
        this.height = height;
        this.weight = weight;
        this.idx = idx;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height == student.height) {
            
            if (this.weight == student.weight) {
                return this.idx - student.idx;
            }
            return student.weight - this.weight;
        }
        
        return student.height - this.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i=0; i<n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(h, w, i+1);
        }
        Arrays.sort(students);

        for (int i=0; i<n; i++) {
            System.out.print(students[i].height + " ");
            System.out.print(students[i].weight + " ");
            System.out.println(students[i].idx);
        }
    }
}