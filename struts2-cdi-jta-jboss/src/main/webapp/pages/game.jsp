<%--
  Created by IntelliJ IDEA.
  User: rafael
  Date: 10/05/2020
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags"  prefix="s" %>
<%@ taglib uri="/WEB-INF/tlds/c.tld" prefix="c"%>
<html>
<head>
    <title>Game Hello</title>
</head>

<body>
<h2>Game Hello - Struts 2 CDI Example</h2>

${game}


<c:forEach var="cliente" items="${clientes}">
    Cliente: <c:out value="${cliente.nome}"/> <br />
</c:forEach>


</body>
</html>

