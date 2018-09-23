<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0047)http://szyunwo.gotoip2.com/jzadmin/Link/add.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="../resource/css/content.css">
<link rel="stylesheet" href="../resource/css/default.css">
<script charset="utf-8" src="../resource/js/kindeditor.js"></script>
<script charset="utf-8" src="../lang/zh_CN.js"></script>
<link rel="stylesheet" href="../themes/default/default.css" />


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
<script type="text/javascript" src="../resource/js/laydate.js.下载"></script>
<link type="text/css" rel="stylesheet"
	href="../resource/css/laydate.css">
<link type="text/css" rel="stylesheet"
	href="../resource/css/laydate(1).css" id="LayDateSkin">
<meta name="__hash__"
	content="7efabe8db30170324562a56c69c60b55_d19d9fb7d42cc91567c1e37380bd769d">
</head>

<body>

	<div class="location">当前位置:链接管理 &gt; 信息管理 &gt; 添加/编辑链接信息</div>
	<form action="${ctx}/link/linkImsUpdate" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">标题</span><input
						name="lmTitle" value="${lts.lmTitle }" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> <select
						name="lmTypeid">
						<c:forEach items="${typelink}" var="tl">
							<option value="${tl.ltId}">${tl.ltNmae }</option>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">图片</span>
					<p>
						<input type="text" name="lmImg" id="thumb" value="${lts.lmImg }">
						<input type="button" id="logo" value="选择图片">
					</p>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">连接地址</span><input
						name="lmUrl" value="${lts.lmUrl }" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="lmSort" value="${lts.lmSort }" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="lmId"
				value="${lts.lmId }"><input type="submit" name="anniu"
				value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="7efabe8db30170324562a56c69c60b55_d19d9fb7d42cc91567c1e37380bd769d">
	</form>


</body>
</html>