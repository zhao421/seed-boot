package com.bmw.seed.util;

/**
 * @author bobo
 * @date 2019-03-11 15:46
 */
public enum ErrorMessage {

	/**
	 * 通用ERROR
	 */
	SYS_ERROR(10000, "系统开小差了,稍后再试"),
	PARAM_ERROR(10001, "参数错误");

	private Integer code;
	private String message;

	ErrorMessage(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public ErrorMessage setMessage(String message) {
		this.message = message;
		return this;
	}
}
