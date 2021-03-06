
package MembrosClube;

import Financeiro.ContaBancaria;
import Financeiro.ContaBar;
import Financeiro.Mensalidade;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Higor Senna
 */
public class AssociadoTitular extends Associado{
    private int id;
    
    private Dependente dep;   
    private ContaBar cb;
    private ContaBancaria c;
    private Mensalidade mens;
    
    
    public AssociadoTitular(){
        super();
    }
    public AssociadoTitular(int id, String nome, String RG, String CPF, 
        String telefone, String endereco, String senhaClube,ContaBancaria conta) {
        
        super(id,nome, RG, CPF, telefone, endereco, senhaClube);
        setC(conta);
        
    }  

    public ContaBar getCb() {
        return cb;
    }

    public void setCb(ContaBar cb) {
        this.cb = cb;
    }

    public ContaBancaria getC() {
        return c;
    }

    public void setC(ContaBancaria c) {
        this.c = c;
    }

    public Mensalidade getMens() {
        return mens;
    }

    public void setMens(Mensalidade mens) {
        this.mens = mens;
    }
    
    
    public void setDependente(Dependente d){
        dep = d;
    }
    public Dependente getDependente(){
        return dep;
    }    
    public int getId(){
       return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    private boolean pagarMensalidade(){
        return false;
    }
    
    private void sacarRestanteBar(){
    }
    
    
    
}
