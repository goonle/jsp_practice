/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-03-05 23:03:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;

public final class catch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/C:/Users/USER/git/jsp_practice/jsp_practice/apache-tomcat-8.5.99/lib/jstl-1.2.jar", Long.valueOf(1709548827874L));
    _jspx_dependants.put("jar:file:/C:/Users/USER/git/jsp_practice/jsp_practice/apache-tomcat-8.5.99/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("java.util.HashMap");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<title>\r\n");
      out.write("		</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("        <p>\r\n");
      out.write("            I just code like this 'int abc= 1/0;'\r\n");
      out.write("        </p>\r\n");
      out.write("        ");
      //  c:catch
      org.apache.taglibs.standard.tag.common.core.CatchTag _jspx_th_c_005fcatch_005f0 = (org.apache.taglibs.standard.tag.common.core.CatchTag) _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar.get(org.apache.taglibs.standard.tag.common.core.CatchTag.class);
      boolean _jspx_th_c_005fcatch_005f0_reused = false;
      try {
        _jspx_th_c_005fcatch_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fcatch_005f0.setParent(null);
        // /catch.jsp(13,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fcatch_005f0.setVar("exception");
        int[] _jspx_push_body_count_c_005fcatch_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fcatch_005f0 = _jspx_th_c_005fcatch_005f0.doStartTag();
          if (_jspx_eval_c_005fcatch_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("            ");

                int abc = 1/0;
            
              out.write("\r\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_c_005fcatch_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fcatch_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fcatch_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fcatch_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fcatch_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fcatch_0026_005fvar.reuse(_jspx_th_c_005fcatch_005f0);
        _jspx_th_c_005fcatch_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fcatch_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fcatch_005f0_reused);
      }
      out.write("\r\n");
      out.write("        <p style=\"border:1px solid #abe105;\">\r\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${exception}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </p>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
