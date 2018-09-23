<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0051)http://szyunwo.gotoip2.com/jzadmin/Xiangmu/cate.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<meta name="__hash__"
	content="1f7096c1b794694781dfa2d224fce19d_c32241d6631c6e5d140ee802970599cb">
</head>

<body>

	<div class="location">当前位置:选项目 &gt; 类别管理 &gt;分类管理</div>

	<form action="${ctx}/project/projectTypeList" method="post"
		name="listform">
		<table width="100%" cellspacing="1" class="listtable">
			<tbody>
				<tr>
					<th class="wid60">ID</th>
					<th class="wid100">排序</th>
					<th>类别名称</th>
					<th class="wid100">操作</th>
				</tr>
				<c:forEach items="${Sprojlist }" var="s">

					<tr>
						<td>${s.pId}</td>
						<td><input name="px[]" type="text" class="inpbor wid60"
							value="${s.pSort}"></td>
						<td><p style="padding-left: 10px;">${s.pName}</p></td>
						<td><a href="{ctx}/project/showTypeUpdate?pId=${b.pId}" class="marlr5">编辑</a><a
							href="${ctx}/project/projectTypedelete?pId=${b.pId}" class="marlr5"
							onclick="return confirm(&#39;删除此类别同时也会删除所有子分类，确定要删除吗？&#39;)">删除</a></td>
					</tr>

					<c:forEach items="${Bprojlist }" var="b">
						<c:if test="${s.pId==b.pIds}">

							<tr>
								<td>${b.pId}</td>
								<td><input name="px[]" type="text" class="inpbor wid60"
									value="${b.pSort}"></td>
								<td><p style="padding-left: 30px;">└──&gt;${b.pName}</p></td>
								<td><a href="${ctx}/project/showTypeUpdate?pId=${b.pId}" class="marlr5">编辑</a><a
									href="${ctx}/project/projectTypedelete?pId=${b.pId}" class="marlr5"
									onclick="return confirm(&#39;删除此类别同时也会删除所有子分类，确定要删除吗？&#39;)">删除</a></td>
							</tr>
						</c:if>
					</c:forEach>
				</c:forEach>
			</tbody>
		</table>

		<div class="mainfoot">
			<input type="submit" name="anniu" value="更新排序">
		</div>
		<input type="hidden" name="__hash__"
			value="1f7096c1b794694781dfa2d224fce19d_c32241d6631c6e5d140ee802970599cb">
	</form>

</body>
</html>