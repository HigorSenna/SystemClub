package MembrosClube;

/**
 *
 * @author Higor Senna
 */
public class Dependente extends Associado {

    public Dependente() {
        super();
    }

    public Dependente(String nome,String RG, String CPF, 
            String telefone, String endereco, String senhaClube){
        
        super(nome, RG, CPF, telefone, endereco, senhaClube);
    }
    
    
    
}
