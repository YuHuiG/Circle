<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0052)http://szyunwo.gotoip2.com/jzadmin/Xiangmu/index.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<meta name="__hash__"
	content="bd1271209ce75fa3d01ed5bd0e2fe823_1e028eb91613d0163b97d32a182ad2f7">
</head>

<body>

	<div class="location">当前位置: 选项目 &gt; 信息管理 &gt; 信息列表</div>
<form action="${ctx}/project/projectImsList" method="post" name="listForm">
	<table width="100%" cellspacing="1" class="listtable">
		<tbody>
			<tr>
				<th class="wid60">选择</th>
				<th class="wid60">ID</th>
				<th class="wid60">排序</th>
				<th class="wid60">所属行业</th>
				<th class="wid60">所在地区</th>
				<th class="wid60">融资方式</th>
				<th class="wid150">标题</th>
				<th class="wid60">浏览量</th>
				<th class="wid60">发布日期</th>
				<th class="wid100">操作</th>
			</tr>
			<c:forEach items="${ph.list}" var="pm">
				<tr>
					<td align="center"><input name="idstr[]" type="checkbox"
						value="33"></td>
					<td align="center">${pm.pmId }</td>
					<td align="center"><input name="px[]" type="text"
						class="inpbor wid60" value="${pm.pmSort }"></td>
					<td align="center">${pm.pmJob }</td>
					<td align="center">${pm.pmAddress }</td>
					<td align="center">${pm.pmType }</td>
					<td>${pm.pmTitle }</td>
					<td align="center">${pm.pmNum }</td>
					<td align="center">${pm.pmDate }</td>
					<td align="center"><a href="${ctx }/project/showImsUpdate?pmId=${pm.pmId }" class="marlr5">编辑</a><a
						href="${ctx}/project/deleteIms?pmId=${pm.pmId }" class="marlr5"
						onclick="return confirm(&#39;确定要删除此帐号吗？&#39;)">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div class="location pageshow">
		<div>
			<%@include file="page.jsp"%>
		</div>
	</div>
</form>
</body>
</html>