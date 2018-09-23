<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0052)http://szyunwo.gotoip2.com/jzadmin/Other/addcate.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<meta name="__hash__"
	content="7e82f3729d7410a1df83c3bdda33f1fe_b1838dcae6e4602c44359ffb81cd6b1d">
</head>

<body>

	<div class="location">当前位置:信息管理 &gt; 类别管理 &gt; 添加类别</div>
	<form action="${ctx }/other/otherTypeUpdate" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">分类名称</span><input
						name="otName" value="${othert.otName }" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> <select
						name="otIds">
						<c:forEach items="${stype}" var="s">
							<option value="${s.otId}">${s.otName }</option>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="otSort" value="${othert.otSort }" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="otId"
				value="${othert.otId }"><input type="submit" name="anniu"
				value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="7e82f3729d7410a1df83c3bdda33f1fe_b1838dcae6e4602c44359ffb81cd6b1d">
	</form>


</body>
</html>