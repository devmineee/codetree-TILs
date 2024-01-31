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
            

            int cnt = 4;
            while (cnt != 0) {
                cnt = 0;
                for(int i = 1; i < 5; i++) {
                    if(person[i-1].name.compareTo(person[i].name) > 0) {
                        Person temp = person[i-1];
                        person[i-1] = person[i];
                        person[i] = temp;
                        cnt ++;
                    }
                }
            }
            

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
                System.out.print(personHeight[i].name + " ");
                System.out.print(personHeight[i].height + " ");
                System.out.println(personHeight[i].weight);
            }
        }
    }