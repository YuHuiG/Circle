<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0049)http://szyunwo.gotoip2.com/jzadmin/Rongzi/add.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<link rel="stylesheet" href="${ctx}/resource/css/default.css">
<script charset="utf-8" src="${ctx}/resource/js/kindeditor.js"></script>
<script charset="utf-8" src="${ctx}/lang/zh_CN.js"></script>
<link rel="stylesheet" href="${ctx}/themes/default/default.css" />


<script>
	var editor;
	KindEditor.ready(function(K) {

		editor = K.create('textarea[name="tuandui"]', {
			allowFileManager : true
		});
		editor = K.create('textarea[name="content"]', {
			allowFileManager : true
		});
		editor = K.create('textarea[name="anli"]', {
			allowFileManager : true
		});

	});
</script>


<meta name="__hash__"
	content="365c26169e0f28bc4201f768c0f79a5b_74aa5c2eab8d45aa7be09c1e95806e77">
</head>

<body>

	<div class="location">当前位置:融资直通车 &gt; 信息管理 &gt; 信息添加</div>
	<form action="${ctx }/invest/investImsAdd" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">机构名称</span><input
						name="imName" value="" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> <select
						name="itId">
						<c:forEach items="${btype}" var="b">
						<c:if test="${b.itIds==1}">
							<option value="${b.itId }">${b.itName }</option>
						</c:if>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">机构LOGO</span>
					<p>
						<input type="text" name="imLogo" id="thumb" value=""> <input
							type="button" id="logo" value="选择图片">
					</p>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">投资阶段</span><input
						name="imInveststage" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">投资领域</span><input
						name="imInvestfield" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">机构简介</span>
					<textarea name="imBrief" class="wid350" rows="5"></textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">成功案例文字</span>
					<textarea name="imCasetext" class="wid350" rows="5">		</textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">详细介绍</span>
					<div class="ke-container ke-container-default"
						style="width: 700px;">
						<textarea name="imDetail"
							style="width: 700px; height: 200px; visibility: hidden; display: none;"></textarea>
					</div>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">成功案例</span>
					<div class="ke-container ke-container-default"
						style="width: 700px;">
						<textarea name="imCase"
							style="width: 700px; height: 200px; visibility: hidden; display: none;"></textarea>
					</div>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">机构团队</span>
					<textarea name="imGroup"
						style="width: 700px; height: 200px; visibility: hidden; display: none;"></textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">游览量初始值</span><input
						name="imNum" value="" class="inpbor wid60">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="imSort" value="" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="id"
				value=""><input type="submit" name="anniu" value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="365c26169e0f28bc4201f768c0f79a5b_74aa5c2eab8d45aa7be09c1e95806e77">
	</form>


</body>
</html>