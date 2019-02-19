package com.imooc.netty.pojo;

import java.util.Date;

public class HealthEducationActivity {
    private Integer id;

    private Integer orgId;

    private Date activityTime;

    private String activityPlace;

    private String activityMode;

    private String activityTheme;

    private String organizer;

    private String learnerType;

    private Integer learnerNum;

    private String materialType;

    private Integer materialNum;

    private String activityAppraise;

    private Integer creatorId;

    private Integer doctorId;

    private Date createTime;

    private Integer state;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Date getActivityTime() {
        return activityTime;
    }

    public void setActivityTime(Date activityTime) {
        this.activityTime = activityTime;
    }

    public String getActivityPlace() {
        return activityPlace;
    }

    public void setActivityPlace(String activityPlace) {
        this.activityPlace = activityPlace == null ? null : activityPlace.trim();
    }

    public String getActivityMode() {
        return activityMode;
    }

    public void setActivityMode(String activityMode) {
        this.activityMode = activityMode == null ? null : activityMode.trim();
    }

    public String getActivityTheme() {
        return activityTheme;
    }

    public void setActivityTheme(String activityTheme) {
        this.activityTheme = activityTheme == null ? null : activityTheme.trim();
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer == null ? null : organizer.trim();
    }

    public String getLearnerType() {
        return learnerType;
    }

    public void setLearnerType(String learnerType) {
        this.learnerType = learnerType == null ? null : learnerType.trim();
    }

    public Integer getLearnerNum() {
        return learnerNum;
    }

    public void setLearnerNum(Integer learnerNum) {
        this.learnerNum = learnerNum;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType == null ? null : materialType.trim();
    }

    public Integer getMaterialNum() {
        return materialNum;
    }

    public void setMaterialNum(Integer materialNum) {
        this.materialNum = materialNum;
    }

    public String getActivityAppraise() {
        return activityAppraise;
    }

    public void setActivityAppraise(String activityAppraise) {
        this.activityAppraise = activityAppraise == null ? null : activityAppraise.trim();
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}