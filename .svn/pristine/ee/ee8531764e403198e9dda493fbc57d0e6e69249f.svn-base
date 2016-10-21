package net.togogo.egou.common.idao;

import java.util.List;
import java.util.Map;

public interface IBaseDao<T> {
	
	/**
	 * 条件查询，
	 * @param maps 若为null,表示查询全部
	 * @return
	 */
	List<T> findRecord(Map<String,? extends Object> maps);
	
	/**
	 * 添加
	 * @param object
	 */
	void addRecord(T bean);
	
	/**
	 * 查询总记录数
	 */
	long findTotalCount();
}
