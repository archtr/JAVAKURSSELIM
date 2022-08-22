package Gun29._02_Constructor;

public class BookClass {
    String name;
    int publishYear;
    String author;

    public BookClass(String name,int publishYear,String author){
        this.name=name;
        this.publishYear=publishYear;
        this.author=author;
    }
    public BookClass(String name1,int publishYear1){
        this(name1,publishYear1,"");
    }
    public BookClass(String name1){
        this(name1,0,"");
    }
    public BookClass(){
        this("",0,"");
    }

    public void bilgiYazdir(){
        System.out.println("Kitap Adı = " +name);
        System.out.println("Kitap Yazım Yılı = " +publishYear);
        System.out.println("Kitap Yazarı = " +author);
    }

    // yazdırma için 2. yöntem
    public String toString(){
        return name+" "+publishYear+" "+author;
    }
}
