public class exercice19 {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println( "\n \n");
    }
    // pour voir si une année est bisextile


    int AN;
      boolean A4;
      boolean A100;
      boolean A400;
      boolean Rbisex;

      if (AN%4==0) {A4 == true} ; if (AN%100 == 0) { A100==true} ; if(AN%400 == 0) { A400 == true};

      if ( A4 * A100 * A400 == true ) { Rbisex == true}
}
