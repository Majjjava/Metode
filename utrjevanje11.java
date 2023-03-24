import java.util.Random;

public class utrjevanje11 {

    public static int najvecjest(int []tab){
        int indeks = 0;
        int max = tab[0];

        for (int i=0; i<tab.length;i++){
            if(tab[i]>max){
                indeks = i;
                max=tab[i];}
        }
        return indeks;
    }
    public static void main(String[] args) {
        
        int[] tab = new int[10];

        for (int i=0; i<tab.length;i++){
            tab[i]=(int)((Math.random()*(100)+0));
        }

        for(int i=0;i<tab.length;i++)
        {
            System.out.print(tab[i]+"  ");
        }

        System.out.println();
        System.out.println(najvecjest(tab));
    }
}
