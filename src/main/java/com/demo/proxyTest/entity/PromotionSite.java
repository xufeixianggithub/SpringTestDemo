package com.demo.proxyTest.entity;

/**
 *  table: see_promotion_site
 */


public class PromotionSite  {

    private Integer id;


    /**
     * 所属用户backendId
     */
    private Integer backendId;

    /**
     * 推广位名称
     */
    private String name;

    /**
     * PID
     */
    private String pid;

    /**
     * 推广渠道id
     */
    private Integer promotionChannelId;

    /**
     * 推广位状态-1删除0禁用1正常
     */
    private Integer status;

    public Integer getBackendId() {
        return backendId;
    }

    public void setBackendId(Integer backendId) {
        this.backendId = backendId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getPromotionChannelId() {
        return promotionChannelId;
    }

    public void setPromotionChannelId(Integer promotionChannelId) {
        this.promotionChannelId = promotionChannelId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public PromotionSite setId(Integer id) {
        this.id = id;
        return this;
    }
}
