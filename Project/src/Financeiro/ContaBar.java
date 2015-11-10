
package Financeiro;

/**
 *
 * @author Higor Senna
 */
public class ContaBar {
    private String tipoContaBar;
    private int numContaBar;
    private double saldo,limite;

    public ContaBar() {
    }

    public ContaBar(String tipoContaBar, int numContaBar, double saldo, double limite) {
        this.tipoContaBar = tipoContaBar;
        this.numContaBar = numContaBar;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getTipoContaBar() {
        return tipoContaBar;
    }

    public void setTipoContaBar(String tipoContaBar) {
        this.tipoContaBar = tipoContaBar;
    }

    public int getNumContaBar() {
        return numContaBar;
    }

    public void setNumContaBar(int numContaBar) {
        this.numContaBar = numContaBar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
