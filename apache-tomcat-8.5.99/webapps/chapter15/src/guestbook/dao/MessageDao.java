package guestbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import guestbook.model.Message;
import jdbc.JdbcUtil;

public class MessageDao {

    private static MessageDao msgDao = new MessageDao();
    public static MessageDao getInstance(){
        return msgDao;
    }

    private MessageDao(){}

    //insert message with guest information
    public int insert(Connection conn, Message message) throws SQLException {
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(
                "insert into guestbook_message (guest_name, password, message) values (?, ?, ?)"
                );
            pstmt.setString(1, message.getGuestName());
            pstmt.setString(2, message.getPassword());
            pstmt.setString(3, message.getMessage());
            return pstmt.executeUpdate();
        }finally{
            JdbcUtil.close(pstmt);
        }
    }
    //select message row by message_id
    public Message Select(Connection conn, int messageId) throws SQLException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.prepareStatement(
                "selct * from guestbook_message where message_id = ? "
                );
            pstmt.setInt(1, messageId);
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                return makeMessageFromResultSet(rs);
            }else {
                return null;
            }

        }finally{
            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
        }
    }
    
    //get message object by resultSet
    private Message makeMessageFromResultSet(ResultSet rs) throws SQLException {
        Message message = new Message();
        message.setId(rs.getInt("message_id"));
        message.setGuestName(rs.getString("guest_name"));
        message.setPassword(rs.getString("password"));
        message.setMessage(rs.getString("message"));
        return message;
    }
    //select whole rows count
    public static int selectCount(Connection conn) throws SQLException{
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) from guestbook_message");
            rs.next();
            return rs.getInt(1);
        } finally{
            JdbcUtil.close(rs);
            JdbcUtil.close(stmt);
        }
    }

    //get message list by start idx and end idx
    public List<Message> selectList(Connection conn, int firstRow, int endRow) throws SQLException{
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try{
            pstmt = conn.prepareStatement("select message_id, guest_name, password, message from guestbook_message order by message_id desc limit ?, ?");
            pstmt.setInt(1, firstRow -1);
            pstmt.setInt(2, endRow - firstRow + 1);
            rs = pstmt.executeQuery();

            if(rs.next()){
                List<Message> messageList = new ArrayList<Message>();
                do {
                    messageList.add(makeMessageFromResultSet(rs));
                }while(rs.next());
                return messageList;
            }else {
                return Collections.emptyList();
            }
        } finally {
            JdbcUtil.close(rs);
            JdbcUtil.close(pstmt);
        }
    }
    //delete row by id
    public int delete(Connection conn, int messageId) throws SQLException {
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement("delete guestbook_message where message_id = ?");
            pstmt.setInt(1, messageId);
            return pstmt.executeUpdate();
        }finally{
            JdbcUtil.close(pstmt);
        }
    }


}
