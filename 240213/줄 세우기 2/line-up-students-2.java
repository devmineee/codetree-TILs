import java.util.*;

class Student implements Comparable<Student> {
    int idx;
    float h;
    float w;
    

    public Student(int idx, float h, float w) {
        this.h = h;
        this.w = w;
        this.idx = idx;
    }

    @Override
    public int compareTo(Student student) {
        if (this.h == student.h) {
            return (int) (student.w - this.w);
        }

        return (int) (this.h-student.h);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] students = new Student[N];
        for (int i=0; i<N; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            students[i] = new Student(i+1, h,w);
        }
        Arrays.sort(students);

        for (int i=0; i<N; i++) {
            System.out.print((int)(students[i].h) + " ");
            System.out.print((int)(students[i].w) + " ");
            System.out.println(students[i].idx);
        }

    }
}