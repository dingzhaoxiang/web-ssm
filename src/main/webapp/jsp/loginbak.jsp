<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <!---->
   <base href="<%=basePath%>">
</head>
<body>
<a href="user/showUser.do">跳到showUser</a>
<form action="user/showUser.do" method="post">
    <p>请输入要查询的手机号</p><input type="text" name="user_phone">
    <br>
    <input type="submit" value="表单提交--跳到showUser">
</form>
<script src="<%=basePath%>js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="<%=basePath%>js/login.js" type="text/javascript"></script>
</body>

</html>
