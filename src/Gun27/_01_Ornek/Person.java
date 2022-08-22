package Gun27._01_Ornek;

import java.util.Locale;

public class Person {

    // properties
    String name;
    String surName;
    int age;

    // class method 3. yöntem

    public void BilgiYazdir(){
        System.out.println("name = " +name);
        System.out.println("surname = " +surName);
        System.out.println("age = " +age);
    }
    public void getBirthYear(){
        System.out.println("Doğum yılı = " +(2022-age));
    }
    public void getInitials (){
        System.out.println("Kişinin Baş Harfleri = " +(name.toUpperCase().charAt(0)+". "+surName.toUpperCase().charAt(0)+". "));
    }
}
