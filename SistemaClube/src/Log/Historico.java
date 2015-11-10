
package Log;
/**
 *
 * @author Higor Senna
 */
public class Historico {
    private String horaEntrada,horaSaida,tipoAssociado,nome,CPF;
    private double totalGastos;

    public Historico() {
    }

    public Historico(String horaEntrada, String horaSaida, String tipoAssociado, String nome, String CPF, double totalGastos) {
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.tipoAssociado = tipoAssociado;
        this.nome = nome;
        this.CPF = CPF;
        this.totalGastos = totalGastos;
    }
    
    

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getTipoAssociado() {
        return tipoAssociado;
    }

    public void setTipoAssociado(String tipoAssociado) {
        this.tipoAssociado = tipoAssociado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getTotalGastos() {
        return totalGastos;
    }

    public void setTotalGastos(double totalGastos) {
        this.totalGastos = totalGastos;
    }
    
    
}
