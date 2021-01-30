public class GestionCursus {
    public static void main(String[] args) {
        Cursus c = new Cursus();
        c.classe();
        System.out.println("=========== Resumer ==========");
        c.afficheToutLesEtudiant();
        c.trier();
        System.out.println("=========  classment =========");
        c.afficheToutLesEtudiant();
    }
}
