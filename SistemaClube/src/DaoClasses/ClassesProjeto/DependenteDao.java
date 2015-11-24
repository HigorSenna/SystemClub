/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasses.ClassesProjeto;

import DaoClasses.DaoGenerics;
import MembrosClube.AssociadoTitular;
import MembrosClube.Dependente;
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Higor Senna
 */
public class DependenteDao implements DaoGenerics<Dependente,String> {

    @Override
    public void inserir(Dependente dep) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "INSERT INTO dependente (CPF_Dep,nome,endereco,telefone,RG,senhaClubeDep) " 
                +"values (?,?,?,?,?,?);";
        
         PreparedStatement stm = c.prepareStatement(sql);
         
         stm.setString(1,dep.getCPF());
         stm.setString(2,dep.getNome());
         stm.setString(3,dep.getEndereco());
         stm.setString(4,dep.getTelefone());
         stm.setString(5,dep.getRG());
         stm.setString(6,dep.getSenhaClube());    
         
         stm.executeUpdate();
    }
    @Override
    public void alterar(Dependente dep) throws SQLException, ClassNotFoundException {
        Connection c =ConnectionFactory.getConnection();
        
        String sql = "UPDATE dependente SET " /*RESPEITAR OS ESPAÇOS*/
                + "nome = ?, "
                + "endereco = ? "
                + "telefone = ? "
                + "RG = ? "
                + "senhaClubeDep = ? "               
                + " where CPF_Dep = ?;";                
        
        PreparedStatement stm = c.prepareStatement(sql);
        
        stm.setString(1,dep.getNome());
        stm.setString(2,dep.getEndereco());
        stm.setString(3,dep.getTelefone());
        stm.setString(4,dep.getRG());      
        stm.setString(5,dep.getSenhaClube());        
        stm.executeUpdate();
    }

    @Override
    public void deletar(Dependente dep) throws SQLException, ClassNotFoundException {
       Connection c = ConnectionFactory.getConnection();
        String sql = "DELETE FROM dependente WHERE " 
                + "CPF_Dep = ?;";
        
       PreparedStatement stm = c.prepareStatement(sql);
       
       stm.setString(1, dep.getCPF());
       
       stm.executeUpdate();
    }

    @Override
    public ArrayList<Dependente> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "select * from dependente;";
        PreparedStatement stm = c.prepareStatement(sql);
        
        ResultSet rs = stm.executeQuery();
        
        ArrayList<Dependente> lista = new ArrayList<>();
        
        while(rs.next()){
            
            Dependente dep = new Dependente(rs.getString("CPF_Dep"),rs.getString("nome"),
                     rs.getString("RG"),rs.getString("telefone")
                     ,rs.getString("endereco"),rs.getString("senhaClubeDep"));
            
            lista.add(dep);        
        }
        return lista;    
    }

    @Override
    public Dependente buscarPelaChave(String chave) throws SQLException, ClassNotFoundException {
         Connection c = ConnectionFactory.getConnection();
        
        String sql = "select * from dependente WHERE CPF_Dep = ?;";
        
         PreparedStatement stm = c.prepareStatement(sql);
         stm.setString(1,chave);
         
         ResultSet rs = stm.executeQuery();
         
         if(rs.next()){
              Dependente dep = new Dependente(rs.getString("CPF_Dep"),rs.getString("nome"),
                     rs.getString("RG"),rs.getString("telefone")
                     ,rs.getString("endereco"),rs.getString("senhaClubeDep"));
                     
             return dep;
         }else{
             return null;
         }
    }
    
}
