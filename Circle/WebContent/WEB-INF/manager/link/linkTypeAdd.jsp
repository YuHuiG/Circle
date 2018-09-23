<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0051)http://szyunwo.gotoip2.com/jzadmin/Link/addcate.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<meta name="__hash__"
	content="433e63ca6b565fca5f5a6e1fc870a3f0_1cb164acd401644deca6e3fd075270b8">
</head>

<body>

	<div class="location">当前位置:链接管理 &gt; 类别管理 &gt; 分类添加</div>
	<form action="${ctx }/link/linkTypeAdd" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">分类名称</span><input
						name="ltNmae" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input name="ltSort"
						value="" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="submit" name="anniu"
				value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="433e63ca6b565fca5f5a6e1fc870a3f0_1cb164acd401644deca6e3fd075270b8">
	</form>


</body>
</html>