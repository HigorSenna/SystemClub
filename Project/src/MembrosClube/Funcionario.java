package MembrosClube;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Higor Senna
 */

public class Funcionario {
    public boolean consultaFuncs(String log, String pass) throws ClassNotFoundException, SQLException{
        boolean exist = false;
        Connection c = ConnectionFactory.getConnection();
        String sql = "SELECT Login,Senha from funcionarios WHERE Login = ? and Senha = ?";
        
        PreparedStatement stm = c.prepareStatement(sql);
        stm.setString(1, log);
        stm.setString(2, pass);               
        ResultSet rs;
        rs = stm.executeQuery();
        
        if(rs.next()){
           exist = true;
        }
        return exist;        
    }
    private String nome,login,senha;

    public Funcionario() {
    }

    public Funcionario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
