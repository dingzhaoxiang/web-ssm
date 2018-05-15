<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>登录界面</title>
    <base href="<%=basePath%>">
    <link href="<%=basePath%>css/login.css" rel="stylesheet" />

</head>
<body background="images/313681.jpg">
<div class="box">
    <h2 class="title_login">巨有钱商城</h2>
    <br>
    <div class="login">
        <form action="<%=request.getContextPath()%>/user/showUser.do" method="post">
            &nbsp;&nbsp;用户账号:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  size="25" name="userName" id="userName" onkeyup="recordInput(this.value)">
            <br>
            &nbsp;&nbsp;输入记录:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  size="25" name="inputrecord" id="inputrecord">
            <br><br><br><br>
            <input type="submit" class="submit_login" value="提交">
        </form>
    </div>
</div>

<script src="<%=basePath%>js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="<%=basePath%>js/login.js?ver=1" type="text/javascript"></script>
</body>
<script type="text/javascript">
    var loginUrl ="<%=request.getContextPath()%>/login/userAuthen.do"
</script>
</html>
