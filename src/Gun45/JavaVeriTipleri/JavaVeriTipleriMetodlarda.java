package Gun45.JavaVeriTipleri;

public class JavaVeriTipleriMetodlarda {

    int a1;
    static int a2;
    static void metod1(){

    }

    public static void main(String[] args) {
        JavaVeriTipleriMetodlarda j=new JavaVeriTipleriMetodlarda();
        j.a1=7;

        a2=8;
        metod1();
        //****************//
        int a=5;
        doProduct(a);
        System.out.println("a = " + a); // a nın değeri değişmez

        String[] arr={"A","B","C","D"};
        for (int i=0 ; i<arr.length; i++){
            System.out.println(arr[i]+" ");
            if (arr[i].equals("D")){
                System.out.println("work done");
                break;
            }
            continue;
        }

        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;

        numbers=new int[4];
        numbers[2]=30;
        numbers[3]=40;

        for (int x:numbers
             ) {
            System.out.println(" " +x);
        }


        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;
        for (int e:data
             ) {
            if (e!=key){
                continue;
               //  count++; hata bunun olmasıydı kod mantık hatası
            }
        }
       //  System.out.println(count+"found");

        







    }
    public static void doProduct(int a){
        a=5*a;
    }
}
