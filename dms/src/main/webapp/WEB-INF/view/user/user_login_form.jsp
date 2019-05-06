<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登录</title>
		<link rel="stylesheet" type="text/css" href="../static/css/login.css"/>
	</head>
	<body>
		<div class="body">
			<form action="login" method="post">
				<table>
					<tr>
						<td>用户姓名</td>
						<td>
							<input type="text" id="cellphone" name="cellphone" placeholder="请输入手机号码">
						</td>
					</tr>
					<tr>
						<td>登录密码</td>
						<td>
							<input type="password" id="password" name="password" placeholder="请输入登录密码">
						</td>
					</tr>
					<tr>
						<td>
							<button type="submit">登录</button>
							<a href="add">立即注册</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>