package Multi_frameworks_back.multiframework.persistence;

import Multi_frameworks_back.multiframework.model.Publication;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PublicacionService {

    public List<Publication> getAllPublications() {
        SqlSession sqlSession = null;
        try{
            sqlSession = SessionFactory.getInstance().getFactory().openSession();
            List<Publication> publications = sqlSession.selectList("Publication.getAllPublication");
            return publications;

        } catch (Exception e) {
            System.out.println("Error al obtener todas las publicaciones" + e.getMessage());
        }



        return null;
    }

    public void addPublication(Publication publication){
        SqlSession sqlSession = null;
        try{
            sqlSession = SessionFactory.getInstance().getFactory().openSession();
            sqlSession.insert("Publication.addPublication", publication);
            sqlSession.commit();
        }catch (Exception e){
            System.out.println("Error al agregar publicacion" + e.getMessage());
        }
    }
}
