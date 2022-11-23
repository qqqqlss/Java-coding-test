import java.util.Scanner; //입력에 필요

class Person {
    static String job = "개발자"; 
}

public class test {
    public static void main(String[] args) {
        
        System.out.println(Person.job);

        

        Person person1 = new Person();
        Person.job = "마케터";
        Person person2 = new Person();
        System.out.println(person1.job);
        System.out.println(person2.job);
    }
}
