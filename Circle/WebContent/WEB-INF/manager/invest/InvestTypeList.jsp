<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://szyunwo.gotoip2.com/jzadmin/Rongzi/cate.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<meta name="__hash__"
	content="cef8772f965e24d264fbd419979075de_44cdb7d6d7ae75f998e2e2cd2b2405eb">
</head>

<body>

	<div class="location">当前位置:融资直通车 &gt; 类别管理 &gt; 类别列表</div>

	<form action="http://szyunwo.gotoip2.com/jzadmin/Info/updatepx.htm"
		method="post" name="listform">
		<table width="100%" cellspacing="1" class="listtable">
			<tbody>
				<tr>
					<th class="wid60">ID</th>
					<th class="wid100">排序</th>
					<th>类别名称</th>
					<th class="wid100">操作</th>
				</tr>
				<c:forEach items="${stype}" var="s">

					<tr>
						<td>${s.itId }</td>
						<td><input name="itSort" type="text" class="inpbor wid60"
							value="${s.itSort }"></td>
						<td><p style="padding-left: 10px;">${s.itName }</p></td>
						<td><a
							href="${ctx}/invest/showInvestTypeUpdate?itId=${s.itId }"
							class="marlr5">编辑</a><a
							href="${ctx}/invest/deleteInvestType?itId=${s.itId }"
							class="marlr5"
							onclick="return confirm(&#39;删除此类别同时也会删除所有子分类，确定要删除吗？&#39;)">删除</a></td>
					</tr>
					<c:forEach items="${btype}" var="b">
						<c:if test="${s.itId==b.itIds }">
							<tr>
								<td>${b.itId }</td>
								<td><input name="px[]" type="text" class="inpbor wid60"
									value="${b.itSort }"></td>
								<td><p style="padding-left: 30px;">└──&gt;${b.itName }</p></td>
								<td><a
									href="${ctx}/invest/showInvestTypeUpdate?itId=${b.itId }"
									class="marlr5">编辑</a><a
									href="${ctx}/invest/deleteInvestType?itId=${b.itId }"
									class="marlr5"
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
			value="cef8772f965e24d264fbd419979075de_44cdb7d6d7ae75f998e2e2cd2b2405eb">
	</form>

</body>
</html>