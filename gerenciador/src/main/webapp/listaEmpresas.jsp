<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="java.util.List"%>
<%@page import="gerenciador.com.github.gcestaro.servlet.Empresa"%>

<%
List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresas</title>
</head>
<body>
	<ul>

		<%
		for (var empresa : empresas) {
		%>
		<li><%=empresa.getNome()%></li>
		<%
		}
		;
		%>
	</ul>
</body>
</html>