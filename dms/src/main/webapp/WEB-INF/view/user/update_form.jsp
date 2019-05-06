<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>修改信息</title>
	</head>
	<body>
		<div>
			<form action="update" method="post">
				<table>
					<tr>
						<td>姓名</td>
						<td><input type="text" name="username" id="username" value="${user.username }"/></td>
						<td><input type="hidden" name="userId" id="userId" value="${user.userId }"/></td>
					</tr>
					<tr>
						<td>性别</td>
						<td>
							<input type="radio" name="gender" id="gender" value="${user.gender }" />男&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="radio" name="gender" id="gender" value="${user.gender }" />女
						</td>
					</tr>
					<tr>
						<td>联系电话</td>
						<td><input type="text" id="cellphone" name="cellphone" value="${user.cellphone }"/></td>
					</tr>
					<tr>
						<td>登录密码</td>
						<td><input type="password" id="password" name="password" value="${user.password }"/></td>
					</tr>
					<tr>
						<td>身份证号码</td>
						<td><input type="text" id="idCard" name="idCard" value="${user.idCard }"/></td>
					</tr>
					<tr>
						<td>
							<button type="submit">确认修改</button>
							<a href="list">返回</a>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>