<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:url value="/removeEmpresa" var="linkServletRemoveEmpresa" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresas</title>
</head>
<body>
	<c:if test="${ not empty nomeEmpresa }">
		<p>Empresa ${ nomeEmpresa } cadastrada com sucesso!</p>
	</c:if>

	Lista de empresas:
	<ul>
		<c:forEach items="${ empresas }" var="empresa">
			<fmt:parseDate value="${empresa.dataAbertura}" pattern="yyyy-MM-dd"
				var="dataAbertura" type="date" />



			<li>${ empresa.nome }-<fmt:formatDate pattern="dd/MM/yyyy"
					value="${dataAbertura}" /> <a
				href="${linkServletRemoveEmpresa }?uuid=${ empresa.uuid}">remover</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>