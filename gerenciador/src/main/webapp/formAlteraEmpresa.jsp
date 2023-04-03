<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualização de empresas</title>
</head>
<body>

	<form action="${linkServletAlteraEmpresa}" method="post">
		Nome: <input type="text" name="lblNomeEmpresa" value="${empresa.nome}" />
		<input type="date" name="dtAberturaEmpresa"
			value="${empresa.dataAbertura}" /> 
		<input type="hidden" name="uuid"
			value="${empresa.uuid}" /> 
		<input type="submit"
			name="btnAlterarEmpresa" />
	</form>
</body>
</html>