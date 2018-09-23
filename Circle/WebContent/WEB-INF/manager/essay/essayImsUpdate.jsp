<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://szyunwo.gotoip2.com/jzadmin/Article/add.htm -->
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
		editor = K.create('textarea[name="content"]', {
			allowFileManager : true
		});
	});
</script>


<script type="text/javascript"
	src="${ctx}/resource/js/laydate.js.download"></script>
<link type="text/css" rel="stylesheet"
	href="${ctx}/resource/css/laydate.css">
<link type="text/css" rel="stylesheet"
	href="${ctx}/resource/css/laydate(1).css" id="LayDateSkin">
<meta name="__hash__"
	content="b5661a5acdbb1e44acbbe3bd13c6ddd9_539fa75918a894129750a9f9917e5cb5">
</head>

<body>

	<div class="location">当前位置:文章管理 &gt; 信息管理 &gt; 信息编辑</div>
	<form action="${ctx}/essay/essayImsUpdate" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">标题</span><input
						name="emTitle" value="${emupdate.emTitle }" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> <select
						name="classid">
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
					<span class="flo_left wid120 textshen">标题图片</span>
					<p>
						<input type="text" name="emImg" id="thumb"
							value="${emupdate.emImg }"> <input type="button"
							id="logo" value="选择图片">
					</p>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">来源</span><input
						name="emSource" value="${emupdate.emSource }"
						class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">发布日期</span><input
						placeholder="请输入日期" class="laydate-icon"
						value="${emupdate.emDate }" name="emDate"
						style="text-indent: 3px;" onclick="laydate()">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">文章简介</span>
					<textarea name="emBrief" class="wid350" rows="5">${emupdate.emBrief }</textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">标签</span>
					<textarea name="emLable" class="wid350" rows="5">	${emupdate.emLable }	</textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">详细介绍</span>
					<div class="ke-container ke-container-default"
						style="width: 700px;">
						<textarea name="emDetail"
							style="width: 700px; height: 200px; visibility: hidden; display: none;">${emupdate.emDetail }</textarea>
					</div>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">浏览量</span><input
						name="emNum" value="${emupdate.emNum }" class="inpbor wid60">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="emSort" value="${emupdate.emSort }" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="emId"
				value="${emupdate.emId }"><input type="submit" name="anniu"
				value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="b5661a5acdbb1e44acbbe3bd13c6ddd9_539fa75918a894129750a9f9917e5cb5">
	</form>


</body>
</html>