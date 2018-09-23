<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0048)http://szyunwo.gotoip2.com/jzadmin/Other/add.htm -->
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
		editor = K.create('textarea[name="content"]', {
			allowFileManager : true
		});
		editor = K.create('textarea[name="beizhu"]', {
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
	content="fc0f16706844fc91842b1bd514e7a546_94f0b60bba5aad9d35648e0351e916ec">
</head>

<body>

	<div class="location">当前位置:信息管理 &gt; 其他管理 &gt; 添加/编辑其他信息</div>
	<form action="${ctx}/other/otherImsUpdate" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">标题</span><input
						name="omTitle" value="${message.omTitle }" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属分类</span> <select
						name="omTypeid">
						<c:forEach items="${stype}" var="s">
							<option value="${s.otId }">${s.otName}</option>
							<c:forEach items="${btype }" var="b">
								<c:if test="${b.otIds==s.otId }">
									<option value="${b.otId }">&nbsp;&nbsp;&nbsp;└──&gt;${b.otName}</option>
								</c:if>
							</c:forEach>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">内容</span>
					<textarea name="content"
						style="width: 700px; height: 200px; visibility: hidden; display: none;"></textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">发布日期</span><input
						placeholder="请输入日期" class="laydate-icon"
						value="${message.omDate }" name="omDate" style="text-indent: 3px;"
						onclick="laydate()">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="omSort" value="${message.omSort }" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="omId"
				value="${message.omId }"><input type="submit" name="anniu"
				value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="fc0f16706844fc91842b1bd514e7a546_94f0b60bba5aad9d35648e0351e916ec">
	</form>


</body>
</html>