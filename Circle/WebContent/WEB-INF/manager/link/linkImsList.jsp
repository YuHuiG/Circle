<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0049)http://szyunwo.gotoip2.com/jzadmin/Link/index.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<meta name="__hash__"
	content="e265ad1c71f2407d8d230233cd9b8b7d_1cb34b842f83b277dbf793d0ba725aa3">
</head>

<body>

	<div class="location">当前位置:链接管理 &gt; 信息管理 &gt; 信息列表</div>
	<form action="${ctx}/link/linkImsList" name="listForm" method="post"></form>
	<table width="100%" cellspacing="1" class="listtable">
		<tbody>
			<tr>
				<th class="wid60">选择</th>
				<th class="wid60">ID</th>
				<th class="wid60">排序</th>
				<th class="wid60">所属分类</th>
				<th class="wid150">图片</th>
				<th class="wid150">标题</th>
				<th class="wid100">操作</th>
			</tr>
			<tr>
				<c:forEach items="${ph.list}" var="linkm">
					<tr>
						<td align="center"><input name="idstr[]" type="checkbox"
							value="${linkm.lmId }"></td>
						<td align="center">${linkm.lmId }</td>
						<td align="center"><input name="px[]" type="text"
							class="inpbor wid60" value="${linkm.lmSort }"></td>
						<td align="center"><font color="red">${linkm.lmTypeid }</font></td>
						<td align="center"><img
							src="${ctx}/resource/img/20170413101453_16672.jpg" width="60"></td>
						<td align="center">${linkm.lmTitle }</td>
						<td align="center"><a
							href="${ctx}/link/showlinkImsUpdate?id=${linkm.lmId}"
							class="marlr5">编辑</a><a
							href="${ctx}/link/deletelinkIms?id=${linkm.lmId}" class="marlr5"
							onclick="return confirm(&#39;确定要删除此帐号吗？&#39;)">删除</a></td>
					</tr>
				</c:forEach>
		</tbody>
	</table>

	<div class="location pageshow">
		<div>
			<%@ include file="page.jsp"%>
		</div>
	</div>

</body>
</html>