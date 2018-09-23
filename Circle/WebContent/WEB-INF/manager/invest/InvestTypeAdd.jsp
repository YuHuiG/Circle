<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0053)http://szyunwo.gotoip2.com/jzadmin/Rongzi/addcate.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<meta name="__hash__"
	content="cc12e02623e6dec9ddbd2e2afd8f4983_7be8edc45b3ef981512589cf22a515c3">
</head>

<body>

	<div class="location">当前位置:融资直通车 &gt; 类别管理 &gt; 添加类别</div>
	<form action="${ctx}/invest/investTypeAdd" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">分类名称</span><input
						name="itName" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> <select
						name="itIds">
						<c:forEach items="${stype}" var="s">
							<option value="${s.itId}">${s.itName }</option>
							<c:forEach items="${btype}" var="b">
								<c:if test="${s.itId==b.itIds}">
									<option value="${b.itId}" disabled="disabled">&nbsp;&nbsp;&nbsp;└──&gt;${b.itName }</option>
								</c:if>
							</c:forEach>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="itSort" value="" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="mod"
				value="4"><input type="submit" name="anniu" value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="cc12e02623e6dec9ddbd2e2afd8f4983_7be8edc45b3ef981512589cf22a515c3">
	</form>


</body>
</html>