<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%--
  Created by IntelliJ IDEA.
  User: hanna
  Date: 07/04/2019
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show hobbies</title>
</head>
<body>
<d:forEach var="hobby" items="${paramValues.hobby}">
    ${hobby}
</d:forEach>

"${fn:join(hobby, "/")}"
</body>
</html>
