package pl.bobinicz;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.weight = builder.weight;
        this.height = builder.height;
    }

    public static class Builder {
        private String name;
        private int age;
        private double height;
        private double weight;

        public Builder() {
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder height(double height){
            this.height = height;
            return this;
        }

        public Builder weight(double weight){
            this.weight = weight;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }
    @Override
    public String toString() {
        return "Person [name: " + name + ", age: " + age + ", height: " + height + ", weight: " + weight + "]";
    }
}


