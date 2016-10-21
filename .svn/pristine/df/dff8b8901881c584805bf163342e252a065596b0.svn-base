<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="../common/taglibs.jsp" %>
<html>
<head>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">    
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


<title>egou商城-商品详情页</title>
<%@include file="../common/res.jsp" %>
<style type="text/css">
.changToRed {
	border: 2px solid #e4393c;
	padding: 2px 4px;
	float: left;
	margin-right: 4px;
	text-decoration: none;
}
.changToWhite {
	border: 1px solid #ccc;
	padding: 2px 4px;
	float: left;
	margin-right: 4px;
	text-decoration: none;
}
.not-allow {
	cursor: not-allowed;
	color: #999;
	border: 1px dashed #ccc;
	padding: 2px 4px;
	float: left;
	margin-right: 4px;
	text-decoration: none;
}
</style>
</head>
<script type="text/javascript">
//加入购物车
function addCart(){
	alert("添加购物车成功!");
}
//立即购买
function buy(){
	window.location.href='cart.jsp';
}
</script>
</head>
<body>
<%@include file="../common/header.jsp" %>
<%@include file="../common/cart_header.jsp" %>


<div class="w ofc mt">
	<div class="l">
		<div class="showPro">
			<div class="big"><a id="showImg" class="cloud-zoom" href="${ctx}/res/img/pic/ppp0.jpg" rel="adjustX:10,adjustY:-1"><img alt="" src="${ctx}/res/img/pic/ppp0.jpg"></a></div>
		</div>
	</div>
	<div class="r" style="width: 640px">
		<ul class="uls form">
			<li><h2>依琦莲2014瑜伽服套装新款 瑜珈健身服三件套 广场舞蹈服装 性价比最高的瑜伽服 三件套 送胸垫 支持货到付款</h2></li>
			<li><label>巴  巴 价：</label><span class="word"><b class="f14 red mr">￥128.00</b>(市场价:<del>￥150.00</del>)</span></li>
			<li><label>商品评价：</label><span class="word"><span class="val_no val3d4" title="4分">4分</span><var class="blue">(已有888人评价)</var></span></li>
			<li><label>运　　费：</label><span class="word">10元</span></li>
			<li><label>库　　存：</label><span class="word" id="stockInventory">100</span><span class="word" >件</span></li>
			<li><label>选择颜色：</label>
				<div id="colors" class="pre spec">
					<a onclick="colorToRed(this,9)" href="javascript:void(0)" title="西瓜红" class="changToRed"><img width="25" height="25" data-img="1" src="${ctx}/res/img/pic/ppp00.jpg" alt="西瓜红 "><i>西瓜红</i></a>
					<a onclick="colorToRed(this,11)" href="javascript:void(0)" title="墨绿" class="changToWhite"><img width="25" height="25" data-img="1" src="${ctx}/res/img/pic/ppp00.jpg" alt="墨绿 "><i>墨绿</i></a>
					<a onclick="colorToRed(this,18)" href="javascript:void(0)" title="浅粉" class="changToWhite"><img width="25" height="25" data-img="1" src="${ctx}/res/img/pic/ppp00.jpg" alt="浅粉 "><i>浅粉</i></a>
				</div>
			</li>
			<li id="sizes"><label>尺　　码：</label>
						<a href="javascript:void(0)" class="not-allow"  id="S">S</a>
						<a href="javascript:void(0)" class="not-allow"  id="M">M</a>
						<a href="javascript:void(0)" class="not-allow"  id="L">L</a>
						<a href="javascript:void(0)" class="not-allow"  id="XL">XL</a>
						<a href="javascript:void(0)" class="not-allow"  id="XXL">XXL</a>
			</li>
			<li><label>我 要 买：</label>
				<a id="sub" class="inb arr" style="border: 1px solid #919191;width: 10px;height: 10px;line-height: 10px;text-align: center;" title="减" href="javascript:void(0);" >-</a>
				<input id="num" type="text" value="1" name="" size="1" readonly="readonly">
				<a id="add" class="inb arr" style="border: 1px solid #919191;width: 10px;height: 10px;line-height: 10px;text-align: center;" title="加" href="javascript:void(0);">+</a></li>
			<li class="submit"><input type="button" value="" class="hand btn138x40" onclick="buy();"/><input type="button" value="" class="hand btn138x40b" onclick="addCart()"/></li>
		</ul>
	</div>
</div>
<div class="w ofc mt">
<%@include file="../common/product_left.jsp" %>
<div class="r wr">
		<h2 class="h2 h2_ch mt"><em>
			<a href="javascript:void(0);" title="商品介绍" rel="#detailTab1" class="here">商品介绍</a>
			<a href="javascript:void(0);" title="规格参数" rel="#detailTab2">规格参数</a>
			<a href="javascript:void(0);" title="包装清单" rel="#detailTab3">包装清单</a></em><cite></cite></h2>
		<div class="box bg_white ofc">
			<div id="detailTab1" class="detail">
				<img src="${ctx}/res/img/pic/p800b.jpg" /><img src="${ctx}/res/img/pic/p800a.jpg" /><img src="${ctx}/res/img/pic/p800c.jpg" /><img src="${ctx}/res/img/pic/p800d.jpg" />
			</div>
			
			<div id="detailTab2" style="display:none">
				<strong>服务承诺：</strong><br>
	京东向您保证所售商品均为正品行货，京东自营商品开具机打发票或电子发票。凭质保证书及京东发票，可享受全国联保服务（奢侈品、钟表除外；奢侈品、钟表由京东联系保修，享受法定三包售后服务），与您亲临商场选购的商品享受相同的质量保证。京东还为您提供具有竞争力的商品价格和<a target="_blank" href="http://www.jd.com/help/kdexpress.aspx">运费政策</a>，请您放心购买！
	<br><br>
	注：因厂家会在没有任何提前通知的情况下更改产品包装、产地或者一些附件，本司不能确保客户收到的货物与商城图片、产地、附件说明完全一致。只能确保为原厂正货！并且保证与当时市场上同样主流新品一致。若本商城没有及时更新，请大家谅解！ <br/>
		<strong>权利声明：</strong><br>京东上的所有商品信息、客户评价、商品咨询、网友讨论等内容，是京东重要的经营资源，未经许可，禁止非法转载使用。
	<p><b>注：</b>本站商品信息均来自于合作方，其真实性、准确性和合法性由信息拥有者（合作方）负责。本站不提供任何保证，并不承担任何法律责任。</p>	
				
			</div>

			<div id="detailTab3" class="detail" style="display:none">

	<pre class="f14">
		上衣*1 裤子*1 抹胸*1 包装*1 
	</pre>

			</div>
		</div>

	</div>
</div>

<div class="mode">
	<div class="tl"></div><div class="tr"></div>
	<ul class="uls">
		<li class="first">
			<span class="guide"></span>
			<dl>
			<dt title="购物指南">购物指南</dt>
			<dd><a href="#" title="购物流程">购物流程</a></dd>
			<dd><a href="#" title="购物流程">购物流程</a></dd>
			<dd><a href="#" target="_blank" title="联系客服">联系客服</a></dd>
			<dd><a href="#" target="_blank" title="联系客服">联系客服</a></dd>
			</dl>
		</li>
		<li>
			<span class="way"></span>
			<dl>
			<dt title="支付方式">支付方式</dt>
			<dd><a href="#" title="货到付款">货到付款</a></dd>
			<dd><a href="#" title="在线支付">在线支付</a></dd>
			<dd><a href="#" title="分期付款">分期付款</a></dd>
			<dd><a href="#" title="分期付款">分期付款</a></dd>
			</dl>
		</li>
		<li>
			<span class="help"></span>
			<dl>
			<dt title="配送方式">配送方式</dt>
			<dd><a href="#" title="上门自提">上门自提</a></dd>
			<dd><a href="#" title="上门自提">上门自提</a></dd>
			<dd><a href="#" title="上门自提">上门自提</a></dd>
			<dd><a href="#" title="上门自提">上门自提</a></dd>
			</dl>
		</li>
		<li>
			<span class="service"></span>
			<dl>
			<dt title="售后服务">售后服务</dt>
			<dd><a href="#" target="_blank" title="售后策略">售后策略</a></dd>
			<dd><a href="#" target="_blank" title="售后策略">售后策略</a></dd>
			<dd><a href="#" target="_blank" title="售后策略">售后策略</a></dd>
			<dd><a href="#" target="_blank" title="售后策略">售后策略</a></dd>
			</dl>
		</li>
		<li>
			<span class="problem"></span>
			<dl>
			<dt title="特色服务">特色服务</dt>
			<dd><a href="#" target="_blank" title="夺宝岛">夺宝岛</a></dd>
			<dd><a href="#" target="_blank" title="夺宝岛">夺宝岛</a></dd>
			<dd><a href="#" target="_blank" title="夺宝岛">夺宝岛</a></dd>
			<dd><a href="#" target="_blank" title="夺宝岛">夺宝岛</a></dd>
			</dl>
		</li>
	</ul>
</div>
</body>
</html>