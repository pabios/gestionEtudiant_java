import java.util.Scanner;

public class Cursus {
    private Etudiant[] liste;


    /**
     * Permet de creer une classe physique
     */

    public void classe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le nombre d'etudiant ");
        int nbEtudiant  = sc.nextInt();

        liste = new Etudiant[nbEtudiant];

        for(int i = 0; i < liste.length; i++ ){
            liste[i] = new Etudiant();
        }
    }

    public void afficheToutLesEtudiant(){
        for(Etudiant e : liste){
            e.afficheUnEtudiant();
        }
    }

    /**
     * Permet de faire le classment des etudiant 
     */

     public void trier(){
         Etudiant stock;
         int i = 0;
         int j = 0;

         while(i != liste.length){
             j = i + 1;
             while(j != liste.length){
                if((liste[i] != null) && liste[i].getMoyenne() > liste[j].getMoyenne()){
                    stock = liste[i];
                    liste[i] = liste[j];
                    liste[j] = stock;
                }


                 j= j + 1;
             }


            i++;
         }
     }

}
