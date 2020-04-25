package com.cym.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import cn.craccd.sqlite.utils.SqliteHelper;

/**
 * Author: D.Yang Email: koyangslash@gmail.com Date: 16/10/9 Time: 下午1:37
 * Describe: 基础控制器
 */
public class BaseController {
//	@Autowired
//	protected SqliteUtils sqliteUtils;
	@Autowired
	protected SqliteHelper sqliteHelper;
	
	@Value("${custom.nginx}")
	protected String nginx;
	
	protected JsonResult renderError() {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		result.setStatus("500");
		return result;
	}

	protected JsonResult renderAuthError() {
		JsonResult result = new JsonResult();
		result.setSuccess(false);
		result.setStatus("401");
		return result;
	}

	protected JsonResult renderError(String msg) {
		JsonResult result = renderError();
		result.setMsg(msg);
		return result;
	}

	protected JsonResult renderSuccess() {
		JsonResult result = new JsonResult();
		result.setSuccess(true);
		result.setStatus("200");
		return result;
	}

	protected JsonResult renderSuccess(Object obj) {
		JsonResult result = renderSuccess();
		result.setObj(obj);
		return result;
	}

}
