/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasses.ClassesProjeto;

import DaoClasses.DaoGenerics;
import Financeiro.ContaBancaria;
import MembrosClube.Associado;
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
 * @author aluno
 */
public class AssociadoDao implements DaoGenerics<AssociadoTitular, Integer> {

    @Override
    public void inserir(AssociadoTitular a) throws SQLException, ClassNotFoundException {

        new ContaBancariaDao().inserir(a.getC());
        // new Dependente .inserir(a.getC());

        Connection c = ConnectionFactory.getConnection();
        String sql = "INSERT INTO associado_titular (nome,CPF,RG,telefone,endereco,senhaClube,numConta) "
                + "values (?,?,?,?,?,?,?);";

        PreparedStatement stm = c.prepareStatement(sql);

        stm.setString(1, a.getNome());
        stm.setString(2, a.getCPF());
        stm.setString(3, a.getRG());
        stm.setString(4, a.getTelefone());
        stm.setString(5, a.getEndereco());
        stm.setString(6, a.getSenhaClube());
        stm.setInt(7, a.getC().getNumero());

        stm.executeUpdate();

    }

    @Override
    public void alterar(AssociadoTitular a) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE associado_titular SET " /*RESPEITAR OS ESPAÇOS*/
                + "nome = ?, "
                + "CPF = ?, "
                + "RG = ? "
                + "telefone = ? "
                + "endereco = ? "
                + "senhaClube = ? "
                + " where id_associado = ?;";

        PreparedStatement stm = c.prepareStatement(sql);

        stm.setString(1, a.getNome());
        stm.setString(2, a.getCPF());
        stm.setString(3, a.getRG());
        stm.setString(4, a.getTelefone());
        stm.setString(5, a.getEndereco());
        stm.setString(6, a.getSenhaClube());

        stm.executeUpdate();

    }

    @Override
    public void deletar(AssociadoTitular a) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        String sql = "DELETE FROM associado_titular WHERE "
                + "id_associado = ?;";

        PreparedStatement stm = c.prepareStatement(sql);

        stm.setInt(1, a.getId());

        stm.executeUpdate();
    }

    @Override
    public ArrayList<AssociadoTitular> buscarTodos() throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "select * from associado_titular at "
                + "join conta_bancaria cb on (at.numConta = cb.numero);";
        PreparedStatement stm = c.prepareStatement(sql);

        ResultSet rs = stm.executeQuery();

        ArrayList<AssociadoTitular> lista = new ArrayList<>();

        while (rs.next()) {
            ContaBancaria cb = new ContaBancaria(rs.getString("agencia"), rs.getInt("numero"), rs.getDouble("saldo"),rs.getString("banco"));
            AssociadoTitular ass = new AssociadoTitular(rs.getInt("id_associado"), rs.getString("nome"),
                    rs.getString("RG"), rs.getString("CPF"), rs.getString("telefone"), rs.getString("endereco"), rs.getString("senhaClube"),cb);
            

            lista.add(ass);
        }
        return lista;
    }

    @Override
    public AssociadoTitular buscarPelaChave(Integer chave) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();

        String sql = "select * from associado_titular at "
                + "join conta_bancaria cb on (at.numConta = cb.numero) WHERE id_associado = ?;";

        PreparedStatement stm = c.prepareStatement(sql);
        stm.setInt(1, chave);

        ResultSet rs = stm.executeQuery();

        if (rs.next()) {
            ContaBancaria cb = new ContaBancaria(rs.getString("agencia"), rs.getInt("numero"), rs.getDouble("saldo"),rs.getString("banco"));
            AssociadoTitular ass = new AssociadoTitular(rs.getInt("id"), rs.getString("nome"),
                    rs.getString("RG"), rs.getString("CPF"), rs.getString("telefone"), rs.getString("endereco"), rs.getString("senhaClube"), cb);

            return ass;
        } else {
            return null;
        }
    }
    
    
     public String buscarNome(String senha) throws SQLException, ClassNotFoundException {
        Connection c = ConnectionFactory.getConnection();
        
        String sql = "select * from associado_titular at "
                + "join conta_bancaria cb on (at.numConta = cb.numero) WHERE senhaClube = ?;";
        
         PreparedStatement stm = c.prepareStatement(sql);
         stm.setString(1,senha);
         
         ResultSet rs = stm.executeQuery();
         
         if(rs.next()){
             ContaBancaria cb = new ContaBancaria(rs.getString("agencia"), rs.getInt("numero"), rs.getDouble("saldo"),rs.getString("banco"));
             AssociadoTitular ass = new AssociadoTitular(rs.getInt("id_associado"),rs.getString("nome"),
                     rs.getString("RG"),rs.getString("CPF"),rs.getString("telefone")
                     ,rs.getString("endereco"),rs.getString("senhaClube"),cb);
                     
             return ass.getNome();
         }else{
             return null;
         }
    }   

}
