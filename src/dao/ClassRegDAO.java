package dao;

import connection.MySqlAcess;
import entities.ClassReg;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClassRegDAO {

    public ClassRegDAO() {
    }
    
    public void insert(ClassReg cr) {
        Connection con = MySqlAcess.getConnection();
        PreparedStatement stm = null;
        
        try {
            String sql = "INSERT INTO tbclassreg (nome,cargah,professor,prereq,dias) VALUES";
            stm = con.prepareStatement(sql+"(?,?,?,?,?)");
            stm.setString(1, cr.getName());
            stm.setDouble(2, cr.getWorkload());
            stm.setString(3, cr.getProfessor());
            stm.setString(4, cr.getPreReq());
            stm.setString(5, cr.getWeekDays());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados inseridos!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar inserir dados: " + ex);
        } finally {
            MySqlAcess.disconnect(con,stm);
        }
    }
    
    public List<ClassReg> read() {
        Connection con = MySqlAcess.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<ClassReg> crList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tbclassreg";
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            while(rs.next()) {
                ClassReg cr = new ClassReg();
                cr.setCod(rs.getInt("codigo"));
                cr.setName(rs.getString("nome"));
                cr.setWorkload(rs.getDouble("cargah"));
                cr.setProfessor(rs.getString("professor"));
                cr.setPreReq(rs.getString("prereq"));
                cr.setWeekDays(rs.getString("dias"));
                crList.add(cr);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar ler o banco de dados: " + ex);
        } finally {
            MySqlAcess.disconnect(con,stm,rs);
        }
        return crList;
    }
    
    public void update(ClassReg cr) {
        Connection con = MySqlAcess.getConnection();
        PreparedStatement stm = null;
        
        try {
            String sql = "UPDATE tbclassreg SET ";
            stm = con.prepareStatement(sql+"nome=?,cargah=?,professor=?,prereq=?,dias=? WHERE codigo=?");
            stm.setString(1, cr.getName());
            stm.setDouble(2, cr.getWorkload());
            stm.setString(3, cr.getProfessor());
            stm.setString(4, cr.getPreReq());
            stm.setString(5, cr.getWeekDays());
            stm.setInt(6,cr.getCod());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados atualizados!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar atualizar dados: " + ex);
        } finally {
            MySqlAcess.disconnect(con,stm);
        }
    }
    
    public void delete(ClassReg cr) {
        Connection con = MySqlAcess.getConnection();
        PreparedStatement stm = null;
        
        try {
            String sql = "DELETE FROM tbclassreg WHERE ";
            stm = con.prepareStatement(sql+"codigo=?");
            stm.setInt(1, cr.getCod());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados excluido!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir dados: " + ex);
        } finally {
            MySqlAcess.disconnect(con,stm);
        }
    }
    
    public List<ClassReg> readLike(String name) {
        Connection con = MySqlAcess.getConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<ClassReg> crList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tbclassreg WHERE nome LIKE ?";
            stm = con.prepareStatement(sql);
            stm.setString(1,name + '%');
            rs = stm.executeQuery();
            while(rs.next()) {
                ClassReg cr = new ClassReg();
                cr.setCod(rs.getInt("codigo"));
                cr.setName(rs.getString("nome"));
                cr.setWorkload(rs.getDouble("cargah"));
                cr.setProfessor(rs.getString("professor"));
                cr.setPreReq(rs.getString("prereq"));
                cr.setWeekDays(rs.getString("dias"));
                crList.add(cr);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar ler o banco de dados: " + ex);
        } finally {
            MySqlAcess.disconnect(con,stm,rs);
        }
        return crList;
    }
}