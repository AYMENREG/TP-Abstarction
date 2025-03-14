//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Paiement cartebancaire =new Cryptomonnaie();
        cartebancaire.effectuerPaiement(1200.68);
        Paiement crypto=new Cryptomonnaie();
        crypto.effectuerPaiement(200.68);
    }
}