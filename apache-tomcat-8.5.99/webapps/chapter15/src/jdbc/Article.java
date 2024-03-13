package jdbc;

public class Article {
    int articleId;
    int readCount=0;

    public void increaseReadCount(){
        readCount += 1;
    }
}
