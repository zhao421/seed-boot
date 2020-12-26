package com.bmw.seed.util.bean;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * <Description>
 *
 * @author yalin.gao@shunyagroup.com
 * @version 1.0
 * @date 2020/07/29
 */
public class PageReq implements Serializable {

	@NotNull(message = "page 不能为空")
	private Integer page;
	@NotNull(message = "pageSize 不能为空")
	private Integer pageSize;


	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
