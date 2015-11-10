
package Financeiro;

/**
 *
 * @author Higor Senna
 */
public class Mensalidade {
    private String referencia,dataVenci;
    private double valor;

    public Mensalidade() {
    }

    public Mensalidade(String referencia, String dataVenci, double valor) {
        this.referencia = referencia;
        this.dataVenci = dataVenci;
        this.valor = valor;
    }    

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDataVenci() {
        return dataVenci;
    }

    public void setDataVenci(String dataVenci) {
        this.dataVenci = dataVenci;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
