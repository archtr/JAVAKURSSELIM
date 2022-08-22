package Gun19;

public class _05_Tablo {
    public static void main(String[] args) {
        // {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        // 2D arrayinden max number print et

        int[][] tablo={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};

        int enb=tablo[0][0];
        System.out.println("Satır uzunluğu = " +tablo.length);
        System.out.println("1.Satırın Sütun uzunluğu = " +tablo[0].length);
        System.out.println("2.Satırın Sütun uzunluğu = " +tablo[1].length);
        System.out.println("3.Satırın Sütun uzunluğu = " +tablo[2].length);
        System.out.println("4.Satırın Sütun uzunluğu = " +tablo[3].length);

        for (int i=0;i< tablo.length;i++)
            for (int j=0;j<tablo[i].length;j++)
                if (tablo[i][j]>enb){
                    enb=tablo[i][j];
                }
        System.out.println("En Büyük Sayı = " +enb);

    }
}
