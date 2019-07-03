<%-- 
    Document   : index
    Created on : 03/07/2019, 01:23:44 PM
    Author     : elvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion de Productos</title>
    </head>
    <body>
        <h1>Formulario Ingreso Productos</h1>       <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
 
     <%-- start web service invocation --%><hr/>
    <%
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
    %>
    <%-- end web service invocation --%><hr/>
    
    <form action="index.jsp" method="post">
        <table>
            <tr>
                <th>Codigo</th>
                <td><input type="text" name="codigo" size="10" required/></td>
            </tr>
            <tr>
                <th>nombre:</th>
                <td><input type="text" name="nombre" size="20" required/></td>
            </tr>
            <tr>
                <th>Precio</th>
                <td><input type="text" name="precio" size="10" required/></td>
            </tr>
            <tr>
                <th>Stock</th>
                <td><input type="text" name="stock" size="10" required/></td>
            </tr>
            <tr>
                <th>Descripcion</th>
                <td><input type="text" name="descripcion" size="20" required/></td>
            </tr>
            <tr>
            <td colspan="2"><input type="submit" value="Enviar"></td>
            </tr>
        </table>
    </form>
    <h1>Buscar Producto</h1>
    <form action="index.jsp" method="post">
        <table>
            <tr>
                <th>codigo:</th>
                <th><input type="text" name="codigo" size="10" required/></th>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Buscar"></td>
            </tr>
        </table>
    </form>

    </body>
</html>
