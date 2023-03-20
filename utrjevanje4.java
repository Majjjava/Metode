
public class utrjevanje4 {

    public static void ponovitev(int []tab, int k){
        int p =0;
        tab=new int[10];
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i]==k){
                p++;
            }
        }
        System.out.println("Ponovitev k je blo: "+p);
    }
    public static void main(String[] args) {

        int [] tabela ={1,2,3,2,1,2,3};
        ponovitev(tabela, 1);

    }
}
