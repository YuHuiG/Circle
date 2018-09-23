<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0048)http://szyunwo.gotoip2.com/jzadmin/Link/cate.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<meta name="__hash__"
	content="8bdcaccdd1d46d29dea3f53b498a5de3_884974fd90feea206beeeae2a86940b8">
</head>

<body>

	<div class="location">当前位置:链接管理 &gt; 类别管理 &gt; 分类管理</div>

	<form action="${ctx}/link/linkTypeList"
		method="post" name="listform">
		<table width="100%" cellspacing="1" class="listtable">
			<tbody>
				<tr>
					<th class="wid60">ID</th>
					<th class="wid100">排序</th>
					<th>类别名称</th>
					<th class="wid100">操作</th>
				</tr>
				<c:forEach items="${list }" var="link">
					<tr>
						<td>${link.ltId }</td>
						<td><input name="px[]" type="text" class="inpbor wid60"
							value="${link.ltSort }"></td>
						<td><p style="padding-left: 10px;">${link.ltNmae}</p></td>
						<td><a href="${ctx}/link/showlinkTypeUpdate?id=${link.ltId}"
							class="marlr5">编辑</a><a
							href="${ctx}/link/deletelinkType?id=${link.ltId}" class="marlr5"
							onclick="return confirm(&#39;确定要删除吗？&#39;)">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="mainfoot">
			<input type="submit" name="anniu" value="更新排序">
		</div>
		<input type="hidden" name="__hash__"
			value="8bdcaccdd1d46d29dea3f53b498a5de3_884974fd90feea206beeeae2a86940b8">
	</form>

</body>
</html>