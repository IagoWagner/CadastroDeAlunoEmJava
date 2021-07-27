package Model.DAO;

import static Model.DAO.ConnectionDatabase.getConnection;
import br.com.model.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CursoDAO extends GenericDAO<Curso> {

    @Override
    public void inserir(Curso obj) {
        
    }

    @Override
    public void editar(Curso obj) {
    }

    @Override
    public void remover(Curso obj) {
    }

    @Override
    public Curso buscarPorID(int id) {
        String sql = "select * from curso where id = ?";
        Curso curso = null;
        try {
        PreparedStatement pstmt = getConnection().prepareStatement(sql);
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();
        
        while(rs.next()){
         curso = new Curso(rs.getInt("id"));
         curso.setNome(rs.getString("nome"));
        }
        rs.close();
        pstmt.close();
        getConnection().close();
        
    } catch (SQLException ex) {
    ex.printStackTrace();
    
}
    return null;
    }
}
