/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasses.ClassesProjeto;

import DaoClasses.DaoGenerics;
import MembrosClube.Associado;
import MembrosClube.Funcionario;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class FuncionarioDao implements DaoGenerics<Funcionario,Integer> {

    @Override
    public void inserir(Funcionario f) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "INSERT INTO funcionario (nome,login,senha) " 
                +"values (?,?,?);";
        
         PreparedStatement stm = c.prepareStatement(sql);
         
         stm.setString(1,f.getNome());
         stm.setString(2,f.getLogin());
         stm.setString(3,f.getSenha());
       
         
         stm.executeUpdate();
    }

    @Override
    public void alterar(Funcionario f) throws SQLException, ClassNotFoundException {
        Connection c =ConnectionFactory.getConnection();
        
        String sql = "UPDATE funcionario SET " /*RESPEITAR OS ESPAÇOS*/
                + "nome = ?, "
                + "login = ?, "
                + "senha = ? "                            
                + " where id_funcionario = ?;";                
        
        PreparedStatement stm = c.prepareStatement(sql);
        
        stm.setString(1,f.getNome());
        stm.setString(2,f.getLogin());
        stm.setString(3,f.getSenha());
        
        stm.executeUpdate();
    }

    @Override
    public void deletar(Funcionario f) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "DELETE FROM funcionario WHERE " 
                + "id_funcionario = ?;";
        
       PreparedStatement stm = c.prepareStatement(sql);
       
       stm.setInt(1, f.getId());
       
       stm.executeUpdate();
    }

    @Override
    public ArrayList<Funcionario> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "select * from funcionario;";
        PreparedStatement stm = c.prepareStatement(sql);
        
        ResultSet rs = stm.executeQuery();
        
        ArrayList<Funcionario> lista = new ArrayList<>();
        
        while(rs.next()){
            Funcionario func = new Funcionario(rs.getInt("id_funcionario"),rs.getString("nome"),
                     rs.getString("login"),
                     rs.getString("senha"));
            
            lista.add(func);        
        }
        return lista;    
    }

    @Override
    public Funcionario buscarPelaChave(Integer chave) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "select * from funcionario WHERE id_funcionario = ?;";
        
         PreparedStatement stm = c.prepareStatement(sql);
         stm.setInt(1,chave);
         
         ResultSet rs = stm.executeQuery();
         
         if(rs.next()){
             Funcionario func = new Funcionario(rs.getInt("id_funcionario"),rs.getString("nome"),
                     rs.getString("login"),
                     rs.getString("senha"));
                     
             return func;
         }else{
             return null;
         }
    }
    
}
