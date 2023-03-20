public class utrjevanje5 {
    public static void jeSteviloDeljivoS3in4(int a, int b){

        for (int i = 1;i<2;i++){
            int vsota = a+b;
            if(vsota%3==0&&vsota%4==0){
                System.out.println("True "+vsota);
            }
        }
    }
    public static void main(String[] args) {
        jeSteviloDeljivoS3in4(5, 7);
    }
}
