<%--
  Created by IntelliJ IDEA.
  User: Zhangxq
  Date: 2016/7/16
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>商品信息列表</title>
</head>
<body>
    <c:if test="${!empty goodsList}">
        <c:forEach var="goods" items="${goodsList}">
            id：${goods.id} &nbsp;&nbsp;名字：${goods.name} &nbsp;&nbsp;价格：${goods.price} &nbsp;&nbsp;<br>
        </c:forEach>
    </c:if>
    <p>test5</p>
    <a href="<%=request.getContextPath() %>/jsp/login.jsp" name="登录界面">跳到login</a>
</body>
</html>
