<%-- <%@page import="com.mysql.jdbc.Field"%> --%>
<%@page import="com.mysql.jdbc.*" %>
<%@ page language="java" contentType="texts/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://szyunwo.gotoip2.com/jzadmin/Zijin/index.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">

<meta name="__hash__"
	content="18709489df31e66dbb1d72f0c6605cab_2c869daebe1cf247d85f29acf156ee9f">
</head>

<body>

	<div class="location">当前位置:找资金 &gt; 信息管理 &gt; 信息列表</div>
	<form action="${ctx}/fmoney/FMIMSList" method="post" name="listForm">
		<table width="100%" cellspacing="1" class="listtable">
			<tbody>
				<tr>
					<th class="wid60">选择</th>
					<th class="wid60">ID</th>
					<th class="wid60">排序</th>
					<th class="wid60">投资方式</th>
					<th class="wid150" align="left">标题</th>
					<th class="wid60">资金类型</th>
					<th class="wid60">所在地区</th>
					<th class="wid60">浏览量</th>
					<th class="wid150">发布日期</th>
					<th class="wid100">操作</th>
				</tr>
				<c:forEach items="${ph.list}" var="fm">
					<tr>
						<td align="center"><input name="idstr[]" type="checkbox"
							value="${fm.capId }"></td>
						<td align="center">${fm.capId}</td>
						<td align="center"><input name="px[]" type="text"
							class="inpbor wid60" value="${fm.descId}"></td>


						<td align="center"><c:if test="${fm.capWayId==0}">不限</c:if> <c:if
								test="${fm.capWayId!=0}">
								<c:forEach items="${listsmalltype}" var="smalltype">
									<c:if test="${smalltype.ccId==fm.capWayId}">${smalltype.ccName}</c:if>
								</c:forEach>
							</c:if></td>
						<td>${fm.capTitle }<c:if test="${fm.capImg!='' && fm.capImg!=null}">
								<font color="red">[图片]</font>
							</c:if>
						</td>
						<td align="center"><c:if test="${fm.capTypeId==0}">不限</c:if>
							<c:if test="${fm.capTypeId!=0}">
								<c:forEach items="${listsmalltype}" var="smalltype">
									<c:if test="${smalltype.ccId==fm.capTypeId}">${smalltype.ccName}</c:if>
								</c:forEach>
							</c:if></td>
						<td align="center"><c:if test="${fm.capAreaId==0}">不限</c:if>
							<c:if test="${fm.capAreaId!=0}">
								<c:forEach items="${listsmalltype}" var="smalltype">
									<c:if test="${smalltype.ccId==fm.capAreaId}">${smalltype.ccName}</c:if>
								</c:forEach>
							</c:if></td>
						<td align="center">${fm.ll}12863</td>
						<td align="center">${fm.fbdate}</td>
						<td align="center"><a
							href="${ctx}/fmoney/showFMIMSUpdate?id=${fm.capId}"
							class="marlr5">编辑</a><a
							href="${ctx}/fmoney/FMIMSdelete?id=${fm.capId}" class="marlr5"
							onclick="return confirm(&#39;确定要删除此信息吗？&#39;)">删除</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<div class="location pageshow">
			<div>
				<%@include file="page.jsp"%>
			</div>
		</div>
		<input type="hidden" name="__hash__"
			value="18709489df31e66dbb1d72f0c6605cab_2c869daebe1cf247d85f29acf156ee9f">
	</form>

</body>
</html>