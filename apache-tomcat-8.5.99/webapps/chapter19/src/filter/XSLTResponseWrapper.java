package webapps.chapter19.src.filter;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class XSLTResponseWrapper extends HttpServletResponseWrapper{
    
    private ResponseBufferWriter buffer = null;

    public XSLTResponseWrapper(HttpServletResponse res){
        super(res);
        buffer = new ResponseBufferWriter();
    }
    @Override
    public PrintWriter getWriter() throws IOException{
        return buffer;
    }
    @Override
    public void setContentType(String contentType){

    }
    public String getBufferedString(){
        return buffer.toString();
    }
}
