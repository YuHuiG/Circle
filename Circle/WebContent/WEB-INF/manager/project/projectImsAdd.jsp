<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0050)http://szyunwo.gotoip2.com/jzadmin/Xiangmu/add.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css" href="${ctx}/content.css">
<link rel="stylesheet" href="${ctx}/default.css">
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
	content="e87bea449ca26904580f88d7cf896dfd_b858e7224bca83d77d96f8125ac8dff0">
</head>

<body>

	<div class="location">当前位置:选项目 &gt; 信息管理 &gt; 添加/编辑项目信息</div>
	<form action="${ctx}/project/projectImsAdd" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">标题</span><input
						name="pmTitle" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所属行业</span> <select
						name="pmJob" multiple="multiple"
						style="width: 180px; height: 200px;">
						<option value="">=不限=</option>
						<c:forEach items="${Bprojlist }" var="s">
							<c:if test="${s.pIds==1}">
								<option value="${s.pName}">${s.pName}</option>
							</c:if>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">所在地区</span> <select
						name="pmAddress" multiple="multiple">
						<option value="">=不限=</option>
						<c:forEach items="${Bprojlist }" var="s">
							<c:if test="${s.pIds==2}">
								<option value="${s.pName}">${s.pName}</option>
							</c:if>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">融资方式</span> <select
						name="pmType">
						<option value="">=不限=</option>
						<c:forEach items="${Bprojlist }" var="s">
							<c:if test="${s.pIds==3}">
								<option value="${s.pName}">${s.pName}</option>
							</c:if>
						</c:forEach>
					</select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">相关图片</span>
					<p>
						<input type="text" name="thumb" id="thumb" value=""> <input
							type="button" id="logo" value="选择图片">
					</p>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">融资资金</span><input
						name="tzzijin1" value="" class="inpbor wid60"><select
						name="tzdanwei1" style="margin-left: 3px;"><option
							value="万">万</option>
						<option value="亿">亿</option></select> - <input name="tzzijin2" value=""
						class="inpbor wid60"><select name="tzdanwei2"
						style="margin-left: 3px;"><option value="万">万</option>
						<option value="亿">亿</option></select>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">融资用途</span><input
						name="yongtu" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">意向资金</span><input
						name="yixiangzijin" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">资金方占股比例</span><input
						name="zhangubili" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">最短退出年限</span><input
						name="tuichunixian" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">联系人</span><input
						name="lianxiren" value="" class="inpbor wid100">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">联系信息</span><input
						name="ftitle" value="" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">项目概述</span>
					<div class="ke-container ke-container-default"
						style="width: 700px;">
						<textarea name="content"
							style="width: 700px; height: 200px; visibility: hidden; display: none;"></textarea>
					</div>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">发布日期</span><input
						placeholder="请输入日期" class="laydate-icon" value="" name="pmDate"
						style="text-indent: 3px;" onclick="laydate()">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">浏览量初始值</span><input
						name="pmNum" value="" class="inpbor wid60">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">排序</span><input
						name="pmSort" value="" class="inpbor wid60">
				</div>
			</li>
			<li class="submitbtn flo_left"><input type="hidden" name="id"
				value=""><input type="submit" name="anniu" value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="e87bea449ca26904580f88d7cf896dfd_b858e7224bca83d77d96f8125ac8dff0">
	</form>


</body>
</html>