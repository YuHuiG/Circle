<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0054)http://szyunwo.gotoip2.com/jzadmin/Rongzi/indexren.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx }/resource/css/content.css">
<meta name="__hash__"
	content="9436c2500f81c2ada907878361960c07_ac4c32685e98b86c7656fd8136a4eadf">
</head>

<body>

	<div class="location">当前位置:融资直通车 &gt; 投资机构管理 &gt; 投资人信息列表</div>
	<form action="${ctx }/invest/investorList" name="listForm" method="post">
		<table width="100%" cellspacing="1" class="listtable">
			<tbody>
				<tr>
					<th class="wid60">ID</th>
					<th class="wid150">姓名</th>
					<th class="wid150">头像</th>
					<th class="wid150">所在地</th>
					<th class="wid100">操作</th>
				</tr>
				<c:forEach items="${ph.list }" var="tor">
				<tr>
					<td>${tor.iumId }</td>
					<td style="text-indent: 0; padding-left: 12px;">${tor.iumName}<br> <font
						color="#999"> ${tor.iumSubhead}</font></td>
					<td align="center"><img src="${ctx}/20170410173306_13749.jpg"
						width="60"></td>
					<td>${tor.iumArea}</td>
					<td align="center"><a
						href="${ctx }/invest/showInvestorUpdate?iumId=${tor.iumId}"
						class="marlr5">编辑</a><a
						href="${ctx }/invest/deleteInvestor?iumId=${tor.iumId}"
						class="marlr5" onclick="return confirm(&#39;确定要删除此帐号吗？&#39;)">删除</a></td>
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