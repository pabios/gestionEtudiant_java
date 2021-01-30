import java.util.Scanner;

public class Etudiant {
    private String nom,prenom;
    private double[] notes;
    private double moyenne;

    public Etudiant(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Entrer le nom de l'etudiant ");
        nom = sc.next();

        System.out.print("Entrer le prenom de l'etudiant ");
        prenom = sc.next();

        System.out.print("l'etudiant  "+prenom+" "+nom+" possede combien de notes ");
        int nb = sc.nextInt();

        notes = new double[nb];
        
        int i = 0;

        while(i != notes.length){
            System.out.print("Entrer la note numero "+(i+1)+" : ");
            notes[i] = sc.nextDouble();
            i++;
        }
        moyenne = calculMoyenne();

    }

    private double calculMoyenne(){
        double som = 0.0;

        for(double valeurNote : notes){
            som = som + valeurNote;
        }

        return som/notes.length;
    }

    /**
     * Permet d'afficher les caracteristique d'un etudiant 
     */
    public void afficheUnEtudiant(){
        System.out.print("les notes de "+prenom+" "+nom+" "+" sont : ");
        for(double valeurNote : notes){
            System.out.print(" "+valeurNote);
        }
        System.out.println();
        System.out.println("Sa moyenne vaut "+moyenne);

    }

    /**
     * Renvoie la moyenne d'un etudiant
     */
    public double getMoyenne(){
        return moyenne;
    }

    
}