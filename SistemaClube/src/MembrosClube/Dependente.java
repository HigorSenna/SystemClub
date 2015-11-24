package MembrosClube;

/**
 *
 * @author Higor Senna
 */
public class Dependente extends Associado {

    public Dependente() {
        super();
    }

    public Dependente(String CPF,String nome,String RG, 
            String telefone, String endereco, String senhaClube){
        
        super(CPF,nome, RG, telefone, endereco, senhaClube);
    }
    
    
    
}
