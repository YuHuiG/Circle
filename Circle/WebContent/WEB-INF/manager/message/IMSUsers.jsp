<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://szyunwo.gotoip2.com/jzadmin/Admin/admin.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<meta name="__hash__"
	content="594b282fb18254989bb85dc2ea3989df_8553358ede34e3486f152ad64ccd9a8a">
</head>

<body>
<form action="${ctx}/IMSUsers" name="listForm">
	<div class="location">当前位置:系统管理 &gt; 帐户管理 &gt; 帐户列表</div>

	<table width="100%" cellspacing="1" class="listtable">
		<tbody>
			<tr>
				<th class="wid60">ID</th>
				<th>用户名</th>
				<th class="wid150">最近登录</th>
				<th class="wid150">IP</th>
				<th class="wid150">登录地址</th>
				<th class="wid100">操作</th>
			</tr>
			<c:forEach items="${ph.list}" var="u">
			<tr>
				<td>${u.id}</td>
				<td>${u.name}</td>
				<td>${u.reclog}</td>
				<td>${u.ip}</td>
				<td>${u.addr}</td>
				<td><a href="${ctx}/IMSUpdateUser?id=${u.id}" class="marlr5">编辑</a><a
					href="${ctx}/deleteUser?id=${u.id}"
					class="marlr5" onclick="return confirm(&#39;确定要删除此帐号吗？&#39;)">删除</a></td>
			</tr>
			<input type="hidden" name="id[]" value="${u.id}">
			</c:forEach>
		</tbody>
		<tr><%@include file="page.jsp"%></tr>
	</table>
</form>

</body>
</html>