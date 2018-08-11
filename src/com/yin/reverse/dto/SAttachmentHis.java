package com.yin.reverse.dto;

import java.util.Date;

/**
 * 
 * @author ylj 
 * @date 2018-08-11
 */
public class SAttachmentHis {
    /**
     * 附件表ID (id)
     */
    private Integer id;

    /**
     * 旧附件Id(ATTACHMENT_ID) (old_id)
     */
    private Integer oldId;

    /**
     * 关联表名 (ref_table)
     */
    private String refTable;

    /**
     * 关联id (ref_id)
     */
    private String refId;

    /**
     * 文件名称 (file_name)
     */
    private String fileName;

    /**
     * 附件路径 (file_path)
     */
    private String filePath;

    /**
     * 上传路径 (upload_path)
     */
    private String uploadPath;

    /**
     * 文件格式 (file_format)
     */
    private String fileFormat;

    /**
     * 文件id (file_id)
     */
    private String fileId;

    /**
     * 预览路径(pc端) (file_look_url)
     */
    private String fileLookUrl;

    /**
     * 下载路径(pc端) (file_download_url)
     */
    private String fileDownloadUrl;

    /**
     * 预览路径(移动端) (file_look_url_mb)
     */
    private String fileLookUrlMb;

    /**
     * 下载路径(移动端) (file_download_url_mb)
     */
    private String fileDownloadUrlMb;

    /**
     * 文件大小 (file_size)
     */
    private String fileSize;

    /**
     * 附件来源 (file_from)
     */
    private String fileFrom;

    /**
     * 附件类型 (type)
     */
    private String type;

    /**
     * 状态 (status)
     */
    private String status;

    /**
     * 是否有效 (enable_flag)
     */
    private String enableFlag;

    /**
     * 版本号 (version_no)
     */
    private Integer versionNo;

    /**
     * 创建人 (create_by)
     */
    private String createBy;

    /**
     * 创建时间 (create_date)
     */
    private Date createDate;

    /**
     * 最后更新人 (last_upd_by)
     */
    private String lastUpdBy;

    /**
     * 最后更新时间 (last_upd_date)
     */
    private Date lastUpdDate;

    /**
     * 更新人登陆名 (login_name)
     */
    private String loginName;

    /**
     * 更新人名称 (name)
     */
    private String name;

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
    private String attribute9;

    /**
     * 附件表ID
     * @return id 附件表ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 附件表ID
     * @param id 附件表ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 旧附件Id(ATTACHMENT_ID)
     * @return old_id 旧附件Id(ATTACHMENT_ID)
     */
    public Integer getOldId() {
        return oldId;
    }

    /**
     * 旧附件Id(ATTACHMENT_ID)
     * @param oldId 旧附件Id(ATTACHMENT_ID)
     */
    public void setOldId(Integer oldId) {
        this.oldId = oldId;
    }

    /**
     * 关联表名
     * @return ref_table 关联表名
     */
    public String getRefTable() {
        return refTable;
    }

    /**
     * 关联表名
     * @param refTable 关联表名
     */
    public void setRefTable(String refTable) {
        this.refTable = refTable == null ? null : refTable.trim();
    }

    /**
     * 关联id
     * @return ref_id 关联id
     */
    public String getRefId() {
        return refId;
    }

    /**
     * 关联id
     * @param refId 关联id
     */
    public void setRefId(String refId) {
        this.refId = refId == null ? null : refId.trim();
    }

    /**
     * 文件名称
     * @return file_name 文件名称
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 文件名称
     * @param fileName 文件名称
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * 附件路径
     * @return file_path 附件路径
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * 附件路径
     * @param filePath 附件路径
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * 上传路径
     * @return upload_path 上传路径
     */
    public String getUploadPath() {
        return uploadPath;
    }

    /**
     * 上传路径
     * @param uploadPath 上传路径
     */
    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath == null ? null : uploadPath.trim();
    }

    /**
     * 文件格式
     * @return file_format 文件格式
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * 文件格式
     * @param fileFormat 文件格式
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat == null ? null : fileFormat.trim();
    }

    /**
     * 文件id
     * @return file_id 文件id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * 文件id
     * @param fileId 文件id
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * 预览路径(pc端)
     * @return file_look_url 预览路径(pc端)
     */
    public String getFileLookUrl() {
        return fileLookUrl;
    }

    /**
     * 预览路径(pc端)
     * @param fileLookUrl 预览路径(pc端)
     */
    public void setFileLookUrl(String fileLookUrl) {
        this.fileLookUrl = fileLookUrl == null ? null : fileLookUrl.trim();
    }

    /**
     * 下载路径(pc端)
     * @return file_download_url 下载路径(pc端)
     */
    public String getFileDownloadUrl() {
        return fileDownloadUrl;
    }

    /**
     * 下载路径(pc端)
     * @param fileDownloadUrl 下载路径(pc端)
     */
    public void setFileDownloadUrl(String fileDownloadUrl) {
        this.fileDownloadUrl = fileDownloadUrl == null ? null : fileDownloadUrl.trim();
    }

    /**
     * 预览路径(移动端)
     * @return file_look_url_mb 预览路径(移动端)
     */
    public String getFileLookUrlMb() {
        return fileLookUrlMb;
    }

    /**
     * 预览路径(移动端)
     * @param fileLookUrlMb 预览路径(移动端)
     */
    public void setFileLookUrlMb(String fileLookUrlMb) {
        this.fileLookUrlMb = fileLookUrlMb == null ? null : fileLookUrlMb.trim();
    }

    /**
     * 下载路径(移动端)
     * @return file_download_url_mb 下载路径(移动端)
     */
    public String getFileDownloadUrlMb() {
        return fileDownloadUrlMb;
    }

    /**
     * 下载路径(移动端)
     * @param fileDownloadUrlMb 下载路径(移动端)
     */
    public void setFileDownloadUrlMb(String fileDownloadUrlMb) {
        this.fileDownloadUrlMb = fileDownloadUrlMb == null ? null : fileDownloadUrlMb.trim();
    }

    /**
     * 文件大小
     * @return file_size 文件大小
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * 文件大小
     * @param fileSize 文件大小
     */
    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    /**
     * 附件来源
     * @return file_from 附件来源
     */
    public String getFileFrom() {
        return fileFrom;
    }

    /**
     * 附件来源
     * @param fileFrom 附件来源
     */
    public void setFileFrom(String fileFrom) {
        this.fileFrom = fileFrom == null ? null : fileFrom.trim();
    }

    /**
     * 附件类型
     * @return type 附件类型
     */
    public String getType() {
        return type;
    }

    /**
     * 附件类型
     * @param type 附件类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 是否有效
     * @return enable_flag 是否有效
     */
    public String getEnableFlag() {
        return enableFlag;
    }

    /**
     * 是否有效
     * @param enableFlag 是否有效
     */
    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag == null ? null : enableFlag.trim();
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
     * 更新人登陆名
     * @return login_name 更新人登陆名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 更新人登陆名
     * @param loginName 更新人登陆名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 更新人名称
     * @return name 更新人名称
     */
    public String getName() {
        return name;
    }

    /**
     * 更新人名称
     * @param name 更新人名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
}