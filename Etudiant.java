import java.util.Scanner;

public class Etudiant{
//attribut
private String nom,prenom;
private double[] notes;
private double moyenne;

public Etudiant(){
    Scanner sc = new Scanner (System.in);
    System.out.print("Entrer le nom de l'etudiant");
    nom = sc.next();
    System.out.print("Saisir le prenom de l'etudiant");
    prenom = sc.next();

    System.out.print("l'etuidant "+prenom+" "+nom+" possedent combien de note" );
    int nbNote =sc.nextInt();
    notes = new double[nbNote];
    int i = 0 ;
    while(i != notes.length){
        System.out.print("Entrer la note numero "+(i+1)+" : ");
        notes[i] = sc.nextDouble();
        i ++;
    }
    moyenne = calculMoyenne();

}
/**
 * Calcule la moyenne d'un etudiant
 * @return moyenne
 */

private double calculMoyenne(){
    double som = 0.0;

    for(double valeurNote : notes){
        som = som + valeurNote;
    }
    return som/notes.length;
}
/**
 * Afficher a lecran les carateristique de l'etudiant
 */
public void afficheUnEtudiant(){
    System.out.print("les notes de "+prenom+" "+nom+" sont  :");

    for(double valeurNote : notes){
        System.out.print(" "+valeurNote);
    }
    System.out.println();
    System.out.println("Sa moyenne vaut "+moyenne);
}

public double getMoyenne(){
    return moyenne;

}


}