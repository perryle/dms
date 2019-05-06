<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="add_user" method="post">
			<table>
				<tr>
					<td>角色</td>
					<td>
						<select name="roleId" id="roleId">
							<option value="1">管理员</option>
							<option value="2">学员</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>姓名</td>
					<td><input type="text" name="username" id="username" placeholder="请输入您的姓名" /></td>
				</tr>
				<tr>
					<td>手机号码</td>
					<td><input type="text" name="cellphone" id="cellphone" placeholder="请输入您的手机号码" /></td>
				</tr>
				<tr>
					<td>性别</td>
					<td><input type="radio" name="gender" id="gender" value="M" checked="checked"/>男&nbsp;&nbsp;&nbsp;
						<input type="radio" name="gender" id="gender" value="F"/>女
					</td>
				</tr>
				<tr>
					<td>登录密码</td>
					<td><input type="password" name="password" id="password" placeholder="请输入您的登录密码" /></td>
				</tr>
				<tr>
					<td>身份证号码</td>
					<td><input type="text" name="idCard" id="idCard" placeholder="请输入您的身份证号码" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<button type="submit">立即注册</button>
						<a href="login">已有账号，直接登录</a>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>