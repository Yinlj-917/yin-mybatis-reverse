package com.yin.reverse.dto;

import java.util.Date;

/**
 * 
 * @author ylj 
 * @date 2018-08-11
 */
public class LandHeadExtHis {
    /**
     * 主键 (id)
     */
    private Integer id;

    /**
     * 主表Id (parent_id)
     */
    private Integer parentId;

    /**
     * 项目优势 (advantage_project)
     */
    private String advantageProject;

    /**
     * 项目劣势 (disadvantage_project)
     */
    private String disadvantageProject;

    /**
     * 项目机会 (chance_project)
     */
    private String chanceProject;

    /**
     * 项目风险 (risk_project)
     */
    private String riskProject;

    /**
     * 东至 (east)
     */
    private String east;

    /**
     * 西至 (west)
     */
    private String west;

    /**
     * 南至 (south)
     */
    private String south;

    /**
     * 北至 (north)
     */
    private String north;

    /**
     * 创建时间 (create_date)
     */
    private Date createDate;

    /**
     * 创建人 (create_by)
     */
    private String createBy;

    /**
     * 版本号 (version_no)
     */
    private Integer versionNo;

    /**
     * 最后更新时间 (last_upd_date)
     */
    private Date lastUpdDate;

    /**
     * 最后更新人 (last_upd_by)
     */
    private String lastUpdBy;

    /**
     * 是否提交合作方信息 (is_commit_partner_info)
     */
    private String isCommitPartnerInfo;

    /**
     * 是否审批完成过合作方信息 (is_approvaled_partner_info)
     */
    private String isApprovaledPartnerInfo;

    /**
     * 合作流程跟随定价提交 (is_pricing_commit)
     */
    private String isPricingCommit;

    /**
     * 合作流程跟随立项提交 (is_project_commit)
     */
    private String isProjectCommit;

    /**
     * 合作流程跟随流程Id (process_instance_id)
     */
    private String processInstanceId;

    /**
     * 合作流程跟随流程code (process_instance_code)
     */
    private String processInstanceCode;

    /**
     * 合作流程跟随流程name (process_instance_name)
     */
    private String processInstanceName;

    /**
     * 大区立项意见 (project_region)
     */
    private String projectRegion;

    /**
     * 总部立项意见 (project_center)
     */
    private String projectCenter;

    /**
     * 执委会立项意见 (project_ebm)
     */
    private String projectEbm;

    /**
     * 大区定价意见 (pricing_region)
     */
    private String pricingRegion;

    /**
     * 总部定价意见 (pricing_center)
     */
    private String pricingCenter;

    /**
     * 执委会定价意见 (pricing_ebm)
     */
    private String pricingEbm;

    /**
     * 旧Id (attribute1)
     */
    private String attribute1;

    /**
     * 下发授权说明 (attribute2)
     */
    private String attribute2;

    /**
     * 下发授权大区查看人 (attribute3)
     */
    private String attribute3;

    /**
     * 是否同时提交立项定价流程 (attribute4)
     */
    private String attribute4;

    /**
     *  (attribute5)
     */
    private String attribute5;

    /**
     *  (attribute6)
     */
    private String attribute6;

    /**
     *  (attribute7)
     */
    private String attribute7;

    /**
     *  (attribute8)
     */
    private String attribute8;

    /**
     *  (attribute9)
     */
    private String attribute9;

    /**
     *  (attribute10)
     */
    private String attribute10;

    /**
     *  (attribute11)
     */
    private String attribute11;

    /**
     *  (attribute12)
     */
    private String attribute12;

    /**
     *  (attribute13)
     */
    private String attribute13;

    /**
     *  (attribute14)
     */
    private String attribute14;

    /**
     *  (attribute15)
     */
    private String attribute15;

    /**
     *  (attribute16)
     */
    private Double attribute16;

    /**
     *  (attribute17)
     */
    private Double attribute17;

    /**
     *  (attribute18)
     */
    private Date attribute18;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 主表Id
     * @return parent_id 主表Id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 主表Id
     * @param parentId 主表Id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 项目优势
     * @return advantage_project 项目优势
     */
    public String getAdvantageProject() {
        return advantageProject;
    }

    /**
     * 项目优势
     * @param advantageProject 项目优势
     */
    public void setAdvantageProject(String advantageProject) {
        this.advantageProject = advantageProject == null ? null : advantageProject.trim();
    }

    /**
     * 项目劣势
     * @return disadvantage_project 项目劣势
     */
    public String getDisadvantageProject() {
        return disadvantageProject;
    }

    /**
     * 项目劣势
     * @param disadvantageProject 项目劣势
     */
    public void setDisadvantageProject(String disadvantageProject) {
        this.disadvantageProject = disadvantageProject == null ? null : disadvantageProject.trim();
    }

    /**
     * 项目机会
     * @return chance_project 项目机会
     */
    public String getChanceProject() {
        return chanceProject;
    }

    /**
     * 项目机会
     * @param chanceProject 项目机会
     */
    public void setChanceProject(String chanceProject) {
        this.chanceProject = chanceProject == null ? null : chanceProject.trim();
    }

    /**
     * 项目风险
     * @return risk_project 项目风险
     */
    public String getRiskProject() {
        return riskProject;
    }

    /**
     * 项目风险
     * @param riskProject 项目风险
     */
    public void setRiskProject(String riskProject) {
        this.riskProject = riskProject == null ? null : riskProject.trim();
    }

    /**
     * 东至
     * @return east 东至
     */
    public String getEast() {
        return east;
    }

    /**
     * 东至
     * @param east 东至
     */
    public void setEast(String east) {
        this.east = east == null ? null : east.trim();
    }

    /**
     * 西至
     * @return west 西至
     */
    public String getWest() {
        return west;
    }

    /**
     * 西至
     * @param west 西至
     */
    public void setWest(String west) {
        this.west = west == null ? null : west.trim();
    }

    /**
     * 南至
     * @return south 南至
     */
    public String getSouth() {
        return south;
    }

    /**
     * 南至
     * @param south 南至
     */
    public void setSouth(String south) {
        this.south = south == null ? null : south.trim();
    }

    /**
     * 北至
     * @return north 北至
     */
    public String getNorth() {
        return north;
    }

    /**
     * 北至
     * @param north 北至
     */
    public void setNorth(String north) {
        this.north = north == null ? null : north.trim();
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 创建人
     * @return create_by 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 创建人
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 版本号
     * @return version_no 版本号
     */
    public Integer getVersionNo() {
        return versionNo;
    }

    /**
     * 版本号
     * @param versionNo 版本号
     */
    public void setVersionNo(Integer versionNo) {
        this.versionNo = versionNo;
    }

    /**
     * 最后更新时间
     * @return last_upd_date 最后更新时间
     */
    public Date getLastUpdDate() {
        return lastUpdDate;
    }

    /**
     * 最后更新时间
     * @param lastUpdDate 最后更新时间
     */
    public void setLastUpdDate(Date lastUpdDate) {
        this.lastUpdDate = lastUpdDate;
    }

    /**
     * 最后更新人
     * @return last_upd_by 最后更新人
     */
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    /**
     * 最后更新人
     * @param lastUpdBy 最后更新人
     */
    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy == null ? null : lastUpdBy.trim();
    }

    /**
     * 是否提交合作方信息
     * @return is_commit_partner_info 是否提交合作方信息
     */
    public String getIsCommitPartnerInfo() {
        return isCommitPartnerInfo;
    }

    /**
     * 是否提交合作方信息
     * @param isCommitPartnerInfo 是否提交合作方信息
     */
    public void setIsCommitPartnerInfo(String isCommitPartnerInfo) {
        this.isCommitPartnerInfo = isCommitPartnerInfo == null ? null : isCommitPartnerInfo.trim();
    }

    /**
     * 是否审批完成过合作方信息
     * @return is_approvaled_partner_info 是否审批完成过合作方信息
     */
    public String getIsApprovaledPartnerInfo() {
        return isApprovaledPartnerInfo;
    }

    /**
     * 是否审批完成过合作方信息
     * @param isApprovaledPartnerInfo 是否审批完成过合作方信息
     */
    public void setIsApprovaledPartnerInfo(String isApprovaledPartnerInfo) {
        this.isApprovaledPartnerInfo = isApprovaledPartnerInfo == null ? null : isApprovaledPartnerInfo.trim();
    }

    /**
     * 合作流程跟随定价提交
     * @return is_pricing_commit 合作流程跟随定价提交
     */
    public String getIsPricingCommit() {
        return isPricingCommit;
    }

    /**
     * 合作流程跟随定价提交
     * @param isPricingCommit 合作流程跟随定价提交
     */
    public void setIsPricingCommit(String isPricingCommit) {
        this.isPricingCommit = isPricingCommit == null ? null : isPricingCommit.trim();
    }

    /**
     * 合作流程跟随立项提交
     * @return is_project_commit 合作流程跟随立项提交
     */
    public String getIsProjectCommit() {
        return isProjectCommit;
    }

    /**
     * 合作流程跟随立项提交
     * @param isProjectCommit 合作流程跟随立项提交
     */
    public void setIsProjectCommit(String isProjectCommit) {
        this.isProjectCommit = isProjectCommit == null ? null : isProjectCommit.trim();
    }

    /**
     * 合作流程跟随流程Id
     * @return process_instance_id 合作流程跟随流程Id
     */
    public String getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * 合作流程跟随流程Id
     * @param processInstanceId 合作流程跟随流程Id
     */
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId == null ? null : processInstanceId.trim();
    }

    /**
     * 合作流程跟随流程code
     * @return process_instance_code 合作流程跟随流程code
     */
    public String getProcessInstanceCode() {
        return processInstanceCode;
    }

    /**
     * 合作流程跟随流程code
     * @param processInstanceCode 合作流程跟随流程code
     */
    public void setProcessInstanceCode(String processInstanceCode) {
        this.processInstanceCode = processInstanceCode == null ? null : processInstanceCode.trim();
    }

    /**
     * 合作流程跟随流程name
     * @return process_instance_name 合作流程跟随流程name
     */
    public String getProcessInstanceName() {
        return processInstanceName;
    }

    /**
     * 合作流程跟随流程name
     * @param processInstanceName 合作流程跟随流程name
     */
    public void setProcessInstanceName(String processInstanceName) {
        this.processInstanceName = processInstanceName == null ? null : processInstanceName.trim();
    }

    /**
     * 大区立项意见
     * @return project_region 大区立项意见
     */
    public String getProjectRegion() {
        return projectRegion;
    }

    /**
     * 大区立项意见
     * @param projectRegion 大区立项意见
     */
    public void setProjectRegion(String projectRegion) {
        this.projectRegion = projectRegion == null ? null : projectRegion.trim();
    }

    /**
     * 总部立项意见
     * @return project_center 总部立项意见
     */
    public String getProjectCenter() {
        return projectCenter;
    }

    /**
     * 总部立项意见
     * @param projectCenter 总部立项意见
     */
    public void setProjectCenter(String projectCenter) {
        this.projectCenter = projectCenter == null ? null : projectCenter.trim();
    }

    /**
     * 执委会立项意见
     * @return project_ebm 执委会立项意见
     */
    public String getProjectEbm() {
        return projectEbm;
    }

    /**
     * 执委会立项意见
     * @param projectEbm 执委会立项意见
     */
    public void setProjectEbm(String projectEbm) {
        this.projectEbm = projectEbm == null ? null : projectEbm.trim();
    }

    /**
     * 大区定价意见
     * @return pricing_region 大区定价意见
     */
    public String getPricingRegion() {
        return pricingRegion;
    }

    /**
     * 大区定价意见
     * @param pricingRegion 大区定价意见
     */
    public void setPricingRegion(String pricingRegion) {
        this.pricingRegion = pricingRegion == null ? null : pricingRegion.trim();
    }

    /**
     * 总部定价意见
     * @return pricing_center 总部定价意见
     */
    public String getPricingCenter() {
        return pricingCenter;
    }

    /**
     * 总部定价意见
     * @param pricingCenter 总部定价意见
     */
    public void setPricingCenter(String pricingCenter) {
        this.pricingCenter = pricingCenter == null ? null : pricingCenter.trim();
    }

    /**
     * 执委会定价意见
     * @return pricing_ebm 执委会定价意见
     */
    public String getPricingEbm() {
        return pricingEbm;
    }

    /**
     * 执委会定价意见
     * @param pricingEbm 执委会定价意见
     */
    public void setPricingEbm(String pricingEbm) {
        this.pricingEbm = pricingEbm == null ? null : pricingEbm.trim();
    }

    /**
     * 旧Id
     * @return attribute1 旧Id
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * 旧Id
     * @param attribute1 旧Id
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    /**
     * 下发授权说明
     * @return attribute2 下发授权说明
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * 下发授权说明
     * @param attribute2 下发授权说明
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    /**
     * 下发授权大区查看人
     * @return attribute3 下发授权大区查看人
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * 下发授权大区查看人
     * @param attribute3 下发授权大区查看人
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    /**
     * 是否同时提交立项定价流程
     * @return attribute4 是否同时提交立项定价流程
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * 是否同时提交立项定价流程
     * @param attribute4 是否同时提交立项定价流程
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    /**
     * 
     * @return attribute5 
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * 
     * @param attribute5 
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    /**
     * 
     * @return attribute6 
     */
    public String getAttribute6() {
        return attribute6;
    }

    /**
     * 
     * @param attribute6 
     */
    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    /**
     * 
     * @return attribute7 
     */
    public String getAttribute7() {
        return attribute7;
    }

    /**
     * 
     * @param attribute7 
     */
    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7 == null ? null : attribute7.trim();
    }

    /**
     * 
     * @return attribute8 
     */
    public String getAttribute8() {
        return attribute8;
    }

    /**
     * 
     * @param attribute8 
     */
    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8 == null ? null : attribute8.trim();
    }

    /**
     * 
     * @return attribute9 
     */
    public String getAttribute9() {
        return attribute9;
    }

    /**
     * 
     * @param attribute9 
     */
    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9 == null ? null : attribute9.trim();
    }

    /**
     * 
     * @return attribute10 
     */
    public String getAttribute10() {
        return attribute10;
    }

    /**
     * 
     * @param attribute10 
     */
    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10 == null ? null : attribute10.trim();
    }

    /**
     * 
     * @return attribute11 
     */
    public String getAttribute11() {
        return attribute11;
    }

    /**
     * 
     * @param attribute11 
     */
    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11 == null ? null : attribute11.trim();
    }

    /**
     * 
     * @return attribute12 
     */
    public String getAttribute12() {
        return attribute12;
    }

    /**
     * 
     * @param attribute12 
     */
    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12 == null ? null : attribute12.trim();
    }

    /**
     * 
     * @return attribute13 
     */
    public String getAttribute13() {
        return attribute13;
    }

    /**
     * 
     * @param attribute13 
     */
    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13 == null ? null : attribute13.trim();
    }

    /**
     * 
     * @return attribute14 
     */
    public String getAttribute14() {
        return attribute14;
    }

    /**
     * 
     * @param attribute14 
     */
    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14 == null ? null : attribute14.trim();
    }

    /**
     * 
     * @return attribute15 
     */
    public String getAttribute15() {
        return attribute15;
    }

    /**
     * 
     * @param attribute15 
     */
    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15 == null ? null : attribute15.trim();
    }

    /**
     * 
     * @return attribute16 
     */
    public Double getAttribute16() {
        return attribute16;
    }

    /**
     * 
     * @param attribute16 
     */
    public void setAttribute16(Double attribute16) {
        this.attribute16 = attribute16;
    }

    /**
     * 
     * @return attribute17 
     */
    public Double getAttribute17() {
        return attribute17;
    }

    /**
     * 
     * @param attribute17 
     */
    public void setAttribute17(Double attribute17) {
        this.attribute17 = attribute17;
    }

    /**
     * 
     * @return attribute18 
     */
    public Date getAttribute18() {
        return attribute18;
    }

    /**
     * 
     * @param attribute18 
     */
    public void setAttribute18(Date attribute18) {
        this.attribute18 = attribute18;
    }
}