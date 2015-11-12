/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasses.ClassesProjeto;

import DaoClasses.DaoGenerics;
import MembrosClube.Associado;
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
public class AssociadoDao implements DaoGenerics<Associado, Integer> {

    @Override
    public void inserir(Associado a) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "INSERT INTO associado_titular (nome,CPF,RG,telefone,endereco,senhaClube) " 
                +"values (?,?,?,?,?,?);";
        
         PreparedStatement stm = c.prepareStatement(sql);
         
         stm.setString(1,a.getNome());
         stm.setString(2,a.getCPF());
         stm.setString(3,a.getRG());
         stm.setString(4,a.getTelefone());
         stm.setString(5,a.getEndereco());
         stm.setString(6,a.getSenhaClube());
         
         stm.executeUpdate();
    }

    @Override
    public void alterar(Associado a) throws SQLException, ClassNotFoundException {
       Connection c =ConnectionFactory.getConnection();
        
        String sql = "UPDATE associado_titular SET " /*RESPEITAR OS ESPAÇOS*/
                + "nome = ?, "
                + "CPF = ?, "
                + "RG = ? "
                + "telefone = ? "
                + "endereco = ? "
                + "senhaClube = ? "               
                + " where id_associado = ?;";                
        
        PreparedStatement stm = c.prepareStatement(sql);
        
        stm.setString(1,a.getNome());
        stm.setString(2,a.getCPF());
        stm.setString(3,a.getRG());
        stm.setString(4,a.getTelefone());
        stm.setString(5,a.getEndereco());
        stm.setString(6,a.getSenhaClube());
        
        stm.executeUpdate();
        
    }

    @Override
    public void deletar(Associado a) throws SQLException, ClassNotFoundException {
       Connection c = ConnectionFactory.getConnection();
        String sql = "DELETE FROM associado_titular WHERE " 
                + "id_associado = ?;";
        
       PreparedStatement stm = c.prepareStatement(sql);
       
       stm.setInt(1, a.getId());
       
       stm.executeUpdate();
    }

    @Override
    public ArrayList<Associado> buscarTodos(Associado a) throws SQLException, ClassNotFoundException {
       Connection c = ConnectionFactory.getConnection();
        
        String sql = "select * from associado_titular;";
        PreparedStatement stm = c.prepareStatement(sql);
        
        ResultSet rs = stm.executeQuery(sql);
        
        ArrayList<Associado> lista = new ArrayList<>();
        
        while(rs.next()){
            Associado ass = new Associado(rs.getInt("id"),rs.getString("nome"),
                     rs.getString("RG"),rs.getString("CPF"),rs.getString("telefone")
                     ,rs.getString("endereco"),rs.getString("senhaClube"));
            
            lista.add(ass);        
        }
        return lista;    
    }

    @Override
    public Associado buscarPelaChave(Integer chave) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "select * from associado_titular WHERE id_associado = ?;";
        
         PreparedStatement stm = c.prepareStatement(sql);
         stm.setInt(1,chave);
         
         ResultSet rs = stm.executeQuery(sql);
         
         if(rs.next()){
             Associado ass = new Associado(rs.getInt("id"),rs.getString("nome"),
                     rs.getString("RG"),rs.getString("CPF"),rs.getString("telefone")
                     ,rs.getString("endereco"),rs.getString("senhaClube"));
                     
             return ass;
         }else{
             return null;
         }
    }
    
}
