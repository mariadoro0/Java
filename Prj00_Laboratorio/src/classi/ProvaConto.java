package classi;

public class ProvaConto {
    public static void main(String[] args) {
        ContoCorrente cc= new ContoCorrente();
        cc.versamento(500);
        cc.prelievo(400);
        System.out.println(cc);
    }
}
