import java.util.Random;

public class utrjevanje12 {
    public static int najmanjsest(int []tab){
        int indeks = 0;
        int min = tab[0];

        for (int i=0; i<tab.length;i++){
            if(tab[i]<min){
                indeks = i;
                min=tab[i];}
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
        System.out.println(najmanjsest(tab));
    }
}

