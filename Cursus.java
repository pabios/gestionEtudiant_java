import java.util.Scanner;

public class Cursus {
    private Etudiant[] liste;

    public void classe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("sasir le nombre d'etudiant");
        int nbEtudiant = sc.nextInt();

        liste = new Etudiant[nbEtudiant];

        for(int i = 0; i < liste.length; i ++){
            liste[i] = new Etudiant();

        }

    }

    /**
     * Affiche l'ensemble des etudiant
     */

     public void afficheLesEtudiant(){
         for(Etudiant e : liste){
             e.afficheUnEtudiant();
         }
     }
     /**
      *  fait le classment des etudiant par ordre croissant
      */
     public void classerParMoyenne(){
         Etudiant stock;
         int i = 0;
         int j = 0;

         while(i != liste.length){
             j = i + 1;
             while(j != liste.length){
                 if( liste[i] != null && (liste[i].getMoyenne() > liste[j].getMoyenne())){
                    stock = liste[i];
                    liste[i] = liste[j];
                    liste[j] = stock;

                 }
             }
         }

     }
}
