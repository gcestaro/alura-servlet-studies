<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:url value="/novaEmpresa" var="linkServletNovaEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de empresas</title>
</head>
<body>

	<form action="${linkServletNovaEmpresa}" method="post">
		Nome: <input type="text" name="lblNomeEmpresa" /> <input type="date"
			name="dtAberturaEmpresa" /> <input type="submit"
			name="btnCadastrarEmpresa" />
	</form>
</body>
</html>