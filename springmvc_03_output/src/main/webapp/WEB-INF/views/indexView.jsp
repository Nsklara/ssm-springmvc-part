<%--
  Created by IntelliJ IDEA.
  User: NSZX
  Date: 2023/12/24
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%-- 取出共享域request中的数据
        request.setAttribute("data","hello jsp~");
    --%>
    <font color="red">${data}</font> <%--动态装配--%>
</body>
</html>
