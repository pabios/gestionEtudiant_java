//package gestionEtudiant;

import java.util.*;

public class Cursus {
    private Etudiant[] liste;
    
     

    public void classe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nombre d'etudiant : ");
        int nbEtudiant = 0;
        nbEtudiant = sc.nextInt();

        liste = new Etudiant[nbEtudiant];

        for(int i = 0; i < liste.length;i++){
            liste[i] = new Etudiant();
        }
    }

    public void voireClasse(){
        int i = 0;

        while(i != liste.length){
            System.out.println("il y 'a : "+liste[i]);
            i++;
        }
    }
    public void afficheLesEtudiants() {
        for(Etudiant e : liste){
            e.afficheUnEtudiant();
        }
    }
 
    /**
     * classer par ordre croissant
     */
    public void classerParMoyenne(){ 
        Etudiant stock;
         
        int i = 0;
        int j = 0;
         

        while(i != liste.length){
            j = i + 1;
            while(j != liste.length){
                    if(liste[i] != null && (liste[i].getMoyenne() > liste[j].getMoyenne())){
                        stock = liste[i];
                        liste[i] = liste[j];
                        liste[j] = stock;
                    }
               
                j ++;
            }
            i++;
        }

         
        
    }
}
