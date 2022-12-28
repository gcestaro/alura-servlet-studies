<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
// scriptlet
String nomeEmpresa = (String) request.getAttribute("nomeEmpresa");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
	<%-- 	<p>Empresa <% out.println(nomeEmpresa); %> cadastrada com sucesso</p> --%>
	<p>
		Empresa
		<%=nomeEmpresa%>
		cadastrada com sucesso
	</p>
</body>
</html>