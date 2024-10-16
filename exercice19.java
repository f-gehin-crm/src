import java.util.Scanner;



public class exercice19 {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println( "\n \n");

    

    
    // pour voir si une année est bisextile

        Scanner in = new Scanner(System.in);
        System.out.println("Entrez une année  :  ");
        int AN = in.nextInt();
        System.out.println(AN);

    
      boolean A4;
      boolean A100;
      boolean A400;
      boolean Rbisex;

      if (AN%4==0) {A4 = true;} else {A4 = false;}
      if (AN%100 == 0) { A100=true ;} else {A100 = false;}
      if(AN%400 == 0) { A400 = true ;}else {A400 = false;}



      if (AN%4==0) {A4 = true;   System.out.println("divible par 4  \n");} ;
       if (AN%100 == 0) { A100=true ;   System.out.println("divisible par 100  \n");} ;
        if(AN%400 == 0) { A400 = true ;   System.out.println("divisible par 400 \n");};

        if ( A100&&A400 == true) {   System.out.println(AN +" est bisextile"); }

         if ( A400  == true ) {   System.out.println(AN +" est bisextile"); }
      
      
         if ( A100 == true) {   System.out.println(AN +" n'est pas bisextile"); }
                                  else  if ( A4 == true ) { System.out.println(AN + " est bisextile");       
    }           

    in.close();
    System.out.println(AN + "BONNE JOURNEE  !!!!!!!!");
}

}
