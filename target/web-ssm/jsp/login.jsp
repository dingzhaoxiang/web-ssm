<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <link href="images/42.jpg" rel="shortcut icon" />
    <title>登录界面</title>
    <base href="<%=basePath%>">
    <link href="<%=basePath%>css/login.css?ver=1" rel="stylesheet" />

</head>
<body background="images/313681.jpg">
<div class="box">
    <h2 class="title_login">巨有钱商城</h2><p class="QR_Login">二维码登录</p>
    <br>
    <div class="login">
        <div>
            &nbsp;&nbsp;用户账号:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  size="25" name="userName" id="userName" onkeyup="recordInput(this.value)">
            <br>
            &nbsp;&nbsp;输入记录:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  size="25" name="inputrecord" id="inputrecord">
            <br>
            &nbsp;&nbsp;登录密码:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"  size="25" name="password" id="password">
            <br><br><br><br><br><br>
            <input type="button" class="submit_login" value="提交" onclick="userAuten()">
        </div>
    </div>
</div>
<div class="qrdiv">
    <h2 align="center" class="scan">拿出手机扫一扫</h2>
    <img class="qrCode" src="<%=request.getContextPath() %>/login/displayQRCode.do"><br>
</div>
<script src="<%=basePath%>js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="<%=basePath%>js/login.js?ver=1" type="text/javascript"></script>
</body>
<script type="text/javascript">
    var loginUrl ="<%=request.getContextPath()%>/login/inputRecord.do"
    var authenUrl ="<%=request.getContextPath()%>/login/userAuthen.do"

</script>
</html>
