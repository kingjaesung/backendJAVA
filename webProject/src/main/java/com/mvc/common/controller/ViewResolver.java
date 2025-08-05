package com.mvc.common.controller;

public class ViewResolver {

	public String prefix; // 공통 경로(폴더)를 명시
	public String suffix; // 확장자 명시

	public void setPrefix(String prefix) {
		this.prefix = prefix; //공통 경로
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix; // 확장자
	}

	public String getView(String viewName) {
		return prefix + viewName + suffix;
	}

}
