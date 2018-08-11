package com.yin.reverse.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LandHeadHisExample {
    /**
     * land_head_his
     */
    protected String orderByClause;

    /**
     * land_head_his
     */
    protected boolean distinct;

    /**
     * land_head_his
     */
    protected List<Criteria> oredCriteria;

    public LandHeadHisExample() {
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
     * land_head_his 2018-08-11
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

        public Criteria andLandIdIsNull() {
            addCriterion("land_id is null");
            return (Criteria) this;
        }

        public Criteria andLandIdIsNotNull() {
            addCriterion("land_id is not null");
            return (Criteria) this;
        }

        public Criteria andLandIdEqualTo(Integer value) {
            addCriterion("land_id =", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotEqualTo(Integer value) {
            addCriterion("land_id <>", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdGreaterThan(Integer value) {
            addCriterion("land_id >", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("land_id >=", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdLessThan(Integer value) {
            addCriterion("land_id <", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdLessThanOrEqualTo(Integer value) {
            addCriterion("land_id <=", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdIn(List<Integer> values) {
            addCriterion("land_id in", values, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotIn(List<Integer> values) {
            addCriterion("land_id not in", values, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdBetween(Integer value1, Integer value2) {
            addCriterion("land_id between", value1, value2, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("land_id not between", value1, value2, "landId");
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

        public Criteria andOldIdEqualTo(String value) {
            addCriterion("old_id =", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotEqualTo(String value) {
            addCriterion("old_id <>", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThan(String value) {
            addCriterion("old_id >", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdGreaterThanOrEqualTo(String value) {
            addCriterion("old_id >=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThan(String value) {
            addCriterion("old_id <", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLessThanOrEqualTo(String value) {
            addCriterion("old_id <=", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdLike(String value) {
            addCriterion("old_id like", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotLike(String value) {
            addCriterion("old_id not like", value, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdIn(List<String> values) {
            addCriterion("old_id in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotIn(List<String> values) {
            addCriterion("old_id not in", values, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdBetween(String value1, String value2) {
            addCriterion("old_id between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andOldIdNotBetween(String value1, String value2) {
            addCriterion("old_id not between", value1, value2, "oldId");
            return (Criteria) this;
        }

        public Criteria andLandNameIsNull() {
            addCriterion("land_name is null");
            return (Criteria) this;
        }

        public Criteria andLandNameIsNotNull() {
            addCriterion("land_name is not null");
            return (Criteria) this;
        }

        public Criteria andLandNameEqualTo(String value) {
            addCriterion("land_name =", value, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameNotEqualTo(String value) {
            addCriterion("land_name <>", value, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameGreaterThan(String value) {
            addCriterion("land_name >", value, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameGreaterThanOrEqualTo(String value) {
            addCriterion("land_name >=", value, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameLessThan(String value) {
            addCriterion("land_name <", value, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameLessThanOrEqualTo(String value) {
            addCriterion("land_name <=", value, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameLike(String value) {
            addCriterion("land_name like", value, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameNotLike(String value) {
            addCriterion("land_name not like", value, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameIn(List<String> values) {
            addCriterion("land_name in", values, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameNotIn(List<String> values) {
            addCriterion("land_name not in", values, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameBetween(String value1, String value2) {
            addCriterion("land_name between", value1, value2, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNameNotBetween(String value1, String value2) {
            addCriterion("land_name not between", value1, value2, "landName");
            return (Criteria) this;
        }

        public Criteria andLandNumIsNull() {
            addCriterion("land_num is null");
            return (Criteria) this;
        }

        public Criteria andLandNumIsNotNull() {
            addCriterion("land_num is not null");
            return (Criteria) this;
        }

        public Criteria andLandNumEqualTo(String value) {
            addCriterion("land_num =", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumNotEqualTo(String value) {
            addCriterion("land_num <>", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumGreaterThan(String value) {
            addCriterion("land_num >", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumGreaterThanOrEqualTo(String value) {
            addCriterion("land_num >=", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumLessThan(String value) {
            addCriterion("land_num <", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumLessThanOrEqualTo(String value) {
            addCriterion("land_num <=", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumLike(String value) {
            addCriterion("land_num like", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumNotLike(String value) {
            addCriterion("land_num not like", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumIn(List<String> values) {
            addCriterion("land_num in", values, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumNotIn(List<String> values) {
            addCriterion("land_num not in", values, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumBetween(String value1, String value2) {
            addCriterion("land_num between", value1, value2, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumNotBetween(String value1, String value2) {
            addCriterion("land_num not between", value1, value2, "landNum");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNull() {
            addCriterion("office_id is null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIsNotNull() {
            addCriterion("office_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeIdEqualTo(String value) {
            addCriterion("office_id =", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotEqualTo(String value) {
            addCriterion("office_id <>", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThan(String value) {
            addCriterion("office_id >", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdGreaterThanOrEqualTo(String value) {
            addCriterion("office_id >=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThan(String value) {
            addCriterion("office_id <", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLessThanOrEqualTo(String value) {
            addCriterion("office_id <=", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdLike(String value) {
            addCriterion("office_id like", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotLike(String value) {
            addCriterion("office_id not like", value, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdIn(List<String> values) {
            addCriterion("office_id in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotIn(List<String> values) {
            addCriterion("office_id not in", values, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdBetween(String value1, String value2) {
            addCriterion("office_id between", value1, value2, "officeId");
            return (Criteria) this;
        }

        public Criteria andOfficeIdNotBetween(String value1, String value2) {
            addCriterion("office_id not between", value1, value2, "officeId");
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

        public Criteria andCreateByNameIsNull() {
            addCriterion("create_by_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIsNotNull() {
            addCriterion("create_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByNameEqualTo(String value) {
            addCriterion("create_by_name =", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotEqualTo(String value) {
            addCriterion("create_by_name <>", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThan(String value) {
            addCriterion("create_by_name >", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_by_name >=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThan(String value) {
            addCriterion("create_by_name <", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLessThanOrEqualTo(String value) {
            addCriterion("create_by_name <=", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameLike(String value) {
            addCriterion("create_by_name like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotLike(String value) {
            addCriterion("create_by_name not like", value, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameIn(List<String> values) {
            addCriterion("create_by_name in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotIn(List<String> values) {
            addCriterion("create_by_name not in", values, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameBetween(String value1, String value2) {
            addCriterion("create_by_name between", value1, value2, "createByName");
            return (Criteria) this;
        }

        public Criteria andCreateByNameNotBetween(String value1, String value2) {
            addCriterion("create_by_name not between", value1, value2, "createByName");
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

        public Criteria andLastUpdByNameIsNull() {
            addCriterion("last_upd_by_name is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameIsNotNull() {
            addCriterion("last_upd_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameEqualTo(String value) {
            addCriterion("last_upd_by_name =", value, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameNotEqualTo(String value) {
            addCriterion("last_upd_by_name <>", value, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameGreaterThan(String value) {
            addCriterion("last_upd_by_name >", value, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_upd_by_name >=", value, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameLessThan(String value) {
            addCriterion("last_upd_by_name <", value, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameLessThanOrEqualTo(String value) {
            addCriterion("last_upd_by_name <=", value, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameLike(String value) {
            addCriterion("last_upd_by_name like", value, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameNotLike(String value) {
            addCriterion("last_upd_by_name not like", value, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameIn(List<String> values) {
            addCriterion("last_upd_by_name in", values, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameNotIn(List<String> values) {
            addCriterion("last_upd_by_name not in", values, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameBetween(String value1, String value2) {
            addCriterion("last_upd_by_name between", value1, value2, "lastUpdByName");
            return (Criteria) this;
        }

        public Criteria andLastUpdByNameNotBetween(String value1, String value2) {
            addCriterion("last_upd_by_name not between", value1, value2, "lastUpdByName");
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

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPlateIdIsNull() {
            addCriterion("plate_id is null");
            return (Criteria) this;
        }

        public Criteria andPlateIdIsNotNull() {
            addCriterion("plate_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlateIdEqualTo(Integer value) {
            addCriterion("plate_id =", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotEqualTo(Integer value) {
            addCriterion("plate_id <>", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThan(Integer value) {
            addCriterion("plate_id >", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plate_id >=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThan(Integer value) {
            addCriterion("plate_id <", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdLessThanOrEqualTo(Integer value) {
            addCriterion("plate_id <=", value, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdIn(List<Integer> values) {
            addCriterion("plate_id in", values, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotIn(List<Integer> values) {
            addCriterion("plate_id not in", values, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdBetween(Integer value1, Integer value2) {
            addCriterion("plate_id between", value1, value2, "plateId");
            return (Criteria) this;
        }

        public Criteria andPlateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plate_id not between", value1, value2, "plateId");
            return (Criteria) this;
        }

        public Criteria andAddressDescIsNull() {
            addCriterion("address_desc is null");
            return (Criteria) this;
        }

        public Criteria andAddressDescIsNotNull() {
            addCriterion("address_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDescEqualTo(String value) {
            addCriterion("address_desc =", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescNotEqualTo(String value) {
            addCriterion("address_desc <>", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescGreaterThan(String value) {
            addCriterion("address_desc >", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescGreaterThanOrEqualTo(String value) {
            addCriterion("address_desc >=", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescLessThan(String value) {
            addCriterion("address_desc <", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescLessThanOrEqualTo(String value) {
            addCriterion("address_desc <=", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescLike(String value) {
            addCriterion("address_desc like", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescNotLike(String value) {
            addCriterion("address_desc not like", value, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescIn(List<String> values) {
            addCriterion("address_desc in", values, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescNotIn(List<String> values) {
            addCriterion("address_desc not in", values, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescBetween(String value1, String value2) {
            addCriterion("address_desc between", value1, value2, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAddressDescNotBetween(String value1, String value2) {
            addCriterion("address_desc not between", value1, value2, "addressDesc");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdIsNull() {
            addCriterion("acquisition_mode_id is null");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdIsNotNull() {
            addCriterion("acquisition_mode_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdEqualTo(String value) {
            addCriterion("acquisition_mode_id =", value, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdNotEqualTo(String value) {
            addCriterion("acquisition_mode_id <>", value, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdGreaterThan(String value) {
            addCriterion("acquisition_mode_id >", value, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdGreaterThanOrEqualTo(String value) {
            addCriterion("acquisition_mode_id >=", value, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdLessThan(String value) {
            addCriterion("acquisition_mode_id <", value, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdLessThanOrEqualTo(String value) {
            addCriterion("acquisition_mode_id <=", value, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdLike(String value) {
            addCriterion("acquisition_mode_id like", value, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdNotLike(String value) {
            addCriterion("acquisition_mode_id not like", value, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdIn(List<String> values) {
            addCriterion("acquisition_mode_id in", values, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdNotIn(List<String> values) {
            addCriterion("acquisition_mode_id not in", values, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdBetween(String value1, String value2) {
            addCriterion("acquisition_mode_id between", value1, value2, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andAcquisitionModeIdNotBetween(String value1, String value2) {
            addCriterion("acquisition_mode_id not between", value1, value2, "acquisitionModeId");
            return (Criteria) this;
        }

        public Criteria andIsNewlandIsNull() {
            addCriterion("is_newland is null");
            return (Criteria) this;
        }

        public Criteria andIsNewlandIsNotNull() {
            addCriterion("is_newland is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewlandEqualTo(String value) {
            addCriterion("is_newland =", value, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandNotEqualTo(String value) {
            addCriterion("is_newland <>", value, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandGreaterThan(String value) {
            addCriterion("is_newland >", value, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandGreaterThanOrEqualTo(String value) {
            addCriterion("is_newland >=", value, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandLessThan(String value) {
            addCriterion("is_newland <", value, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandLessThanOrEqualTo(String value) {
            addCriterion("is_newland <=", value, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandLike(String value) {
            addCriterion("is_newland like", value, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandNotLike(String value) {
            addCriterion("is_newland not like", value, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandIn(List<String> values) {
            addCriterion("is_newland in", values, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandNotIn(List<String> values) {
            addCriterion("is_newland not in", values, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandBetween(String value1, String value2) {
            addCriterion("is_newland between", value1, value2, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsNewlandNotBetween(String value1, String value2) {
            addCriterion("is_newland not between", value1, value2, "isNewland");
            return (Criteria) this;
        }

        public Criteria andIsApprovalIsNull() {
            addCriterion("is_approval is null");
            return (Criteria) this;
        }

        public Criteria andIsApprovalIsNotNull() {
            addCriterion("is_approval is not null");
            return (Criteria) this;
        }

        public Criteria andIsApprovalEqualTo(String value) {
            addCriterion("is_approval =", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalNotEqualTo(String value) {
            addCriterion("is_approval <>", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalGreaterThan(String value) {
            addCriterion("is_approval >", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalGreaterThanOrEqualTo(String value) {
            addCriterion("is_approval >=", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalLessThan(String value) {
            addCriterion("is_approval <", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalLessThanOrEqualTo(String value) {
            addCriterion("is_approval <=", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalLike(String value) {
            addCriterion("is_approval like", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalNotLike(String value) {
            addCriterion("is_approval not like", value, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalIn(List<String> values) {
            addCriterion("is_approval in", values, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalNotIn(List<String> values) {
            addCriterion("is_approval not in", values, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalBetween(String value1, String value2) {
            addCriterion("is_approval between", value1, value2, "isApproval");
            return (Criteria) this;
        }

        public Criteria andIsApprovalNotBetween(String value1, String value2) {
            addCriterion("is_approval not between", value1, value2, "isApproval");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointIsNull() {
            addCriterion("economics_appoint is null");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointIsNotNull() {
            addCriterion("economics_appoint is not null");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointEqualTo(String value) {
            addCriterion("economics_appoint =", value, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointNotEqualTo(String value) {
            addCriterion("economics_appoint <>", value, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointGreaterThan(String value) {
            addCriterion("economics_appoint >", value, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointGreaterThanOrEqualTo(String value) {
            addCriterion("economics_appoint >=", value, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointLessThan(String value) {
            addCriterion("economics_appoint <", value, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointLessThanOrEqualTo(String value) {
            addCriterion("economics_appoint <=", value, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointLike(String value) {
            addCriterion("economics_appoint like", value, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointNotLike(String value) {
            addCriterion("economics_appoint not like", value, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointIn(List<String> values) {
            addCriterion("economics_appoint in", values, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointNotIn(List<String> values) {
            addCriterion("economics_appoint not in", values, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointBetween(String value1, String value2) {
            addCriterion("economics_appoint between", value1, value2, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andEconomicsAppointNotBetween(String value1, String value2) {
            addCriterion("economics_appoint not between", value1, value2, "economicsAppoint");
            return (Criteria) this;
        }

        public Criteria andPayConditionsIsNull() {
            addCriterion("pay_conditions is null");
            return (Criteria) this;
        }

        public Criteria andPayConditionsIsNotNull() {
            addCriterion("pay_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andPayConditionsEqualTo(String value) {
            addCriterion("pay_conditions =", value, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsNotEqualTo(String value) {
            addCriterion("pay_conditions <>", value, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsGreaterThan(String value) {
            addCriterion("pay_conditions >", value, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("pay_conditions >=", value, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsLessThan(String value) {
            addCriterion("pay_conditions <", value, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsLessThanOrEqualTo(String value) {
            addCriterion("pay_conditions <=", value, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsLike(String value) {
            addCriterion("pay_conditions like", value, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsNotLike(String value) {
            addCriterion("pay_conditions not like", value, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsIn(List<String> values) {
            addCriterion("pay_conditions in", values, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsNotIn(List<String> values) {
            addCriterion("pay_conditions not in", values, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsBetween(String value1, String value2) {
            addCriterion("pay_conditions between", value1, value2, "payConditions");
            return (Criteria) this;
        }

        public Criteria andPayConditionsNotBetween(String value1, String value2) {
            addCriterion("pay_conditions not between", value1, value2, "payConditions");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskIsNull() {
            addCriterion("notice_risk is null");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskIsNotNull() {
            addCriterion("notice_risk is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskEqualTo(String value) {
            addCriterion("notice_risk =", value, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskNotEqualTo(String value) {
            addCriterion("notice_risk <>", value, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskGreaterThan(String value) {
            addCriterion("notice_risk >", value, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskGreaterThanOrEqualTo(String value) {
            addCriterion("notice_risk >=", value, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskLessThan(String value) {
            addCriterion("notice_risk <", value, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskLessThanOrEqualTo(String value) {
            addCriterion("notice_risk <=", value, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskLike(String value) {
            addCriterion("notice_risk like", value, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskNotLike(String value) {
            addCriterion("notice_risk not like", value, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskIn(List<String> values) {
            addCriterion("notice_risk in", values, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskNotIn(List<String> values) {
            addCriterion("notice_risk not in", values, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskBetween(String value1, String value2) {
            addCriterion("notice_risk between", value1, value2, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andNoticeRiskNotBetween(String value1, String value2) {
            addCriterion("notice_risk not between", value1, value2, "noticeRisk");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionIsNull() {
            addCriterion("apply_limiting_condition is null");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionIsNotNull() {
            addCriterion("apply_limiting_condition is not null");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionEqualTo(String value) {
            addCriterion("apply_limiting_condition =", value, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionNotEqualTo(String value) {
            addCriterion("apply_limiting_condition <>", value, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionGreaterThan(String value) {
            addCriterion("apply_limiting_condition >", value, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionGreaterThanOrEqualTo(String value) {
            addCriterion("apply_limiting_condition >=", value, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionLessThan(String value) {
            addCriterion("apply_limiting_condition <", value, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionLessThanOrEqualTo(String value) {
            addCriterion("apply_limiting_condition <=", value, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionLike(String value) {
            addCriterion("apply_limiting_condition like", value, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionNotLike(String value) {
            addCriterion("apply_limiting_condition not like", value, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionIn(List<String> values) {
            addCriterion("apply_limiting_condition in", values, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionNotIn(List<String> values) {
            addCriterion("apply_limiting_condition not in", values, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionBetween(String value1, String value2) {
            addCriterion("apply_limiting_condition between", value1, value2, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andApplyLimitingConditionNotBetween(String value1, String value2) {
            addCriterion("apply_limiting_condition not between", value1, value2, "applyLimitingCondition");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesIsNull() {
            addCriterion("bidding_rules is null");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesIsNotNull() {
            addCriterion("bidding_rules is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesEqualTo(String value) {
            addCriterion("bidding_rules =", value, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesNotEqualTo(String value) {
            addCriterion("bidding_rules <>", value, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesGreaterThan(String value) {
            addCriterion("bidding_rules >", value, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesGreaterThanOrEqualTo(String value) {
            addCriterion("bidding_rules >=", value, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesLessThan(String value) {
            addCriterion("bidding_rules <", value, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesLessThanOrEqualTo(String value) {
            addCriterion("bidding_rules <=", value, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesLike(String value) {
            addCriterion("bidding_rules like", value, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesNotLike(String value) {
            addCriterion("bidding_rules not like", value, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesIn(List<String> values) {
            addCriterion("bidding_rules in", values, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesNotIn(List<String> values) {
            addCriterion("bidding_rules not in", values, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesBetween(String value1, String value2) {
            addCriterion("bidding_rules between", value1, value2, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andBiddingRulesNotBetween(String value1, String value2) {
            addCriterion("bidding_rules not between", value1, value2, "biddingRules");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkIsNull() {
            addCriterion("landinout_remark is null");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkIsNotNull() {
            addCriterion("landinout_remark is not null");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkEqualTo(String value) {
            addCriterion("landinout_remark =", value, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkNotEqualTo(String value) {
            addCriterion("landinout_remark <>", value, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkGreaterThan(String value) {
            addCriterion("landinout_remark >", value, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("landinout_remark >=", value, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkLessThan(String value) {
            addCriterion("landinout_remark <", value, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkLessThanOrEqualTo(String value) {
            addCriterion("landinout_remark <=", value, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkLike(String value) {
            addCriterion("landinout_remark like", value, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkNotLike(String value) {
            addCriterion("landinout_remark not like", value, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkIn(List<String> values) {
            addCriterion("landinout_remark in", values, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkNotIn(List<String> values) {
            addCriterion("landinout_remark not in", values, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkBetween(String value1, String value2) {
            addCriterion("landinout_remark between", value1, value2, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLandinoutRemarkNotBetween(String value1, String value2) {
            addCriterion("landinout_remark not between", value1, value2, "landinoutRemark");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduIsNull() {
            addCriterion("lng_point_baidu is null");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduIsNotNull() {
            addCriterion("lng_point_baidu is not null");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduEqualTo(Double value) {
            addCriterion("lng_point_baidu =", value, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduNotEqualTo(Double value) {
            addCriterion("lng_point_baidu <>", value, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduGreaterThan(Double value) {
            addCriterion("lng_point_baidu >", value, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduGreaterThanOrEqualTo(Double value) {
            addCriterion("lng_point_baidu >=", value, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduLessThan(Double value) {
            addCriterion("lng_point_baidu <", value, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduLessThanOrEqualTo(Double value) {
            addCriterion("lng_point_baidu <=", value, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduIn(List<Double> values) {
            addCriterion("lng_point_baidu in", values, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduNotIn(List<Double> values) {
            addCriterion("lng_point_baidu not in", values, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduBetween(Double value1, Double value2) {
            addCriterion("lng_point_baidu between", value1, value2, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointBaiduNotBetween(Double value1, Double value2) {
            addCriterion("lng_point_baidu not between", value1, value2, "lngPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduIsNull() {
            addCriterion("lat_point_baidu is null");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduIsNotNull() {
            addCriterion("lat_point_baidu is not null");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduEqualTo(Double value) {
            addCriterion("lat_point_baidu =", value, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduNotEqualTo(Double value) {
            addCriterion("lat_point_baidu <>", value, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduGreaterThan(Double value) {
            addCriterion("lat_point_baidu >", value, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduGreaterThanOrEqualTo(Double value) {
            addCriterion("lat_point_baidu >=", value, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduLessThan(Double value) {
            addCriterion("lat_point_baidu <", value, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduLessThanOrEqualTo(Double value) {
            addCriterion("lat_point_baidu <=", value, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduIn(List<Double> values) {
            addCriterion("lat_point_baidu in", values, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduNotIn(List<Double> values) {
            addCriterion("lat_point_baidu not in", values, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduBetween(Double value1, Double value2) {
            addCriterion("lat_point_baidu between", value1, value2, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLatPointBaiduNotBetween(Double value1, Double value2) {
            addCriterion("lat_point_baidu not between", value1, value2, "latPointBaidu");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeIsNull() {
            addCriterion("lng_point_gaode is null");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeIsNotNull() {
            addCriterion("lng_point_gaode is not null");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeEqualTo(Double value) {
            addCriterion("lng_point_gaode =", value, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeNotEqualTo(Double value) {
            addCriterion("lng_point_gaode <>", value, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeGreaterThan(Double value) {
            addCriterion("lng_point_gaode >", value, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeGreaterThanOrEqualTo(Double value) {
            addCriterion("lng_point_gaode >=", value, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeLessThan(Double value) {
            addCriterion("lng_point_gaode <", value, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeLessThanOrEqualTo(Double value) {
            addCriterion("lng_point_gaode <=", value, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeIn(List<Double> values) {
            addCriterion("lng_point_gaode in", values, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeNotIn(List<Double> values) {
            addCriterion("lng_point_gaode not in", values, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeBetween(Double value1, Double value2) {
            addCriterion("lng_point_gaode between", value1, value2, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointGaodeNotBetween(Double value1, Double value2) {
            addCriterion("lng_point_gaode not between", value1, value2, "lngPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeIsNull() {
            addCriterion("lat_point_gaode is null");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeIsNotNull() {
            addCriterion("lat_point_gaode is not null");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeEqualTo(Double value) {
            addCriterion("lat_point_gaode =", value, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeNotEqualTo(Double value) {
            addCriterion("lat_point_gaode <>", value, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeGreaterThan(Double value) {
            addCriterion("lat_point_gaode >", value, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeGreaterThanOrEqualTo(Double value) {
            addCriterion("lat_point_gaode >=", value, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeLessThan(Double value) {
            addCriterion("lat_point_gaode <", value, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeLessThanOrEqualTo(Double value) {
            addCriterion("lat_point_gaode <=", value, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeIn(List<Double> values) {
            addCriterion("lat_point_gaode in", values, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeNotIn(List<Double> values) {
            addCriterion("lat_point_gaode not in", values, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeBetween(Double value1, Double value2) {
            addCriterion("lat_point_gaode between", value1, value2, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLatPointGaodeNotBetween(Double value1, Double value2) {
            addCriterion("lat_point_gaode not between", value1, value2, "latPointGaode");
            return (Criteria) this;
        }

        public Criteria andLngPointTxIsNull() {
            addCriterion("lng_point_tx is null");
            return (Criteria) this;
        }

        public Criteria andLngPointTxIsNotNull() {
            addCriterion("lng_point_tx is not null");
            return (Criteria) this;
        }

        public Criteria andLngPointTxEqualTo(Double value) {
            addCriterion("lng_point_tx =", value, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxNotEqualTo(Double value) {
            addCriterion("lng_point_tx <>", value, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxGreaterThan(Double value) {
            addCriterion("lng_point_tx >", value, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxGreaterThanOrEqualTo(Double value) {
            addCriterion("lng_point_tx >=", value, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxLessThan(Double value) {
            addCriterion("lng_point_tx <", value, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxLessThanOrEqualTo(Double value) {
            addCriterion("lng_point_tx <=", value, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxIn(List<Double> values) {
            addCriterion("lng_point_tx in", values, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxNotIn(List<Double> values) {
            addCriterion("lng_point_tx not in", values, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxBetween(Double value1, Double value2) {
            addCriterion("lng_point_tx between", value1, value2, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointTxNotBetween(Double value1, Double value2) {
            addCriterion("lng_point_tx not between", value1, value2, "lngPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxIsNull() {
            addCriterion("lat_point_tx is null");
            return (Criteria) this;
        }

        public Criteria andLatPointTxIsNotNull() {
            addCriterion("lat_point_tx is not null");
            return (Criteria) this;
        }

        public Criteria andLatPointTxEqualTo(Double value) {
            addCriterion("lat_point_tx =", value, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxNotEqualTo(Double value) {
            addCriterion("lat_point_tx <>", value, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxGreaterThan(Double value) {
            addCriterion("lat_point_tx >", value, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxGreaterThanOrEqualTo(Double value) {
            addCriterion("lat_point_tx >=", value, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxLessThan(Double value) {
            addCriterion("lat_point_tx <", value, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxLessThanOrEqualTo(Double value) {
            addCriterion("lat_point_tx <=", value, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxIn(List<Double> values) {
            addCriterion("lat_point_tx in", values, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxNotIn(List<Double> values) {
            addCriterion("lat_point_tx not in", values, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxBetween(Double value1, Double value2) {
            addCriterion("lat_point_tx between", value1, value2, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLatPointTxNotBetween(Double value1, Double value2) {
            addCriterion("lat_point_tx not between", value1, value2, "latPointTx");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleIsNull() {
            addCriterion("lng_point_google is null");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleIsNotNull() {
            addCriterion("lng_point_google is not null");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleEqualTo(Double value) {
            addCriterion("lng_point_google =", value, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleNotEqualTo(Double value) {
            addCriterion("lng_point_google <>", value, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleGreaterThan(Double value) {
            addCriterion("lng_point_google >", value, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleGreaterThanOrEqualTo(Double value) {
            addCriterion("lng_point_google >=", value, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleLessThan(Double value) {
            addCriterion("lng_point_google <", value, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleLessThanOrEqualTo(Double value) {
            addCriterion("lng_point_google <=", value, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleIn(List<Double> values) {
            addCriterion("lng_point_google in", values, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleNotIn(List<Double> values) {
            addCriterion("lng_point_google not in", values, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleBetween(Double value1, Double value2) {
            addCriterion("lng_point_google between", value1, value2, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLngPointGoogleNotBetween(Double value1, Double value2) {
            addCriterion("lng_point_google not between", value1, value2, "lngPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleIsNull() {
            addCriterion("lat_point_google is null");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleIsNotNull() {
            addCriterion("lat_point_google is not null");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleEqualTo(Double value) {
            addCriterion("lat_point_google =", value, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleNotEqualTo(Double value) {
            addCriterion("lat_point_google <>", value, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleGreaterThan(Double value) {
            addCriterion("lat_point_google >", value, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleGreaterThanOrEqualTo(Double value) {
            addCriterion("lat_point_google >=", value, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleLessThan(Double value) {
            addCriterion("lat_point_google <", value, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleLessThanOrEqualTo(Double value) {
            addCriterion("lat_point_google <=", value, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleIn(List<Double> values) {
            addCriterion("lat_point_google in", values, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleNotIn(List<Double> values) {
            addCriterion("lat_point_google not in", values, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleBetween(Double value1, Double value2) {
            addCriterion("lat_point_google between", value1, value2, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andLatPointGoogleNotBetween(Double value1, Double value2) {
            addCriterion("lat_point_google not between", value1, value2, "latPointGoogle");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNull() {
            addCriterion("region_name is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNotNull() {
            addCriterion("region_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEqualTo(String value) {
            addCriterion("region_name =", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotEqualTo(String value) {
            addCriterion("region_name <>", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThan(String value) {
            addCriterion("region_name >", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThanOrEqualTo(String value) {
            addCriterion("region_name >=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThan(String value) {
            addCriterion("region_name <", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThanOrEqualTo(String value) {
            addCriterion("region_name <=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLike(String value) {
            addCriterion("region_name like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotLike(String value) {
            addCriterion("region_name not like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameIn(List<String> values) {
            addCriterion("region_name in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotIn(List<String> values) {
            addCriterion("region_name not in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameBetween(String value1, String value2) {
            addCriterion("region_name between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotBetween(String value1, String value2) {
            addCriterion("region_name not between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andLandPropertyIsNull() {
            addCriterion("land_property is null");
            return (Criteria) this;
        }

        public Criteria andLandPropertyIsNotNull() {
            addCriterion("land_property is not null");
            return (Criteria) this;
        }

        public Criteria andLandPropertyEqualTo(String value) {
            addCriterion("land_property =", value, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyNotEqualTo(String value) {
            addCriterion("land_property <>", value, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyGreaterThan(String value) {
            addCriterion("land_property >", value, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("land_property >=", value, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyLessThan(String value) {
            addCriterion("land_property <", value, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyLessThanOrEqualTo(String value) {
            addCriterion("land_property <=", value, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyLike(String value) {
            addCriterion("land_property like", value, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyNotLike(String value) {
            addCriterion("land_property not like", value, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyIn(List<String> values) {
            addCriterion("land_property in", values, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyNotIn(List<String> values) {
            addCriterion("land_property not in", values, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyBetween(String value1, String value2) {
            addCriterion("land_property between", value1, value2, "landProperty");
            return (Criteria) this;
        }

        public Criteria andLandPropertyNotBetween(String value1, String value2) {
            addCriterion("land_property not between", value1, value2, "landProperty");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaIsNull() {
            addCriterion("use_land_area is null");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaIsNotNull() {
            addCriterion("use_land_area is not null");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaEqualTo(Double value) {
            addCriterion("use_land_area =", value, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaNotEqualTo(Double value) {
            addCriterion("use_land_area <>", value, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaGreaterThan(Double value) {
            addCriterion("use_land_area >", value, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("use_land_area >=", value, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaLessThan(Double value) {
            addCriterion("use_land_area <", value, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaLessThanOrEqualTo(Double value) {
            addCriterion("use_land_area <=", value, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaIn(List<Double> values) {
            addCriterion("use_land_area in", values, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaNotIn(List<Double> values) {
            addCriterion("use_land_area not in", values, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaBetween(Double value1, Double value2) {
            addCriterion("use_land_area between", value1, value2, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andUseLandAreaNotBetween(Double value1, Double value2) {
            addCriterion("use_land_area not between", value1, value2, "useLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaIsNull() {
            addCriterion("total_land_area is null");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaIsNotNull() {
            addCriterion("total_land_area is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaEqualTo(Double value) {
            addCriterion("total_land_area =", value, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaNotEqualTo(Double value) {
            addCriterion("total_land_area <>", value, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaGreaterThan(Double value) {
            addCriterion("total_land_area >", value, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("total_land_area >=", value, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaLessThan(Double value) {
            addCriterion("total_land_area <", value, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaLessThanOrEqualTo(Double value) {
            addCriterion("total_land_area <=", value, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaIn(List<Double> values) {
            addCriterion("total_land_area in", values, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaNotIn(List<Double> values) {
            addCriterion("total_land_area not in", values, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaBetween(Double value1, Double value2) {
            addCriterion("total_land_area between", value1, value2, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andTotalLandAreaNotBetween(Double value1, Double value2) {
            addCriterion("total_land_area not between", value1, value2, "totalLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaIsNull() {
            addCriterion("net_land_area is null");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaIsNotNull() {
            addCriterion("net_land_area is not null");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaEqualTo(Double value) {
            addCriterion("net_land_area =", value, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaNotEqualTo(Double value) {
            addCriterion("net_land_area <>", value, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaGreaterThan(Double value) {
            addCriterion("net_land_area >", value, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("net_land_area >=", value, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaLessThan(Double value) {
            addCriterion("net_land_area <", value, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaLessThanOrEqualTo(Double value) {
            addCriterion("net_land_area <=", value, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaIn(List<Double> values) {
            addCriterion("net_land_area in", values, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaNotIn(List<Double> values) {
            addCriterion("net_land_area not in", values, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaBetween(Double value1, Double value2) {
            addCriterion("net_land_area between", value1, value2, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andNetLandAreaNotBetween(Double value1, Double value2) {
            addCriterion("net_land_area not between", value1, value2, "netLandArea");
            return (Criteria) this;
        }

        public Criteria andCapacityRateIsNull() {
            addCriterion("capacity_rate is null");
            return (Criteria) this;
        }

        public Criteria andCapacityRateIsNotNull() {
            addCriterion("capacity_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityRateEqualTo(Double value) {
            addCriterion("capacity_rate =", value, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateNotEqualTo(Double value) {
            addCriterion("capacity_rate <>", value, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateGreaterThan(Double value) {
            addCriterion("capacity_rate >", value, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateGreaterThanOrEqualTo(Double value) {
            addCriterion("capacity_rate >=", value, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateLessThan(Double value) {
            addCriterion("capacity_rate <", value, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateLessThanOrEqualTo(Double value) {
            addCriterion("capacity_rate <=", value, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateIn(List<Double> values) {
            addCriterion("capacity_rate in", values, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateNotIn(List<Double> values) {
            addCriterion("capacity_rate not in", values, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateBetween(Double value1, Double value2) {
            addCriterion("capacity_rate between", value1, value2, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andCapacityRateNotBetween(Double value1, Double value2) {
            addCriterion("capacity_rate not between", value1, value2, "capacityRate");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityIsNull() {
            addCriterion("build_max_density is null");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityIsNotNull() {
            addCriterion("build_max_density is not null");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityEqualTo(Double value) {
            addCriterion("build_max_density =", value, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityNotEqualTo(Double value) {
            addCriterion("build_max_density <>", value, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityGreaterThan(Double value) {
            addCriterion("build_max_density >", value, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityGreaterThanOrEqualTo(Double value) {
            addCriterion("build_max_density >=", value, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityLessThan(Double value) {
            addCriterion("build_max_density <", value, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityLessThanOrEqualTo(Double value) {
            addCriterion("build_max_density <=", value, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityIn(List<Double> values) {
            addCriterion("build_max_density in", values, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityNotIn(List<Double> values) {
            addCriterion("build_max_density not in", values, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityBetween(Double value1, Double value2) {
            addCriterion("build_max_density between", value1, value2, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andBuildMaxDensityNotBetween(Double value1, Double value2) {
            addCriterion("build_max_density not between", value1, value2, "buildMaxDensity");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaIsNull() {
            addCriterion("capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaIsNotNull() {
            addCriterion("capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("capacity_building_area =", value, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("capacity_building_area <>", value, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("capacity_building_area >", value, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("capacity_building_area >=", value, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaLessThan(Double value) {
            addCriterion("capacity_building_area <", value, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("capacity_building_area <=", value, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("capacity_building_area in", values, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("capacity_building_area not in", values, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("capacity_building_area between", value1, value2, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("capacity_building_area not between", value1, value2, "capacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaIsNull() {
            addCriterion("holding_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaIsNotNull() {
            addCriterion("holding_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("holding_capacity_building_area =", value, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("holding_capacity_building_area <>", value, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("holding_capacity_building_area >", value, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("holding_capacity_building_area >=", value, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaLessThan(Double value) {
            addCriterion("holding_capacity_building_area <", value, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("holding_capacity_building_area <=", value, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("holding_capacity_building_area in", values, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("holding_capacity_building_area not in", values, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("holding_capacity_building_area between", value1, value2, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andHoldingCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("holding_capacity_building_area not between", value1, value2, "holdingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaIsNull() {
            addCriterion("sale_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaIsNotNull() {
            addCriterion("sale_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("sale_capacity_building_area =", value, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("sale_capacity_building_area <>", value, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("sale_capacity_building_area >", value, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_capacity_building_area >=", value, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaLessThan(Double value) {
            addCriterion("sale_capacity_building_area <", value, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("sale_capacity_building_area <=", value, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("sale_capacity_building_area in", values, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("sale_capacity_building_area not in", values, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("sale_capacity_building_area between", value1, value2, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andSaleCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("sale_capacity_building_area not between", value1, value2, "saleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaIsNull() {
            addCriterion("other_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaIsNotNull() {
            addCriterion("other_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("other_capacity_building_area =", value, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("other_capacity_building_area <>", value, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("other_capacity_building_area >", value, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("other_capacity_building_area >=", value, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaLessThan(Double value) {
            addCriterion("other_capacity_building_area <", value, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("other_capacity_building_area <=", value, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("other_capacity_building_area in", values, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("other_capacity_building_area not in", values, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("other_capacity_building_area between", value1, value2, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andOtherCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("other_capacity_building_area not between", value1, value2, "otherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaIsNull() {
            addCriterion("construction_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaIsNotNull() {
            addCriterion("construction_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("construction_capacity_building_area =", value, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("construction_capacity_building_area <>", value, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("construction_capacity_building_area >", value, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("construction_capacity_building_area >=", value, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaLessThan(Double value) {
            addCriterion("construction_capacity_building_area <", value, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("construction_capacity_building_area <=", value, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("construction_capacity_building_area in", values, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("construction_capacity_building_area not in", values, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("construction_capacity_building_area between", value1, value2, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andConstructionCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("construction_capacity_building_area not between", value1, value2, "constructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaIsNull() {
            addCriterion("deal_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaIsNotNull() {
            addCriterion("deal_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("deal_capacity_building_area =", value, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("deal_capacity_building_area <>", value, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("deal_capacity_building_area >", value, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("deal_capacity_building_area >=", value, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaLessThan(Double value) {
            addCriterion("deal_capacity_building_area <", value, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("deal_capacity_building_area <=", value, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("deal_capacity_building_area in", values, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("deal_capacity_building_area not in", values, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("deal_capacity_building_area between", value1, value2, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("deal_capacity_building_area not between", value1, value2, "dealCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaIsNull() {
            addCriterion("deal_holding_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaIsNotNull() {
            addCriterion("deal_holding_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("deal_holding_capacity_building_area =", value, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("deal_holding_capacity_building_area <>", value, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("deal_holding_capacity_building_area >", value, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("deal_holding_capacity_building_area >=", value, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaLessThan(Double value) {
            addCriterion("deal_holding_capacity_building_area <", value, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("deal_holding_capacity_building_area <=", value, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("deal_holding_capacity_building_area in", values, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("deal_holding_capacity_building_area not in", values, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("deal_holding_capacity_building_area between", value1, value2, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealHoldingCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("deal_holding_capacity_building_area not between", value1, value2, "dealHoldingCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaIsNull() {
            addCriterion("deal_sale_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaIsNotNull() {
            addCriterion("deal_sale_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("deal_sale_capacity_building_area =", value, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("deal_sale_capacity_building_area <>", value, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("deal_sale_capacity_building_area >", value, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("deal_sale_capacity_building_area >=", value, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaLessThan(Double value) {
            addCriterion("deal_sale_capacity_building_area <", value, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("deal_sale_capacity_building_area <=", value, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("deal_sale_capacity_building_area in", values, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("deal_sale_capacity_building_area not in", values, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("deal_sale_capacity_building_area between", value1, value2, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealSaleCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("deal_sale_capacity_building_area not between", value1, value2, "dealSaleCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaIsNull() {
            addCriterion("deal_other_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaIsNotNull() {
            addCriterion("deal_other_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("deal_other_capacity_building_area =", value, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("deal_other_capacity_building_area <>", value, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("deal_other_capacity_building_area >", value, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("deal_other_capacity_building_area >=", value, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaLessThan(Double value) {
            addCriterion("deal_other_capacity_building_area <", value, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("deal_other_capacity_building_area <=", value, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("deal_other_capacity_building_area in", values, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("deal_other_capacity_building_area not in", values, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("deal_other_capacity_building_area between", value1, value2, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealOtherCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("deal_other_capacity_building_area not between", value1, value2, "dealOtherCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaIsNull() {
            addCriterion("deal_construction_capacity_building_area is null");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaIsNotNull() {
            addCriterion("deal_construction_capacity_building_area is not null");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaEqualTo(Double value) {
            addCriterion("deal_construction_capacity_building_area =", value, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaNotEqualTo(Double value) {
            addCriterion("deal_construction_capacity_building_area <>", value, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaGreaterThan(Double value) {
            addCriterion("deal_construction_capacity_building_area >", value, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("deal_construction_capacity_building_area >=", value, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaLessThan(Double value) {
            addCriterion("deal_construction_capacity_building_area <", value, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaLessThanOrEqualTo(Double value) {
            addCriterion("deal_construction_capacity_building_area <=", value, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaIn(List<Double> values) {
            addCriterion("deal_construction_capacity_building_area in", values, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaNotIn(List<Double> values) {
            addCriterion("deal_construction_capacity_building_area not in", values, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaBetween(Double value1, Double value2) {
            addCriterion("deal_construction_capacity_building_area between", value1, value2, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andDealConstructionCapacityBuildingAreaNotBetween(Double value1, Double value2) {
            addCriterion("deal_construction_capacity_building_area not between", value1, value2, "dealConstructionCapacityBuildingArea");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceIsNull() {
            addCriterion("upset_price is null");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceIsNotNull() {
            addCriterion("upset_price is not null");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceEqualTo(Double value) {
            addCriterion("upset_price =", value, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceNotEqualTo(Double value) {
            addCriterion("upset_price <>", value, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceGreaterThan(Double value) {
            addCriterion("upset_price >", value, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("upset_price >=", value, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceLessThan(Double value) {
            addCriterion("upset_price <", value, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceLessThanOrEqualTo(Double value) {
            addCriterion("upset_price <=", value, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceIn(List<Double> values) {
            addCriterion("upset_price in", values, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceNotIn(List<Double> values) {
            addCriterion("upset_price not in", values, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceBetween(Double value1, Double value2) {
            addCriterion("upset_price between", value1, value2, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andUpsetPriceNotBetween(Double value1, Double value2) {
            addCriterion("upset_price not between", value1, value2, "upsetPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceIsNull() {
            addCriterion("floor_price is null");
            return (Criteria) this;
        }

        public Criteria andFloorPriceIsNotNull() {
            addCriterion("floor_price is not null");
            return (Criteria) this;
        }

        public Criteria andFloorPriceEqualTo(Double value) {
            addCriterion("floor_price =", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceNotEqualTo(Double value) {
            addCriterion("floor_price <>", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceGreaterThan(Double value) {
            addCriterion("floor_price >", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("floor_price >=", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceLessThan(Double value) {
            addCriterion("floor_price <", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceLessThanOrEqualTo(Double value) {
            addCriterion("floor_price <=", value, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceIn(List<Double> values) {
            addCriterion("floor_price in", values, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceNotIn(List<Double> values) {
            addCriterion("floor_price not in", values, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceBetween(Double value1, Double value2) {
            addCriterion("floor_price between", value1, value2, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andFloorPriceNotBetween(Double value1, Double value2) {
            addCriterion("floor_price not between", value1, value2, "floorPrice");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateIsNull() {
            addCriterion("regist_due_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateIsNotNull() {
            addCriterion("regist_due_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateEqualTo(Date value) {
            addCriterion("regist_due_date =", value, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateNotEqualTo(Date value) {
            addCriterion("regist_due_date <>", value, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateGreaterThan(Date value) {
            addCriterion("regist_due_date >", value, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_due_date >=", value, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateLessThan(Date value) {
            addCriterion("regist_due_date <", value, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateLessThanOrEqualTo(Date value) {
            addCriterion("regist_due_date <=", value, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateIn(List<Date> values) {
            addCriterion("regist_due_date in", values, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateNotIn(List<Date> values) {
            addCriterion("regist_due_date not in", values, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateBetween(Date value1, Date value2) {
            addCriterion("regist_due_date between", value1, value2, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andRegistDueDateNotBetween(Date value1, Date value2) {
            addCriterion("regist_due_date not between", value1, value2, "registDueDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateIsNull() {
            addCriterion("apply_limit_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateIsNotNull() {
            addCriterion("apply_limit_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateEqualTo(Date value) {
            addCriterion("apply_limit_date =", value, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateNotEqualTo(Date value) {
            addCriterion("apply_limit_date <>", value, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateGreaterThan(Date value) {
            addCriterion("apply_limit_date >", value, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_limit_date >=", value, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateLessThan(Date value) {
            addCriterion("apply_limit_date <", value, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateLessThanOrEqualTo(Date value) {
            addCriterion("apply_limit_date <=", value, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateIn(List<Date> values) {
            addCriterion("apply_limit_date in", values, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateNotIn(List<Date> values) {
            addCriterion("apply_limit_date not in", values, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateBetween(Date value1, Date value2) {
            addCriterion("apply_limit_date between", value1, value2, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andApplyLimitDateNotBetween(Date value1, Date value2) {
            addCriterion("apply_limit_date not between", value1, value2, "applyLimitDate");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeIsNull() {
            addCriterion("land_stock_time is null");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeIsNotNull() {
            addCriterion("land_stock_time is not null");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeEqualTo(Date value) {
            addCriterion("land_stock_time =", value, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeNotEqualTo(Date value) {
            addCriterion("land_stock_time <>", value, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeGreaterThan(Date value) {
            addCriterion("land_stock_time >", value, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("land_stock_time >=", value, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeLessThan(Date value) {
            addCriterion("land_stock_time <", value, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeLessThanOrEqualTo(Date value) {
            addCriterion("land_stock_time <=", value, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeIn(List<Date> values) {
            addCriterion("land_stock_time in", values, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeNotIn(List<Date> values) {
            addCriterion("land_stock_time not in", values, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeBetween(Date value1, Date value2) {
            addCriterion("land_stock_time between", value1, value2, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandStockTimeNotBetween(Date value1, Date value2) {
            addCriterion("land_stock_time not between", value1, value2, "landStockTime");
            return (Criteria) this;
        }

        public Criteria andLandDealdateIsNull() {
            addCriterion("land_dealdate is null");
            return (Criteria) this;
        }

        public Criteria andLandDealdateIsNotNull() {
            addCriterion("land_dealdate is not null");
            return (Criteria) this;
        }

        public Criteria andLandDealdateEqualTo(Date value) {
            addCriterion("land_dealdate =", value, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateNotEqualTo(Date value) {
            addCriterion("land_dealdate <>", value, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateGreaterThan(Date value) {
            addCriterion("land_dealdate >", value, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("land_dealdate >=", value, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateLessThan(Date value) {
            addCriterion("land_dealdate <", value, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateLessThanOrEqualTo(Date value) {
            addCriterion("land_dealdate <=", value, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateIn(List<Date> values) {
            addCriterion("land_dealdate in", values, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateNotIn(List<Date> values) {
            addCriterion("land_dealdate not in", values, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateBetween(Date value1, Date value2) {
            addCriterion("land_dealdate between", value1, value2, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andLandDealdateNotBetween(Date value1, Date value2) {
            addCriterion("land_dealdate not between", value1, value2, "landDealdate");
            return (Criteria) this;
        }

        public Criteria andDepositAmtIsNull() {
            addCriterion("deposit_amt is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmtIsNotNull() {
            addCriterion("deposit_amt is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmtEqualTo(Double value) {
            addCriterion("deposit_amt =", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtNotEqualTo(Double value) {
            addCriterion("deposit_amt <>", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtGreaterThan(Double value) {
            addCriterion("deposit_amt >", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit_amt >=", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtLessThan(Double value) {
            addCriterion("deposit_amt <", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtLessThanOrEqualTo(Double value) {
            addCriterion("deposit_amt <=", value, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtIn(List<Double> values) {
            addCriterion("deposit_amt in", values, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtNotIn(List<Double> values) {
            addCriterion("deposit_amt not in", values, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtBetween(Double value1, Double value2) {
            addCriterion("deposit_amt between", value1, value2, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositAmtNotBetween(Double value1, Double value2) {
            addCriterion("deposit_amt not between", value1, value2, "depositAmt");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateIsNull() {
            addCriterion("deposit_due_date is null");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateIsNotNull() {
            addCriterion("deposit_due_date is not null");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateEqualTo(Date value) {
            addCriterion("deposit_due_date =", value, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateNotEqualTo(Date value) {
            addCriterion("deposit_due_date <>", value, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateGreaterThan(Date value) {
            addCriterion("deposit_due_date >", value, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("deposit_due_date >=", value, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateLessThan(Date value) {
            addCriterion("deposit_due_date <", value, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateLessThanOrEqualTo(Date value) {
            addCriterion("deposit_due_date <=", value, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateIn(List<Date> values) {
            addCriterion("deposit_due_date in", values, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateNotIn(List<Date> values) {
            addCriterion("deposit_due_date not in", values, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateBetween(Date value1, Date value2) {
            addCriterion("deposit_due_date between", value1, value2, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositDueDateNotBetween(Date value1, Date value2) {
            addCriterion("deposit_due_date not between", value1, value2, "depositDueDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateIsNull() {
            addCriterion("deposit_return_date is null");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateIsNotNull() {
            addCriterion("deposit_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateEqualTo(Date value) {
            addCriterion("deposit_return_date =", value, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateNotEqualTo(Date value) {
            addCriterion("deposit_return_date <>", value, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateGreaterThan(Date value) {
            addCriterion("deposit_return_date >", value, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("deposit_return_date >=", value, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateLessThan(Date value) {
            addCriterion("deposit_return_date <", value, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateLessThanOrEqualTo(Date value) {
            addCriterion("deposit_return_date <=", value, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateIn(List<Date> values) {
            addCriterion("deposit_return_date in", values, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateNotIn(List<Date> values) {
            addCriterion("deposit_return_date not in", values, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateBetween(Date value1, Date value2) {
            addCriterion("deposit_return_date between", value1, value2, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andDepositReturnDateNotBetween(Date value1, Date value2) {
            addCriterion("deposit_return_date not between", value1, value2, "depositReturnDate");
            return (Criteria) this;
        }

        public Criteria andPayProgressIsNull() {
            addCriterion("pay_progress is null");
            return (Criteria) this;
        }

        public Criteria andPayProgressIsNotNull() {
            addCriterion("pay_progress is not null");
            return (Criteria) this;
        }

        public Criteria andPayProgressEqualTo(String value) {
            addCriterion("pay_progress =", value, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressNotEqualTo(String value) {
            addCriterion("pay_progress <>", value, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressGreaterThan(String value) {
            addCriterion("pay_progress >", value, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressGreaterThanOrEqualTo(String value) {
            addCriterion("pay_progress >=", value, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressLessThan(String value) {
            addCriterion("pay_progress <", value, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressLessThanOrEqualTo(String value) {
            addCriterion("pay_progress <=", value, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressLike(String value) {
            addCriterion("pay_progress like", value, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressNotLike(String value) {
            addCriterion("pay_progress not like", value, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressIn(List<String> values) {
            addCriterion("pay_progress in", values, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressNotIn(List<String> values) {
            addCriterion("pay_progress not in", values, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressBetween(String value1, String value2) {
            addCriterion("pay_progress between", value1, value2, "payProgress");
            return (Criteria) this;
        }

        public Criteria andPayProgressNotBetween(String value1, String value2) {
            addCriterion("pay_progress not between", value1, value2, "payProgress");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andVersionNumIsNull() {
            addCriterion("version_num is null");
            return (Criteria) this;
        }

        public Criteria andVersionNumIsNotNull() {
            addCriterion("version_num is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNumEqualTo(Long value) {
            addCriterion("version_num =", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumNotEqualTo(Long value) {
            addCriterion("version_num <>", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumGreaterThan(Long value) {
            addCriterion("version_num >", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumGreaterThanOrEqualTo(Long value) {
            addCriterion("version_num >=", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumLessThan(Long value) {
            addCriterion("version_num <", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumLessThanOrEqualTo(Long value) {
            addCriterion("version_num <=", value, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumIn(List<Long> values) {
            addCriterion("version_num in", values, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumNotIn(List<Long> values) {
            addCriterion("version_num not in", values, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumBetween(Long value1, Long value2) {
            addCriterion("version_num between", value1, value2, "versionNum");
            return (Criteria) this;
        }

        public Criteria andVersionNumNotBetween(Long value1, Long value2) {
            addCriterion("version_num not between", value1, value2, "versionNum");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdIsNull() {
            addCriterion("handle_person_id is null");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdIsNotNull() {
            addCriterion("handle_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdEqualTo(String value) {
            addCriterion("handle_person_id =", value, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdNotEqualTo(String value) {
            addCriterion("handle_person_id <>", value, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdGreaterThan(String value) {
            addCriterion("handle_person_id >", value, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("handle_person_id >=", value, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdLessThan(String value) {
            addCriterion("handle_person_id <", value, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdLessThanOrEqualTo(String value) {
            addCriterion("handle_person_id <=", value, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdLike(String value) {
            addCriterion("handle_person_id like", value, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdNotLike(String value) {
            addCriterion("handle_person_id not like", value, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdIn(List<String> values) {
            addCriterion("handle_person_id in", values, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdNotIn(List<String> values) {
            addCriterion("handle_person_id not in", values, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdBetween(String value1, String value2) {
            addCriterion("handle_person_id between", value1, value2, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andHandlePersonIdNotBetween(String value1, String value2) {
            addCriterion("handle_person_id not between", value1, value2, "handlePersonId");
            return (Criteria) this;
        }

        public Criteria andLandStatusIsNull() {
            addCriterion("land_status is null");
            return (Criteria) this;
        }

        public Criteria andLandStatusIsNotNull() {
            addCriterion("land_status is not null");
            return (Criteria) this;
        }

        public Criteria andLandStatusEqualTo(String value) {
            addCriterion("land_status =", value, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusNotEqualTo(String value) {
            addCriterion("land_status <>", value, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusGreaterThan(String value) {
            addCriterion("land_status >", value, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusGreaterThanOrEqualTo(String value) {
            addCriterion("land_status >=", value, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusLessThan(String value) {
            addCriterion("land_status <", value, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusLessThanOrEqualTo(String value) {
            addCriterion("land_status <=", value, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusLike(String value) {
            addCriterion("land_status like", value, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusNotLike(String value) {
            addCriterion("land_status not like", value, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusIn(List<String> values) {
            addCriterion("land_status in", values, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusNotIn(List<String> values) {
            addCriterion("land_status not in", values, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusBetween(String value1, String value2) {
            addCriterion("land_status between", value1, value2, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandStatusNotBetween(String value1, String value2) {
            addCriterion("land_status not between", value1, value2, "landStatus");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateIsNull() {
            addCriterion("land_submit_date is null");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateIsNotNull() {
            addCriterion("land_submit_date is not null");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateEqualTo(Date value) {
            addCriterion("land_submit_date =", value, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateNotEqualTo(Date value) {
            addCriterion("land_submit_date <>", value, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateGreaterThan(Date value) {
            addCriterion("land_submit_date >", value, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("land_submit_date >=", value, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateLessThan(Date value) {
            addCriterion("land_submit_date <", value, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("land_submit_date <=", value, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateIn(List<Date> values) {
            addCriterion("land_submit_date in", values, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateNotIn(List<Date> values) {
            addCriterion("land_submit_date not in", values, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateBetween(Date value1, Date value2) {
            addCriterion("land_submit_date between", value1, value2, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("land_submit_date not between", value1, value2, "landSubmitDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateIsNull() {
            addCriterion("land_shopping_date is null");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateIsNotNull() {
            addCriterion("land_shopping_date is not null");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateEqualTo(Date value) {
            addCriterion("land_shopping_date =", value, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateNotEqualTo(Date value) {
            addCriterion("land_shopping_date <>", value, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateGreaterThan(Date value) {
            addCriterion("land_shopping_date >", value, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("land_shopping_date >=", value, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateLessThan(Date value) {
            addCriterion("land_shopping_date <", value, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateLessThanOrEqualTo(Date value) {
            addCriterion("land_shopping_date <=", value, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateIn(List<Date> values) {
            addCriterion("land_shopping_date in", values, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateNotIn(List<Date> values) {
            addCriterion("land_shopping_date not in", values, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateBetween(Date value1, Date value2) {
            addCriterion("land_shopping_date between", value1, value2, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andLandShoppingDateNotBetween(Date value1, Date value2) {
            addCriterion("land_shopping_date not between", value1, value2, "landShoppingDate");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandIsNull() {
            addCriterion("is_residential_land is null");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandIsNotNull() {
            addCriterion("is_residential_land is not null");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandEqualTo(String value) {
            addCriterion("is_residential_land =", value, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandNotEqualTo(String value) {
            addCriterion("is_residential_land <>", value, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandGreaterThan(String value) {
            addCriterion("is_residential_land >", value, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandGreaterThanOrEqualTo(String value) {
            addCriterion("is_residential_land >=", value, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandLessThan(String value) {
            addCriterion("is_residential_land <", value, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandLessThanOrEqualTo(String value) {
            addCriterion("is_residential_land <=", value, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandLike(String value) {
            addCriterion("is_residential_land like", value, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandNotLike(String value) {
            addCriterion("is_residential_land not like", value, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandIn(List<String> values) {
            addCriterion("is_residential_land in", values, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandNotIn(List<String> values) {
            addCriterion("is_residential_land not in", values, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandBetween(String value1, String value2) {
            addCriterion("is_residential_land between", value1, value2, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsResidentialLandNotBetween(String value1, String value2) {
            addCriterion("is_residential_land not between", value1, value2, "isResidentialLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandIsNull() {
            addCriterion("is_man_service_land is null");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandIsNotNull() {
            addCriterion("is_man_service_land is not null");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandEqualTo(String value) {
            addCriterion("is_man_service_land =", value, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandNotEqualTo(String value) {
            addCriterion("is_man_service_land <>", value, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandGreaterThan(String value) {
            addCriterion("is_man_service_land >", value, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandGreaterThanOrEqualTo(String value) {
            addCriterion("is_man_service_land >=", value, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandLessThan(String value) {
            addCriterion("is_man_service_land <", value, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandLessThanOrEqualTo(String value) {
            addCriterion("is_man_service_land <=", value, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandLike(String value) {
            addCriterion("is_man_service_land like", value, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandNotLike(String value) {
            addCriterion("is_man_service_land not like", value, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandIn(List<String> values) {
            addCriterion("is_man_service_land in", values, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandNotIn(List<String> values) {
            addCriterion("is_man_service_land not in", values, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandBetween(String value1, String value2) {
            addCriterion("is_man_service_land between", value1, value2, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsManServiceLandNotBetween(String value1, String value2) {
            addCriterion("is_man_service_land not between", value1, value2, "isManServiceLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandIsNull() {
            addCriterion("is_business_land is null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandIsNotNull() {
            addCriterion("is_business_land is not null");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandEqualTo(String value) {
            addCriterion("is_business_land =", value, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandNotEqualTo(String value) {
            addCriterion("is_business_land <>", value, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandGreaterThan(String value) {
            addCriterion("is_business_land >", value, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandGreaterThanOrEqualTo(String value) {
            addCriterion("is_business_land >=", value, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandLessThan(String value) {
            addCriterion("is_business_land <", value, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandLessThanOrEqualTo(String value) {
            addCriterion("is_business_land <=", value, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandLike(String value) {
            addCriterion("is_business_land like", value, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandNotLike(String value) {
            addCriterion("is_business_land not like", value, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandIn(List<String> values) {
            addCriterion("is_business_land in", values, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandNotIn(List<String> values) {
            addCriterion("is_business_land not in", values, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandBetween(String value1, String value2) {
            addCriterion("is_business_land between", value1, value2, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsBusinessLandNotBetween(String value1, String value2) {
            addCriterion("is_business_land not between", value1, value2, "isBusinessLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandIsNull() {
            addCriterion("is_industrial_land is null");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandIsNotNull() {
            addCriterion("is_industrial_land is not null");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandEqualTo(String value) {
            addCriterion("is_industrial_land =", value, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandNotEqualTo(String value) {
            addCriterion("is_industrial_land <>", value, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandGreaterThan(String value) {
            addCriterion("is_industrial_land >", value, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandGreaterThanOrEqualTo(String value) {
            addCriterion("is_industrial_land >=", value, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandLessThan(String value) {
            addCriterion("is_industrial_land <", value, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandLessThanOrEqualTo(String value) {
            addCriterion("is_industrial_land <=", value, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandLike(String value) {
            addCriterion("is_industrial_land like", value, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandNotLike(String value) {
            addCriterion("is_industrial_land not like", value, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandIn(List<String> values) {
            addCriterion("is_industrial_land in", values, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandNotIn(List<String> values) {
            addCriterion("is_industrial_land not in", values, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandBetween(String value1, String value2) {
            addCriterion("is_industrial_land between", value1, value2, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsIndustrialLandNotBetween(String value1, String value2) {
            addCriterion("is_industrial_land not between", value1, value2, "isIndustrialLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandIsNull() {
            addCriterion("is_warehousing_land is null");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandIsNotNull() {
            addCriterion("is_warehousing_land is not null");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandEqualTo(String value) {
            addCriterion("is_warehousing_land =", value, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandNotEqualTo(String value) {
            addCriterion("is_warehousing_land <>", value, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandGreaterThan(String value) {
            addCriterion("is_warehousing_land >", value, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandGreaterThanOrEqualTo(String value) {
            addCriterion("is_warehousing_land >=", value, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandLessThan(String value) {
            addCriterion("is_warehousing_land <", value, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandLessThanOrEqualTo(String value) {
            addCriterion("is_warehousing_land <=", value, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandLike(String value) {
            addCriterion("is_warehousing_land like", value, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandNotLike(String value) {
            addCriterion("is_warehousing_land not like", value, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandIn(List<String> values) {
            addCriterion("is_warehousing_land in", values, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandNotIn(List<String> values) {
            addCriterion("is_warehousing_land not in", values, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandBetween(String value1, String value2) {
            addCriterion("is_warehousing_land between", value1, value2, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsWarehousingLandNotBetween(String value1, String value2) {
            addCriterion("is_warehousing_land not between", value1, value2, "isWarehousingLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandIsNull() {
            addCriterion("is_traffic_land is null");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandIsNotNull() {
            addCriterion("is_traffic_land is not null");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandEqualTo(String value) {
            addCriterion("is_traffic_land =", value, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandNotEqualTo(String value) {
            addCriterion("is_traffic_land <>", value, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandGreaterThan(String value) {
            addCriterion("is_traffic_land >", value, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandGreaterThanOrEqualTo(String value) {
            addCriterion("is_traffic_land >=", value, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandLessThan(String value) {
            addCriterion("is_traffic_land <", value, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandLessThanOrEqualTo(String value) {
            addCriterion("is_traffic_land <=", value, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandLike(String value) {
            addCriterion("is_traffic_land like", value, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandNotLike(String value) {
            addCriterion("is_traffic_land not like", value, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandIn(List<String> values) {
            addCriterion("is_traffic_land in", values, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandNotIn(List<String> values) {
            addCriterion("is_traffic_land not in", values, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandBetween(String value1, String value2) {
            addCriterion("is_traffic_land between", value1, value2, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsTrafficLandNotBetween(String value1, String value2) {
            addCriterion("is_traffic_land not between", value1, value2, "isTrafficLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandIsNull() {
            addCriterion("is_public_land is null");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandIsNotNull() {
            addCriterion("is_public_land is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandEqualTo(String value) {
            addCriterion("is_public_land =", value, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandNotEqualTo(String value) {
            addCriterion("is_public_land <>", value, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandGreaterThan(String value) {
            addCriterion("is_public_land >", value, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandGreaterThanOrEqualTo(String value) {
            addCriterion("is_public_land >=", value, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandLessThan(String value) {
            addCriterion("is_public_land <", value, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandLessThanOrEqualTo(String value) {
            addCriterion("is_public_land <=", value, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandLike(String value) {
            addCriterion("is_public_land like", value, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandNotLike(String value) {
            addCriterion("is_public_land not like", value, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandIn(List<String> values) {
            addCriterion("is_public_land in", values, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandNotIn(List<String> values) {
            addCriterion("is_public_land not in", values, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandBetween(String value1, String value2) {
            addCriterion("is_public_land between", value1, value2, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsPublicLandNotBetween(String value1, String value2) {
            addCriterion("is_public_land not between", value1, value2, "isPublicLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandIsNull() {
            addCriterion("is_square_land is null");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandIsNotNull() {
            addCriterion("is_square_land is not null");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandEqualTo(String value) {
            addCriterion("is_square_land =", value, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandNotEqualTo(String value) {
            addCriterion("is_square_land <>", value, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandGreaterThan(String value) {
            addCriterion("is_square_land >", value, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandGreaterThanOrEqualTo(String value) {
            addCriterion("is_square_land >=", value, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandLessThan(String value) {
            addCriterion("is_square_land <", value, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandLessThanOrEqualTo(String value) {
            addCriterion("is_square_land <=", value, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandLike(String value) {
            addCriterion("is_square_land like", value, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandNotLike(String value) {
            addCriterion("is_square_land not like", value, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandIn(List<String> values) {
            addCriterion("is_square_land in", values, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandNotIn(List<String> values) {
            addCriterion("is_square_land not in", values, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandBetween(String value1, String value2) {
            addCriterion("is_square_land between", value1, value2, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andIsSquareLandNotBetween(String value1, String value2) {
            addCriterion("is_square_land not between", value1, value2, "isSquareLand");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceIsNull() {
            addCriterion("apply_advice is null");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceIsNotNull() {
            addCriterion("apply_advice is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceEqualTo(String value) {
            addCriterion("apply_advice =", value, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceNotEqualTo(String value) {
            addCriterion("apply_advice <>", value, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceGreaterThan(String value) {
            addCriterion("apply_advice >", value, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("apply_advice >=", value, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceLessThan(String value) {
            addCriterion("apply_advice <", value, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceLessThanOrEqualTo(String value) {
            addCriterion("apply_advice <=", value, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceLike(String value) {
            addCriterion("apply_advice like", value, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceNotLike(String value) {
            addCriterion("apply_advice not like", value, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceIn(List<String> values) {
            addCriterion("apply_advice in", values, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceNotIn(List<String> values) {
            addCriterion("apply_advice not in", values, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceBetween(String value1, String value2) {
            addCriterion("apply_advice between", value1, value2, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andApplyAdviceNotBetween(String value1, String value2) {
            addCriterion("apply_advice not between", value1, value2, "applyAdvice");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyIsNull() {
            addCriterion("land_gain_company is null");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyIsNotNull() {
            addCriterion("land_gain_company is not null");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyEqualTo(String value) {
            addCriterion("land_gain_company =", value, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyNotEqualTo(String value) {
            addCriterion("land_gain_company <>", value, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyGreaterThan(String value) {
            addCriterion("land_gain_company >", value, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("land_gain_company >=", value, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyLessThan(String value) {
            addCriterion("land_gain_company <", value, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyLessThanOrEqualTo(String value) {
            addCriterion("land_gain_company <=", value, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyLike(String value) {
            addCriterion("land_gain_company like", value, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyNotLike(String value) {
            addCriterion("land_gain_company not like", value, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyIn(List<String> values) {
            addCriterion("land_gain_company in", values, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyNotIn(List<String> values) {
            addCriterion("land_gain_company not in", values, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyBetween(String value1, String value2) {
            addCriterion("land_gain_company between", value1, value2, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyNotBetween(String value1, String value2) {
            addCriterion("land_gain_company not between", value1, value2, "landGainCompany");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtIsNull() {
            addCriterion("land_deal_per_amt is null");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtIsNotNull() {
            addCriterion("land_deal_per_amt is not null");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtEqualTo(Double value) {
            addCriterion("land_deal_per_amt =", value, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtNotEqualTo(Double value) {
            addCriterion("land_deal_per_amt <>", value, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtGreaterThan(Double value) {
            addCriterion("land_deal_per_amt >", value, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("land_deal_per_amt >=", value, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtLessThan(Double value) {
            addCriterion("land_deal_per_amt <", value, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtLessThanOrEqualTo(Double value) {
            addCriterion("land_deal_per_amt <=", value, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtIn(List<Double> values) {
            addCriterion("land_deal_per_amt in", values, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtNotIn(List<Double> values) {
            addCriterion("land_deal_per_amt not in", values, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtBetween(Double value1, Double value2) {
            addCriterion("land_deal_per_amt between", value1, value2, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealPerAmtNotBetween(Double value1, Double value2) {
            addCriterion("land_deal_per_amt not between", value1, value2, "landDealPerAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtIsNull() {
            addCriterion("land_deal_name_amt is null");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtIsNotNull() {
            addCriterion("land_deal_name_amt is not null");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtEqualTo(Double value) {
            addCriterion("land_deal_name_amt =", value, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtNotEqualTo(Double value) {
            addCriterion("land_deal_name_amt <>", value, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtGreaterThan(Double value) {
            addCriterion("land_deal_name_amt >", value, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("land_deal_name_amt >=", value, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtLessThan(Double value) {
            addCriterion("land_deal_name_amt <", value, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtLessThanOrEqualTo(Double value) {
            addCriterion("land_deal_name_amt <=", value, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtIn(List<Double> values) {
            addCriterion("land_deal_name_amt in", values, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtNotIn(List<Double> values) {
            addCriterion("land_deal_name_amt not in", values, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtBetween(Double value1, Double value2) {
            addCriterion("land_deal_name_amt between", value1, value2, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealNameAmtNotBetween(Double value1, Double value2) {
            addCriterion("land_deal_name_amt not between", value1, value2, "landDealNameAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtIsNull() {
            addCriterion("land_deal_amt is null");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtIsNotNull() {
            addCriterion("land_deal_amt is not null");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtEqualTo(Double value) {
            addCriterion("land_deal_amt =", value, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtNotEqualTo(Double value) {
            addCriterion("land_deal_amt <>", value, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtGreaterThan(Double value) {
            addCriterion("land_deal_amt >", value, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("land_deal_amt >=", value, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtLessThan(Double value) {
            addCriterion("land_deal_amt <", value, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtLessThanOrEqualTo(Double value) {
            addCriterion("land_deal_amt <=", value, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtIn(List<Double> values) {
            addCriterion("land_deal_amt in", values, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtNotIn(List<Double> values) {
            addCriterion("land_deal_amt not in", values, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtBetween(Double value1, Double value2) {
            addCriterion("land_deal_amt between", value1, value2, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andLandDealAmtNotBetween(Double value1, Double value2) {
            addCriterion("land_deal_amt not between", value1, value2, "landDealAmt");
            return (Criteria) this;
        }

        public Criteria andCompantCntIsNull() {
            addCriterion("compant_cnt is null");
            return (Criteria) this;
        }

        public Criteria andCompantCntIsNotNull() {
            addCriterion("compant_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andCompantCntEqualTo(Integer value) {
            addCriterion("compant_cnt =", value, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntNotEqualTo(Integer value) {
            addCriterion("compant_cnt <>", value, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntGreaterThan(Integer value) {
            addCriterion("compant_cnt >", value, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("compant_cnt >=", value, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntLessThan(Integer value) {
            addCriterion("compant_cnt <", value, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntLessThanOrEqualTo(Integer value) {
            addCriterion("compant_cnt <=", value, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntIn(List<Integer> values) {
            addCriterion("compant_cnt in", values, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntNotIn(List<Integer> values) {
            addCriterion("compant_cnt not in", values, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntBetween(Integer value1, Integer value2) {
            addCriterion("compant_cnt between", value1, value2, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andCompantCntNotBetween(Integer value1, Integer value2) {
            addCriterion("compant_cnt not between", value1, value2, "compantCnt");
            return (Criteria) this;
        }

        public Criteria andPremiumRateIsNull() {
            addCriterion("premium_rate is null");
            return (Criteria) this;
        }

        public Criteria andPremiumRateIsNotNull() {
            addCriterion("premium_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumRateEqualTo(Double value) {
            addCriterion("premium_rate =", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateNotEqualTo(Double value) {
            addCriterion("premium_rate <>", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateGreaterThan(Double value) {
            addCriterion("premium_rate >", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateGreaterThanOrEqualTo(Double value) {
            addCriterion("premium_rate >=", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateLessThan(Double value) {
            addCriterion("premium_rate <", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateLessThanOrEqualTo(Double value) {
            addCriterion("premium_rate <=", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateIn(List<Double> values) {
            addCriterion("premium_rate in", values, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateNotIn(List<Double> values) {
            addCriterion("premium_rate not in", values, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateBetween(Double value1, Double value2) {
            addCriterion("premium_rate between", value1, value2, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateNotBetween(Double value1, Double value2) {
            addCriterion("premium_rate not between", value1, value2, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusIsNull() {
            addCriterion("acquisition_status is null");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusIsNotNull() {
            addCriterion("acquisition_status is not null");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusEqualTo(String value) {
            addCriterion("acquisition_status =", value, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusNotEqualTo(String value) {
            addCriterion("acquisition_status <>", value, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusGreaterThan(String value) {
            addCriterion("acquisition_status >", value, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("acquisition_status >=", value, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusLessThan(String value) {
            addCriterion("acquisition_status <", value, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusLessThanOrEqualTo(String value) {
            addCriterion("acquisition_status <=", value, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusLike(String value) {
            addCriterion("acquisition_status like", value, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusNotLike(String value) {
            addCriterion("acquisition_status not like", value, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusIn(List<String> values) {
            addCriterion("acquisition_status in", values, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusNotIn(List<String> values) {
            addCriterion("acquisition_status not in", values, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusBetween(String value1, String value2) {
            addCriterion("acquisition_status between", value1, value2, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andAcquisitionStatusNotBetween(String value1, String value2) {
            addCriterion("acquisition_status not between", value1, value2, "acquisitionStatus");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisIsNull() {
            addCriterion("bidding_analysis is null");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisIsNotNull() {
            addCriterion("bidding_analysis is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisEqualTo(String value) {
            addCriterion("bidding_analysis =", value, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisNotEqualTo(String value) {
            addCriterion("bidding_analysis <>", value, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisGreaterThan(String value) {
            addCriterion("bidding_analysis >", value, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("bidding_analysis >=", value, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisLessThan(String value) {
            addCriterion("bidding_analysis <", value, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisLessThanOrEqualTo(String value) {
            addCriterion("bidding_analysis <=", value, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisLike(String value) {
            addCriterion("bidding_analysis like", value, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisNotLike(String value) {
            addCriterion("bidding_analysis not like", value, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisIn(List<String> values) {
            addCriterion("bidding_analysis in", values, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisNotIn(List<String> values) {
            addCriterion("bidding_analysis not in", values, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisBetween(String value1, String value2) {
            addCriterion("bidding_analysis between", value1, value2, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andBiddingAnalysisNotBetween(String value1, String value2) {
            addCriterion("bidding_analysis not between", value1, value2, "biddingAnalysis");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseIsNull() {
            addCriterion("price_advise is null");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseIsNotNull() {
            addCriterion("price_advise is not null");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseEqualTo(String value) {
            addCriterion("price_advise =", value, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseNotEqualTo(String value) {
            addCriterion("price_advise <>", value, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseGreaterThan(String value) {
            addCriterion("price_advise >", value, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseGreaterThanOrEqualTo(String value) {
            addCriterion("price_advise >=", value, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseLessThan(String value) {
            addCriterion("price_advise <", value, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseLessThanOrEqualTo(String value) {
            addCriterion("price_advise <=", value, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseLike(String value) {
            addCriterion("price_advise like", value, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseNotLike(String value) {
            addCriterion("price_advise not like", value, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseIn(List<String> values) {
            addCriterion("price_advise in", values, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseNotIn(List<String> values) {
            addCriterion("price_advise not in", values, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseBetween(String value1, String value2) {
            addCriterion("price_advise between", value1, value2, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAdviseNotBetween(String value1, String value2) {
            addCriterion("price_advise not between", value1, value2, "priceAdvise");
            return (Criteria) this;
        }

        public Criteria andPriceAmtIsNull() {
            addCriterion("price_amt is null");
            return (Criteria) this;
        }

        public Criteria andPriceAmtIsNotNull() {
            addCriterion("price_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPriceAmtEqualTo(String value) {
            addCriterion("price_amt =", value, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtNotEqualTo(String value) {
            addCriterion("price_amt <>", value, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtGreaterThan(String value) {
            addCriterion("price_amt >", value, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtGreaterThanOrEqualTo(String value) {
            addCriterion("price_amt >=", value, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtLessThan(String value) {
            addCriterion("price_amt <", value, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtLessThanOrEqualTo(String value) {
            addCriterion("price_amt <=", value, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtLike(String value) {
            addCriterion("price_amt like", value, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtNotLike(String value) {
            addCriterion("price_amt not like", value, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtIn(List<String> values) {
            addCriterion("price_amt in", values, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtNotIn(List<String> values) {
            addCriterion("price_amt not in", values, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtBetween(String value1, String value2) {
            addCriterion("price_amt between", value1, value2, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andPriceAmtNotBetween(String value1, String value2) {
            addCriterion("price_amt not between", value1, value2, "priceAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtIsNull() {
            addCriterion("final_per_amt is null");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtIsNotNull() {
            addCriterion("final_per_amt is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtEqualTo(String value) {
            addCriterion("final_per_amt =", value, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtNotEqualTo(String value) {
            addCriterion("final_per_amt <>", value, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtGreaterThan(String value) {
            addCriterion("final_per_amt >", value, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtGreaterThanOrEqualTo(String value) {
            addCriterion("final_per_amt >=", value, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtLessThan(String value) {
            addCriterion("final_per_amt <", value, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtLessThanOrEqualTo(String value) {
            addCriterion("final_per_amt <=", value, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtLike(String value) {
            addCriterion("final_per_amt like", value, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtNotLike(String value) {
            addCriterion("final_per_amt not like", value, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtIn(List<String> values) {
            addCriterion("final_per_amt in", values, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtNotIn(List<String> values) {
            addCriterion("final_per_amt not in", values, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtBetween(String value1, String value2) {
            addCriterion("final_per_amt between", value1, value2, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andFinalPerAmtNotBetween(String value1, String value2) {
            addCriterion("final_per_amt not between", value1, value2, "finalPerAmt");
            return (Criteria) this;
        }

        public Criteria andCalculateDescIsNull() {
            addCriterion("calculate_desc is null");
            return (Criteria) this;
        }

        public Criteria andCalculateDescIsNotNull() {
            addCriterion("calculate_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateDescEqualTo(String value) {
            addCriterion("calculate_desc =", value, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescNotEqualTo(String value) {
            addCriterion("calculate_desc <>", value, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescGreaterThan(String value) {
            addCriterion("calculate_desc >", value, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescGreaterThanOrEqualTo(String value) {
            addCriterion("calculate_desc >=", value, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescLessThan(String value) {
            addCriterion("calculate_desc <", value, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescLessThanOrEqualTo(String value) {
            addCriterion("calculate_desc <=", value, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescLike(String value) {
            addCriterion("calculate_desc like", value, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescNotLike(String value) {
            addCriterion("calculate_desc not like", value, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescIn(List<String> values) {
            addCriterion("calculate_desc in", values, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescNotIn(List<String> values) {
            addCriterion("calculate_desc not in", values, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescBetween(String value1, String value2) {
            addCriterion("calculate_desc between", value1, value2, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andCalculateDescNotBetween(String value1, String value2) {
            addCriterion("calculate_desc not between", value1, value2, "calculateDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescIsNull() {
            addCriterion("land_gain_company_desc is null");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescIsNotNull() {
            addCriterion("land_gain_company_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescEqualTo(String value) {
            addCriterion("land_gain_company_desc =", value, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescNotEqualTo(String value) {
            addCriterion("land_gain_company_desc <>", value, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescGreaterThan(String value) {
            addCriterion("land_gain_company_desc >", value, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescGreaterThanOrEqualTo(String value) {
            addCriterion("land_gain_company_desc >=", value, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescLessThan(String value) {
            addCriterion("land_gain_company_desc <", value, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescLessThanOrEqualTo(String value) {
            addCriterion("land_gain_company_desc <=", value, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescLike(String value) {
            addCriterion("land_gain_company_desc like", value, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescNotLike(String value) {
            addCriterion("land_gain_company_desc not like", value, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescIn(List<String> values) {
            addCriterion("land_gain_company_desc in", values, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescNotIn(List<String> values) {
            addCriterion("land_gain_company_desc not in", values, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescBetween(String value1, String value2) {
            addCriterion("land_gain_company_desc between", value1, value2, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andLandGainCompanyDescNotBetween(String value1, String value2) {
            addCriterion("land_gain_company_desc not between", value1, value2, "landGainCompanyDesc");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeIsNull() {
            addCriterion("is_area_change is null");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeIsNotNull() {
            addCriterion("is_area_change is not null");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeEqualTo(String value) {
            addCriterion("is_area_change =", value, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeNotEqualTo(String value) {
            addCriterion("is_area_change <>", value, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeGreaterThan(String value) {
            addCriterion("is_area_change >", value, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeGreaterThanOrEqualTo(String value) {
            addCriterion("is_area_change >=", value, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeLessThan(String value) {
            addCriterion("is_area_change <", value, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeLessThanOrEqualTo(String value) {
            addCriterion("is_area_change <=", value, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeLike(String value) {
            addCriterion("is_area_change like", value, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeNotLike(String value) {
            addCriterion("is_area_change not like", value, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeIn(List<String> values) {
            addCriterion("is_area_change in", values, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeNotIn(List<String> values) {
            addCriterion("is_area_change not in", values, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeBetween(String value1, String value2) {
            addCriterion("is_area_change between", value1, value2, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andIsAreaChangeNotBetween(String value1, String value2) {
            addCriterion("is_area_change not between", value1, value2, "isAreaChange");
            return (Criteria) this;
        }

        public Criteria andLandListDateIsNull() {
            addCriterion("land_list_date is null");
            return (Criteria) this;
        }

        public Criteria andLandListDateIsNotNull() {
            addCriterion("land_list_date is not null");
            return (Criteria) this;
        }

        public Criteria andLandListDateEqualTo(Date value) {
            addCriterion("land_list_date =", value, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateNotEqualTo(Date value) {
            addCriterion("land_list_date <>", value, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateGreaterThan(Date value) {
            addCriterion("land_list_date >", value, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateGreaterThanOrEqualTo(Date value) {
            addCriterion("land_list_date >=", value, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateLessThan(Date value) {
            addCriterion("land_list_date <", value, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateLessThanOrEqualTo(Date value) {
            addCriterion("land_list_date <=", value, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateIn(List<Date> values) {
            addCriterion("land_list_date in", values, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateNotIn(List<Date> values) {
            addCriterion("land_list_date not in", values, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateBetween(Date value1, Date value2) {
            addCriterion("land_list_date between", value1, value2, "landListDate");
            return (Criteria) this;
        }

        public Criteria andLandListDateNotBetween(Date value1, Date value2) {
            addCriterion("land_list_date not between", value1, value2, "landListDate");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdIsNull() {
            addCriterion("app_wf_proc_id is null");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdIsNotNull() {
            addCriterion("app_wf_proc_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdEqualTo(String value) {
            addCriterion("app_wf_proc_id =", value, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdNotEqualTo(String value) {
            addCriterion("app_wf_proc_id <>", value, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdGreaterThan(String value) {
            addCriterion("app_wf_proc_id >", value, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_wf_proc_id >=", value, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdLessThan(String value) {
            addCriterion("app_wf_proc_id <", value, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdLessThanOrEqualTo(String value) {
            addCriterion("app_wf_proc_id <=", value, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdLike(String value) {
            addCriterion("app_wf_proc_id like", value, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdNotLike(String value) {
            addCriterion("app_wf_proc_id not like", value, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdIn(List<String> values) {
            addCriterion("app_wf_proc_id in", values, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdNotIn(List<String> values) {
            addCriterion("app_wf_proc_id not in", values, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdBetween(String value1, String value2) {
            addCriterion("app_wf_proc_id between", value1, value2, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfProcIdNotBetween(String value1, String value2) {
            addCriterion("app_wf_proc_id not between", value1, value2, "appWfProcId");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeIsNull() {
            addCriterion("app_wf_node_code is null");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeIsNotNull() {
            addCriterion("app_wf_node_code is not null");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeEqualTo(String value) {
            addCriterion("app_wf_node_code =", value, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeNotEqualTo(String value) {
            addCriterion("app_wf_node_code <>", value, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeGreaterThan(String value) {
            addCriterion("app_wf_node_code >", value, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("app_wf_node_code >=", value, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeLessThan(String value) {
            addCriterion("app_wf_node_code <", value, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeLessThanOrEqualTo(String value) {
            addCriterion("app_wf_node_code <=", value, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeLike(String value) {
            addCriterion("app_wf_node_code like", value, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeNotLike(String value) {
            addCriterion("app_wf_node_code not like", value, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeIn(List<String> values) {
            addCriterion("app_wf_node_code in", values, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeNotIn(List<String> values) {
            addCriterion("app_wf_node_code not in", values, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeBetween(String value1, String value2) {
            addCriterion("app_wf_node_code between", value1, value2, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeCodeNotBetween(String value1, String value2) {
            addCriterion("app_wf_node_code not between", value1, value2, "appWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeIsNull() {
            addCriterion("app_wf_node is null");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeIsNotNull() {
            addCriterion("app_wf_node is not null");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeEqualTo(String value) {
            addCriterion("app_wf_node =", value, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeNotEqualTo(String value) {
            addCriterion("app_wf_node <>", value, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeGreaterThan(String value) {
            addCriterion("app_wf_node >", value, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeGreaterThanOrEqualTo(String value) {
            addCriterion("app_wf_node >=", value, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeLessThan(String value) {
            addCriterion("app_wf_node <", value, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeLessThanOrEqualTo(String value) {
            addCriterion("app_wf_node <=", value, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeLike(String value) {
            addCriterion("app_wf_node like", value, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeNotLike(String value) {
            addCriterion("app_wf_node not like", value, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeIn(List<String> values) {
            addCriterion("app_wf_node in", values, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeNotIn(List<String> values) {
            addCriterion("app_wf_node not in", values, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeBetween(String value1, String value2) {
            addCriterion("app_wf_node between", value1, value2, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andAppWfNodeNotBetween(String value1, String value2) {
            addCriterion("app_wf_node not between", value1, value2, "appWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdIsNull() {
            addCriterion("price_wf_proc_id is null");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdIsNotNull() {
            addCriterion("price_wf_proc_id is not null");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdEqualTo(String value) {
            addCriterion("price_wf_proc_id =", value, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdNotEqualTo(String value) {
            addCriterion("price_wf_proc_id <>", value, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdGreaterThan(String value) {
            addCriterion("price_wf_proc_id >", value, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdGreaterThanOrEqualTo(String value) {
            addCriterion("price_wf_proc_id >=", value, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdLessThan(String value) {
            addCriterion("price_wf_proc_id <", value, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdLessThanOrEqualTo(String value) {
            addCriterion("price_wf_proc_id <=", value, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdLike(String value) {
            addCriterion("price_wf_proc_id like", value, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdNotLike(String value) {
            addCriterion("price_wf_proc_id not like", value, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdIn(List<String> values) {
            addCriterion("price_wf_proc_id in", values, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdNotIn(List<String> values) {
            addCriterion("price_wf_proc_id not in", values, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdBetween(String value1, String value2) {
            addCriterion("price_wf_proc_id between", value1, value2, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfProcIdNotBetween(String value1, String value2) {
            addCriterion("price_wf_proc_id not between", value1, value2, "priceWfProcId");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeIsNull() {
            addCriterion("price_wf_node is null");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeIsNotNull() {
            addCriterion("price_wf_node is not null");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeEqualTo(String value) {
            addCriterion("price_wf_node =", value, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeNotEqualTo(String value) {
            addCriterion("price_wf_node <>", value, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeGreaterThan(String value) {
            addCriterion("price_wf_node >", value, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeGreaterThanOrEqualTo(String value) {
            addCriterion("price_wf_node >=", value, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeLessThan(String value) {
            addCriterion("price_wf_node <", value, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeLessThanOrEqualTo(String value) {
            addCriterion("price_wf_node <=", value, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeLike(String value) {
            addCriterion("price_wf_node like", value, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeNotLike(String value) {
            addCriterion("price_wf_node not like", value, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeIn(List<String> values) {
            addCriterion("price_wf_node in", values, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeNotIn(List<String> values) {
            addCriterion("price_wf_node not in", values, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeBetween(String value1, String value2) {
            addCriterion("price_wf_node between", value1, value2, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeNotBetween(String value1, String value2) {
            addCriterion("price_wf_node not between", value1, value2, "priceWfNode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeIsNull() {
            addCriterion("price_wf_node_code is null");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeIsNotNull() {
            addCriterion("price_wf_node_code is not null");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeEqualTo(String value) {
            addCriterion("price_wf_node_code =", value, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeNotEqualTo(String value) {
            addCriterion("price_wf_node_code <>", value, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeGreaterThan(String value) {
            addCriterion("price_wf_node_code >", value, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("price_wf_node_code >=", value, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeLessThan(String value) {
            addCriterion("price_wf_node_code <", value, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeLessThanOrEqualTo(String value) {
            addCriterion("price_wf_node_code <=", value, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeLike(String value) {
            addCriterion("price_wf_node_code like", value, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeNotLike(String value) {
            addCriterion("price_wf_node_code not like", value, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeIn(List<String> values) {
            addCriterion("price_wf_node_code in", values, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeNotIn(List<String> values) {
            addCriterion("price_wf_node_code not in", values, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeBetween(String value1, String value2) {
            addCriterion("price_wf_node_code between", value1, value2, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceWfNodeCodeNotBetween(String value1, String value2) {
            addCriterion("price_wf_node_code not between", value1, value2, "priceWfNodeCode");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIsNull() {
            addCriterion("price_status is null");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIsNotNull() {
            addCriterion("price_status is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStatusEqualTo(String value) {
            addCriterion("price_status =", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotEqualTo(String value) {
            addCriterion("price_status <>", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusGreaterThan(String value) {
            addCriterion("price_status >", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("price_status >=", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLessThan(String value) {
            addCriterion("price_status <", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLessThanOrEqualTo(String value) {
            addCriterion("price_status <=", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusLike(String value) {
            addCriterion("price_status like", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotLike(String value) {
            addCriterion("price_status not like", value, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusIn(List<String> values) {
            addCriterion("price_status in", values, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotIn(List<String> values) {
            addCriterion("price_status not in", values, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusBetween(String value1, String value2) {
            addCriterion("price_status between", value1, value2, "priceStatus");
            return (Criteria) this;
        }

        public Criteria andPriceStatusNotBetween(String value1, String value2) {
            addCriterion("price_status not between", value1, value2, "priceStatus");
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

        public Criteria andAttribute10IsNull() {
            addCriterion("attribute10 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute10IsNotNull() {
            addCriterion("attribute10 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute10EqualTo(Double value) {
            addCriterion("attribute10 =", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotEqualTo(Double value) {
            addCriterion("attribute10 <>", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThan(Double value) {
            addCriterion("attribute10 >", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThanOrEqualTo(Double value) {
            addCriterion("attribute10 >=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThan(Double value) {
            addCriterion("attribute10 <", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThanOrEqualTo(Double value) {
            addCriterion("attribute10 <=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10In(List<Double> values) {
            addCriterion("attribute10 in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotIn(List<Double> values) {
            addCriterion("attribute10 not in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Between(Double value1, Double value2) {
            addCriterion("attribute10 between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotBetween(Double value1, Double value2) {
            addCriterion("attribute10 not between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute11IsNull() {
            addCriterion("attribute11 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute11IsNotNull() {
            addCriterion("attribute11 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute11EqualTo(Double value) {
            addCriterion("attribute11 =", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotEqualTo(Double value) {
            addCriterion("attribute11 <>", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11GreaterThan(Double value) {
            addCriterion("attribute11 >", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11GreaterThanOrEqualTo(Double value) {
            addCriterion("attribute11 >=", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11LessThan(Double value) {
            addCriterion("attribute11 <", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11LessThanOrEqualTo(Double value) {
            addCriterion("attribute11 <=", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11In(List<Double> values) {
            addCriterion("attribute11 in", values, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotIn(List<Double> values) {
            addCriterion("attribute11 not in", values, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11Between(Double value1, Double value2) {
            addCriterion("attribute11 between", value1, value2, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotBetween(Double value1, Double value2) {
            addCriterion("attribute11 not between", value1, value2, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute12IsNull() {
            addCriterion("attribute12 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute12IsNotNull() {
            addCriterion("attribute12 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute12EqualTo(Double value) {
            addCriterion("attribute12 =", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotEqualTo(Double value) {
            addCriterion("attribute12 <>", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12GreaterThan(Double value) {
            addCriterion("attribute12 >", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12GreaterThanOrEqualTo(Double value) {
            addCriterion("attribute12 >=", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12LessThan(Double value) {
            addCriterion("attribute12 <", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12LessThanOrEqualTo(Double value) {
            addCriterion("attribute12 <=", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12In(List<Double> values) {
            addCriterion("attribute12 in", values, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotIn(List<Double> values) {
            addCriterion("attribute12 not in", values, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12Between(Double value1, Double value2) {
            addCriterion("attribute12 between", value1, value2, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotBetween(Double value1, Double value2) {
            addCriterion("attribute12 not between", value1, value2, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute13IsNull() {
            addCriterion("attribute13 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute13IsNotNull() {
            addCriterion("attribute13 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute13EqualTo(Double value) {
            addCriterion("attribute13 =", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotEqualTo(Double value) {
            addCriterion("attribute13 <>", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13GreaterThan(Double value) {
            addCriterion("attribute13 >", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13GreaterThanOrEqualTo(Double value) {
            addCriterion("attribute13 >=", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13LessThan(Double value) {
            addCriterion("attribute13 <", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13LessThanOrEqualTo(Double value) {
            addCriterion("attribute13 <=", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13In(List<Double> values) {
            addCriterion("attribute13 in", values, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotIn(List<Double> values) {
            addCriterion("attribute13 not in", values, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13Between(Double value1, Double value2) {
            addCriterion("attribute13 between", value1, value2, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotBetween(Double value1, Double value2) {
            addCriterion("attribute13 not between", value1, value2, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute14IsNull() {
            addCriterion("attribute14 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute14IsNotNull() {
            addCriterion("attribute14 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute14EqualTo(Double value) {
            addCriterion("attribute14 =", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotEqualTo(Double value) {
            addCriterion("attribute14 <>", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14GreaterThan(Double value) {
            addCriterion("attribute14 >", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14GreaterThanOrEqualTo(Double value) {
            addCriterion("attribute14 >=", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14LessThan(Double value) {
            addCriterion("attribute14 <", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14LessThanOrEqualTo(Double value) {
            addCriterion("attribute14 <=", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14In(List<Double> values) {
            addCriterion("attribute14 in", values, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotIn(List<Double> values) {
            addCriterion("attribute14 not in", values, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14Between(Double value1, Double value2) {
            addCriterion("attribute14 between", value1, value2, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotBetween(Double value1, Double value2) {
            addCriterion("attribute14 not between", value1, value2, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute15IsNull() {
            addCriterion("attribute15 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute15IsNotNull() {
            addCriterion("attribute15 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute15EqualTo(Date value) {
            addCriterion("attribute15 =", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotEqualTo(Date value) {
            addCriterion("attribute15 <>", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15GreaterThan(Date value) {
            addCriterion("attribute15 >", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15GreaterThanOrEqualTo(Date value) {
            addCriterion("attribute15 >=", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15LessThan(Date value) {
            addCriterion("attribute15 <", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15LessThanOrEqualTo(Date value) {
            addCriterion("attribute15 <=", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15In(List<Date> values) {
            addCriterion("attribute15 in", values, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotIn(List<Date> values) {
            addCriterion("attribute15 not in", values, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15Between(Date value1, Date value2) {
            addCriterion("attribute15 between", value1, value2, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotBetween(Date value1, Date value2) {
            addCriterion("attribute15 not between", value1, value2, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute16IsNull() {
            addCriterion("attribute16 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute16IsNotNull() {
            addCriterion("attribute16 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute16EqualTo(Date value) {
            addCriterion("attribute16 =", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotEqualTo(Date value) {
            addCriterion("attribute16 <>", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16GreaterThan(Date value) {
            addCriterion("attribute16 >", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16GreaterThanOrEqualTo(Date value) {
            addCriterion("attribute16 >=", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16LessThan(Date value) {
            addCriterion("attribute16 <", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16LessThanOrEqualTo(Date value) {
            addCriterion("attribute16 <=", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16In(List<Date> values) {
            addCriterion("attribute16 in", values, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotIn(List<Date> values) {
            addCriterion("attribute16 not in", values, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16Between(Date value1, Date value2) {
            addCriterion("attribute16 between", value1, value2, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotBetween(Date value1, Date value2) {
            addCriterion("attribute16 not between", value1, value2, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute17IsNull() {
            addCriterion("attribute17 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute17IsNotNull() {
            addCriterion("attribute17 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute17EqualTo(Date value) {
            addCriterion("attribute17 =", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotEqualTo(Date value) {
            addCriterion("attribute17 <>", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17GreaterThan(Date value) {
            addCriterion("attribute17 >", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17GreaterThanOrEqualTo(Date value) {
            addCriterion("attribute17 >=", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17LessThan(Date value) {
            addCriterion("attribute17 <", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17LessThanOrEqualTo(Date value) {
            addCriterion("attribute17 <=", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17In(List<Date> values) {
            addCriterion("attribute17 in", values, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotIn(List<Date> values) {
            addCriterion("attribute17 not in", values, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17Between(Date value1, Date value2) {
            addCriterion("attribute17 between", value1, value2, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotBetween(Date value1, Date value2) {
            addCriterion("attribute17 not between", value1, value2, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute18IsNull() {
            addCriterion("attribute18 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute18IsNotNull() {
            addCriterion("attribute18 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute18EqualTo(Date value) {
            addCriterion("attribute18 =", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotEqualTo(Date value) {
            addCriterion("attribute18 <>", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18GreaterThan(Date value) {
            addCriterion("attribute18 >", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18GreaterThanOrEqualTo(Date value) {
            addCriterion("attribute18 >=", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18LessThan(Date value) {
            addCriterion("attribute18 <", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18LessThanOrEqualTo(Date value) {
            addCriterion("attribute18 <=", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18In(List<Date> values) {
            addCriterion("attribute18 in", values, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotIn(List<Date> values) {
            addCriterion("attribute18 not in", values, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18Between(Date value1, Date value2) {
            addCriterion("attribute18 between", value1, value2, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotBetween(Date value1, Date value2) {
            addCriterion("attribute18 not between", value1, value2, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute19IsNull() {
            addCriterion("attribute19 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute19IsNotNull() {
            addCriterion("attribute19 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute19EqualTo(Date value) {
            addCriterion("attribute19 =", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19NotEqualTo(Date value) {
            addCriterion("attribute19 <>", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19GreaterThan(Date value) {
            addCriterion("attribute19 >", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19GreaterThanOrEqualTo(Date value) {
            addCriterion("attribute19 >=", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19LessThan(Date value) {
            addCriterion("attribute19 <", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19LessThanOrEqualTo(Date value) {
            addCriterion("attribute19 <=", value, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19In(List<Date> values) {
            addCriterion("attribute19 in", values, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19NotIn(List<Date> values) {
            addCriterion("attribute19 not in", values, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19Between(Date value1, Date value2) {
            addCriterion("attribute19 between", value1, value2, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute19NotBetween(Date value1, Date value2) {
            addCriterion("attribute19 not between", value1, value2, "attribute19");
            return (Criteria) this;
        }

        public Criteria andAttribute20IsNull() {
            addCriterion("attribute20 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute20IsNotNull() {
            addCriterion("attribute20 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute20EqualTo(Date value) {
            addCriterion("attribute20 =", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20NotEqualTo(Date value) {
            addCriterion("attribute20 <>", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20GreaterThan(Date value) {
            addCriterion("attribute20 >", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20GreaterThanOrEqualTo(Date value) {
            addCriterion("attribute20 >=", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20LessThan(Date value) {
            addCriterion("attribute20 <", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20LessThanOrEqualTo(Date value) {
            addCriterion("attribute20 <=", value, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20In(List<Date> values) {
            addCriterion("attribute20 in", values, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20NotIn(List<Date> values) {
            addCriterion("attribute20 not in", values, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20Between(Date value1, Date value2) {
            addCriterion("attribute20 between", value1, value2, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute20NotBetween(Date value1, Date value2) {
            addCriterion("attribute20 not between", value1, value2, "attribute20");
            return (Criteria) this;
        }

        public Criteria andAttribute21IsNull() {
            addCriterion("attribute21 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute21IsNotNull() {
            addCriterion("attribute21 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute21EqualTo(String value) {
            addCriterion("attribute21 =", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21NotEqualTo(String value) {
            addCriterion("attribute21 <>", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21GreaterThan(String value) {
            addCriterion("attribute21 >", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21GreaterThanOrEqualTo(String value) {
            addCriterion("attribute21 >=", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21LessThan(String value) {
            addCriterion("attribute21 <", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21LessThanOrEqualTo(String value) {
            addCriterion("attribute21 <=", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21Like(String value) {
            addCriterion("attribute21 like", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21NotLike(String value) {
            addCriterion("attribute21 not like", value, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21In(List<String> values) {
            addCriterion("attribute21 in", values, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21NotIn(List<String> values) {
            addCriterion("attribute21 not in", values, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21Between(String value1, String value2) {
            addCriterion("attribute21 between", value1, value2, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute21NotBetween(String value1, String value2) {
            addCriterion("attribute21 not between", value1, value2, "attribute21");
            return (Criteria) this;
        }

        public Criteria andAttribute22IsNull() {
            addCriterion("attribute22 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute22IsNotNull() {
            addCriterion("attribute22 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute22EqualTo(String value) {
            addCriterion("attribute22 =", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22NotEqualTo(String value) {
            addCriterion("attribute22 <>", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22GreaterThan(String value) {
            addCriterion("attribute22 >", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22GreaterThanOrEqualTo(String value) {
            addCriterion("attribute22 >=", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22LessThan(String value) {
            addCriterion("attribute22 <", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22LessThanOrEqualTo(String value) {
            addCriterion("attribute22 <=", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22Like(String value) {
            addCriterion("attribute22 like", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22NotLike(String value) {
            addCriterion("attribute22 not like", value, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22In(List<String> values) {
            addCriterion("attribute22 in", values, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22NotIn(List<String> values) {
            addCriterion("attribute22 not in", values, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22Between(String value1, String value2) {
            addCriterion("attribute22 between", value1, value2, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute22NotBetween(String value1, String value2) {
            addCriterion("attribute22 not between", value1, value2, "attribute22");
            return (Criteria) this;
        }

        public Criteria andAttribute23IsNull() {
            addCriterion("attribute23 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute23IsNotNull() {
            addCriterion("attribute23 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute23EqualTo(String value) {
            addCriterion("attribute23 =", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23NotEqualTo(String value) {
            addCriterion("attribute23 <>", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23GreaterThan(String value) {
            addCriterion("attribute23 >", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23GreaterThanOrEqualTo(String value) {
            addCriterion("attribute23 >=", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23LessThan(String value) {
            addCriterion("attribute23 <", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23LessThanOrEqualTo(String value) {
            addCriterion("attribute23 <=", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23Like(String value) {
            addCriterion("attribute23 like", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23NotLike(String value) {
            addCriterion("attribute23 not like", value, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23In(List<String> values) {
            addCriterion("attribute23 in", values, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23NotIn(List<String> values) {
            addCriterion("attribute23 not in", values, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23Between(String value1, String value2) {
            addCriterion("attribute23 between", value1, value2, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute23NotBetween(String value1, String value2) {
            addCriterion("attribute23 not between", value1, value2, "attribute23");
            return (Criteria) this;
        }

        public Criteria andAttribute24IsNull() {
            addCriterion("attribute24 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute24IsNotNull() {
            addCriterion("attribute24 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute24EqualTo(String value) {
            addCriterion("attribute24 =", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24NotEqualTo(String value) {
            addCriterion("attribute24 <>", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24GreaterThan(String value) {
            addCriterion("attribute24 >", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24GreaterThanOrEqualTo(String value) {
            addCriterion("attribute24 >=", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24LessThan(String value) {
            addCriterion("attribute24 <", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24LessThanOrEqualTo(String value) {
            addCriterion("attribute24 <=", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24Like(String value) {
            addCriterion("attribute24 like", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24NotLike(String value) {
            addCriterion("attribute24 not like", value, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24In(List<String> values) {
            addCriterion("attribute24 in", values, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24NotIn(List<String> values) {
            addCriterion("attribute24 not in", values, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24Between(String value1, String value2) {
            addCriterion("attribute24 between", value1, value2, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute24NotBetween(String value1, String value2) {
            addCriterion("attribute24 not between", value1, value2, "attribute24");
            return (Criteria) this;
        }

        public Criteria andAttribute25IsNull() {
            addCriterion("attribute25 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute25IsNotNull() {
            addCriterion("attribute25 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute25EqualTo(String value) {
            addCriterion("attribute25 =", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25NotEqualTo(String value) {
            addCriterion("attribute25 <>", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25GreaterThan(String value) {
            addCriterion("attribute25 >", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25GreaterThanOrEqualTo(String value) {
            addCriterion("attribute25 >=", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25LessThan(String value) {
            addCriterion("attribute25 <", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25LessThanOrEqualTo(String value) {
            addCriterion("attribute25 <=", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25Like(String value) {
            addCriterion("attribute25 like", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25NotLike(String value) {
            addCriterion("attribute25 not like", value, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25In(List<String> values) {
            addCriterion("attribute25 in", values, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25NotIn(List<String> values) {
            addCriterion("attribute25 not in", values, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25Between(String value1, String value2) {
            addCriterion("attribute25 between", value1, value2, "attribute25");
            return (Criteria) this;
        }

        public Criteria andAttribute25NotBetween(String value1, String value2) {
            addCriterion("attribute25 not between", value1, value2, "attribute25");
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
     * land_head_his 2018-08-11
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