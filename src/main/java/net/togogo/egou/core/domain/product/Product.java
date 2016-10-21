package net.togogo.egou.core.domain.product;

import java.util.Date;

public class Product {

	private int id;			//ID
	private String no;		//商品编号
	private String name;	//商品名称
	private double weight;	//重量 单位:克
	private short is_new;	//是否新品:0:旧品,1:新品
	private short is_hot;	//是否热销:0,否 1:是
	private short is_commend;	//推荐 1推荐 0 不推荐
	private Date create_time;	//添加时间
	private String create_user_id;	//添加人ID
	private Date check_time;	//审核时间
	private String check_user_id;	//审核人ID
	private short is_show;	//上下架:0否 1是
	private short is_del;	//是否删除:0删除,1,没删除
	private int type_id;	//类型ID
	private int brand_id;	//品牌ID
	private String keywords;	//检索关键词
	private int sales;	//销量
	private String description; //商品描述
	private String package_list;	//包装清单
	private String feature;	//商品属性集
	private String color;	//颜色集
	private String size;	//尺寸集
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public short getIs_new() {
		return is_new;
	}
	public void setIs_new(short is_new) {
		this.is_new = is_new;
	}
	public short getIs_hot() {
		return is_hot;
	}
	public void setIs_hot(short is_hot) {
		this.is_hot = is_hot;
	}
	public short getIs_commend() {
		return is_commend;
	}
	public void setIs_commend(short is_commend) {
		this.is_commend = is_commend;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public String getCreate_user_id() {
		return create_user_id;
	}
	public void setCreate_user_id(String create_user_id) {
		this.create_user_id = create_user_id;
	}
	public Date getCheck_time() {
		return check_time;
	}
	public void setCheck_time(Date check_time) {
		this.check_time = check_time;
	}
	public String getCheck_user_id() {
		return check_user_id;
	}
	public void setCheck_user_id(String check_user_id) {
		this.check_user_id = check_user_id;
	}
	public short getIs_show() {
		return is_show;
	}
	public void setIs_show(short is_show) {
		this.is_show = is_show;
	}
	public short getIs_del() {
		return is_del;
	}
	public void setIs_del(short is_del) {
		this.is_del = is_del;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPackage_list() {
		return package_list;
	}
	public void setPackage_list(String package_list) {
		this.package_list = package_list;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", no=" + no + ", name=" + name + ", weight=" + weight + ", is_new=" + is_new
				+ ", is_hot=" + is_hot + ", is_commend=" + is_commend + ", create_time=" + create_time
				+ ", create_user_id=" + create_user_id + ", check_time=" + check_time + ", check_user_id="
				+ check_user_id + ", is_show=" + is_show + ", is_del=" + is_del + ", type_id=" + type_id + ", brand_id="
				+ brand_id + ", keywords=" + keywords + ", sales=" + sales + ", description=" + description
				+ ", package_list=" + package_list + ", feature=" + feature + ", color=" + color + ", size=" + size
				+ "]";
	}
	
}
