package Multi_frameworks_back.multiframework.persistence;

import Multi_frameworks_back.multiframework.model.Comment;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CommentService {
    public List<Comment> getAllCommentByIdPublication( Integer idPublication){
        SqlSession sqlSession = null;
        try{
            sqlSession = SessionFactory.getInstance().getFactory().openSession();
            List<Comment> comments = sqlSession.selectList("Comment.getAllCommentByIdPublication", idPublication);
            return comments;

        } catch (Exception e) {
            System.out.println("Error al obtener todas los comentarios" + e.getMessage());
        }

        return null;
    }

    public void addComment(Comment comment){
        SqlSession sqlSession = null;
        try{
            sqlSession = SessionFactory.getInstance().getFactory().openSession();
            sqlSession.insert("Comment.addComment", comment);
            sqlSession.commit();
        }catch (Exception e){
            System.out.println("Error al agregar comentario" + e.getMessage());
        }
    }


}
