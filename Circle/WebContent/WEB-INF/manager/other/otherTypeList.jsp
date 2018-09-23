<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0049)http://szyunwo.gotoip2.com/jzadmin/Other/cate.htm -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<meta name="__hash__"
	content="93a3ff04dcaac7af57d83b76ef9e0823_a59c6534f196513c6cf3f75491c76da2">
</head>

<body>

	<div class="location">当前位置:信息管理 &gt; 类别管理 &gt; 类别列表</div>

	<form action="${ctx}/other/otherTypeList" method="post" name="listform">
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
						<td>${s.otId }</td>
						<td><input name="px[]" type="text" class="inpbor wid60"
							value="${s.otSort }"></td>
						<td><p style="padding-left: 10px;">${s.otName }</p></td>
						<td><a href="${ctx }/other/otherTypeUpdate?id=${s.otId }"
							class="marlr5">编辑</a><a
							href="${ctx }/other/deleteotherType?id=${s.otId }" class="marlr5"
							onclick="return confirm(&#39;删除此类别同时也会删除所有子分类，确定要删除吗？&#39;)">删除</a></td>
					</tr>

					<c:forEach items="${btype}" var="b">
						<c:if test="${b.otIds==s.otId}">
							<tr>
								<td>${b.otId }</td>
								<td><input name="px[]" type="text" class="inpbor wid60"
									value="${b.otSort }"></td>
								<td><p style="padding-left: 30px;">└──&gt;${b.otName }</p></td>
								<td><a href="${ctx }/other/showotherTypeUpdate?id=${b.otId }"
									class="marlr5">编辑</a><a
									href="${ctx }/other/deleteotherType?id=${b.otId }"
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
			value="93a3ff04dcaac7af57d83b76ef9e0823_a59c6534f196513c6cf3f75491c76da2">
	</form>

</body>
</html>