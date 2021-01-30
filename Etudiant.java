import java.util.*;

public class Etudiant{
    private String nom,prenom;
    private double moyenne;
    private double[] notes;



    public Etudiant(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer le nom del'etudiant : ");
        nom = sc.next();
        
        System.out.print("Entrer le prenom de l'etudiant : ");
        prenom = sc.next();

        System.out.print("l'etudiant possedent combien de notes ? ");
        System.out.print(prenom+" "+nom+" :  ");
        int nombre = sc.nextInt();
        
        notes = new double[nombre];
        System.out.println(" vous avez dit  "+ notes.length+" notes ");
         
        for(int i = 0; i < notes.length;i++){
            System.out.print("Saisir la note numero "+(i+1)+"  : ");
            notes[i] = sc.nextDouble();
        }
        moyenne = calculMoyenne();
    }

    /**
     * Permet de calculer la moyenne de L'etudiant
     */
    private double calculMoyenne(){
        double somme = 0.0;

        for(double valeurNote : notes){
            somme = somme +valeurNote;
        }

        return somme/notes.length;
    }

    /**
     * Affiche a l'ecran les caracteristique d'un etudiant
     */

    public void afficheUnEtudiant(){
        System.out.print("les notes de "+prenom+" "+nom+" sont : ");

        for(double valeurNote : notes){
            System.out.print(" "+valeurNote);
        }
        System.out.println();
        System.out.println("sa moyenne vaut "+moyenne);

    }


    public double getMoyenne(){
        return moyenne;
    }
    
}