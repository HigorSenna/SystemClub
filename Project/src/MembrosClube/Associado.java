
package MembrosClube;

import Log.Historico;

/**
 *
 * @author Higor Senna
 */
public class Associado {
    private String nome,RG,CPF,telefone,endereco,senhaClube;
    
    private Historico hist;

    public Historico getHist() {
        return hist;
    }

    public void setHist(Historico hist) {
        this.hist = hist;
    }    

    public Associado() {
    }

    public Associado(String nome, String RG, String CPF, String telefone, String endereco, String senhaClube) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.telefone = telefone;
        this.endereco = endereco;
        this.senhaClube = senhaClube;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {        
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenhaClube() {
        return senhaClube;
    }

    public void setSenhaClube(String senhaClube) {
        this.senhaClube = senhaClube;
    }
    
    protected void comprar(){
    }
    protected void entrarSede(){
    }
    protected void sairSede(){
    }
    protected void depositarContaBar(){
    }
    
}
