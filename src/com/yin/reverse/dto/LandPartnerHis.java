package com.yin.reverse.dto;

import java.util.Date;

/**
 * 
 * @author ylj 
 * @date 2018-08-11
 */
public class LandPartnerHis {
    /**
     * 主键 (id)
     */
    private Integer id;

    /**
     * 地块头表信息Id (parent_id)
     */
    private Integer parentId;

    /**
     * 旧系统合作方表Id (old_id)
     */
    private Integer oldId;

    /**
     * 旧系统地块头信息ID (old_parent_id)
     */
    private Integer oldParentId;

    /**
     * 合作方名称 (partner_name)
     */
    private String partnerName;

    /**
     * 合作方性质-PARTNER_NATURE (partner_type)
     */
    private String partnerType;

    /**
     * 各合作方股比(%) (partner_equity_rate)
     */
    private Double partnerEquityRate;

    /**
     *  (is_stock)
     */
    private String isStock;

    /**
     *  (is_join)
     */
    private String isJoin;

    /**
     * 操盘/并表事宜 (operate_join)
     */
    private String operateJoin;

    /**
     * 公司治理 (company_manage)
     */
    private String companyManage;

    /**
     * 两项费用 (two_cost)
     */
    private String twoCost;

    /**
     * 资金安排 (price_manage)
     */
    private String priceManage;

    /**
     * 保证金 (financing)
     */
    private Double financing;

    /**
     * 操作事宜 (operate_affairs)
     */
    private String operateAffairs;

    /**
     * 并表事宜 (join_affairs)
     */
    private String joinAffairs;

    /**
     * 合作方描述 (partner_remark)
     */
    private String partnerRemark;

    /**
     * 创建时间 (create_date)
     */
    private Date createDate;

    /**
     * 创建人 (create_by)
     */
    private String createBy;

    /**
     * 最后更新时间 (last_upd_date)
     */
    private Date lastUpdDate;

    /**
     * 最后更新人 (last_upd_by)
     */
    private String lastUpdBy;

    /**
     * 版本号 (version_no)
     */
    private Integer versionNo;

    /**
     * 保存阶段（input|deal） (attribute1)
     */
    private String attribute1;

    /**
     * 交易方案 (attribute2)
     */
    private String attribute2;

    /**
     *  (attribute3)
     */
    private String attribute3;

    /**
     *  (attribute4)
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
    private Double attribute12;

    /**
     *  (attribute13)
     */
    private Double attribute13;

    /**
     *  (attribute14)
     */
    private Date attribute14;

    /**
     *  (attribute15)
     */
    private Date attribute15;

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
     * 地块头表信息Id
     * @return parent_id 地块头表信息Id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 地块头表信息Id
     * @param parentId 地块头表信息Id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 旧系统合作方表Id
     * @return old_id 旧系统合作方表Id
     */
    public Integer getOldId() {
        return oldId;
    }

    /**
     * 旧系统合作方表Id
     * @param oldId 旧系统合作方表Id
     */
    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    /**
     * 旧系统地块头信息ID
     * @return old_parent_id 旧系统地块头信息ID
     */
    public Integer getOldParentId() {
        return oldParentId;
    }

    /**
     * 旧系统地块头信息ID
     * @param oldParentId 旧系统地块头信息ID
     */
    public void setOldParentId(Integer oldParentId) {
        this.oldParentId = oldParentId;
    }

    /**
     * 合作方名称
     * @return partner_name 合作方名称
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * 合作方名称
     * @param partnerName 合作方名称
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    /**
     * 合作方性质-PARTNER_NATURE
     * @return partner_type 合作方性质-PARTNER_NATURE
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * 合作方性质-PARTNER_NATURE
     * @param partnerType 合作方性质-PARTNER_NATURE
     */
    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType == null ? null : partnerType.trim();
    }

    /**
     * 各合作方股比(%)
     * @return partner_equity_rate 各合作方股比(%)
     */
    public Double getPartnerEquityRate() {
        return partnerEquityRate;
    }

    /**
     * 各合作方股比(%)
     * @param partnerEquityRate 各合作方股比(%)
     */
    public void setPartnerEquityRate(Double partnerEquityRate) {
        this.partnerEquityRate = partnerEquityRate;
    }

    /**
     * 
     * @return is_stock 
     */
    public String getIsStock() {
        return isStock;
    }

    /**
     * 
     * @param isStock 
     */
    public void setIsStock(String isStock) {
        this.isStock = isStock == null ? null : isStock.trim();
    }

    /**
     * 
     * @return is_join 
     */
    public String getIsJoin() {
        return isJoin;
    }

    /**
     * 
     * @param isJoin 
     */
    public void setIsJoin(String isJoin) {
        this.isJoin = isJoin == null ? null : isJoin.trim();
    }

    /**
     * 操盘/并表事宜
     * @return operate_join 操盘/并表事宜
     */
    public String getOperateJoin() {
        return operateJoin;
    }

    /**
     * 操盘/并表事宜
     * @param operateJoin 操盘/并表事宜
     */
    public void setOperateJoin(String operateJoin) {
        this.operateJoin = operateJoin == null ? null : operateJoin.trim();
    }

    /**
     * 公司治理
     * @return company_manage 公司治理
     */
    public String getCompanyManage() {
        return companyManage;
    }

    /**
     * 公司治理
     * @param companyManage 公司治理
     */
    public void setCompanyManage(String companyManage) {
        this.companyManage = companyManage == null ? null : companyManage.trim();
    }

    /**
     * 两项费用
     * @return two_cost 两项费用
     */
    public String getTwoCost() {
        return twoCost;
    }

    /**
     * 两项费用
     * @param twoCost 两项费用
     */
    public void setTwoCost(String twoCost) {
        this.twoCost = twoCost == null ? null : twoCost.trim();
    }

    /**
     * 资金安排
     * @return price_manage 资金安排
     */
    public String getPriceManage() {
        return priceManage;
    }

    /**
     * 资金安排
     * @param priceManage 资金安排
     */
    public void setPriceManage(String priceManage) {
        this.priceManage = priceManage == null ? null : priceManage.trim();
    }

    /**
     * 保证金
     * @return financing 保证金
     */
    public Double getFinancing() {
        return financing;
    }

    /**
     * 保证金
     * @param financing 保证金
     */
    public void setFinancing(Double financing) {
        this.financing = financing;
    }

    /**
     * 操作事宜
     * @return operate_affairs 操作事宜
     */
    public String getOperateAffairs() {
        return operateAffairs;
    }

    /**
     * 操作事宜
     * @param operateAffairs 操作事宜
     */
    public void setOperateAffairs(String operateAffairs) {
        this.operateAffairs = operateAffairs == null ? null : operateAffairs.trim();
    }

    /**
     * 并表事宜
     * @return join_affairs 并表事宜
     */
    public String getJoinAffairs() {
        return joinAffairs;
    }

    /**
     * 并表事宜
     * @param joinAffairs 并表事宜
     */
    public void setJoinAffairs(String joinAffairs) {
        this.joinAffairs = joinAffairs == null ? null : joinAffairs.trim();
    }

    /**
     * 合作方描述
     * @return partner_remark 合作方描述
     */
    public String getPartnerRemark() {
        return partnerRemark;
    }

    /**
     * 合作方描述
     * @param partnerRemark 合作方描述
     */
    public void setPartnerRemark(String partnerRemark) {
        this.partnerRemark = partnerRemark == null ? null : partnerRemark.trim();
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
     * 保存阶段（input|deal）
     * @return attribute1 保存阶段（input|deal）
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * 保存阶段（input|deal）
     * @param attribute1 保存阶段（input|deal）
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    /**
     * 交易方案
     * @return attribute2 交易方案
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * 交易方案
     * @param attribute2 交易方案
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    /**
     * 
     * @return attribute3 
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * 
     * @param attribute3 
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    /**
     * 
     * @return attribute4 
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * 
     * @param attribute4 
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
    public Double getAttribute12() {
        return attribute12;
    }

    /**
     * 
     * @param attribute12 
     */
    public void setAttribute12(Double attribute12) {
        this.attribute12 = attribute12;
    }

    /**
     * 
     * @return attribute13 
     */
    public Double getAttribute13() {
        return attribute13;
    }

    /**
     * 
     * @param attribute13 
     */
    public void setAttribute13(Double attribute13) {
        this.attribute13 = attribute13;
    }

    /**
     * 
     * @return attribute14 
     */
    public Date getAttribute14() {
        return attribute14;
    }

    /**
     * 
     * @param attribute14 
     */
    public void setAttribute14(Date attribute14) {
        this.attribute14 = attribute14;
    }

    /**
     * 
     * @return attribute15 
     */
    public Date getAttribute15() {
        return attribute15;
    }

    /**
     * 
     * @param attribute15 
     */
    public void setAttribute15(Date attribute15) {
        this.attribute15 = attribute15;
    }
}