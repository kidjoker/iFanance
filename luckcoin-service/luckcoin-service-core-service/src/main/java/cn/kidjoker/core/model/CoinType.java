/** work for life!
 * 
 */
package cn.kidjoker.core.model;

import cn.kidjoker.common.model.BaseModelAdapter;

/**
 * @author kidjoker
 *
 * @date 2017年12月16日 
 */
public class CoinType extends BaseModelAdapter<String> {
	
	private static final long serialVersionUID = -1176974587974679516L;

	private String coinTypeId;
	
	private String nameCh;
	
	private String nameEn;

	public String getCoinTypeId() {
		return coinTypeId;
	}

	public void setCoinTypeId(String coinTypeId) {
		this.coinTypeId = coinTypeId;
	}

	public String getNameCh() {
		return nameCh;
	}

	public void setNameCh(String nameCh) {
		this.nameCh = nameCh;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}
	
}
