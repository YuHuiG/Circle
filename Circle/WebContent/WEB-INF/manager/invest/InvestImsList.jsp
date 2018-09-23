<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0051)http://szyunwo.gotoip2.com/jzadmin/Rongzi/index.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<meta name="__hash__"
	content="692863585e7c3bbc3d05ae688606ca0d_67fe1c91a7992c23e2764a5a827220dc">
</head>

<body>

	<div class="location">当前位置:融资直通车 &gt; 信息管理 &gt; 信息列表</div>
<form action="${ctx}/invest/investImsList" name="listForm" method="post"></form>
	<table width="100%" cellspacing="1" class="listtable">
		<tbody>
			<tr>
				<th class="wid60">ID</th>
				<th class="wid150">所属分类</th>
				<th class="wid150">logo</th>
				<th class="wid150">标题</th>
				<th class="wid100">操作</th>
			</tr>

			<c:forEach items="${ph.list}" var="b">
				<tr>
					<td>${b.imId }</td>
					<td><font color="red"> <c:forEach items="${btype }"
								var="c">
								<c:if test="${b.itId== c.itId}">
									${c.itName }
									</c:if>
							</c:forEach>
					</font></td>
					<td align="center"><img src="${ctx}/20170410084509_25737.jpg"
						width="60"></td>
					<td>${b.imName }</td>
					<td align="center"><a
						href="${ctx}/invest/showInvestImsUpdate?imId=${b.imId }"
						class="marlr5">编辑</a><a
						href="${ctx}/invest/deleteIms?imId=${b.imId }" class="marlr5"
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

</body>
</html>