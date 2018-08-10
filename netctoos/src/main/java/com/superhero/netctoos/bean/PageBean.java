package com.superhero.netctoos.bean;

import java.util.List;

public class PageBean {
	private int code=0;
	private int count;
	private String msg;
	private List<?> data;
	
	private String limit;
	
	private String page;
	
	public PageBean() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	
	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "CutBean [code=" + code + ", count=" + count + ", msg=" + msg + ", data=" + data + ", limit=" + limit
				+ ", page=" + page + "]";
	}

	

}

