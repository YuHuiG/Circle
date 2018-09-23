<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0054)http://szyunwo.gotoip2.com/jzadmin/Xiangmu/addcate.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<meta name="__hash__"
	content="b0f374c45b9f03d9ddce89e121b2aa17_faf2c6a4b26fe1461872f32dfbb21788">
</head>

<body>

	<div class="location">当前位置:选项目 &gt; 类别管理 &gt; 分类添加</div>
	<form action="${ctx}/project/projectTypeAdd" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">分类名称</span><input
						name="pName" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> 
					<select name="pIds">
						<c:forEach items="${Sprojlist }" var="s">
							<option value="${s.pId}">${s.pName}</option>
							<c:forEach items="${Bprojlist }" var="b">
								<c:if test="${s.pId==b.pIds}">
									<option value="${b.pId}" disabled="disabled">&nbsp;&nbsp;&nbsp;└──&gt;${b.pName}</option>
								</c:if>
							</c:forEach>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input name="pSort"
						value="" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="mod"
				value="6"><input type="submit" name="anniu" value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="b0f374c45b9f03d9ddce89e121b2aa17_faf2c6a4b26fe1461872f32dfbb21788">
	</form>


</body>
</html>