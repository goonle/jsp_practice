package jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class ArticleDao {
    
    private static ArticleDao instance;
    public static ArticleDao getInstance(){
        return instance;
    }
    public Article selectById(Connection conn,int i){
        
        return new Article();
    }

    public void updateReadCount(Connection conn, Article article){
        try{
            if(conn != null) {
                conn.prepareStatement("update chapter15 set read_count = ? where article_id = ?");
            }
        }catch(SQLException ex){

        }
    }
}
