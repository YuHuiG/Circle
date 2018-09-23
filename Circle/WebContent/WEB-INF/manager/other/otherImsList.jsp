<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://szyunwo.gotoip2.com/jzadmin/Other/index.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<meta name="__hash__"
	content="738a8a9f33fd3cff8a019242e769fdfc_df181b10cc0369222265d23592534eb9">
</head>

<body>

	<div class="location">当前位置:系统管理 &gt; 其他管理 &gt; 信息列表</div>
	<form action="${ctx}/other/otherImsList" name="listForm" method="post">
		<table width="100%" cellspacing="1" class="listtable">
			<tbody>
				<tr>
					<th class="wid60">选择</th>
					<th class="wid60">ID</th>
					<th class="wid60">排序</th>
					<th class="wid60">所属分类</th>
					<th class="wid150">标题</th>
					<th class="wid150">发布日期</th>
					<th class="wid100">操作</th>
				</tr>

				<c:forEach items="${ph.list}" var="otms">
					<tr>
						<td align="center"><input name="idstr[]" type="checkbox"
							value="${otms.omId }"></td>
						<td align="center">${otms.omId }</td>
						<td align="center"><input name="px[]" type="text" class="inpbor wid60"
							value="${otms.omSort}"></td>
						<td >
						 
						    <c:forEach items="${stype}" var="s">
								<c:if test="${s.otId==otms.omTypeid }">
									<font color="red">${s.otName }</font>
								</c:if>
							</c:forEach>
								 <c:forEach items="${btype}" var="b">
								<c:if test="${b.otId==otms.omTypeid }">
									<font color="red">${b.otName }</font>
								</c:if>
							</c:forEach>
						</td>
						<td>${otms.omTitle }</td>
						<td align="center">${otms.omDate }</td>
						<td align="center"><a
							href="${ctx}/other/showotherImsUpdate?id=${otms.omId }"
							class="marlr5">编辑</a><a
							href="${ctx}/other/deleteotherIms?id=${otms.omId }"
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