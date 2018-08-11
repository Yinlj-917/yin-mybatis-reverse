package com.yin.reverse.dto;

import java.util.Date;

/**
 * 
 * @author ylj 
 * @date 2018-08-11
 */
public class LandPointHis {
    /**
     * 主键 (id)
     */
    private Integer id;

    /**
     * 土地信息Id (parent_id)
     */
    private Integer parentId;

    /**
     * 旧系统Id (old_id)
     */
    private Integer oldId;

    /**
     * 旧系统土地头ID (old_parent_id)
     */
    private Integer oldParentId;

    /**
     * 百度经度 (lng_point)
     */
    private Double lngPoint;

    /**
     * 百度纬度 (lat_point)
     */
    private Double latPoint;

    /**
     * 高德地图经度 (lng_point_gaode)
     */
    private Double lngPointGaode;

    /**
     * 高德地图纬度 (lat_point_gaode)
     */
    private Double latPointGaode;

    /**
     * 腾讯地图经度 (lng_point_tx)
     */
    private Double lngPointTx;

    /**
     * 腾讯地图纬度 (lat_point_tx)
     */
    private Double latPointTx;

    /**
     * 谷歌地图经度 (lng_point_google)
     */
    private Double lngPointGoogle;

    /**
     * 谷歌地图纬度 (lat_point_google)
     */
    private Double latPointGoogle;

    /**
     * 土地序号 (land_num)
     */
    private Long landNum;

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
     * 历史数据是否生效（Y/N） (history_flag)
     */
    private String historyFlag;

    /**
     *  (attribute1)
     */
    private String attribute1;

    /**
     *  (attribute2)
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
    private Double attribute9;

    /**
     *  (attribute10)
     */
    private Double attribute10;

    /**
     *  (attribute11)
     */
    private Double attribute11;

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
     * 土地信息Id
     * @return parent_id 土地信息Id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 土地信息Id
     * @param parentId 土地信息Id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 旧系统Id
     * @return old_id 旧系统Id
     */
    public Integer getOldId() {
        return oldId;
    }

    /**
     * 旧系统Id
     * @param oldId 旧系统Id
     */
    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    /**
     * 旧系统土地头ID
     * @return old_parent_id 旧系统土地头ID
     */
    public Integer getOldParentId() {
        return oldParentId;
    }

    /**
     * 旧系统土地头ID
     * @param oldParentId 旧系统土地头ID
     */
    public void setOldParentId(Integer oldParentId) {
        this.oldParentId = oldParentId;
    }

    /**
     * 百度经度
     * @return lng_point 百度经度
     */
    public Double getLngPoint() {
        return lngPoint;
    }

    /**
     * 百度经度
     * @param lngPoint 百度经度
     */
    public void setLngPoint(Double lngPoint) {
        this.lngPoint = lngPoint;
    }

    /**
     * 百度纬度
     * @return lat_point 百度纬度
     */
    public Double getLatPoint() {
        return latPoint;
    }

    /**
     * 百度纬度
     * @param latPoint 百度纬度
     */
    public void setLatPoint(Double latPoint) {
        this.latPoint = latPoint;
    }

    /**
     * 高德地图经度
     * @return lng_point_gaode 高德地图经度
     */
    public Double getLngPointGaode() {
        return lngPointGaode;
    }

    /**
     * 高德地图经度
     * @param lngPointGaode 高德地图经度
     */
    public void setLngPointGaode(Double lngPointGaode) {
        this.lngPointGaode = lngPointGaode;
    }

    /**
     * 高德地图纬度
     * @return lat_point_gaode 高德地图纬度
     */
    public Double getLatPointGaode() {
        return latPointGaode;
    }

    /**
     * 高德地图纬度
     * @param latPointGaode 高德地图纬度
     */
    public void setLatPointGaode(Double latPointGaode) {
        this.latPointGaode = latPointGaode;
    }

    /**
     * 腾讯地图经度
     * @return lng_point_tx 腾讯地图经度
     */
    public Double getLngPointTx() {
        return lngPointTx;
    }

    /**
     * 腾讯地图经度
     * @param lngPointTx 腾讯地图经度
     */
    public void setLngPointTx(Double lngPointTx) {
        this.lngPointTx = lngPointTx;
    }

    /**
     * 腾讯地图纬度
     * @return lat_point_tx 腾讯地图纬度
     */
    public Double getLatPointTx() {
        return latPointTx;
    }

    /**
     * 腾讯地图纬度
     * @param latPointTx 腾讯地图纬度
     */
    public void setLatPointTx(Double latPointTx) {
        this.latPointTx = latPointTx;
    }

    /**
     * 谷歌地图经度
     * @return lng_point_google 谷歌地图经度
     */
    public Double getLngPointGoogle() {
        return lngPointGoogle;
    }

    /**
     * 谷歌地图经度
     * @param lngPointGoogle 谷歌地图经度
     */
    public void setLngPointGoogle(Double lngPointGoogle) {
        this.lngPointGoogle = lngPointGoogle;
    }

    /**
     * 谷歌地图纬度
     * @return lat_point_google 谷歌地图纬度
     */
    public Double getLatPointGoogle() {
        return latPointGoogle;
    }

    /**
     * 谷歌地图纬度
     * @param latPointGoogle 谷歌地图纬度
     */
    public void setLatPointGoogle(Double latPointGoogle) {
        this.latPointGoogle = latPointGoogle;
    }

    /**
     * 土地序号
     * @return land_num 土地序号
     */
    public Long getLandNum() {
        return landNum;
    }

    /**
     * 土地序号
     * @param landNum 土地序号
     */
    public void setLandNum(Long landNum) {
        this.landNum = landNum;
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
     * 
     * @return attribute1 
     */
    public String getAttribute1() {
        return attribute1;
    }

    /**
     * 
     * @param attribute1 
     */
    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    /**
     * 
     * @return attribute2 
     */
    public String getAttribute2() {
        return attribute2;
    }

    /**
     * 
     * @param attribute2 
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
    public Double getAttribute9() {
        return attribute9;
    }

    /**
     * 
     * @param attribute9 
     */
    public void setAttribute9(Double attribute9) {
        this.attribute9 = attribute9;
    }

    /**
     * 
     * @return attribute10 
     */
    public Double getAttribute10() {
        return attribute10;
    }

    /**
     * 
     * @param attribute10 
     */
    public void setAttribute10(Double attribute10) {
        this.attribute10 = attribute10;
    }

    /**
     * 
     * @return attribute11 
     */
    public Double getAttribute11() {
        return attribute11;
    }

    /**
     * 
     * @param attribute11 
     */
    public void setAttribute11(Double attribute11) {
        this.attribute11 = attribute11;
    }
}