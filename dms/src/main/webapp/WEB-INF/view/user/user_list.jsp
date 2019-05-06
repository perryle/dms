<%@page import="java.util.List"%>
<%@page import="cn.ekgc.dms.pojo.entity.User"%>
<%@page import="cn.ekgc.dms.pojo.vo.Page"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>欢迎：${user.username }</h1>
		<a href="add">添加新用户</a>
		<a href="login">重新登录</a>
		
		<table>
			<thead>
				<tr>
					<th>序&nbsp;&nbsp;号</th>
					<th>姓&nbsp;&nbsp;名</th>
					<th>性&nbsp;&nbsp;别</th>
					<th>联系电话</th>
					<th>身份证号码</th>
					<th>创&nbsp;建&nbsp;时&nbsp;间</th>
					<th>修&nbsp;改&nbsp;时&nbsp;间</th>
					<th>操&nbsp;&nbsp;&nbsp;&nbsp;作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${page.list }" var="user" varStatus="s">
					<tr>
						<td>${s.index + 1 }</td>
						<td>${user.username }</td>
						<td>
							<c:choose>
								<c:when test="${'M' eq user.gender }">男</c:when>
								<c:otherwise>女</c:otherwise>
							</c:choose>
						</td>
						<td>${user.cellphone }</td>
						<td>${user.idCard }</td>
						<td>
							<fmt:formatDate value="${user.createDate }" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>
						<td>
							<fmt:formatDate value="${user.updateDate }" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>
						<td>
							<a href="update?userId=${user.userId }">修改</a>
							<a href="delete?userId=${user.userId }">删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="7" align="center">
						<a href="list?pageNum=1">首页</a>&nbsp;&nbsp;&nbsp;
						<c:choose>
							<c:when test="${page.pageNum eq 1 }">上一页&nbsp;&nbsp;&nbsp;</c:when>
							<c:otherwise>
								<a href="list?pageNum=${page.pageNum - 1 }">上一页&nbsp;&nbsp;&nbsp;</a>
							</c:otherwise>
						</c:choose>
						<c:choose>
							<c:when test="${page.pageNum eq page.totalPage }">下一页&nbsp;&nbsp;&nbsp;</c:when>
							<c:otherwise>
								<a href="list?pageNum=${page.pageNum + 1 }">下一页&nbsp;&nbsp;&nbsp;</a>
							</c:otherwise>
						</c:choose>
						<a href="list?pageNum=${page.totalPage }">末页</a>
					</td>
				</tr>
			</tfoot>
		</table>
	</body>
</html>