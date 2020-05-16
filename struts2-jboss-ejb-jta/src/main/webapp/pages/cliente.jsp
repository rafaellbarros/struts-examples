<%--
  Created by IntelliJ IDEA.
  User: rafael
  Date: 16/05/2020
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags"  prefix="s" %>
<%@ taglib uri="/WEB-INF/tlds/c.tld" prefix="c"%>
<html>
<head>
    <title>Cliente</title>
</head>

<body>
    <h1>${titulo}</h1>
    <c:forEach var="cliente" items="${clientes}">
        <strong>Nome:</strong> <c:out value="${cliente.nome}"/> <br />
    </c:forEach>

</body>
</html>

