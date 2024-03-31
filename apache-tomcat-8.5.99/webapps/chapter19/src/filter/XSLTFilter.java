package webapps.chapter19.src.filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

@WebFilter(filterName = "xsltFilter" , urlPatterns = {"/xml/*"})
public class XSLTFilter implements Filter{
    
    private String xslPath = null;

    @Override
    public void init(FilterConfig config) throws ServletException {
        xslPath = config.getServletContext().getRealPath("/WEb-INF/xml/book.xsl");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        //컨텐츠 타입 설정
        response.setContentType("text/html; chartset=utf-8");
        //http response 값 담기
        PrintWriter writer = response.getWriter();
        XSLTResponseWrapper responseWrapper = new XSLTResponseWrapper((HttpServletResponse) response);
        //request 에 대한 결과를 responseWrapper에 담는다.
        chain.doFilter(request, responseWrapper);

        try{
            //xsl 파일 읽기
            TransformerFactory factory = TransformerFactory.newInstance();
            Reader xslReader = new BufferedReader(new FileReader(xslPath));

            StreamSource xslSource = new StreamSource(xslReader);
            //값 변경
            Transformer transformer = factory.newTransformer(xslSource);
            //http response 값 xml 형식으로 담기
            String xmlDocument = responseWrapper.getBufferedString();
            Reader xmlReader = new StringReader(xmlDocument);
            StreamSource xmlSource = new  StreamSource(xmlReader);
            //transformer에 담기
            StringWriter buffer = new StringWriter(4096);
            transformer.transform(xmlSource, new StreamResult(buffer));

            writer.print(buffer.toString());

        }catch (Exception e){
            throw new ServletException();
        }

        writer.flush();
        writer.close();

    }

    @Override
    public void destroy(){

    }
}
