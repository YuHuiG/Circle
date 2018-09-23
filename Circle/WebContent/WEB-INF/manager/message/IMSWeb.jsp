<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0051)http://szyunwo.gotoip2.com/jzadmin/System/index.htm -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>无标题文档</title>
<link rel="stylesheet" type="text/css"
	href="${ctx}/resource/css/content.css">
<link rel="stylesheet" href="${ctx}/resource/css/default.css">
<script charset="UTF-8" src="${ctx}/resource/js/kindeditor.js"></script>
<script charset="UTF-8" src="${ctx}/resource/js/zh_CN.js.download"></script>


<script>
	KindEditor.ready(function(K) {
		var editor = K.editor({
			allowFileManager : true
		});
		K('#logo').click(function() {
			editor.loadPlugin('image', function() {
				editor.plugin.imageDialog({
					imageUrl : K('#thumb').val(),
					clickFn : function(url, width, height, border) {
						K('#thumb').val(url);
						editor.hideDialog();
					}
				});
			});
		});
	});
</script>
<script type="text/javascript" src="${ctx}/resource/js/laydate.js.download"></script>
<link type="text/css" rel="stylesheet" href="${ctx}/laydate.css">
<link type="text/css" rel="stylesheet" href="${ctx}/laydate(1).css"
	id="LayDateSkin">
<meta name="__hash__"
	content="e9d675a4d1104bca8304bcc3cb862b82_a0955700cb35f4af6721ea12684d533a">
</head>

<body>

	<div class="location">当前位置:系统设置 &gt; 网站基本信息</div>
	<form action="${ctx}/updateWeb" name="form" method="post">
		<ul>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">网站名称<font color="red">(*)</font></span><input
						name="webname" value="${wb.webname}" class="inpbor wid350">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">客服热线</span><input
						name="servicephone" value="${wb.servicephone}"
						class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">邮箱</span><input name="email"
						value="${wb.email}" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">微博</span><input
						name="microblog" value="${wb.microblog}" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">投诉电话</span><input
						name="complainthotline" value="${wb.complainthotline}"
						class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">二维码</span>
					<p>
						<input type="text" name="qrcode" id="thumb" value="${wb.qrcode}">
						<input type="button" id="logo" value="选择图片">
					</p>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">注册人数</span><input
						name="enrollment" value="${wb.enrollment}" class="inpbor wid200">人
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">交易金额</span><input
						name="amounts" value="${wb.amounts}" class="inpbor wid200">亿元
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">为投资人赚取</span><input
						name="investorsearn" value="${wb.investorsearn}"
						class="inpbor wid200">万元
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">网站开通日期</span><input
						placeholder="请输入日期" class="laydate-icon"
						value="${wb.websiteopeningdate}" name="websiteopeningdate"
						style="text-indent: 3px;" onclick="laydate()">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">底部版权</span><input
						name="copyright" value="${wb.copyright}" class="inpbor wid200">
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">关键词</span>
					<textarea name="antistop" rows="5" class="textarea wid350">${wb.antistop}</textarea>
				</div>
			</li>
			<li class="common mart6">
				<div class="addborder">
					<span class="flo_left wid120 textshen">描述</span>
					<textarea name="description" rows="5" class="textarea wid350">${wb.description}</textarea>
				</div>
			</li>
			<li class="submitbtn flo_left"><input name="id" value="${wb.id}"
				type="hidden"><input type="submit" name="anniu" value="提 交"></li>
		</ul>
		<input type="hidden" name="__hash__"
			value="e9d675a4d1104bca8304bcc3cb862b82_a0955700cb35f4af6721ea12684d533a">
	</form>


</body>
</html>