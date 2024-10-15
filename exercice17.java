public class exercice17 {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // définition des variables

        double solde=1000;
        double  Montant = 200;
        double  TEST = 0;
        double  Mensualité=Montant/3;
        double R = Math.round(Mensualité * 100.0) / 100.0;
        String Type;
        Type = "Electron";
        

       /*  définition des cartes

        double C[];
        C = new double [3];
            // carte classique 
            C[0]= 500 ;
            // carte premium 
            C[1]= 1000 ;
            // carte electron 
            C[2]= 0 ;

            // boucle
            for( int i=0 ; i<3 ; i++) {

                TEST = + C[i] ;

                    if ( Montant > C[i]+solde) {
                        System.out.println("  OPERATION IMPOSSIBLE !!!!"); 
                    }
                       */ 
                    
            if (Type=="Classique") {
                if (Montant>solde+500) {
                    System.out.println("OPERATION IMPOSSIBLE   !!!!!!!");
                    System.exit(0);
                }
                  }
                    if (Type=="Gold") {
                        if (Montant>solde+1000) {
                            System.out.println("OPERATION IMPOSSIBLE   !!!!!!!");
                            System.exit(0);
                        }  
                    }  

                        if (Type=="Electron") {
                            if (Montant>solde) {
                                System.out.println("OPERATION IMPOSSIBLE   !!!!!!!");
                                System.exit(0);
                            }    
                        }
                System.out.println("votre solde :  "+ solde);
                System.out.println("vos mensualités :  "+ R );
                        } 
}

