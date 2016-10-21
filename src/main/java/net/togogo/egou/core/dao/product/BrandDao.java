package net.togogo.egou.core.dao.product;

import java.util.Properties;

import net.togogo.egou.common.idao.IBaseDao;
import net.togogo.egou.core.domain.product.Brand;


public interface BrandDao extends IBaseDao<Brand> {
	
	String[] findBrandName(Properties pro);
}
