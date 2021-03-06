package com.cym.model;

import cn.craccd.sqlHelper.bean.BaseModel;
import cn.craccd.sqlHelper.config.InitValue;
import cn.craccd.sqlHelper.config.Table;

@Table
public class Location extends BaseModel {
	String serverId;
	
	String path;
	Integer type; // 0 http 1 root 2 负载均衡
	
	String value;
	String upstreamId;
	String upstreamPath;
	String locationParamJson;
	
	
	
	public String getUpstreamPath() {
		return upstreamPath;
	}

	public void setUpstreamPath(String upstreamPath) {
		this.upstreamPath = upstreamPath;
	}

	public String getLocationParamJson() {
		return locationParamJson;
	}

	public void setLocationParamJson(String locationParamJson) {
		this.locationParamJson = locationParamJson;
	}

	public String getUpstreamId() {
		return upstreamId;
	}

	public void setUpstreamId(String upstreamId) {
		this.upstreamId = upstreamId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getServerId() {
		return serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}



}
