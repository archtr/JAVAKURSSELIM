package Gun29._01_Constructor;

public class Student {

    int id;
    String name;
    String surname;
    int classroom;

    // yapıcı metod : constructor
    public Student(){
        this(0,"","",0);
        // System.out.println("nesne oluşturuldu");
    }
    public Student(int id , String name , String surname , int classroom){
        this.id=id; // değişkenlerin karışmaması için , buradaki manasında
        this.name=name; // başlarına this eklendi
        this.surname=surname;
        this.classroom=classroom;
    }
    public Student(int id1 , String name1 , String surname1 ){
        this (id1,name1,surname1,0); // this : classın içindeyken classdan
                                               // bahsettiğimizde kuşşanılır
    }
    public Student(int id1 , String name1 ){
        this (id1,name1,"",0);
    }
    public Student(int id1  ){
        this (id1,"","",0);
        // id=id1;
        // name="";
        // surname="";
        // classroom=0;
    }
}
