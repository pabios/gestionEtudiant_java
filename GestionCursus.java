//package gestionEtudiant;

public class GestionCursus {
    public static void main(String[] args) {
        Cursus c = new  Cursus();
        c.classe();
        System.out.println("-----------Recapitulatif --------------");       
        c.afficheLesEtudiants();
        c.classerParMoyenne();

        System.out.println("-----------classement-----------------");
        c.afficheLesEtudiants();
         
    }
    
}
