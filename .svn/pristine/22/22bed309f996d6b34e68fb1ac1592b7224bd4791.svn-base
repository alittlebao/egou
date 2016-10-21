package net.togogo.egou.core.domain.product;

import java.io.Serializable;

import net.togogo.egou.common.utils.Constants;


/**
 * 图片
 */
public class Img implements Serializable {
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer product_id;
	private String url;
	private Integer is_def;
	
	//获取全Url
	public String getAllUrl(){
		return Constants.IMG_URL + url;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getIs_def() {
		return is_def;
	}

	public void setIs_def(Integer is_def) {
		this.is_def = is_def;
	}

	@Override
	public String toString() {
		return "Img [id=" + id + ", product_id=" + product_id + ", url=" + url + ", is_def=" + is_def + "]";
	}
	
}
