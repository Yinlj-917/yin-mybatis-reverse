package com.yin.reverse.dto;

import java.util.Date;

/**
 * 
 * @author ylj 
 * @date 2018-08-11
 */
public class LandHeadHis {
    /**
     * 地块头历史自增id (id)
     */
    private Integer id;

    /**
     * 地块头id (land_id)
     */
    private Integer landId;

    /**
     * 旧系统id (old_id)
     */
    private String oldId;

    /**
     * 地块名称 (land_name)
     */
    private String landName;

    /**
     * 宗地编号 (land_num)
     */
    private String landNum;

    /**
     * 组织id (office_id)
     */
    private String officeId;

    /**
     * 创建时间 (create_date)
     */
    private Date createDate;

    /**
     * 创建人 (create_by)
     */
    private String createBy;

    /**
     * 创建人名称 (create_by_name)
     */
    private String createByName;

    /**
     * 最后更新时间 (last_upd_date)
     */
    private Date lastUpdDate;

    /**
     * 最后更新人 (last_upd_by)
     */
    private String lastUpdBy;

    /**
     * 最后更新人名称 (last_upd_by_name)
     */
    private String lastUpdByName;

    /**
     * 版本号 (version_no)
     */
    private Integer versionNo;

    /**
     * 省份 (province_name)
     */
    private String provinceName;

    /**
     * 城市 (city_name)
     */
    private String cityName;

    /**
     * 区域 (area)
     */
    private String area;

    /**
     * 板块id (plate_id)
     */
    private Integer plateId;

    /**
     * 详细地址 (address_desc)
     */
    private String addressDesc;

    /**
     * 获取方式code-land_get_way (acquisition_mode_id)
     */
    private String acquisitionModeId;

    /**
     * 是否新上市地块-sys_boolean (is_newland)
     */
    private String isNewland;

    /**
     * 是否报批-sys_boolean (is_approval)
     */
    private String isApproval;

    /**
     * 经济预定 (economics_appoint)
     */
    private String economicsAppoint;

    /**
     * 交地条件 (pay_conditions)
     */
    private String payConditions;

    /**
     * 公告提示风险 (notice_risk)
     */
    private String noticeRisk;

    /**
     * 报名限制条件 (apply_limiting_condition)
     */
    private String applyLimitingCondition;

    /**
     * 竞买规则 (bidding_rules)
     */
    private String biddingRules;

    /**
     * 备注 (remark)
     */
    private String remark;

    /**
     * 土地获取/流失情况--备注 (landinout_remark)
     */
    private String landinoutRemark;

    /**
     * 百度地图-经度 (lng_point_baidu)
     */
    private Double lngPointBaidu;

    /**
     * 百度地图-纬度 (lat_point_baidu)
     */
    private Double latPointBaidu;

    /**
     * 高德地图-经度 (lng_point_gaode)
     */
    private Double lngPointGaode;

    /**
     * 高德地图-纬度 (lat_point_gaode)
     */
    private Double latPointGaode;

    /**
     * 腾讯地图-经度 (lng_point_tx)
     */
    private Double lngPointTx;

    /**
     * 腾讯地图-纬度 (lat_point_tx)
     */
    private Double latPointTx;

    /**
     * 谷歌地图-经度 (lng_point_google)
     */
    private Double lngPointGoogle;

    /**
     * 谷歌地图-纬度 (lat_point_google)
     */
    private Double latPointGoogle;

    /**
     * 大区 (region_name)
     */
    private String regionName;

    /**
     * 大区code (region_code)
     */
    private String regionCode;

    /**
     * 用地属性code-land_use_property (land_property)
     */
    private String landProperty;

    /**
     * 用地面积(m*2) (use_land_area)
     */
    private Double useLandArea;

    /**
     * 总用地面积 (total_land_area)
     */
    private Double totalLandArea;

    /**
     * 净用地面积 (net_land_area)
     */
    private Double netLandArea;

    /**
     * 容积率 (capacity_rate)
     */
    private Double capacityRate;

    /**
     * 建筑最大密度 (build_max_density)
     */
    private Double buildMaxDensity;

    /**
     * 计容建筑面积(自动计算) (capacity_building_area)
     */
    private Double capacityBuildingArea;

    /**
     * 计容建筑面积(持有)(m*2)(自动计算) (holding_capacity_building_area)
     */
    private Double holdingCapacityBuildingArea;

    /**
     * 计容建筑面积(销售)(m*2)(自动计算) (sale_capacity_building_area)
     */
    private Double saleCapacityBuildingArea;

    /**
     * 计容建筑面积(其他)(m*2)(自动计算) (other_capacity_building_area)
     */
    private Double otherCapacityBuildingArea;

    /**
     * 计容建筑面积(配建/代建)(m*2)(自动计算) (construction_capacity_building_area)
     */
    private Double constructionCapacityBuildingArea;

    /**
     * 成交-计容建筑面积(自动计算) (deal_capacity_building_area)
     */
    private Double dealCapacityBuildingArea;

    /**
     * 成交-计容建筑面积(持有)(m*2)(自动计算) (deal_holding_capacity_building_area)
     */
    private Double dealHoldingCapacityBuildingArea;

    /**
     * 成交-计容建筑面积(销售)(m*2)(自动计算) (deal_sale_capacity_building_area)
     */
    private Double dealSaleCapacityBuildingArea;

    /**
     * 成交-计容建筑面积(其他)(m*2)(自动计算) (deal_other_capacity_building_area)
     */
    private Double dealOtherCapacityBuildingArea;

    /**
     * 成交-计容建筑面积(配建/代建)(m*2)(自动计算) (deal_construction_capacity_building_area)
     */
    private Double dealConstructionCapacityBuildingArea;

    /**
     * 起拍价(万元) (upset_price)
     */
    private Double upsetPrice;

    /**
     * 起拍楼面价(元/m*2) (floor_price)
     */
    private Double floorPrice;

    /**
     * 具体含义待确认 (regist_due_date)
     */
    private Date registDueDate;

    /**
     * 报名截止时间 (apply_limit_date)
     */
    private Date applyLimitDate;

    /**
     * 土地挂牌时间 (land_stock_time)
     */
    private Date landStockTime;

    /**
     * 土地成交时间 (land_dealdate)
     */
    private Date landDealdate;

    /**
     * 保证金额度(万元) (deposit_amt)
     */
    private Double depositAmt;

    /**
     * 保证金截止时间 (deposit_due_date)
     */
    private Date depositDueDate;

    /**
     * 保证金返还时间 (deposit_return_date)
     */
    private Date depositReturnDate;

    /**
     * 地价支付进度 (pay_progress)
     */
    private String payProgress;

    /**
     * 创建时间(土地录入时间) (creation_date)
     */
    private Date creationDate;

    /**
     * 版本 (version_num)
     */
    private Long versionNum;

    /**
     * 经办人id (handle_person_id)
     */
    private String handlePersonId;

    /**
     * 当前状态code-land_status (land_status)
     */
    private String landStatus;

    /**
     * 交地时间 (land_submit_date)
     */
    private Date landSubmitDate;

    /**
     * 竞买时间 (land_shopping_date)
     */
    private Date landShoppingDate;

    /**
     * 是否是居住用地 (is_residential_land)
     */
    private String isResidentialLand;

    /**
     * 公共管理与公共服务设施用地 (is_man_service_land)
     */
    private String isManServiceLand;

    /**
     * 商业服务业设施用地 (is_business_land)
     */
    private String isBusinessLand;

    /**
     * 工业用地 (is_industrial_land)
     */
    private String isIndustrialLand;

    /**
     * 物流仓储用地 (is_warehousing_land)
     */
    private String isWarehousingLand;

    /**
     * 道路与交通设施用地 (is_traffic_land)
     */
    private String isTrafficLand;

    /**
     * 是否是公用设施用地 (is_public_land)
     */
    private String isPublicLand;

    /**
     * 是否是绿地与广场用地 (is_square_land)
     */
    private String isSquareLand;

    /**
     * 立项申请意见 (apply_advice)
     */
    private String applyAdvice;

    /**
     * 土地获取公司（实际控制人） (land_gain_company)
     */
    private String landGainCompany;

    /**
     * 成交实际楼面价(元/㎡) (land_deal_per_amt)
     */
    private Double landDealPerAmt;

    /**
     * 成交名义楼面价(元/㎡） (land_deal_name_amt)
     */
    private Double landDealNameAmt;

    /**
     * 土地成交总价(万元) (land_deal_amt)
     */
    private Double landDealAmt;

    /**
     * 竞买开发商个数 (compant_cnt)
     */
    private Integer compantCnt;

    /**
     * 溢价率 (premium_rate)
     */
    private Double premiumRate;

    /**
     * 获取状态 (acquisition_status)
     */
    private String acquisitionStatus;

    /**
     * 竞拍分析 (bidding_analysis)
     */
    private String biddingAnalysis;

    /**
     * 定价意见 (price_advise)
     */
    private String priceAdvise;

    /**
     * 最终定价（app端） (price_amt)
     */
    private String priceAmt;

    /**
     * 最终楼面价（app端） (final_per_amt)
     */
    private String finalPerAmt;

    /**
     * 计算口径说明 (calculate_desc)
     */
    private String calculateDesc;

    /**
     * 竞买开发商名单 (land_gain_company_desc)
     */
    private String landGainCompanyDesc;

    /**
     * 竞拍前后业务面积是否有变化 (is_area_change)
     */
    private String isAreaChange;

    /**
     * 土地挂牌时间 (land_list_date)
     */
    private Date landListDate;

    /**
     * 立项-流程Id (app_wf_proc_id)
     */
    private String appWfProcId;

    /**
     * 立项-节点编码 (app_wf_node_code)
     */
    private String appWfNodeCode;

    /**
     * 立项-节点 (app_wf_node)
     */
    private String appWfNode;

    /**
     * 定价-流程Id (price_wf_proc_id)
     */
    private String priceWfProcId;

    /**
     * 定价-节点 (price_wf_node)
     */
    private String priceWfNode;

    /**
     * 定价-节点编码 (price_wf_node_code)
     */
    private String priceWfNodeCode;

    /**
     *  (price_status)
     */
    private String priceStatus;

    /**
     * 历史数据是否生效（Y/N） (history_flag)
     */
    private String historyFlag;

    /**
     * 是否存在图片视频附件，Y是，N否 (attribute1)
     */
    private String attribute1;

    /**
     * 是否存在附件，Y是，N否 (attribute2)
     */
    private String attribute2;

    /**
     * 是否公示Y/N,Y公示 (attribute3)
     */
    private String attribute3;

    /**
     * 竞拍前后业务合作方是否有变化 (attribute4)
     */
    private String attribute4;

    /**
     * 土地编号（老数据的landnum） (attribute5)
     */
    private String attribute5;

    /**
     * 是否驳回标识(RETURN、CONTINUE) (attribute6)
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
     * 销售净利润预测 (attribute10)
     */
    private Double attribute10;

    /**
     * 配建配套建面 (attribute11)
     */
    private Double attribute11;

    /**
     * 配建保障房面积（无偿移政府） (attribute12)
     */
    private Double attribute12;

    /**
     *  (attribute13)
     */
    private Double attribute13;

    /**
     *  (attribute14)
     */
    private Double attribute14;

    /**
     * 预计支付日期 (attribute15)
     */
    private Date attribute15;

    /**
     *  (attribute16)
     */
    private Date attribute16;

    /**
     *  (attribute17)
     */
    private Date attribute17;

    /**
     *  (attribute18)
     */
    private Date attribute18;

    /**
     *  (attribute19)
     */
    private Date attribute19;

    /**
     *  (attribute20)
     */
    private Date attribute20;

    /**
     *  (attribute21)
     */
    private String attribute21;

    /**
     *  (attribute22)
     */
    private String attribute22;

    /**
     *  (attribute23)
     */
    private String attribute23;

    /**
     *  (attribute24)
     */
    private String attribute24;

    /**
     *  (attribute25)
     */
    private String attribute25;

    /**
     * 地块头历史自增id
     * @return id 地块头历史自增id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 地块头历史自增id
     * @param id 地块头历史自增id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 地块头id
     * @return land_id 地块头id
     */
    public Integer getLandId() {
        return landId;
    }

    /**
     * 地块头id
     * @param landId 地块头id
     */
    public void setLandId(Integer landId) {
        this.landId = landId;
    }

    /**
     * 旧系统id
     * @return old_id 旧系统id
     */
    public String getOldId() {
        return oldId;
    }

    /**
     * 旧系统id
     * @param oldId 旧系统id
     */
    public void setOldId(String oldId) {
        this.oldId = oldId == null ? null : oldId.trim();
    }

    /**
     * 地块名称
     * @return land_name 地块名称
     */
    public String getLandName() {
        return landName;
    }

    /**
     * 地块名称
     * @param landName 地块名称
     */
    public void setLandName(String landName) {
        this.landName = landName == null ? null : landName.trim();
    }

    /**
     * 宗地编号
     * @return land_num 宗地编号
     */
    public String getLandNum() {
        return landNum;
    }

    /**
     * 宗地编号
     * @param landNum 宗地编号
     */
    public void setLandNum(String landNum) {
        this.landNum = landNum == null ? null : landNum.trim();
    }

    /**
     * 组织id
     * @return office_id 组织id
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * 组织id
     * @param officeId 组织id
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
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
     * 创建人名称
     * @return create_by_name 创建人名称
     */
    public String getCreateByName() {
        return createByName;
    }

    /**
     * 创建人名称
     * @param createByName 创建人名称
     */
    public void setCreateByName(String createByName) {
        this.createByName = createByName == null ? null : createByName.trim();
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
     * 最后更新人名称
     * @return last_upd_by_name 最后更新人名称
     */
    public String getLastUpdByName() {
        return lastUpdByName;
    }

    /**
     * 最后更新人名称
     * @param lastUpdByName 最后更新人名称
     */
    public void setLastUpdByName(String lastUpdByName) {
        this.lastUpdByName = lastUpdByName == null ? null : lastUpdByName.trim();
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
     * 省份
     * @return province_name 省份
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 省份
     * @param provinceName 省份
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * 城市
     * @return city_name 城市
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 城市
     * @param cityName 城市
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 区域
     * @return area 区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 区域
     * @param area 区域
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 板块id
     * @return plate_id 板块id
     */
    public Integer getPlateId() {
        return plateId;
    }

    /**
     * 板块id
     * @param plateId 板块id
     */
    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }

    /**
     * 详细地址
     * @return address_desc 详细地址
     */
    public String getAddressDesc() {
        return addressDesc;
    }

    /**
     * 详细地址
     * @param addressDesc 详细地址
     */
    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc == null ? null : addressDesc.trim();
    }

    /**
     * 获取方式code-land_get_way
     * @return acquisition_mode_id 获取方式code-land_get_way
     */
    public String getAcquisitionModeId() {
        return acquisitionModeId;
    }

    /**
     * 获取方式code-land_get_way
     * @param acquisitionModeId 获取方式code-land_get_way
     */
    public void setAcquisitionModeId(String acquisitionModeId) {
        this.acquisitionModeId = acquisitionModeId == null ? null : acquisitionModeId.trim();
    }

    /**
     * 是否新上市地块-sys_boolean
     * @return is_newland 是否新上市地块-sys_boolean
     */
    public String getIsNewland() {
        return isNewland;
    }

    /**
     * 是否新上市地块-sys_boolean
     * @param isNewland 是否新上市地块-sys_boolean
     */
    public void setIsNewland(String isNewland) {
        this.isNewland = isNewland == null ? null : isNewland.trim();
    }

    /**
     * 是否报批-sys_boolean
     * @return is_approval 是否报批-sys_boolean
     */
    public String getIsApproval() {
        return isApproval;
    }

    /**
     * 是否报批-sys_boolean
     * @param isApproval 是否报批-sys_boolean
     */
    public void setIsApproval(String isApproval) {
        this.isApproval = isApproval == null ? null : isApproval.trim();
    }

    /**
     * 经济预定
     * @return economics_appoint 经济预定
     */
    public String getEconomicsAppoint() {
        return economicsAppoint;
    }

    /**
     * 经济预定
     * @param economicsAppoint 经济预定
     */
    public void setEconomicsAppoint(String economicsAppoint) {
        this.economicsAppoint = economicsAppoint == null ? null : economicsAppoint.trim();
    }

    /**
     * 交地条件
     * @return pay_conditions 交地条件
     */
    public String getPayConditions() {
        return payConditions;
    }

    /**
     * 交地条件
     * @param payConditions 交地条件
     */
    public void setPayConditions(String payConditions) {
        this.payConditions = payConditions == null ? null : payConditions.trim();
    }

    /**
     * 公告提示风险
     * @return notice_risk 公告提示风险
     */
    public String getNoticeRisk() {
        return noticeRisk;
    }

    /**
     * 公告提示风险
     * @param noticeRisk 公告提示风险
     */
    public void setNoticeRisk(String noticeRisk) {
        this.noticeRisk = noticeRisk == null ? null : noticeRisk.trim();
    }

    /**
     * 报名限制条件
     * @return apply_limiting_condition 报名限制条件
     */
    public String getApplyLimitingCondition() {
        return applyLimitingCondition;
    }

    /**
     * 报名限制条件
     * @param applyLimitingCondition 报名限制条件
     */
    public void setApplyLimitingCondition(String applyLimitingCondition) {
        this.applyLimitingCondition = applyLimitingCondition == null ? null : applyLimitingCondition.trim();
    }

    /**
     * 竞买规则
     * @return bidding_rules 竞买规则
     */
    public String getBiddingRules() {
        return biddingRules;
    }

    /**
     * 竞买规则
     * @param biddingRules 竞买规则
     */
    public void setBiddingRules(String biddingRules) {
        this.biddingRules = biddingRules == null ? null : biddingRules.trim();
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 土地获取/流失情况--备注
     * @return landinout_remark 土地获取/流失情况--备注
     */
    public String getLandinoutRemark() {
        return landinoutRemark;
    }

    /**
     * 土地获取/流失情况--备注
     * @param landinoutRemark 土地获取/流失情况--备注
     */
    public void setLandinoutRemark(String landinoutRemark) {
        this.landinoutRemark = landinoutRemark == null ? null : landinoutRemark.trim();
    }

    /**
     * 百度地图-经度
     * @return lng_point_baidu 百度地图-经度
     */
    public Double getLngPointBaidu() {
        return lngPointBaidu;
    }

    /**
     * 百度地图-经度
     * @param lngPointBaidu 百度地图-经度
     */
    public void setLngPointBaidu(Double lngPointBaidu) {
        this.lngPointBaidu = lngPointBaidu;
    }

    /**
     * 百度地图-纬度
     * @return lat_point_baidu 百度地图-纬度
     */
    public Double getLatPointBaidu() {
        return latPointBaidu;
    }

    /**
     * 百度地图-纬度
     * @param latPointBaidu 百度地图-纬度
     */
    public void setLatPointBaidu(Double latPointBaidu) {
        this.latPointBaidu = latPointBaidu;
    }

    /**
     * 高德地图-经度
     * @return lng_point_gaode 高德地图-经度
     */
    public Double getLngPointGaode() {
        return lngPointGaode;
    }

    /**
     * 高德地图-经度
     * @param lngPointGaode 高德地图-经度
     */
    public void setLngPointGaode(Double lngPointGaode) {
        this.lngPointGaode = lngPointGaode;
    }

    /**
     * 高德地图-纬度
     * @return lat_point_gaode 高德地图-纬度
     */
    public Double getLatPointGaode() {
        return latPointGaode;
    }

    /**
     * 高德地图-纬度
     * @param latPointGaode 高德地图-纬度
     */
    public void setLatPointGaode(Double latPointGaode) {
        this.latPointGaode = latPointGaode;
    }

    /**
     * 腾讯地图-经度
     * @return lng_point_tx 腾讯地图-经度
     */
    public Double getLngPointTx() {
        return lngPointTx;
    }

    /**
     * 腾讯地图-经度
     * @param lngPointTx 腾讯地图-经度
     */
    public void setLngPointTx(Double lngPointTx) {
        this.lngPointTx = lngPointTx;
    }

    /**
     * 腾讯地图-纬度
     * @return lat_point_tx 腾讯地图-纬度
     */
    public Double getLatPointTx() {
        return latPointTx;
    }

    /**
     * 腾讯地图-纬度
     * @param latPointTx 腾讯地图-纬度
     */
    public void setLatPointTx(Double latPointTx) {
        this.latPointTx = latPointTx;
    }

    /**
     * 谷歌地图-经度
     * @return lng_point_google 谷歌地图-经度
     */
    public Double getLngPointGoogle() {
        return lngPointGoogle;
    }

    /**
     * 谷歌地图-经度
     * @param lngPointGoogle 谷歌地图-经度
     */
    public void setLngPointGoogle(Double lngPointGoogle) {
        this.lngPointGoogle = lngPointGoogle;
    }

    /**
     * 谷歌地图-纬度
     * @return lat_point_google 谷歌地图-纬度
     */
    public Double getLatPointGoogle() {
        return latPointGoogle;
    }

    /**
     * 谷歌地图-纬度
     * @param latPointGoogle 谷歌地图-纬度
     */
    public void setLatPointGoogle(Double latPointGoogle) {
        this.latPointGoogle = latPointGoogle;
    }

    /**
     * 大区
     * @return region_name 大区
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 大区
     * @param regionName 大区
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * 大区code
     * @return region_code 大区code
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 大区code
     * @param regionCode 大区code
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    /**
     * 用地属性code-land_use_property
     * @return land_property 用地属性code-land_use_property
     */
    public String getLandProperty() {
        return landProperty;
    }

    /**
     * 用地属性code-land_use_property
     * @param landProperty 用地属性code-land_use_property
     */
    public void setLandProperty(String landProperty) {
        this.landProperty = landProperty == null ? null : landProperty.trim();
    }

    /**
     * 用地面积(m*2)
     * @return use_land_area 用地面积(m*2)
     */
    public Double getUseLandArea() {
        return useLandArea;
    }

    /**
     * 用地面积(m*2)
     * @param useLandArea 用地面积(m*2)
     */
    public void setUseLandArea(Double useLandArea) {
        this.useLandArea = useLandArea;
    }

    /**
     * 总用地面积
     * @return total_land_area 总用地面积
     */
    public Double getTotalLandArea() {
        return totalLandArea;
    }

    /**
     * 总用地面积
     * @param totalLandArea 总用地面积
     */
    public void setTotalLandArea(Double totalLandArea) {
        this.totalLandArea = totalLandArea;
    }

    /**
     * 净用地面积
     * @return net_land_area 净用地面积
     */
    public Double getNetLandArea() {
        return netLandArea;
    }

    /**
     * 净用地面积
     * @param netLandArea 净用地面积
     */
    public void setNetLandArea(Double netLandArea) {
        this.netLandArea = netLandArea;
    }

    /**
     * 容积率
     * @return capacity_rate 容积率
     */
    public Double getCapacityRate() {
        return capacityRate;
    }

    /**
     * 容积率
     * @param capacityRate 容积率
     */
    public void setCapacityRate(Double capacityRate) {
        this.capacityRate = capacityRate;
    }

    /**
     * 建筑最大密度
     * @return build_max_density 建筑最大密度
     */
    public Double getBuildMaxDensity() {
        return buildMaxDensity;
    }

    /**
     * 建筑最大密度
     * @param buildMaxDensity 建筑最大密度
     */
    public void setBuildMaxDensity(Double buildMaxDensity) {
        this.buildMaxDensity = buildMaxDensity;
    }

    /**
     * 计容建筑面积(自动计算)
     * @return capacity_building_area 计容建筑面积(自动计算)
     */
    public Double getCapacityBuildingArea() {
        return capacityBuildingArea;
    }

    /**
     * 计容建筑面积(自动计算)
     * @param capacityBuildingArea 计容建筑面积(自动计算)
     */
    public void setCapacityBuildingArea(Double capacityBuildingArea) {
        this.capacityBuildingArea = capacityBuildingArea;
    }

    /**
     * 计容建筑面积(持有)(m*2)(自动计算)
     * @return holding_capacity_building_area 计容建筑面积(持有)(m*2)(自动计算)
     */
    public Double getHoldingCapacityBuildingArea() {
        return holdingCapacityBuildingArea;
    }

    /**
     * 计容建筑面积(持有)(m*2)(自动计算)
     * @param holdingCapacityBuildingArea 计容建筑面积(持有)(m*2)(自动计算)
     */
    public void setHoldingCapacityBuildingArea(Double holdingCapacityBuildingArea) {
        this.holdingCapacityBuildingArea = holdingCapacityBuildingArea;
    }

    /**
     * 计容建筑面积(销售)(m*2)(自动计算)
     * @return sale_capacity_building_area 计容建筑面积(销售)(m*2)(自动计算)
     */
    public Double getSaleCapacityBuildingArea() {
        return saleCapacityBuildingArea;
    }

    /**
     * 计容建筑面积(销售)(m*2)(自动计算)
     * @param saleCapacityBuildingArea 计容建筑面积(销售)(m*2)(自动计算)
     */
    public void setSaleCapacityBuildingArea(Double saleCapacityBuildingArea) {
        this.saleCapacityBuildingArea = saleCapacityBuildingArea;
    }

    /**
     * 计容建筑面积(其他)(m*2)(自动计算)
     * @return other_capacity_building_area 计容建筑面积(其他)(m*2)(自动计算)
     */
    public Double getOtherCapacityBuildingArea() {
        return otherCapacityBuildingArea;
    }

    /**
     * 计容建筑面积(其他)(m*2)(自动计算)
     * @param otherCapacityBuildingArea 计容建筑面积(其他)(m*2)(自动计算)
     */
    public void setOtherCapacityBuildingArea(Double otherCapacityBuildingArea) {
        this.otherCapacityBuildingArea = otherCapacityBuildingArea;
    }

    /**
     * 计容建筑面积(配建/代建)(m*2)(自动计算)
     * @return construction_capacity_building_area 计容建筑面积(配建/代建)(m*2)(自动计算)
     */
    public Double getConstructionCapacityBuildingArea() {
        return constructionCapacityBuildingArea;
    }

    /**
     * 计容建筑面积(配建/代建)(m*2)(自动计算)
     * @param constructionCapacityBuildingArea 计容建筑面积(配建/代建)(m*2)(自动计算)
     */
    public void setConstructionCapacityBuildingArea(Double constructionCapacityBuildingArea) {
        this.constructionCapacityBuildingArea = constructionCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(自动计算)
     * @return deal_capacity_building_area 成交-计容建筑面积(自动计算)
     */
    public Double getDealCapacityBuildingArea() {
        return dealCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(自动计算)
     * @param dealCapacityBuildingArea 成交-计容建筑面积(自动计算)
     */
    public void setDealCapacityBuildingArea(Double dealCapacityBuildingArea) {
        this.dealCapacityBuildingArea = dealCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(持有)(m*2)(自动计算)
     * @return deal_holding_capacity_building_area 成交-计容建筑面积(持有)(m*2)(自动计算)
     */
    public Double getDealHoldingCapacityBuildingArea() {
        return dealHoldingCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(持有)(m*2)(自动计算)
     * @param dealHoldingCapacityBuildingArea 成交-计容建筑面积(持有)(m*2)(自动计算)
     */
    public void setDealHoldingCapacityBuildingArea(Double dealHoldingCapacityBuildingArea) {
        this.dealHoldingCapacityBuildingArea = dealHoldingCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(销售)(m*2)(自动计算)
     * @return deal_sale_capacity_building_area 成交-计容建筑面积(销售)(m*2)(自动计算)
     */
    public Double getDealSaleCapacityBuildingArea() {
        return dealSaleCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(销售)(m*2)(自动计算)
     * @param dealSaleCapacityBuildingArea 成交-计容建筑面积(销售)(m*2)(自动计算)
     */
    public void setDealSaleCapacityBuildingArea(Double dealSaleCapacityBuildingArea) {
        this.dealSaleCapacityBuildingArea = dealSaleCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(其他)(m*2)(自动计算)
     * @return deal_other_capacity_building_area 成交-计容建筑面积(其他)(m*2)(自动计算)
     */
    public Double getDealOtherCapacityBuildingArea() {
        return dealOtherCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(其他)(m*2)(自动计算)
     * @param dealOtherCapacityBuildingArea 成交-计容建筑面积(其他)(m*2)(自动计算)
     */
    public void setDealOtherCapacityBuildingArea(Double dealOtherCapacityBuildingArea) {
        this.dealOtherCapacityBuildingArea = dealOtherCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(配建/代建)(m*2)(自动计算)
     * @return deal_construction_capacity_building_area 成交-计容建筑面积(配建/代建)(m*2)(自动计算)
     */
    public Double getDealConstructionCapacityBuildingArea() {
        return dealConstructionCapacityBuildingArea;
    }

    /**
     * 成交-计容建筑面积(配建/代建)(m*2)(自动计算)
     * @param dealConstructionCapacityBuildingArea 成交-计容建筑面积(配建/代建)(m*2)(自动计算)
     */
    public void setDealConstructionCapacityBuildingArea(Double dealConstructionCapacityBuildingArea) {
        this.dealConstructionCapacityBuildingArea = dealConstructionCapacityBuildingArea;
    }

    /**
     * 起拍价(万元)
     * @return upset_price 起拍价(万元)
     */
    public Double getUpsetPrice() {
        return upsetPrice;
    }

    /**
     * 起拍价(万元)
     * @param upsetPrice 起拍价(万元)
     */
    public void setUpsetPrice(Double upsetPrice) {
        this.upsetPrice = upsetPrice;
    }

    /**
     * 起拍楼面价(元/m*2)
     * @return floor_price 起拍楼面价(元/m*2)
     */
    public Double getFloorPrice() {
        return floorPrice;
    }

    /**
     * 起拍楼面价(元/m*2)
     * @param floorPrice 起拍楼面价(元/m*2)
     */
    public void setFloorPrice(Double floorPrice) {
        this.floorPrice = floorPrice;
    }

    /**
     * 具体含义待确认
     * @return regist_due_date 具体含义待确认
     */
    public Date getRegistDueDate() {
        return registDueDate;
    }

    /**
     * 具体含义待确认
     * @param registDueDate 具体含义待确认
     */
    public void setRegistDueDate(Date registDueDate) {
        this.registDueDate = registDueDate;
    }

    /**
     * 报名截止时间
     * @return apply_limit_date 报名截止时间
     */
    public Date getApplyLimitDate() {
        return applyLimitDate;
    }

    /**
     * 报名截止时间
     * @param applyLimitDate 报名截止时间
     */
    public void setApplyLimitDate(Date applyLimitDate) {
        this.applyLimitDate = applyLimitDate;
    }

    /**
     * 土地挂牌时间
     * @return land_stock_time 土地挂牌时间
     */
    public Date getLandStockTime() {
        return landStockTime;
    }

    /**
     * 土地挂牌时间
     * @param landStockTime 土地挂牌时间
     */
    public void setLandStockTime(Date landStockTime) {
        this.landStockTime = landStockTime;
    }

    /**
     * 土地成交时间
     * @return land_dealdate 土地成交时间
     */
    public Date getLandDealdate() {
        return landDealdate;
    }

    /**
     * 土地成交时间
     * @param landDealdate 土地成交时间
     */
    public void setLandDealdate(Date landDealdate) {
        this.landDealdate = landDealdate;
    }

    /**
     * 保证金额度(万元)
     * @return deposit_amt 保证金额度(万元)
     */
    public Double getDepositAmt() {
        return depositAmt;
    }

    /**
     * 保证金额度(万元)
     * @param depositAmt 保证金额度(万元)
     */
    public void setDepositAmt(Double depositAmt) {
        this.depositAmt = depositAmt;
    }

    /**
     * 保证金截止时间
     * @return deposit_due_date 保证金截止时间
     */
    public Date getDepositDueDate() {
        return depositDueDate;
    }

    /**
     * 保证金截止时间
     * @param depositDueDate 保证金截止时间
     */
    public void setDepositDueDate(Date depositDueDate) {
        this.depositDueDate = depositDueDate;
    }

    /**
     * 保证金返还时间
     * @return deposit_return_date 保证金返还时间
     */
    public Date getDepositReturnDate() {
        return depositReturnDate;
    }

    /**
     * 保证金返还时间
     * @param depositReturnDate 保证金返还时间
     */
    public void setDepositReturnDate(Date depositReturnDate) {
        this.depositReturnDate = depositReturnDate;
    }

    /**
     * 地价支付进度
     * @return pay_progress 地价支付进度
     */
    public String getPayProgress() {
        return payProgress;
    }

    /**
     * 地价支付进度
     * @param payProgress 地价支付进度
     */
    public void setPayProgress(String payProgress) {
        this.payProgress = payProgress == null ? null : payProgress.trim();
    }

    /**
     * 创建时间(土地录入时间)
     * @return creation_date 创建时间(土地录入时间)
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * 创建时间(土地录入时间)
     * @param creationDate 创建时间(土地录入时间)
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * 版本
     * @return version_num 版本
     */
    public Long getVersionNum() {
        return versionNum;
    }

    /**
     * 版本
     * @param versionNum 版本
     */
    public void setVersionNum(Long versionNum) {
        this.versionNum = versionNum;
    }

    /**
     * 经办人id
     * @return handle_person_id 经办人id
     */
    public String getHandlePersonId() {
        return handlePersonId;
    }

    /**
     * 经办人id
     * @param handlePersonId 经办人id
     */
    public void setHandlePersonId(String handlePersonId) {
        this.handlePersonId = handlePersonId == null ? null : handlePersonId.trim();
    }

    /**
     * 当前状态code-land_status
     * @return land_status 当前状态code-land_status
     */
    public String getLandStatus() {
        return landStatus;
    }

    /**
     * 当前状态code-land_status
     * @param landStatus 当前状态code-land_status
     */
    public void setLandStatus(String landStatus) {
        this.landStatus = landStatus == null ? null : landStatus.trim();
    }

    /**
     * 交地时间
     * @return land_submit_date 交地时间
     */
    public Date getLandSubmitDate() {
        return landSubmitDate;
    }

    /**
     * 交地时间
     * @param landSubmitDate 交地时间
     */
    public void setLandSubmitDate(Date landSubmitDate) {
        this.landSubmitDate = landSubmitDate;
    }

    /**
     * 竞买时间
     * @return land_shopping_date 竞买时间
     */
    public Date getLandShoppingDate() {
        return landShoppingDate;
    }

    /**
     * 竞买时间
     * @param landShoppingDate 竞买时间
     */
    public void setLandShoppingDate(Date landShoppingDate) {
        this.landShoppingDate = landShoppingDate;
    }

    /**
     * 是否是居住用地
     * @return is_residential_land 是否是居住用地
     */
    public String getIsResidentialLand() {
        return isResidentialLand;
    }

    /**
     * 是否是居住用地
     * @param isResidentialLand 是否是居住用地
     */
    public void setIsResidentialLand(String isResidentialLand) {
        this.isResidentialLand = isResidentialLand == null ? null : isResidentialLand.trim();
    }

    /**
     * 公共管理与公共服务设施用地
     * @return is_man_service_land 公共管理与公共服务设施用地
     */
    public String getIsManServiceLand() {
        return isManServiceLand;
    }

    /**
     * 公共管理与公共服务设施用地
     * @param isManServiceLand 公共管理与公共服务设施用地
     */
    public void setIsManServiceLand(String isManServiceLand) {
        this.isManServiceLand = isManServiceLand == null ? null : isManServiceLand.trim();
    }

    /**
     * 商业服务业设施用地
     * @return is_business_land 商业服务业设施用地
     */
    public String getIsBusinessLand() {
        return isBusinessLand;
    }

    /**
     * 商业服务业设施用地
     * @param isBusinessLand 商业服务业设施用地
     */
    public void setIsBusinessLand(String isBusinessLand) {
        this.isBusinessLand = isBusinessLand == null ? null : isBusinessLand.trim();
    }

    /**
     * 工业用地
     * @return is_industrial_land 工业用地
     */
    public String getIsIndustrialLand() {
        return isIndustrialLand;
    }

    /**
     * 工业用地
     * @param isIndustrialLand 工业用地
     */
    public void setIsIndustrialLand(String isIndustrialLand) {
        this.isIndustrialLand = isIndustrialLand == null ? null : isIndustrialLand.trim();
    }

    /**
     * 物流仓储用地
     * @return is_warehousing_land 物流仓储用地
     */
    public String getIsWarehousingLand() {
        return isWarehousingLand;
    }

    /**
     * 物流仓储用地
     * @param isWarehousingLand 物流仓储用地
     */
    public void setIsWarehousingLand(String isWarehousingLand) {
        this.isWarehousingLand = isWarehousingLand == null ? null : isWarehousingLand.trim();
    }

    /**
     * 道路与交通设施用地
     * @return is_traffic_land 道路与交通设施用地
     */
    public String getIsTrafficLand() {
        return isTrafficLand;
    }

    /**
     * 道路与交通设施用地
     * @param isTrafficLand 道路与交通设施用地
     */
    public void setIsTrafficLand(String isTrafficLand) {
        this.isTrafficLand = isTrafficLand == null ? null : isTrafficLand.trim();
    }

    /**
     * 是否是公用设施用地
     * @return is_public_land 是否是公用设施用地
     */
    public String getIsPublicLand() {
        return isPublicLand;
    }

    /**
     * 是否是公用设施用地
     * @param isPublicLand 是否是公用设施用地
     */
    public void setIsPublicLand(String isPublicLand) {
        this.isPublicLand = isPublicLand == null ? null : isPublicLand.trim();
    }

    /**
     * 是否是绿地与广场用地
     * @return is_square_land 是否是绿地与广场用地
     */
    public String getIsSquareLand() {
        return isSquareLand;
    }

    /**
     * 是否是绿地与广场用地
     * @param isSquareLand 是否是绿地与广场用地
     */
    public void setIsSquareLand(String isSquareLand) {
        this.isSquareLand = isSquareLand == null ? null : isSquareLand.trim();
    }

    /**
     * 立项申请意见
     * @return apply_advice 立项申请意见
     */
    public String getApplyAdvice() {
        return applyAdvice;
    }

    /**
     * 立项申请意见
     * @param applyAdvice 立项申请意见
     */
    public void setApplyAdvice(String applyAdvice) {
        this.applyAdvice = applyAdvice == null ? null : applyAdvice.trim();
    }

    /**
     * 土地获取公司（实际控制人）
     * @return land_gain_company 土地获取公司（实际控制人）
     */
    public String getLandGainCompany() {
        return landGainCompany;
    }

    /**
     * 土地获取公司（实际控制人）
     * @param landGainCompany 土地获取公司（实际控制人）
     */
    public void setLandGainCompany(String landGainCompany) {
        this.landGainCompany = landGainCompany == null ? null : landGainCompany.trim();
    }

    /**
     * 成交实际楼面价(元/㎡)
     * @return land_deal_per_amt 成交实际楼面价(元/㎡)
     */
    public Double getLandDealPerAmt() {
        return landDealPerAmt;
    }

    /**
     * 成交实际楼面价(元/㎡)
     * @param landDealPerAmt 成交实际楼面价(元/㎡)
     */
    public void setLandDealPerAmt(Double landDealPerAmt) {
        this.landDealPerAmt = landDealPerAmt;
    }

    /**
     * 成交名义楼面价(元/㎡）
     * @return land_deal_name_amt 成交名义楼面价(元/㎡）
     */
    public Double getLandDealNameAmt() {
        return landDealNameAmt;
    }

    /**
     * 成交名义楼面价(元/㎡）
     * @param landDealNameAmt 成交名义楼面价(元/㎡）
     */
    public void setLandDealNameAmt(Double landDealNameAmt) {
        this.landDealNameAmt = landDealNameAmt;
    }

    /**
     * 土地成交总价(万元)
     * @return land_deal_amt 土地成交总价(万元)
     */
    public Double getLandDealAmt() {
        return landDealAmt;
    }

    /**
     * 土地成交总价(万元)
     * @param landDealAmt 土地成交总价(万元)
     */
    public void setLandDealAmt(Double landDealAmt) {
        this.landDealAmt = landDealAmt;
    }

    /**
     * 竞买开发商个数
     * @return compant_cnt 竞买开发商个数
     */
    public Integer getCompantCnt() {
        return compantCnt;
    }

    /**
     * 竞买开发商个数
     * @param compantCnt 竞买开发商个数
     */
    public void setCompantCnt(Integer compantCnt) {
        this.compantCnt = compantCnt;
    }

    /**
     * 溢价率
     * @return premium_rate 溢价率
     */
    public Double getPremiumRate() {
        return premiumRate;
    }

    /**
     * 溢价率
     * @param premiumRate 溢价率
     */
    public void setPremiumRate(Double premiumRate) {
        this.premiumRate = premiumRate;
    }

    /**
     * 获取状态
     * @return acquisition_status 获取状态
     */
    public String getAcquisitionStatus() {
        return acquisitionStatus;
    }

    /**
     * 获取状态
     * @param acquisitionStatus 获取状态
     */
    public void setAcquisitionStatus(String acquisitionStatus) {
        this.acquisitionStatus = acquisitionStatus == null ? null : acquisitionStatus.trim();
    }

    /**
     * 竞拍分析
     * @return bidding_analysis 竞拍分析
     */
    public String getBiddingAnalysis() {
        return biddingAnalysis;
    }

    /**
     * 竞拍分析
     * @param biddingAnalysis 竞拍分析
     */
    public void setBiddingAnalysis(String biddingAnalysis) {
        this.biddingAnalysis = biddingAnalysis == null ? null : biddingAnalysis.trim();
    }

    /**
     * 定价意见
     * @return price_advise 定价意见
     */
    public String getPriceAdvise() {
        return priceAdvise;
    }

    /**
     * 定价意见
     * @param priceAdvise 定价意见
     */
    public void setPriceAdvise(String priceAdvise) {
        this.priceAdvise = priceAdvise == null ? null : priceAdvise.trim();
    }

    /**
     * 最终定价（app端）
     * @return price_amt 最终定价（app端）
     */
    public String getPriceAmt() {
        return priceAmt;
    }

    /**
     * 最终定价（app端）
     * @param priceAmt 最终定价（app端）
     */
    public void setPriceAmt(String priceAmt) {
        this.priceAmt = priceAmt == null ? null : priceAmt.trim();
    }

    /**
     * 最终楼面价（app端）
     * @return final_per_amt 最终楼面价（app端）
     */
    public String getFinalPerAmt() {
        return finalPerAmt;
    }

    /**
     * 最终楼面价（app端）
     * @param finalPerAmt 最终楼面价（app端）
     */
    public void setFinalPerAmt(String finalPerAmt) {
        this.finalPerAmt = finalPerAmt == null ? null : finalPerAmt.trim();
    }

    /**
     * 计算口径说明
     * @return calculate_desc 计算口径说明
     */
    public String getCalculateDesc() {
        return calculateDesc;
    }

    /**
     * 计算口径说明
     * @param calculateDesc 计算口径说明
     */
    public void setCalculateDesc(String calculateDesc) {
        this.calculateDesc = calculateDesc == null ? null : calculateDesc.trim();
    }

    /**
     * 竞买开发商名单
     * @return land_gain_company_desc 竞买开发商名单
     */
    public String getLandGainCompanyDesc() {
        return landGainCompanyDesc;
    }

    /**
     * 竞买开发商名单
     * @param landGainCompanyDesc 竞买开发商名单
     */
    public void setLandGainCompanyDesc(String landGainCompanyDesc) {
        this.landGainCompanyDesc = landGainCompanyDesc == null ? null : landGainCompanyDesc.trim();
    }

    /**
     * 竞拍前后业务面积是否有变化
     * @return is_area_change 竞拍前后业务面积是否有变化
     */
    public String getIsAreaChange() {
        return isAreaChange;
    }

    /**
     * 竞拍前后业务面积是否有变化
     * @param isAreaChange 竞拍前后业务面积是否有变化
     */
    public void setIsAreaChange(String isAreaChange) {
        this.isAreaChange = isAreaChange == null ? null : isAreaChange.trim();
    }

    /**
     * 土地挂牌时间
     * @return land_list_date 土地挂牌时间
     */
    public Date getLandListDate() {
        return landListDate;
    }

    /**
     * 土地挂牌时间
     * @param landListDate 土地挂牌时间
     */
    public void setLandListDate(Date landListDate) {
        this.landListDate = landListDate;
    }

    /**
     * 立项-流程Id
     * @return app_wf_proc_id 立项-流程Id
     */
    public String getAppWfProcId() {
        return appWfProcId;
    }

    /**
     * 立项-流程Id
     * @param appWfProcId 立项-流程Id
     */
    public void setAppWfProcId(String appWfProcId) {
        this.appWfProcId = appWfProcId == null ? null : appWfProcId.trim();
    }

    /**
     * 立项-节点编码
     * @return app_wf_node_code 立项-节点编码
     */
    public String getAppWfNodeCode() {
        return appWfNodeCode;
    }

    /**
     * 立项-节点编码
     * @param appWfNodeCode 立项-节点编码
     */
    public void setAppWfNodeCode(String appWfNodeCode) {
        this.appWfNodeCode = appWfNodeCode == null ? null : appWfNodeCode.trim();
    }

    /**
     * 立项-节点
     * @return app_wf_node 立项-节点
     */
    public String getAppWfNode() {
        return appWfNode;
    }

    /**
     * 立项-节点
     * @param appWfNode 立项-节点
     */
    public void setAppWfNode(String appWfNode) {
        this.appWfNode = appWfNode == null ? null : appWfNode.trim();
    }

    /**
     * 定价-流程Id
     * @return price_wf_proc_id 定价-流程Id
     */
    public String getPriceWfProcId() {
        return priceWfProcId;
    }

    /**
     * 定价-流程Id
     * @param priceWfProcId 定价-流程Id
     */
    public void setPriceWfProcId(String priceWfProcId) {
        this.priceWfProcId = priceWfProcId == null ? null : priceWfProcId.trim();
    }

    /**
     * 定价-节点
     * @return price_wf_node 定价-节点
     */
    public String getPriceWfNode() {
        return priceWfNode;
    }

    /**
     * 定价-节点
     * @param priceWfNode 定价-节点
     */
    public void setPriceWfNode(String priceWfNode) {
        this.priceWfNode = priceWfNode == null ? null : priceWfNode.trim();
    }

    /**
     * 定价-节点编码
     * @return price_wf_node_code 定价-节点编码
     */
    public String getPriceWfNodeCode() {
        return priceWfNodeCode;
    }

    /**
     * 定价-节点编码
     * @param priceWfNodeCode 定价-节点编码
     */
    public void setPriceWfNodeCode(String priceWfNodeCode) {
        this.priceWfNodeCode = priceWfNodeCode == null ? null : priceWfNodeCode.trim();
    }

    /**
     * 
     * @return price_status 
     */
    public String getPriceStatus() {
        return priceStatus;
    }

    /**
     * 
     * @param priceStatus 
     */
    public void setPriceStatus(String priceStatus) {
        this.priceStatus = priceStatus == null ? null : priceStatus.trim();
    }

    /**
     * 历史数据是否生效（Y/N）
     * @return history_flag 历史数据是否生效（Y/N）
     */
    public String getHistoryFlag() {
        return historyFlag;
    }

    /**
     * 历史数据是否生效（Y/N）
     * @param historyFlag 历史数据是否生效（Y/N）
     */
    public void setHistoryFlag(String historyFlag) {
        this.historyFlag = historyFlag == null ? null : historyFlag.trim();
    }

    /**
     * 是否存在图片视频附件，Y是，N否
     * @return attribute1 是否存在图片视频附件，Y是，N否
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * 是否存在图片视频附件，Y是，N否
     * @param attribute1 是否存在图片视频附件，Y是，N否
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    /**
     * 是否存在附件，Y是，N否
     * @return attribute2 是否存在附件，Y是，N否
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * 是否存在附件，Y是，N否
     * @param attribute2 是否存在附件，Y是，N否
     */
    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    /**
     * 是否公示Y/N,Y公示
     * @return attribute3 是否公示Y/N,Y公示
     */
    public String getAttribute3() {
        return attribute3;
    }

    /**
     * 是否公示Y/N,Y公示
     * @param attribute3 是否公示Y/N,Y公示
     */
    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    /**
     * 竞拍前后业务合作方是否有变化
     * @return attribute4 竞拍前后业务合作方是否有变化
     */
    public String getAttribute4() {
        return attribute4;
    }

    /**
     * 竞拍前后业务合作方是否有变化
     * @param attribute4 竞拍前后业务合作方是否有变化
     */
    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    /**
     * 土地编号（老数据的landnum）
     * @return attribute5 土地编号（老数据的landnum）
     */
    public String getAttribute5() {
        return attribute5;
    }

    /**
     * 土地编号（老数据的landnum）
     * @param attribute5 土地编号（老数据的landnum）
     */
    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    /**
     * 是否驳回标识(RETURN、CONTINUE)
     * @return attribute6 是否驳回标识(RETURN、CONTINUE)
     */
    public String getAttribute6() {
        return attribute6;
    }

    /**
     * 是否驳回标识(RETURN、CONTINUE)
     * @param attribute6 是否驳回标识(RETURN、CONTINUE)
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
     * 销售净利润预测
     * @return attribute10 销售净利润预测
     */
    public Double getAttribute10() {
        return attribute10;
    }

    /**
     * 销售净利润预测
     * @param attribute10 销售净利润预测
     */
    public void setAttribute10(Double attribute10) {
        this.attribute10 = attribute10;
    }

    /**
     * 配建配套建面
     * @return attribute11 配建配套建面
     */
    public Double getAttribute11() {
        return attribute11;
    }

    /**
     * 配建配套建面
     * @param attribute11 配建配套建面
     */
    public void setAttribute11(Double attribute11) {
        this.attribute11 = attribute11;
    }

    /**
     * 配建保障房面积（无偿移政府）
     * @return attribute12 配建保障房面积（无偿移政府）
     */
    public Double getAttribute12() {
        return attribute12;
    }

    /**
     * 配建保障房面积（无偿移政府）
     * @param attribute12 配建保障房面积（无偿移政府）
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
    public Double getAttribute14() {
        return attribute14;
    }

    /**
     * 
     * @param attribute14 
     */
    public void setAttribute14(Double attribute14) {
        this.attribute14 = attribute14;
    }

    /**
     * 预计支付日期
     * @return attribute15 预计支付日期
     */
    public Date getAttribute15() {
        return attribute15;
    }

    /**
     * 预计支付日期
     * @param attribute15 预计支付日期
     */
    public void setAttribute15(Date attribute15) {
        this.attribute15 = attribute15;
    }

    /**
     * 
     * @return attribute16 
     */
    public Date getAttribute16() {
        return attribute16;
    }

    /**
     * 
     * @param attribute16 
     */
    public void setAttribute16(Date attribute16) {
        this.attribute16 = attribute16;
    }

    /**
     * 
     * @return attribute17 
     */
    public Date getAttribute17() {
        return attribute17;
    }

    /**
     * 
     * @param attribute17 
     */
    public void setAttribute17(Date attribute17) {
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

    /**
     * 
     * @return attribute19 
     */
    public Date getAttribute19() {
        return attribute19;
    }

    /**
     * 
     * @param attribute19 
     */
    public void setAttribute19(Date attribute19) {
        this.attribute19 = attribute19;
    }

    /**
     * 
     * @return attribute20 
     */
    public Date getAttribute20() {
        return attribute20;
    }

    /**
     * 
     * @param attribute20 
     */
    public void setAttribute20(Date attribute20) {
        this.attribute20 = attribute20;
    }

    /**
     * 
     * @return attribute21 
     */
    public String getAttribute21() {
        return attribute21;
    }

    /**
     * 
     * @param attribute21 
     */
    public void setAttribute21(String attribute21) {
        this.attribute21 = attribute21 == null ? null : attribute21.trim();
    }

    /**
     * 
     * @return attribute22 
     */
    public String getAttribute22() {
        return attribute22;
    }

    /**
     * 
     * @param attribute22 
     */
    public void setAttribute22(String attribute22) {
        this.attribute22 = attribute22 == null ? null : attribute22.trim();
    }

    /**
     * 
     * @return attribute23 
     */
    public String getAttribute23() {
        return attribute23;
    }

    /**
     * 
     * @param attribute23 
     */
    public void setAttribute23(String attribute23) {
        this.attribute23 = attribute23 == null ? null : attribute23.trim();
    }

    /**
     * 
     * @return attribute24 
     */
    public String getAttribute24() {
        return attribute24;
    }

    /**
     * 
     * @param attribute24 
     */
    public void setAttribute24(String attribute24) {
        this.attribute24 = attribute24 == null ? null : attribute24.trim();
    }

    /**
     * 
     * @return attribute25 
     */
    public String getAttribute25() {
        return attribute25;
    }

    /**
     * 
     * @param attribute25 
     */
    public void setAttribute25(String attribute25) {
        this.attribute25 = attribute25 == null ? null : attribute25.trim();
    }
}