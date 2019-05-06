package cn.ekgc.dms.pojo.vo;

import java.io.Serializable;
import java.util.List;

import cn.ekgc.dms.util.ConstantUtil;

public class Page<E> implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long pageNum;
	private Long pageSize;
	private List<E> list;
	private Long totalCount;
	private Long totalPage;
	
	public Page() {}
	public Page(Long pageNum, Long pageSize) {
		//判断页码是否可用
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		}else {
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		}else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
		}
	}
	
	public Long getPageNum() {
		return pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageSize() {
		return pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	
}
