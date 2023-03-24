public class utrjevanje9 {

    public static boolean isPal(String niz) {
      String obrnjenNiz = new StringBuffer(niz).reverse().toString();
      return niz.equals(obrnjenNiz);
    }
  
    public static void izpisPal(String[] tab) {
      for (String niz : tab) {
        if (isPal(niz)) {
          System.out.println(niz);
        }
      }
    }
  
    public static void main(String[] args) {
      String[] testTabela = {"bob", "anna", "lucas", "racecar", "madam"};
      izpisPal(testTabela);
    }
  }
