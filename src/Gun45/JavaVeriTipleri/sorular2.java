package Gun45.JavaVeriTipleri;

import java.util.ArrayList;

public class sorular2 {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j].equals("B")) {
                    continue;
                }
            }
            continue;
        }

        int[][] arr1=new int[2][4];
        arr1[0]=new int[]{1,3,5,7};
        arr1[1]=new int[]{1,3};
        for (int[] a:arr1){
            for (int i=0;i< arr1.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

        String[][] chs=new String[2][];
        chs[0]=new String[2];
        chs[1]=new String[5];
        int i=97;
        for (int a=0;a< chs.length;a++){
            for (int b=0; b< chs.length;b++){
                chs[a][b]=""+i;
                i++;
            }
        }
        for (String[] ca:chs){
            for (String c:ca){
                System.out.println(c+" ");
            }
            System.out.println();
        }

        ArrayList<Integer> points = new ArrayList<>();
        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        points.remove(1);
        points.remove(null);
        System.out.println(points);





    }
}
