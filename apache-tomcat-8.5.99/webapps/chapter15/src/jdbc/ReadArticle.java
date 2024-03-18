package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ReadArticle {

    ArticleDao articleDao = null;

    public Article read(int articleId) throws Exception{
        Connection conn = null;

        try{
            String jdbcUrl="jdbc:apache:commons:dbcp:chap14";
            conn = DriverManager.getConnection(jdbcUrl);
            conn.setAutoCommit(false);

            articleDao = ArticleDao.getInstance();

            Article article = articleDao.selectById(conn, articleId);
            if(article == null){
            }
            article.increaseReadCount();
            articleDao.updateReadCount(conn, article);
            conn.commit();
            return article;

        }catch(SQLException ex){
            JdbcUtil.rollback(conn);
            throw ex;
        }finally{
            JdbcUtil.close(conn);
        }
    }
}
