
package Financeiro;

/**
 *
 * @author Higor Senna
 */
public class ContaBancaria {
    private String agencia;
    private int numero;
    private double saldo;
    private String banco;


    public ContaBancaria() {
    }

    public ContaBancaria(String agencia, int numero, double saldo,String banco) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    
}
