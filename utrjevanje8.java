import java.util.Random;

public class utrjevanje8 {

    public static void izpisStevil(int a){
        
        int [] tab = new int[10];
        for (i=0; i<tab.length; i++){
            tab[i]=(int)(Math.random()*(10-0)+0);
        }

        if (tab[i]==6){
            System.out.print(tab[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        izpisStevil(0);
    }
}
