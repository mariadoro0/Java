package classi;

public class ContoCorrente {
    private int nConto;
    private String titolare;
    private double saldo;

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public void versamento(double amount){
        if (amount>0) {
            this.saldo += amount;
        }

    }
    public double prelievo(double amount){
        if (this.saldo>=amount){
            this.saldo-=amount;
            return amount;
        }
        System.out.println("Disponibilità insufficiente.");
        return 0;
    }

    @Override
    public String toString() {
        return "classi.ContoCorrente{" +
                "numero conto=" + nConto +
                ", titolare='" + titolare + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

