public class GestionCursus {
    public static void main(String[] args) {
        Cursus c = new Cursus();
        c.classe();
        System.out.println("========recapitulatif ========");
        c.afficheLesEtudiant();
        c.classerParMoyenne();

        System.out.println("==========voici le rang final============");
        c.afficheLesEtudiant();
    }
}
