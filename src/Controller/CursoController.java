
package Controller;

import br.com.model.Curso;
import Model.DAO.Curso;

public class CursoController extends GenericController<Curso> {
    
    @Override
    public Curso buscarporID(int id) {
        return new CursoDao().buscarporID(id);
    }
    
}
