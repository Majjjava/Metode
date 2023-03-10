import java.util.Scanner;

public class utrjevanje3 {
    public static void main(String[] args) {
        
    Scanner vhod = new Scanner(System.in);

    String vnos = vhod.nextLine();
    StringBuffer sb = new StringBuffer(vnos);

    String niz = vhod.nextLine();
    char znak = niz.charAt(0);


    for (int i=0; i<sb.length();i++){
        if(i%2 == 0){
            sb.setCharAt(i, znak);
        }  
    }
    System.out.println(sb);
    }
}
