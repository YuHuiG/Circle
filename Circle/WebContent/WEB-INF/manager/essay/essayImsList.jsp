<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0052)http://szyunwo.gotoip2.com/jzadmin/Article/index.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<meta name="__hash__"
	content="49358c4b070c25b31e2921a0c777ca60_aef38196f3338b1a5addbb4d208a2688">
</head>

<body>

	<div class="location">当前位置:文章管理 &gt; 信息管理 &gt; 信息列表</div>
	<form action="${ctx}/essay/essayImsList" name="listForm" method="post">
		<table width="100%" cellspacing="1" class="listtable">
			<tbody>
				<tr>
					<th class="wid60">选择</th>
					<th class="wid60">ID</th>
					<th class="wid60">排序</th>
					<th class="wid60">所属分类</th>
					<th class="wid150">图片</th>
					<th class="wid150">标题</th>
					<th class="wid150">发布日期</th>
					<th class="wid100">操作</th>
				</tr>

				<c:forEach items="${ph.list }" var="em">
					<tr>
						<td align="center"><input name="idstr[]" type="checkbox"
							value="${em.emId }"></td>
						<td align="center">${em.emId }</td>
						<td align="center"><input name="px[]" type="text"
							class="inpbor wid60" value="${em.emSort }"></td>
						<td><font color="red">${em.emJobs }</font></td>
						<td align="center"><img
							src="${ctx }/resource/img/20170411101643_15721.jpg" width="60"></td>
						<td>${em.emTitle }</td>
						<td align="center">${em.emDate }</td>
						<td align="center"><a
							href="${ctx }/essay/showessayImsUpdate?id=${em.emId }"
							class="marlr5">编辑</a><a
							href="${ctx }/essay/deletesessayIms?id=${em.emId }"
							class="marlr5" onclick="return confirm(&#39;确定要删除此帐号吗？&#39;)">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="location pageshow">
			<div>
				<%@ include file="page.jsp"%>
			</div>
		</div>
	</form>
</body>
</html>