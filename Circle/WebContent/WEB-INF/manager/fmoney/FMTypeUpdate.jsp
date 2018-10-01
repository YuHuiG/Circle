<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0052)http://szyunwo.gotoip2.com/jzadmin/Zijin/addcate.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<meta name="__hash__"
	content="3268a65c793c96a5f66c5e581fa2adfb_20d8372bd74f7c63d83fcce14dfed069">
</head>

<body>

	<div class="location">当前位置:找资金 &gt; 类别管理 &gt; 分类编辑</div>
	<form action="${ctx}/fmoney/ZXFMTypeUpdate" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">分类名称</span><input
						name="ccName" value="${ctype.ccName}" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> <select
						name="ccParentId" id="selec">
						<c:if test="${ctype.ccParentId==0}">
							<option value="0">=一级分类=</option>
						</c:if>
						<c:if test="${ctype.ccParentId!=0}">
							<c:forEach items="${cp}" var="cp">
								<option value="${cp.ccId}">${cp.ccName}</option>
							</c:forEach>
						</c:if>
					</select>
					<script>
						document.getElementById("selec").value = '${ctype.ccParentId}';
					</script>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="ccDesc" value="${ctype.ccDesc}" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="ccId"
				value="${ctype.ccId}"><input type="submit" name="anniu"
				value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="3268a65c793c96a5f66c5e581fa2adfb_20d8372bd74f7c63d83fcce14dfed069">
	</form>


</body>
</html>