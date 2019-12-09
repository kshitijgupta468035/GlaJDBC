package practice4;

public class Student {
    String name;
    int age ;
    double percentage;

    public Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    public String checker() {
        if (age > 20 ) {
            return name;
        } else {
            return null;
        }
    }


}
