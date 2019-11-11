<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QQ注册</title>
<script type="text/javascript" src="<%=basePath%>/static/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/jsonHandler.js"></script>
</head>
<body>
	<center>
		<form action="javascript:void(0)" id="form1">
			<table border="1px" width="300px">
				<tr>
					<td>昵称：</td>
					<td><input type="text" name="nick" placeholder="请输入4-10位字符" ></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="pwd" placeholder="请输入6-16位字符" ></td>
				</tr>
				<tr>
					<td>手机号：</td>
					<td><input type="text" name="phone" placeholder="请输入正确的手机号格式" ></td>
				</tr>
				<tr>
					<td>邮箱：</td>
					<td><input type="email" name="email" placeholder="请输入正确的邮箱格式"></td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input type="text" name="age" placeholder="请输入一个正整数" ></td>
				</tr>
				<tr>
					<td><input type="submit" value="注册" id="reg"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
			</table>
		</form>
	</center>
	
	<script type="text/javascript">
		/* 在注册按钮上添加一个单机事件 */
		$(function(){
			$("#reg").click(function(){
				//json对象
				var json = $("#form1").serializeObject();
				//将json对象转成json字符串
				$.ajax({
					url:"/qq/registerQQ",
					type:"post",
					dataType:"json",
					data:json,
					success:function(result){
						alert("成功了");
					}
				});
			});
		});
	</script>
</body>
</html>