package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gestion de Productos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulario Ingreso Productos</h1>       ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	cl.services.webservices.ProductoWS_Service service = new cl.services.webservices.ProductoWS_Service();
	cl.services.webservices.ProductoWS port = service.getProductoWSPort();
	 // TODO initialize WS operation arguments here
	int codigo = Integer.parseInt(request.getParameter("codigo"));
	java.lang.String nombre = request.getParameter("nombre");
	int precio = Integer.parseInt(request.getParameter("precio"));
	int stock = Integer.parseInt(request.getParameter("stock"));
	java.lang.String descripcion = request.getParameter("descripcion");
	// TODO process result here
	java.lang.String result = port.ingresarProducto(codigo, nombre, precio, stock, descripcion);
	out.println("<font color='red'>"+result+"</font>");
    } catch (Exception ex) {
	//out.print("<font color='red>"+"No se  ingreso correctamente"+"</font>");
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write(" \n");
      out.write("     ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	cl.services.webservices.ProductoWS_Service service = new cl.services.webservices.ProductoWS_Service();
	cl.services.webservices.ProductoWS port = service.getProductoWSPort();
	 // TODO initialize WS operation arguments here
	int codigo = Integer.parseInt(request.getParameter("codigo"));
	// TODO process result here
	java.lang.String result = port.buscarProducto(codigo);
	out.println("<font color='blue'>"+"Resultado de la consulta "+result+"</font>");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    \n");
      out.write("    <form action=\"index.jsp\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>Codigo</th>\n");
      out.write("                <td><input type=\"text\" name=\"codigo\" size=\"10\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>nombre:</th>\n");
      out.write("                <td><input type=\"text\" name=\"nombre\" size=\"20\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Precio</th>\n");
      out.write("                <td><input type=\"text\" name=\"precio\" size=\"10\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Stock</th>\n");
      out.write("                <td><input type=\"text\" name=\"stock\" size=\"10\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Descripcion</th>\n");
      out.write("                <td><input type=\"text\" name=\"descripcion\" size=\"20\" required/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <td colspan=\"2\"><input type=\"submit\" value=\"Enviar\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("    <h1>Buscar Producto</h1>\n");
      out.write("    <form action=\"index.jsp\" method=\"post\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <th>codigo:</th>\n");
      out.write("                <th><input type=\"text\" name=\"codigo\" size=\"10\" required/></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\"><input type=\"submit\" value=\"Buscar\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
