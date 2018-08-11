package com.yin.reverse.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SAttachmentHisExample {
    /**
     * s_attachment_his
     */
    protected String orderByClause;

    /**
     * s_attachment_his
     */
    protected boolean distinct;

    /**
     * s_attachment_his
     */
    protected List<Criteria> oredCriteria;

    public SAttachmentHisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * s_attachment_his 2018-08-11
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOldIdIsNull() {
            addCriterion("old_id is null");
            return (Criteria) this;
        }

        public Criteria andOldIdIsNotNull() {
            addCriterion("old_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldIdEqualTo(Integer value) {
            addCriterion("old_id =", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotEqualTo(Integer value) {
            addCriterion("old_id <>", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThan(Integer value) {
            addCriterion("old_id >", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_id >=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThan(Integer value) {
            addCriterion("old_id <", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThanOrEqualTo(Integer value) {
            addCriterion("old_id <=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdIn(List<Integer> values) {
            addCriterion("old_id in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotIn(List<Integer> values) {
            addCriterion("old_id not in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdBetween(Integer value1, Integer value2) {
            addCriterion("old_id between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotBetween(Integer value1, Integer value2) {
            addCriterion("old_id not between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andRefTableIsNull() {
            addCriterion("ref_table is null");
            return (Criteria) this;
        }

        public Criteria andRefTableIsNotNull() {
            addCriterion("ref_table is not null");
            return (Criteria) this;
        }

        public Criteria andRefTableEqualTo(String value) {
            addCriterion("ref_table =", value, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableNotEqualTo(String value) {
            addCriterion("ref_table <>", value, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableGreaterThan(String value) {
            addCriterion("ref_table >", value, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableGreaterThanOrEqualTo(String value) {
            addCriterion("ref_table >=", value, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableLessThan(String value) {
            addCriterion("ref_table <", value, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableLessThanOrEqualTo(String value) {
            addCriterion("ref_table <=", value, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableLike(String value) {
            addCriterion("ref_table like", value, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableNotLike(String value) {
            addCriterion("ref_table not like", value, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableIn(List<String> values) {
            addCriterion("ref_table in", values, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableNotIn(List<String> values) {
            addCriterion("ref_table not in", values, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableBetween(String value1, String value2) {
            addCriterion("ref_table between", value1, value2, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefTableNotBetween(String value1, String value2) {
            addCriterion("ref_table not between", value1, value2, "refTable");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("ref_id is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("ref_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(String value) {
            addCriterion("ref_id =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(String value) {
            addCriterion("ref_id <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(String value) {
            addCriterion("ref_id >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("ref_id >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(String value) {
            addCriterion("ref_id <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(String value) {
            addCriterion("ref_id <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLike(String value) {
            addCriterion("ref_id like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotLike(String value) {
            addCriterion("ref_id not like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<String> values) {
            addCriterion("ref_id in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<String> values) {
            addCriterion("ref_id not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(String value1, String value2) {
            addCriterion("ref_id between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(String value1, String value2) {
            addCriterion("ref_id not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andUploadPathIsNull() {
            addCriterion("upload_path is null");
            return (Criteria) this;
        }

        public Criteria andUploadPathIsNotNull() {
            addCriterion("upload_path is not null");
            return (Criteria) this;
        }

        public Criteria andUploadPathEqualTo(String value) {
            addCriterion("upload_path =", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathNotEqualTo(String value) {
            addCriterion("upload_path <>", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathGreaterThan(String value) {
            addCriterion("upload_path >", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathGreaterThanOrEqualTo(String value) {
            addCriterion("upload_path >=", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathLessThan(String value) {
            addCriterion("upload_path <", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathLessThanOrEqualTo(String value) {
            addCriterion("upload_path <=", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathLike(String value) {
            addCriterion("upload_path like", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathNotLike(String value) {
            addCriterion("upload_path not like", value, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathIn(List<String> values) {
            addCriterion("upload_path in", values, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathNotIn(List<String> values) {
            addCriterion("upload_path not in", values, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathBetween(String value1, String value2) {
            addCriterion("upload_path between", value1, value2, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andUploadPathNotBetween(String value1, String value2) {
            addCriterion("upload_path not between", value1, value2, "uploadPath");
            return (Criteria) this;
        }

        public Criteria andFileFormatIsNull() {
            addCriterion("file_format is null");
            return (Criteria) this;
        }

        public Criteria andFileFormatIsNotNull() {
            addCriterion("file_format is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormatEqualTo(String value) {
            addCriterion("file_format =", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatNotEqualTo(String value) {
            addCriterion("file_format <>", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatGreaterThan(String value) {
            addCriterion("file_format >", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatGreaterThanOrEqualTo(String value) {
            addCriterion("file_format >=", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatLessThan(String value) {
            addCriterion("file_format <", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatLessThanOrEqualTo(String value) {
            addCriterion("file_format <=", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatLike(String value) {
            addCriterion("file_format like", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatNotLike(String value) {
            addCriterion("file_format not like", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatIn(List<String> values) {
            addCriterion("file_format in", values, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatNotIn(List<String> values) {
            addCriterion("file_format not in", values, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatBetween(String value1, String value2) {
            addCriterion("file_format between", value1, value2, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatNotBetween(String value1, String value2) {
            addCriterion("file_format not between", value1, value2, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlIsNull() {
            addCriterion("file_look_url is null");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlIsNotNull() {
            addCriterion("file_look_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlEqualTo(String value) {
            addCriterion("file_look_url =", value, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlNotEqualTo(String value) {
            addCriterion("file_look_url <>", value, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlGreaterThan(String value) {
            addCriterion("file_look_url >", value, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_look_url >=", value, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlLessThan(String value) {
            addCriterion("file_look_url <", value, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlLessThanOrEqualTo(String value) {
            addCriterion("file_look_url <=", value, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlLike(String value) {
            addCriterion("file_look_url like", value, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlNotLike(String value) {
            addCriterion("file_look_url not like", value, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlIn(List<String> values) {
            addCriterion("file_look_url in", values, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlNotIn(List<String> values) {
            addCriterion("file_look_url not in", values, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlBetween(String value1, String value2) {
            addCriterion("file_look_url between", value1, value2, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlNotBetween(String value1, String value2) {
            addCriterion("file_look_url not between", value1, value2, "fileLookUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlIsNull() {
            addCriterion("file_download_url is null");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlIsNotNull() {
            addCriterion("file_download_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlEqualTo(String value) {
            addCriterion("file_download_url =", value, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlNotEqualTo(String value) {
            addCriterion("file_download_url <>", value, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlGreaterThan(String value) {
            addCriterion("file_download_url >", value, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_download_url >=", value, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlLessThan(String value) {
            addCriterion("file_download_url <", value, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("file_download_url <=", value, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlLike(String value) {
            addCriterion("file_download_url like", value, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlNotLike(String value) {
            addCriterion("file_download_url not like", value, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlIn(List<String> values) {
            addCriterion("file_download_url in", values, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlNotIn(List<String> values) {
            addCriterion("file_download_url not in", values, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlBetween(String value1, String value2) {
            addCriterion("file_download_url between", value1, value2, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("file_download_url not between", value1, value2, "fileDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbIsNull() {
            addCriterion("file_look_url_mb is null");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbIsNotNull() {
            addCriterion("file_look_url_mb is not null");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbEqualTo(String value) {
            addCriterion("file_look_url_mb =", value, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbNotEqualTo(String value) {
            addCriterion("file_look_url_mb <>", value, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbGreaterThan(String value) {
            addCriterion("file_look_url_mb >", value, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbGreaterThanOrEqualTo(String value) {
            addCriterion("file_look_url_mb >=", value, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbLessThan(String value) {
            addCriterion("file_look_url_mb <", value, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbLessThanOrEqualTo(String value) {
            addCriterion("file_look_url_mb <=", value, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbLike(String value) {
            addCriterion("file_look_url_mb like", value, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbNotLike(String value) {
            addCriterion("file_look_url_mb not like", value, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbIn(List<String> values) {
            addCriterion("file_look_url_mb in", values, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbNotIn(List<String> values) {
            addCriterion("file_look_url_mb not in", values, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbBetween(String value1, String value2) {
            addCriterion("file_look_url_mb between", value1, value2, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileLookUrlMbNotBetween(String value1, String value2) {
            addCriterion("file_look_url_mb not between", value1, value2, "fileLookUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbIsNull() {
            addCriterion("file_download_url_mb is null");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbIsNotNull() {
            addCriterion("file_download_url_mb is not null");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbEqualTo(String value) {
            addCriterion("file_download_url_mb =", value, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbNotEqualTo(String value) {
            addCriterion("file_download_url_mb <>", value, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbGreaterThan(String value) {
            addCriterion("file_download_url_mb >", value, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbGreaterThanOrEqualTo(String value) {
            addCriterion("file_download_url_mb >=", value, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbLessThan(String value) {
            addCriterion("file_download_url_mb <", value, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbLessThanOrEqualTo(String value) {
            addCriterion("file_download_url_mb <=", value, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbLike(String value) {
            addCriterion("file_download_url_mb like", value, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbNotLike(String value) {
            addCriterion("file_download_url_mb not like", value, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbIn(List<String> values) {
            addCriterion("file_download_url_mb in", values, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbNotIn(List<String> values) {
            addCriterion("file_download_url_mb not in", values, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbBetween(String value1, String value2) {
            addCriterion("file_download_url_mb between", value1, value2, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileDownloadUrlMbNotBetween(String value1, String value2) {
            addCriterion("file_download_url_mb not between", value1, value2, "fileDownloadUrlMb");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(String value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(String value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(String value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(String value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(String value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(String value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLike(String value) {
            addCriterion("file_size like", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotLike(String value) {
            addCriterion("file_size not like", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<String> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<String> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(String value1, String value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(String value1, String value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileFromIsNull() {
            addCriterion("file_from is null");
            return (Criteria) this;
        }

        public Criteria andFileFromIsNotNull() {
            addCriterion("file_from is not null");
            return (Criteria) this;
        }

        public Criteria andFileFromEqualTo(String value) {
            addCriterion("file_from =", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromNotEqualTo(String value) {
            addCriterion("file_from <>", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromGreaterThan(String value) {
            addCriterion("file_from >", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromGreaterThanOrEqualTo(String value) {
            addCriterion("file_from >=", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromLessThan(String value) {
            addCriterion("file_from <", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromLessThanOrEqualTo(String value) {
            addCriterion("file_from <=", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromLike(String value) {
            addCriterion("file_from like", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromNotLike(String value) {
            addCriterion("file_from not like", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromIn(List<String> values) {
            addCriterion("file_from in", values, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromNotIn(List<String> values) {
            addCriterion("file_from not in", values, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromBetween(String value1, String value2) {
            addCriterion("file_from between", value1, value2, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromNotBetween(String value1, String value2) {
            addCriterion("file_from not between", value1, value2, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNull() {
            addCriterion("enable_flag is null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIsNotNull() {
            addCriterion("enable_flag is not null");
            return (Criteria) this;
        }

        public Criteria andEnableFlagEqualTo(String value) {
            addCriterion("enable_flag =", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotEqualTo(String value) {
            addCriterion("enable_flag <>", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThan(String value) {
            addCriterion("enable_flag >", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagGreaterThanOrEqualTo(String value) {
            addCriterion("enable_flag >=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThan(String value) {
            addCriterion("enable_flag <", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLessThanOrEqualTo(String value) {
            addCriterion("enable_flag <=", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagLike(String value) {
            addCriterion("enable_flag like", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotLike(String value) {
            addCriterion("enable_flag not like", value, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagIn(List<String> values) {
            addCriterion("enable_flag in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotIn(List<String> values) {
            addCriterion("enable_flag not in", values, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagBetween(String value1, String value2) {
            addCriterion("enable_flag between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andEnableFlagNotBetween(String value1, String value2) {
            addCriterion("enable_flag not between", value1, value2, "enableFlag");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(Integer value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(Integer value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(Integer value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(Integer value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(Integer value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<Integer> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<Integer> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(Integer value1, Integer value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdByIsNull() {
            addCriterion("last_upd_by is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdByIsNotNull() {
            addCriterion("last_upd_by is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdByEqualTo(String value) {
            addCriterion("last_upd_by =", value, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNotEqualTo(String value) {
            addCriterion("last_upd_by <>", value, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByGreaterThan(String value) {
            addCriterion("last_upd_by >", value, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByGreaterThanOrEqualTo(String value) {
            addCriterion("last_upd_by >=", value, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByLessThan(String value) {
            addCriterion("last_upd_by <", value, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByLessThanOrEqualTo(String value) {
            addCriterion("last_upd_by <=", value, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByLike(String value) {
            addCriterion("last_upd_by like", value, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNotLike(String value) {
            addCriterion("last_upd_by not like", value, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByIn(List<String> values) {
            addCriterion("last_upd_by in", values, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNotIn(List<String> values) {
            addCriterion("last_upd_by not in", values, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByBetween(String value1, String value2) {
            addCriterion("last_upd_by between", value1, value2, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNotBetween(String value1, String value2) {
            addCriterion("last_upd_by not between", value1, value2, "lastUpdBy");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateIsNull() {
            addCriterion("last_upd_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateIsNotNull() {
            addCriterion("last_upd_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateEqualTo(Date value) {
            addCriterion("last_upd_date =", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateNotEqualTo(Date value) {
            addCriterion("last_upd_date <>", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateGreaterThan(Date value) {
            addCriterion("last_upd_date >", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_upd_date >=", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateLessThan(Date value) {
            addCriterion("last_upd_date <", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateLessThanOrEqualTo(Date value) {
            addCriterion("last_upd_date <=", value, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateIn(List<Date> values) {
            addCriterion("last_upd_date in", values, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateNotIn(List<Date> values) {
            addCriterion("last_upd_date not in", values, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateBetween(Date value1, Date value2) {
            addCriterion("last_upd_date between", value1, value2, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdDateNotBetween(Date value1, Date value2) {
            addCriterion("last_upd_date not between", value1, value2, "lastUpdDate");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagIsNull() {
            addCriterion("history_flag is null");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagIsNotNull() {
            addCriterion("history_flag is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagEqualTo(String value) {
            addCriterion("history_flag =", value, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagNotEqualTo(String value) {
            addCriterion("history_flag <>", value, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagGreaterThan(String value) {
            addCriterion("history_flag >", value, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagGreaterThanOrEqualTo(String value) {
            addCriterion("history_flag >=", value, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagLessThan(String value) {
            addCriterion("history_flag <", value, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagLessThanOrEqualTo(String value) {
            addCriterion("history_flag <=", value, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagLike(String value) {
            addCriterion("history_flag like", value, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagNotLike(String value) {
            addCriterion("history_flag not like", value, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagIn(List<String> values) {
            addCriterion("history_flag in", values, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagNotIn(List<String> values) {
            addCriterion("history_flag not in", values, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagBetween(String value1, String value2) {
            addCriterion("history_flag between", value1, value2, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andHistoryFlagNotBetween(String value1, String value2) {
            addCriterion("history_flag not between", value1, value2, "historyFlag");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNull() {
            addCriterion("attribute1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("attribute1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("attribute1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("attribute1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("attribute1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("attribute1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("attribute1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("attribute1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("attribute1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("attribute1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("attribute1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("attribute1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("attribute1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("attribute1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("attribute2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("attribute2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("attribute2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("attribute2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("attribute2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("attribute2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("attribute2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("attribute2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("attribute2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("attribute2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("attribute2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("attribute2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("attribute2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("attribute2 not between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("attribute3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("attribute3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("attribute3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("attribute3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("attribute3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("attribute3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("attribute3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("attribute3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("attribute3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("attribute3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("attribute3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("attribute3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("attribute3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("attribute3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNull() {
            addCriterion("attribute4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("attribute4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(String value) {
            addCriterion("attribute4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(String value) {
            addCriterion("attribute4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(String value) {
            addCriterion("attribute4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(String value) {
            addCriterion("attribute4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(String value) {
            addCriterion("attribute4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(String value) {
            addCriterion("attribute4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Like(String value) {
            addCriterion("attribute4 like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotLike(String value) {
            addCriterion("attribute4 not like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<String> values) {
            addCriterion("attribute4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<String> values) {
            addCriterion("attribute4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(String value1, String value2) {
            addCriterion("attribute4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(String value1, String value2) {
            addCriterion("attribute4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("attribute5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("attribute5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("attribute5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("attribute5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("attribute5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("attribute5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("attribute5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("attribute5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("attribute5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("attribute5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("attribute5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("attribute5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("attribute5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("attribute5 not between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNull() {
            addCriterion("attribute6 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute6IsNotNull() {
            addCriterion("attribute6 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute6EqualTo(String value) {
            addCriterion("attribute6 =", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotEqualTo(String value) {
            addCriterion("attribute6 <>", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThan(String value) {
            addCriterion("attribute6 >", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6GreaterThanOrEqualTo(String value) {
            addCriterion("attribute6 >=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThan(String value) {
            addCriterion("attribute6 <", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6LessThanOrEqualTo(String value) {
            addCriterion("attribute6 <=", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Like(String value) {
            addCriterion("attribute6 like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotLike(String value) {
            addCriterion("attribute6 not like", value, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6In(List<String> values) {
            addCriterion("attribute6 in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotIn(List<String> values) {
            addCriterion("attribute6 not in", values, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6Between(String value1, String value2) {
            addCriterion("attribute6 between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute6NotBetween(String value1, String value2) {
            addCriterion("attribute6 not between", value1, value2, "attribute6");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNull() {
            addCriterion("attribute7 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute7IsNotNull() {
            addCriterion("attribute7 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute7EqualTo(String value) {
            addCriterion("attribute7 =", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotEqualTo(String value) {
            addCriterion("attribute7 <>", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThan(String value) {
            addCriterion("attribute7 >", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7GreaterThanOrEqualTo(String value) {
            addCriterion("attribute7 >=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThan(String value) {
            addCriterion("attribute7 <", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7LessThanOrEqualTo(String value) {
            addCriterion("attribute7 <=", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Like(String value) {
            addCriterion("attribute7 like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotLike(String value) {
            addCriterion("attribute7 not like", value, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7In(List<String> values) {
            addCriterion("attribute7 in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotIn(List<String> values) {
            addCriterion("attribute7 not in", values, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7Between(String value1, String value2) {
            addCriterion("attribute7 between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute7NotBetween(String value1, String value2) {
            addCriterion("attribute7 not between", value1, value2, "attribute7");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNull() {
            addCriterion("attribute8 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute8IsNotNull() {
            addCriterion("attribute8 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute8EqualTo(String value) {
            addCriterion("attribute8 =", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotEqualTo(String value) {
            addCriterion("attribute8 <>", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThan(String value) {
            addCriterion("attribute8 >", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8GreaterThanOrEqualTo(String value) {
            addCriterion("attribute8 >=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThan(String value) {
            addCriterion("attribute8 <", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8LessThanOrEqualTo(String value) {
            addCriterion("attribute8 <=", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Like(String value) {
            addCriterion("attribute8 like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotLike(String value) {
            addCriterion("attribute8 not like", value, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8In(List<String> values) {
            addCriterion("attribute8 in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotIn(List<String> values) {
            addCriterion("attribute8 not in", values, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8Between(String value1, String value2) {
            addCriterion("attribute8 between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute8NotBetween(String value1, String value2) {
            addCriterion("attribute8 not between", value1, value2, "attribute8");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNull() {
            addCriterion("attribute9 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute9IsNotNull() {
            addCriterion("attribute9 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute9EqualTo(String value) {
            addCriterion("attribute9 =", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotEqualTo(String value) {
            addCriterion("attribute9 <>", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThan(String value) {
            addCriterion("attribute9 >", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThanOrEqualTo(String value) {
            addCriterion("attribute9 >=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThan(String value) {
            addCriterion("attribute9 <", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThanOrEqualTo(String value) {
            addCriterion("attribute9 <=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Like(String value) {
            addCriterion("attribute9 like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotLike(String value) {
            addCriterion("attribute9 not like", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9In(List<String> values) {
            addCriterion("attribute9 in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotIn(List<String> values) {
            addCriterion("attribute9 not in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Between(String value1, String value2) {
            addCriterion("attribute9 between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotBetween(String value1, String value2) {
            addCriterion("attribute9 not between", value1, value2, "attribute9");
            return (Criteria) this;
        }
    }

    /**
     * 
 * @author ylj 
 * @date 2018-08-11
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * s_attachment_his 2018-08-11
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}