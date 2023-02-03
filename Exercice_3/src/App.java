public class App {
    public static void main(String[] args) throws Exception {
        Personne personne1 = new Personne();
        Personne personne2 = new Personne("akou", 25, 'M');
        Personne personne3 = new Personne("Pierre", 0);

        System.out.println("affichage des objets");
        personne1.displayInfo();
        personne2.displayInfo();
        personne3.displayInfo();
    }
}
