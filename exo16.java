public class exo16 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("\n \n");

        // creation du tableau
        double A[];
        A = new double [3];
        // prix litre diesel
        A[0] =  1.652;
        // prix litre sans plomb 95
        A[1] =  1.753;
        // prix litre sans plomb 98
        A[2]=  1.840;
        // nombre kilometres
        double NB= 450 ;
        // cout du voyage
        double C=0  ;
        

        // boucle de calcul
        // condition d'affichage

        for (int i=0; i<3;i++) {

            C=NB*A[i]*0.06;
            double R = Math.round(C * 100.0) / 100.0;

            if ( i==0 ) {
                System.out.println("le coût du voyage avec du diesel sera de   " + R + "  euros \n");
            }

            if ( i==1) {
                System.out.println("le coût du voyage avec du sans plomb 95 sera de   " + R + "  uros \n");
            }

            if (i==2) {
                System.out.println("le coût du voyage avec du sans plomb 98 sera de   " + R + "  euros \n");
            }


         }
         System.out.println("\n \n");

         System.out.println(" BON VOYAGE !!!!!!");

}
}