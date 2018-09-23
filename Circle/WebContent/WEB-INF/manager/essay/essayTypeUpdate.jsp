<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0054)http://szyunwo.gotoip2.com/jzadmin/Article/addcate.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<meta name="__hash__"
	content="1f5e64ee6edb17efa3ffb89eaccc80d7_bb14433b98eb18c7b34c138fc0a9da67">
</head>

<body>

	<div class="location">当前位置:文章管理 &gt; 类别管理 &gt; 编辑分类</div>
	<form action="${ctx}/essay/essayTypeUpdate" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">分类名称</span><input
						name="etName" value="${et.etName }" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> <select
						name="etIds">
						<c:forEach items="${stype}" var="s">
							<option value="${s.etId}">${s.etName }</option>
							<c:forEach items="${btype}" var="b">
								<c:if test="${s.etId==b.etIds}">
									<option value="${b.etId}" disabled="disabled">&nbsp;&nbsp;&nbsp;└──&gt;${b.etName }</option>
								</c:if>
							</c:forEach>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input name="etSort"
						value="${et.etSort }" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="etId"
				value="${et.etId }"><input type="submit" name="anniu"
				value="提 交"></li>
		</ul>
	</form>


</body>
</html>