package pl.bobinicz;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person.Builder()
                .name("Barney")
                .age(28)
                .height(1.76)
                .weight(74.2)
                .build();
        System.out.println(person1);

        Person person2 = new Person.Builder().name("Marshall").age(32).height(1.88).weight(94).build();
        System.out.println(person2);
    }
}
