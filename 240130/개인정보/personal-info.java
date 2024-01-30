import java.util.Scanner;
import java.util.Arrays;

class Person {

    String name;
    int height;
    float weight;

    public Person(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
    class PersonHeight implements Comparable<PersonHeight> {

        String name;
        int height;
        float weight;

        public PersonHeight(String name, int height, float weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }
        @Override
        public int compareTo(PersonHeight personheight) {
            return personheight.height - this.height;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Person[] person = new Person[5];
            PersonHeight[] personHeight = new PersonHeight[5];

            for (int i=0; i<5; i++) {
                String name = sc.next();
                int h = sc.nextInt();
                float w = sc.nextFloat();
                person[i] = new Person(name, h, w);
                personHeight[i] = new PersonHeight(name,h,w);
            }
            // Arrays.sort(person);
            Arrays.sort(personHeight);

            System.out.println("name");
            for (int i=0; i<5; i++) {
                System.out.print(person[i].name + " ");
                System.out.print(person[i].height + " ");
                System.out.println(person[i].weight);
            }
            System.out.println();
            System.out.println("height");
            for (int i=0; i<5; i++) {
                System.out.print(person[i].name + " ");
                System.out.print(person[i].height + " ");
                System.out.println(person[i].weight);
            }
        }
    }