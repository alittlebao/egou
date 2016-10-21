<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/back_page/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>egou-add</title>

<script type="text/javascript" charset="utf-8"
	src="/res/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8"
	src="/res/ueditor/ueditor.all.min.js"></script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8"
	src="/res/ueditor/lang/zh-cn/zh-cn.js"></script>
<style type="">
.h2_ch a:hover, .h2_ch a.here {
	color: #FFF;
	font-weight: bold;
	background-position: 0px -32px;
}

.h2_ch a {
	float: left;
	height: 32px;
	margin-right: -1px;
	padding: 0px 16px;
	line-height: 32px;
	font-size: 14px;
	font-weight: normal;
	border: 1px solid #C5C5C5;
	background: url('/res/togogo/img/admin/bg_ch.gif') repeat-x scroll 0% 0%
		transparent;
}

a {
	color: #06C;
	text-decoration: none;
}
</style>
<script type="text/javascript">
	$(function() {
		var tObj;
		$("#tabs a").each(function() {
			// 0  -1 -1  
			//找不到就是-1  找到就是0

			if ($(this).attr("class").indexOf("here") == 0) {
				tObj = $(this)
			}
			$(this).click(function() {
				//here  nor
				var c = $(this).attr("class");
				//
				if (c.indexOf("here") == 0) {
					return;
				}
				var ref = $(this).attr("ref");
				var ref_t = tObj.attr("ref");
				tObj.attr("class", "nor");
				$(this).attr("class", "here");
				$(ref_t).hide();
				$(ref).show();
				tObj = $(this);
				if (ref == '#tab_2') {
					/* var fck = new FCKeditor("productdesc");
					fck.BasePath = "/res/fckeditor/";
					fck.Height = 400;
					fck.ReplaceTextarea(); */
					var ue = UE.getEditor('productdesc');
					
				}
			});
		});
		$("#pic")
				.change(
						function() {
							var $file = $(this);
							var fileObj = $file[0];
							var windowURL = window.URL || window.webkitURL;
							var dataURL;
							var $img = $("#img_url");

							if (fileObj && fileObj.files && fileObj.files[0]) {
								dataURL = windowURL
										.createObjectURL(fileObj.files[0]);
								$img.attr('src', dataURL);
							} else {
								dataURL = $file.val();
								var imgObj = document.getElementById("img_url");
								// 两个坑:
								// 1、在设置filter属性时，元素必须已经存在在DOM树中，动态创建的Node，也需要在设置属性前加入到DOM中，先设置属性在加入，无效；
								// 2、src属性需要像下面的方式添加，上面的两种方式添加，无效；
								imgObj.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
								imgObj.filters
										.item("DXImageTransform.Microsoft.AlphaImageLoader").src = dataURL;

							}
							uploadPic();
						});
	});
	function uploadPic() {
		//利用jquery form .js ajax上传文件
		//jquery ajax
		var options = {
			url : "/upload/img_upload.do",
			dataType : "json",
			success : function(data) {
				//http:localhost:8080/imgweb/upload/abc.jpg
				//data包含两个路径，一个路径url，完整路径http:localhost:8080/imgweb/upload/abc.jpg，另一个是相对路径 path upload/abc.jpg
				//$("#img_url").attr("src",data.imgUrl);
				$("#product_path").val(data.filePath);
			}
		};
		$("#jvForm").ajaxSubmit(options);
	}
</script>
</head>
<body>
	<div class="box-positon">
		<div class="rpos">当前位置: 商品管理 - 添加</div>
		<form class="ropt">
			<input type="submit" onclick="this.form.action='v_list.do';"
				value="返回列表" class="return-button" />
		</form>
		<div class="clear"></div>
	</div>
	<h2 class="h2_ch">
		<span id="tabs"> <a href="javascript:void(0);" ref="#tab_1"
			title="基本信息" class="here">基本信息</a> <a href="javascript:void(0);"
			ref="#tab_2" title="商品描述" class="nor">商品描述</a> <a
			href="javascript:void(3);" ref="#tab_3" title="商品参数" class="nor">包装清单</a>
		</span>
	</h2>
	<div class="body-box" style="float: right">
		<form id="jvForm" action="/product/add.do" method="post"
			enctype="multipart/form-data">
			<table cellspacing="1" cellpadding="2" width="100%" border="0"
				class="pn-ftable">
				<tbody id="tab_1">
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h"><span
							class="pn-frequired">*</span> 商品类型:</td>
						<td width="80%" class="pn-fcontent"><select name="type_id">
								<option value="">请选择</option>
								<option value="2">瑜珈服</option>
								<option value="3">瑜伽辅助</option>
						</select></td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h"><span
							class="pn-frequired">*</span> 商品名称:</td>
						<td width="80%" class="pn-fcontent"><input type="text"
							class="required" name="name" maxlength="100" size="100" /></td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h">商品品牌:</td>
						<td width="80%" class="pn-fcontent"><select name="brand_id">
								<option value="">请选择品牌</option>
								<option value="1">依琦莲</option>
								<option value="2">凯速（KANSOON）</option>
								<option value="3">梵歌纳（vangona）</option>
						</select></td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h">商品毛重:</td>
						<td width="80%" class="pn-fcontent"><input type="text"
							value="0.6" class="required" name="weight" maxlength="10" />KG</td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h">材质:</td>
						<td width="80%" class="pn-fcontent"><input type="checkbox"
							value="1" name="feature" />环保人棉 <input type="checkbox" value="1"
							name="feature" />环保人棉 <input type="checkbox" value="1"
							name="feature" />环保人棉 <input type="checkbox" value="1"
							name="feature" />环保人棉 <input type="checkbox" value="1"
							name="feature" />环保人棉 <input type="checkbox" value="1"
							name="feature" />环保人棉</td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h"><span
							class="pn-frequired">*</span> 颜色:</td>
						<td width="80%" class="pn-fcontent"><input type="checkbox"
							value="9" name="color" />西瓜红 <input type="checkbox" value="9"
							name="color" />西瓜红 <input type="checkbox" value="9" name="color" />西瓜红
							<input type="checkbox" value="9" name="color" />西瓜红 <input
							type="checkbox" value="9" name="color" />西瓜红 <input
							type="checkbox" value="9" name="color" />西瓜红 <input
							type="checkbox" value="9" name="color" />西瓜红</td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h"><span
							class="pn-frequired">*</span> 尺码:</td>
						<td width="80%" class="pn-fcontent"><input type="checkbox"
							name="size" value="S" />S <input type="checkbox" name="size"
							value="M" />M <input type="checkbox" name="size" value="L" />L
							<input type="checkbox" name="size" value="XL" />XL <input
							type="checkbox" name="size" value="XXL" />XXL</td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h">状态:</td>
						<td width="80%" class="pn-fcontent"><input type="checkbox"
							name="is_new" value="1" />新品 <input type="checkbox"
							name="isCommend" value="1" />推荐 <input type="checkbox"
							name="is_hot" value="1" />热卖</td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h"><span
							class="pn-frequired">*</span> 上传商品图片(90x150尺寸):</td>
						<td width="80%" class="pn-fcontent">注:该尺寸图片必须为90x150。</td>
					</tr>
					<tr>
						<td width="20%" class="pn-flabel pn-flabel-h"></td>
						<td width="80%" class="pn-fcontent"><img width="100"
							height="100" id="img_url" /> <input type="hidden" name="url"
							id="product_path" /> <input type="file" name="pic" id="pic" /></td>
					</tr>
				</tbody>
				<tbody id="tab_2" style="display: none">
					<tr>
						<td>
							<!-- <textarea rows="10" cols="10" id="productdesc"
								name="description"></textarea> --> <script id="productdesc"
								type="text/plain" style="width:98%;height:300px;"></script>
						</td>
					</tr>
				</tbody>
				<tbody id="tab_3" style="display: none">
					<tr>
						<td><textarea rows="15" cols="136" id="productList"
								name="package_list"></textarea></td>
					</tr>
				</tbody>
				<tbody>
					<tr>
						<td class="pn-fbutton" colspan="2"><input type="submit"
							class="submit" value="提交" /> &nbsp; <input type="reset"
							class="reset" value="重置" /></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
</body>
</html>