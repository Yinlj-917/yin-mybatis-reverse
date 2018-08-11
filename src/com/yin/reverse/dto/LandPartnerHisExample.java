package com.yin.reverse.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LandPartnerHisExample {
    /**
     * land_partner_his
     */
    protected String orderByClause;

    /**
     * land_partner_his
     */
    protected boolean distinct;

    /**
     * land_partner_his
     */
    protected List<Criteria> oredCriteria;

    public LandPartnerHisExample() {
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
     * land_partner_his 2018-08-11
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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

        public Criteria andOldParentIdIsNull() {
            addCriterion("old_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andOldParentIdIsNotNull() {
            addCriterion("old_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andOldParentIdEqualTo(Integer value) {
            addCriterion("old_parent_id =", value, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdNotEqualTo(Integer value) {
            addCriterion("old_parent_id <>", value, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdGreaterThan(Integer value) {
            addCriterion("old_parent_id >", value, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("old_parent_id >=", value, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdLessThan(Integer value) {
            addCriterion("old_parent_id <", value, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("old_parent_id <=", value, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdIn(List<Integer> values) {
            addCriterion("old_parent_id in", values, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdNotIn(List<Integer> values) {
            addCriterion("old_parent_id not in", values, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdBetween(Integer value1, Integer value2) {
            addCriterion("old_parent_id between", value1, value2, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andOldParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("old_parent_id not between", value1, value2, "oldParentId");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNull() {
            addCriterion("partner_name is null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNotNull() {
            addCriterion("partner_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameEqualTo(String value) {
            addCriterion("partner_name =", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotEqualTo(String value) {
            addCriterion("partner_name <>", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThan(String value) {
            addCriterion("partner_name >", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("partner_name >=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThan(String value) {
            addCriterion("partner_name <", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThanOrEqualTo(String value) {
            addCriterion("partner_name <=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLike(String value) {
            addCriterion("partner_name like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotLike(String value) {
            addCriterion("partner_name not like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIn(List<String> values) {
            addCriterion("partner_name in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotIn(List<String> values) {
            addCriterion("partner_name not in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameBetween(String value1, String value2) {
            addCriterion("partner_name between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotBetween(String value1, String value2) {
            addCriterion("partner_name not between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeIsNull() {
            addCriterion("partner_type is null");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeIsNotNull() {
            addCriterion("partner_type is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeEqualTo(String value) {
            addCriterion("partner_type =", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeNotEqualTo(String value) {
            addCriterion("partner_type <>", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeGreaterThan(String value) {
            addCriterion("partner_type >", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("partner_type >=", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeLessThan(String value) {
            addCriterion("partner_type <", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeLessThanOrEqualTo(String value) {
            addCriterion("partner_type <=", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeLike(String value) {
            addCriterion("partner_type like", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeNotLike(String value) {
            addCriterion("partner_type not like", value, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeIn(List<String> values) {
            addCriterion("partner_type in", values, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeNotIn(List<String> values) {
            addCriterion("partner_type not in", values, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeBetween(String value1, String value2) {
            addCriterion("partner_type between", value1, value2, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerTypeNotBetween(String value1, String value2) {
            addCriterion("partner_type not between", value1, value2, "partnerType");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateIsNull() {
            addCriterion("partner_equity_rate is null");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateIsNotNull() {
            addCriterion("partner_equity_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateEqualTo(Double value) {
            addCriterion("partner_equity_rate =", value, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateNotEqualTo(Double value) {
            addCriterion("partner_equity_rate <>", value, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateGreaterThan(Double value) {
            addCriterion("partner_equity_rate >", value, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateGreaterThanOrEqualTo(Double value) {
            addCriterion("partner_equity_rate >=", value, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateLessThan(Double value) {
            addCriterion("partner_equity_rate <", value, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateLessThanOrEqualTo(Double value) {
            addCriterion("partner_equity_rate <=", value, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateIn(List<Double> values) {
            addCriterion("partner_equity_rate in", values, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateNotIn(List<Double> values) {
            addCriterion("partner_equity_rate not in", values, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateBetween(Double value1, Double value2) {
            addCriterion("partner_equity_rate between", value1, value2, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andPartnerEquityRateNotBetween(Double value1, Double value2) {
            addCriterion("partner_equity_rate not between", value1, value2, "partnerEquityRate");
            return (Criteria) this;
        }

        public Criteria andIsStockIsNull() {
            addCriterion("is_stock is null");
            return (Criteria) this;
        }

        public Criteria andIsStockIsNotNull() {
            addCriterion("is_stock is not null");
            return (Criteria) this;
        }

        public Criteria andIsStockEqualTo(String value) {
            addCriterion("is_stock =", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockNotEqualTo(String value) {
            addCriterion("is_stock <>", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockGreaterThan(String value) {
            addCriterion("is_stock >", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockGreaterThanOrEqualTo(String value) {
            addCriterion("is_stock >=", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockLessThan(String value) {
            addCriterion("is_stock <", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockLessThanOrEqualTo(String value) {
            addCriterion("is_stock <=", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockLike(String value) {
            addCriterion("is_stock like", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockNotLike(String value) {
            addCriterion("is_stock not like", value, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockIn(List<String> values) {
            addCriterion("is_stock in", values, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockNotIn(List<String> values) {
            addCriterion("is_stock not in", values, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockBetween(String value1, String value2) {
            addCriterion("is_stock between", value1, value2, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsStockNotBetween(String value1, String value2) {
            addCriterion("is_stock not between", value1, value2, "isStock");
            return (Criteria) this;
        }

        public Criteria andIsJoinIsNull() {
            addCriterion("is_join is null");
            return (Criteria) this;
        }

        public Criteria andIsJoinIsNotNull() {
            addCriterion("is_join is not null");
            return (Criteria) this;
        }

        public Criteria andIsJoinEqualTo(String value) {
            addCriterion("is_join =", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinNotEqualTo(String value) {
            addCriterion("is_join <>", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinGreaterThan(String value) {
            addCriterion("is_join >", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinGreaterThanOrEqualTo(String value) {
            addCriterion("is_join >=", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinLessThan(String value) {
            addCriterion("is_join <", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinLessThanOrEqualTo(String value) {
            addCriterion("is_join <=", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinLike(String value) {
            addCriterion("is_join like", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinNotLike(String value) {
            addCriterion("is_join not like", value, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinIn(List<String> values) {
            addCriterion("is_join in", values, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinNotIn(List<String> values) {
            addCriterion("is_join not in", values, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinBetween(String value1, String value2) {
            addCriterion("is_join between", value1, value2, "isJoin");
            return (Criteria) this;
        }

        public Criteria andIsJoinNotBetween(String value1, String value2) {
            addCriterion("is_join not between", value1, value2, "isJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinIsNull() {
            addCriterion("operate_join is null");
            return (Criteria) this;
        }

        public Criteria andOperateJoinIsNotNull() {
            addCriterion("operate_join is not null");
            return (Criteria) this;
        }

        public Criteria andOperateJoinEqualTo(String value) {
            addCriterion("operate_join =", value, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinNotEqualTo(String value) {
            addCriterion("operate_join <>", value, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinGreaterThan(String value) {
            addCriterion("operate_join >", value, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinGreaterThanOrEqualTo(String value) {
            addCriterion("operate_join >=", value, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinLessThan(String value) {
            addCriterion("operate_join <", value, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinLessThanOrEqualTo(String value) {
            addCriterion("operate_join <=", value, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinLike(String value) {
            addCriterion("operate_join like", value, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinNotLike(String value) {
            addCriterion("operate_join not like", value, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinIn(List<String> values) {
            addCriterion("operate_join in", values, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinNotIn(List<String> values) {
            addCriterion("operate_join not in", values, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinBetween(String value1, String value2) {
            addCriterion("operate_join between", value1, value2, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andOperateJoinNotBetween(String value1, String value2) {
            addCriterion("operate_join not between", value1, value2, "operateJoin");
            return (Criteria) this;
        }

        public Criteria andCompanyManageIsNull() {
            addCriterion("company_manage is null");
            return (Criteria) this;
        }

        public Criteria andCompanyManageIsNotNull() {
            addCriterion("company_manage is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyManageEqualTo(String value) {
            addCriterion("company_manage =", value, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageNotEqualTo(String value) {
            addCriterion("company_manage <>", value, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageGreaterThan(String value) {
            addCriterion("company_manage >", value, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageGreaterThanOrEqualTo(String value) {
            addCriterion("company_manage >=", value, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageLessThan(String value) {
            addCriterion("company_manage <", value, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageLessThanOrEqualTo(String value) {
            addCriterion("company_manage <=", value, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageLike(String value) {
            addCriterion("company_manage like", value, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageNotLike(String value) {
            addCriterion("company_manage not like", value, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageIn(List<String> values) {
            addCriterion("company_manage in", values, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageNotIn(List<String> values) {
            addCriterion("company_manage not in", values, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageBetween(String value1, String value2) {
            addCriterion("company_manage between", value1, value2, "companyManage");
            return (Criteria) this;
        }

        public Criteria andCompanyManageNotBetween(String value1, String value2) {
            addCriterion("company_manage not between", value1, value2, "companyManage");
            return (Criteria) this;
        }

        public Criteria andTwoCostIsNull() {
            addCriterion("two_cost is null");
            return (Criteria) this;
        }

        public Criteria andTwoCostIsNotNull() {
            addCriterion("two_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTwoCostEqualTo(String value) {
            addCriterion("two_cost =", value, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostNotEqualTo(String value) {
            addCriterion("two_cost <>", value, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostGreaterThan(String value) {
            addCriterion("two_cost >", value, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostGreaterThanOrEqualTo(String value) {
            addCriterion("two_cost >=", value, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostLessThan(String value) {
            addCriterion("two_cost <", value, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostLessThanOrEqualTo(String value) {
            addCriterion("two_cost <=", value, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostLike(String value) {
            addCriterion("two_cost like", value, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostNotLike(String value) {
            addCriterion("two_cost not like", value, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostIn(List<String> values) {
            addCriterion("two_cost in", values, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostNotIn(List<String> values) {
            addCriterion("two_cost not in", values, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostBetween(String value1, String value2) {
            addCriterion("two_cost between", value1, value2, "twoCost");
            return (Criteria) this;
        }

        public Criteria andTwoCostNotBetween(String value1, String value2) {
            addCriterion("two_cost not between", value1, value2, "twoCost");
            return (Criteria) this;
        }

        public Criteria andPriceManageIsNull() {
            addCriterion("price_manage is null");
            return (Criteria) this;
        }

        public Criteria andPriceManageIsNotNull() {
            addCriterion("price_manage is not null");
            return (Criteria) this;
        }

        public Criteria andPriceManageEqualTo(String value) {
            addCriterion("price_manage =", value, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageNotEqualTo(String value) {
            addCriterion("price_manage <>", value, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageGreaterThan(String value) {
            addCriterion("price_manage >", value, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageGreaterThanOrEqualTo(String value) {
            addCriterion("price_manage >=", value, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageLessThan(String value) {
            addCriterion("price_manage <", value, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageLessThanOrEqualTo(String value) {
            addCriterion("price_manage <=", value, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageLike(String value) {
            addCriterion("price_manage like", value, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageNotLike(String value) {
            addCriterion("price_manage not like", value, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageIn(List<String> values) {
            addCriterion("price_manage in", values, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageNotIn(List<String> values) {
            addCriterion("price_manage not in", values, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageBetween(String value1, String value2) {
            addCriterion("price_manage between", value1, value2, "priceManage");
            return (Criteria) this;
        }

        public Criteria andPriceManageNotBetween(String value1, String value2) {
            addCriterion("price_manage not between", value1, value2, "priceManage");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNull() {
            addCriterion("financing is null");
            return (Criteria) this;
        }

        public Criteria andFinancingIsNotNull() {
            addCriterion("financing is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingEqualTo(Double value) {
            addCriterion("financing =", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotEqualTo(Double value) {
            addCriterion("financing <>", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThan(Double value) {
            addCriterion("financing >", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingGreaterThanOrEqualTo(Double value) {
            addCriterion("financing >=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThan(Double value) {
            addCriterion("financing <", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingLessThanOrEqualTo(Double value) {
            addCriterion("financing <=", value, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingIn(List<Double> values) {
            addCriterion("financing in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotIn(List<Double> values) {
            addCriterion("financing not in", values, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingBetween(Double value1, Double value2) {
            addCriterion("financing between", value1, value2, "financing");
            return (Criteria) this;
        }

        public Criteria andFinancingNotBetween(Double value1, Double value2) {
            addCriterion("financing not between", value1, value2, "financing");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsIsNull() {
            addCriterion("operate_affairs is null");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsIsNotNull() {
            addCriterion("operate_affairs is not null");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsEqualTo(String value) {
            addCriterion("operate_affairs =", value, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsNotEqualTo(String value) {
            addCriterion("operate_affairs <>", value, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsGreaterThan(String value) {
            addCriterion("operate_affairs >", value, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsGreaterThanOrEqualTo(String value) {
            addCriterion("operate_affairs >=", value, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsLessThan(String value) {
            addCriterion("operate_affairs <", value, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsLessThanOrEqualTo(String value) {
            addCriterion("operate_affairs <=", value, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsLike(String value) {
            addCriterion("operate_affairs like", value, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsNotLike(String value) {
            addCriterion("operate_affairs not like", value, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsIn(List<String> values) {
            addCriterion("operate_affairs in", values, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsNotIn(List<String> values) {
            addCriterion("operate_affairs not in", values, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsBetween(String value1, String value2) {
            addCriterion("operate_affairs between", value1, value2, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andOperateAffairsNotBetween(String value1, String value2) {
            addCriterion("operate_affairs not between", value1, value2, "operateAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsIsNull() {
            addCriterion("join_affairs is null");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsIsNotNull() {
            addCriterion("join_affairs is not null");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsEqualTo(String value) {
            addCriterion("join_affairs =", value, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsNotEqualTo(String value) {
            addCriterion("join_affairs <>", value, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsGreaterThan(String value) {
            addCriterion("join_affairs >", value, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsGreaterThanOrEqualTo(String value) {
            addCriterion("join_affairs >=", value, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsLessThan(String value) {
            addCriterion("join_affairs <", value, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsLessThanOrEqualTo(String value) {
            addCriterion("join_affairs <=", value, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsLike(String value) {
            addCriterion("join_affairs like", value, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsNotLike(String value) {
            addCriterion("join_affairs not like", value, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsIn(List<String> values) {
            addCriterion("join_affairs in", values, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsNotIn(List<String> values) {
            addCriterion("join_affairs not in", values, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsBetween(String value1, String value2) {
            addCriterion("join_affairs between", value1, value2, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andJoinAffairsNotBetween(String value1, String value2) {
            addCriterion("join_affairs not between", value1, value2, "joinAffairs");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkIsNull() {
            addCriterion("partner_remark is null");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkIsNotNull() {
            addCriterion("partner_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkEqualTo(String value) {
            addCriterion("partner_remark =", value, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkNotEqualTo(String value) {
            addCriterion("partner_remark <>", value, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkGreaterThan(String value) {
            addCriterion("partner_remark >", value, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("partner_remark >=", value, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkLessThan(String value) {
            addCriterion("partner_remark <", value, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkLessThanOrEqualTo(String value) {
            addCriterion("partner_remark <=", value, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkLike(String value) {
            addCriterion("partner_remark like", value, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkNotLike(String value) {
            addCriterion("partner_remark not like", value, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkIn(List<String> values) {
            addCriterion("partner_remark in", values, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkNotIn(List<String> values) {
            addCriterion("partner_remark not in", values, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkBetween(String value1, String value2) {
            addCriterion("partner_remark between", value1, value2, "partnerRemark");
            return (Criteria) this;
        }

        public Criteria andPartnerRemarkNotBetween(String value1, String value2) {
            addCriterion("partner_remark not between", value1, value2, "partnerRemark");
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

        public Criteria andAttribute10EqualTo(String value) {
            addCriterion("attribute10 =", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotEqualTo(String value) {
            addCriterion("attribute10 <>", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThan(String value) {
            addCriterion("attribute10 >", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10GreaterThanOrEqualTo(String value) {
            addCriterion("attribute10 >=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThan(String value) {
            addCriterion("attribute10 <", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10LessThanOrEqualTo(String value) {
            addCriterion("attribute10 <=", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Like(String value) {
            addCriterion("attribute10 like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotLike(String value) {
            addCriterion("attribute10 not like", value, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10In(List<String> values) {
            addCriterion("attribute10 in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotIn(List<String> values) {
            addCriterion("attribute10 not in", values, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10Between(String value1, String value2) {
            addCriterion("attribute10 between", value1, value2, "attribute10");
            return (Criteria) this;
        }

        public Criteria andAttribute10NotBetween(String value1, String value2) {
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

        public Criteria andAttribute11EqualTo(String value) {
            addCriterion("attribute11 =", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotEqualTo(String value) {
            addCriterion("attribute11 <>", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11GreaterThan(String value) {
            addCriterion("attribute11 >", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11GreaterThanOrEqualTo(String value) {
            addCriterion("attribute11 >=", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11LessThan(String value) {
            addCriterion("attribute11 <", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11LessThanOrEqualTo(String value) {
            addCriterion("attribute11 <=", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11Like(String value) {
            addCriterion("attribute11 like", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotLike(String value) {
            addCriterion("attribute11 not like", value, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11In(List<String> values) {
            addCriterion("attribute11 in", values, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotIn(List<String> values) {
            addCriterion("attribute11 not in", values, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11Between(String value1, String value2) {
            addCriterion("attribute11 between", value1, value2, "attribute11");
            return (Criteria) this;
        }

        public Criteria andAttribute11NotBetween(String value1, String value2) {
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

        public Criteria andAttribute14EqualTo(Date value) {
            addCriterionForJDBCDate("attribute14 =", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotEqualTo(Date value) {
            addCriterionForJDBCDate("attribute14 <>", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14GreaterThan(Date value) {
            addCriterionForJDBCDate("attribute14 >", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attribute14 >=", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14LessThan(Date value) {
            addCriterionForJDBCDate("attribute14 <", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attribute14 <=", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14In(List<Date> values) {
            addCriterionForJDBCDate("attribute14 in", values, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotIn(List<Date> values) {
            addCriterionForJDBCDate("attribute14 not in", values, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14Between(Date value1, Date value2) {
            addCriterionForJDBCDate("attribute14 between", value1, value2, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attribute14 not between", value1, value2, "attribute14");
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
            addCriterionForJDBCDate("attribute15 =", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotEqualTo(Date value) {
            addCriterionForJDBCDate("attribute15 <>", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15GreaterThan(Date value) {
            addCriterionForJDBCDate("attribute15 >", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attribute15 >=", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15LessThan(Date value) {
            addCriterionForJDBCDate("attribute15 <", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attribute15 <=", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15In(List<Date> values) {
            addCriterionForJDBCDate("attribute15 in", values, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotIn(List<Date> values) {
            addCriterionForJDBCDate("attribute15 not in", values, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15Between(Date value1, Date value2) {
            addCriterionForJDBCDate("attribute15 between", value1, value2, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attribute15 not between", value1, value2, "attribute15");
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
     * land_partner_his 2018-08-11
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