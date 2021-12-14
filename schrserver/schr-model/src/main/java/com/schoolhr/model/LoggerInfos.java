package com.schoolhr.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class LoggerInfos {
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private Date requestTime;

    private String requestURL;

    private String requestInfos;

    private Integer requestManagerId;

    private Hr hr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public String getRequestURL() {
        return requestURL;
    }

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public String getRequestInfos() {
        return requestInfos;
    }

    public void setRequestInfos(String requestInfos) {
        this.requestInfos = requestInfos;
    }

    public Integer getRequestManagerId() {
        return requestManagerId;
    }

    public void setRequestManagerId(Integer requestManagerId) {
        this.requestManagerId = requestManagerId;
    }

    public Hr getHr() {
        return hr;
    }

    public void setHr(Hr hr) {
        this.hr = hr;
    }

}