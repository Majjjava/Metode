public class utrjevanje10 {

    public static atSam(String niz){
        int a = 0;
        String samoglasniki = ("aeiouAEIOU");

        for(int i=0; i<niz.length(); i++){
            if(samoglasniki.indexOf(niz.charAt(i))>=0){
                a++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        
    }
}
