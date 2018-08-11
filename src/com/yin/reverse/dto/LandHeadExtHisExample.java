package com.yin.reverse.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LandHeadExtHisExample {
    /**
     * land_head_ext_his
     */
    protected String orderByClause;

    /**
     * land_head_ext_his
     */
    protected boolean distinct;

    /**
     * land_head_ext_his
     */
    protected List<Criteria> oredCriteria;

    public LandHeadExtHisExample() {
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
     * land_head_ext_his 2018-08-11
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

        public Criteria andAdvantageProjectIsNull() {
            addCriterion("advantage_project is null");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectIsNotNull() {
            addCriterion("advantage_project is not null");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectEqualTo(String value) {
            addCriterion("advantage_project =", value, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectNotEqualTo(String value) {
            addCriterion("advantage_project <>", value, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectGreaterThan(String value) {
            addCriterion("advantage_project >", value, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectGreaterThanOrEqualTo(String value) {
            addCriterion("advantage_project >=", value, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectLessThan(String value) {
            addCriterion("advantage_project <", value, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectLessThanOrEqualTo(String value) {
            addCriterion("advantage_project <=", value, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectLike(String value) {
            addCriterion("advantage_project like", value, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectNotLike(String value) {
            addCriterion("advantage_project not like", value, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectIn(List<String> values) {
            addCriterion("advantage_project in", values, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectNotIn(List<String> values) {
            addCriterion("advantage_project not in", values, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectBetween(String value1, String value2) {
            addCriterion("advantage_project between", value1, value2, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andAdvantageProjectNotBetween(String value1, String value2) {
            addCriterion("advantage_project not between", value1, value2, "advantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectIsNull() {
            addCriterion("disadvantage_project is null");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectIsNotNull() {
            addCriterion("disadvantage_project is not null");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectEqualTo(String value) {
            addCriterion("disadvantage_project =", value, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectNotEqualTo(String value) {
            addCriterion("disadvantage_project <>", value, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectGreaterThan(String value) {
            addCriterion("disadvantage_project >", value, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectGreaterThanOrEqualTo(String value) {
            addCriterion("disadvantage_project >=", value, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectLessThan(String value) {
            addCriterion("disadvantage_project <", value, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectLessThanOrEqualTo(String value) {
            addCriterion("disadvantage_project <=", value, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectLike(String value) {
            addCriterion("disadvantage_project like", value, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectNotLike(String value) {
            addCriterion("disadvantage_project not like", value, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectIn(List<String> values) {
            addCriterion("disadvantage_project in", values, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectNotIn(List<String> values) {
            addCriterion("disadvantage_project not in", values, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectBetween(String value1, String value2) {
            addCriterion("disadvantage_project between", value1, value2, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andDisadvantageProjectNotBetween(String value1, String value2) {
            addCriterion("disadvantage_project not between", value1, value2, "disadvantageProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectIsNull() {
            addCriterion("chance_project is null");
            return (Criteria) this;
        }

        public Criteria andChanceProjectIsNotNull() {
            addCriterion("chance_project is not null");
            return (Criteria) this;
        }

        public Criteria andChanceProjectEqualTo(String value) {
            addCriterion("chance_project =", value, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectNotEqualTo(String value) {
            addCriterion("chance_project <>", value, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectGreaterThan(String value) {
            addCriterion("chance_project >", value, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectGreaterThanOrEqualTo(String value) {
            addCriterion("chance_project >=", value, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectLessThan(String value) {
            addCriterion("chance_project <", value, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectLessThanOrEqualTo(String value) {
            addCriterion("chance_project <=", value, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectLike(String value) {
            addCriterion("chance_project like", value, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectNotLike(String value) {
            addCriterion("chance_project not like", value, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectIn(List<String> values) {
            addCriterion("chance_project in", values, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectNotIn(List<String> values) {
            addCriterion("chance_project not in", values, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectBetween(String value1, String value2) {
            addCriterion("chance_project between", value1, value2, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andChanceProjectNotBetween(String value1, String value2) {
            addCriterion("chance_project not between", value1, value2, "chanceProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectIsNull() {
            addCriterion("risk_project is null");
            return (Criteria) this;
        }

        public Criteria andRiskProjectIsNotNull() {
            addCriterion("risk_project is not null");
            return (Criteria) this;
        }

        public Criteria andRiskProjectEqualTo(String value) {
            addCriterion("risk_project =", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectNotEqualTo(String value) {
            addCriterion("risk_project <>", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectGreaterThan(String value) {
            addCriterion("risk_project >", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectGreaterThanOrEqualTo(String value) {
            addCriterion("risk_project >=", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectLessThan(String value) {
            addCriterion("risk_project <", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectLessThanOrEqualTo(String value) {
            addCriterion("risk_project <=", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectLike(String value) {
            addCriterion("risk_project like", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectNotLike(String value) {
            addCriterion("risk_project not like", value, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectIn(List<String> values) {
            addCriterion("risk_project in", values, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectNotIn(List<String> values) {
            addCriterion("risk_project not in", values, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectBetween(String value1, String value2) {
            addCriterion("risk_project between", value1, value2, "riskProject");
            return (Criteria) this;
        }

        public Criteria andRiskProjectNotBetween(String value1, String value2) {
            addCriterion("risk_project not between", value1, value2, "riskProject");
            return (Criteria) this;
        }

        public Criteria andEastIsNull() {
            addCriterion("east is null");
            return (Criteria) this;
        }

        public Criteria andEastIsNotNull() {
            addCriterion("east is not null");
            return (Criteria) this;
        }

        public Criteria andEastEqualTo(String value) {
            addCriterion("east =", value, "east");
            return (Criteria) this;
        }

        public Criteria andEastNotEqualTo(String value) {
            addCriterion("east <>", value, "east");
            return (Criteria) this;
        }

        public Criteria andEastGreaterThan(String value) {
            addCriterion("east >", value, "east");
            return (Criteria) this;
        }

        public Criteria andEastGreaterThanOrEqualTo(String value) {
            addCriterion("east >=", value, "east");
            return (Criteria) this;
        }

        public Criteria andEastLessThan(String value) {
            addCriterion("east <", value, "east");
            return (Criteria) this;
        }

        public Criteria andEastLessThanOrEqualTo(String value) {
            addCriterion("east <=", value, "east");
            return (Criteria) this;
        }

        public Criteria andEastLike(String value) {
            addCriterion("east like", value, "east");
            return (Criteria) this;
        }

        public Criteria andEastNotLike(String value) {
            addCriterion("east not like", value, "east");
            return (Criteria) this;
        }

        public Criteria andEastIn(List<String> values) {
            addCriterion("east in", values, "east");
            return (Criteria) this;
        }

        public Criteria andEastNotIn(List<String> values) {
            addCriterion("east not in", values, "east");
            return (Criteria) this;
        }

        public Criteria andEastBetween(String value1, String value2) {
            addCriterion("east between", value1, value2, "east");
            return (Criteria) this;
        }

        public Criteria andEastNotBetween(String value1, String value2) {
            addCriterion("east not between", value1, value2, "east");
            return (Criteria) this;
        }

        public Criteria andWestIsNull() {
            addCriterion("west is null");
            return (Criteria) this;
        }

        public Criteria andWestIsNotNull() {
            addCriterion("west is not null");
            return (Criteria) this;
        }

        public Criteria andWestEqualTo(String value) {
            addCriterion("west =", value, "west");
            return (Criteria) this;
        }

        public Criteria andWestNotEqualTo(String value) {
            addCriterion("west <>", value, "west");
            return (Criteria) this;
        }

        public Criteria andWestGreaterThan(String value) {
            addCriterion("west >", value, "west");
            return (Criteria) this;
        }

        public Criteria andWestGreaterThanOrEqualTo(String value) {
            addCriterion("west >=", value, "west");
            return (Criteria) this;
        }

        public Criteria andWestLessThan(String value) {
            addCriterion("west <", value, "west");
            return (Criteria) this;
        }

        public Criteria andWestLessThanOrEqualTo(String value) {
            addCriterion("west <=", value, "west");
            return (Criteria) this;
        }

        public Criteria andWestLike(String value) {
            addCriterion("west like", value, "west");
            return (Criteria) this;
        }

        public Criteria andWestNotLike(String value) {
            addCriterion("west not like", value, "west");
            return (Criteria) this;
        }

        public Criteria andWestIn(List<String> values) {
            addCriterion("west in", values, "west");
            return (Criteria) this;
        }

        public Criteria andWestNotIn(List<String> values) {
            addCriterion("west not in", values, "west");
            return (Criteria) this;
        }

        public Criteria andWestBetween(String value1, String value2) {
            addCriterion("west between", value1, value2, "west");
            return (Criteria) this;
        }

        public Criteria andWestNotBetween(String value1, String value2) {
            addCriterion("west not between", value1, value2, "west");
            return (Criteria) this;
        }

        public Criteria andSouthIsNull() {
            addCriterion("south is null");
            return (Criteria) this;
        }

        public Criteria andSouthIsNotNull() {
            addCriterion("south is not null");
            return (Criteria) this;
        }

        public Criteria andSouthEqualTo(String value) {
            addCriterion("south =", value, "south");
            return (Criteria) this;
        }

        public Criteria andSouthNotEqualTo(String value) {
            addCriterion("south <>", value, "south");
            return (Criteria) this;
        }

        public Criteria andSouthGreaterThan(String value) {
            addCriterion("south >", value, "south");
            return (Criteria) this;
        }

        public Criteria andSouthGreaterThanOrEqualTo(String value) {
            addCriterion("south >=", value, "south");
            return (Criteria) this;
        }

        public Criteria andSouthLessThan(String value) {
            addCriterion("south <", value, "south");
            return (Criteria) this;
        }

        public Criteria andSouthLessThanOrEqualTo(String value) {
            addCriterion("south <=", value, "south");
            return (Criteria) this;
        }

        public Criteria andSouthLike(String value) {
            addCriterion("south like", value, "south");
            return (Criteria) this;
        }

        public Criteria andSouthNotLike(String value) {
            addCriterion("south not like", value, "south");
            return (Criteria) this;
        }

        public Criteria andSouthIn(List<String> values) {
            addCriterion("south in", values, "south");
            return (Criteria) this;
        }

        public Criteria andSouthNotIn(List<String> values) {
            addCriterion("south not in", values, "south");
            return (Criteria) this;
        }

        public Criteria andSouthBetween(String value1, String value2) {
            addCriterion("south between", value1, value2, "south");
            return (Criteria) this;
        }

        public Criteria andSouthNotBetween(String value1, String value2) {
            addCriterion("south not between", value1, value2, "south");
            return (Criteria) this;
        }

        public Criteria andNorthIsNull() {
            addCriterion("north is null");
            return (Criteria) this;
        }

        public Criteria andNorthIsNotNull() {
            addCriterion("north is not null");
            return (Criteria) this;
        }

        public Criteria andNorthEqualTo(String value) {
            addCriterion("north =", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthNotEqualTo(String value) {
            addCriterion("north <>", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthGreaterThan(String value) {
            addCriterion("north >", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthGreaterThanOrEqualTo(String value) {
            addCriterion("north >=", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthLessThan(String value) {
            addCriterion("north <", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthLessThanOrEqualTo(String value) {
            addCriterion("north <=", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthLike(String value) {
            addCriterion("north like", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthNotLike(String value) {
            addCriterion("north not like", value, "north");
            return (Criteria) this;
        }

        public Criteria andNorthIn(List<String> values) {
            addCriterion("north in", values, "north");
            return (Criteria) this;
        }

        public Criteria andNorthNotIn(List<String> values) {
            addCriterion("north not in", values, "north");
            return (Criteria) this;
        }

        public Criteria andNorthBetween(String value1, String value2) {
            addCriterion("north between", value1, value2, "north");
            return (Criteria) this;
        }

        public Criteria andNorthNotBetween(String value1, String value2) {
            addCriterion("north not between", value1, value2, "north");
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

        public Criteria andIsCommitPartnerInfoIsNull() {
            addCriterion("is_commit_partner_info is null");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoIsNotNull() {
            addCriterion("is_commit_partner_info is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoEqualTo(String value) {
            addCriterion("is_commit_partner_info =", value, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoNotEqualTo(String value) {
            addCriterion("is_commit_partner_info <>", value, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoGreaterThan(String value) {
            addCriterion("is_commit_partner_info >", value, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("is_commit_partner_info >=", value, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoLessThan(String value) {
            addCriterion("is_commit_partner_info <", value, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoLessThanOrEqualTo(String value) {
            addCriterion("is_commit_partner_info <=", value, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoLike(String value) {
            addCriterion("is_commit_partner_info like", value, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoNotLike(String value) {
            addCriterion("is_commit_partner_info not like", value, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoIn(List<String> values) {
            addCriterion("is_commit_partner_info in", values, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoNotIn(List<String> values) {
            addCriterion("is_commit_partner_info not in", values, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoBetween(String value1, String value2) {
            addCriterion("is_commit_partner_info between", value1, value2, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsCommitPartnerInfoNotBetween(String value1, String value2) {
            addCriterion("is_commit_partner_info not between", value1, value2, "isCommitPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoIsNull() {
            addCriterion("is_approvaled_partner_info is null");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoIsNotNull() {
            addCriterion("is_approvaled_partner_info is not null");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoEqualTo(String value) {
            addCriterion("is_approvaled_partner_info =", value, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoNotEqualTo(String value) {
            addCriterion("is_approvaled_partner_info <>", value, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoGreaterThan(String value) {
            addCriterion("is_approvaled_partner_info >", value, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("is_approvaled_partner_info >=", value, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoLessThan(String value) {
            addCriterion("is_approvaled_partner_info <", value, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoLessThanOrEqualTo(String value) {
            addCriterion("is_approvaled_partner_info <=", value, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoLike(String value) {
            addCriterion("is_approvaled_partner_info like", value, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoNotLike(String value) {
            addCriterion("is_approvaled_partner_info not like", value, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoIn(List<String> values) {
            addCriterion("is_approvaled_partner_info in", values, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoNotIn(List<String> values) {
            addCriterion("is_approvaled_partner_info not in", values, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoBetween(String value1, String value2) {
            addCriterion("is_approvaled_partner_info between", value1, value2, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsApprovaledPartnerInfoNotBetween(String value1, String value2) {
            addCriterion("is_approvaled_partner_info not between", value1, value2, "isApprovaledPartnerInfo");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitIsNull() {
            addCriterion("is_pricing_commit is null");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitIsNotNull() {
            addCriterion("is_pricing_commit is not null");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitEqualTo(String value) {
            addCriterion("is_pricing_commit =", value, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitNotEqualTo(String value) {
            addCriterion("is_pricing_commit <>", value, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitGreaterThan(String value) {
            addCriterion("is_pricing_commit >", value, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitGreaterThanOrEqualTo(String value) {
            addCriterion("is_pricing_commit >=", value, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitLessThan(String value) {
            addCriterion("is_pricing_commit <", value, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitLessThanOrEqualTo(String value) {
            addCriterion("is_pricing_commit <=", value, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitLike(String value) {
            addCriterion("is_pricing_commit like", value, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitNotLike(String value) {
            addCriterion("is_pricing_commit not like", value, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitIn(List<String> values) {
            addCriterion("is_pricing_commit in", values, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitNotIn(List<String> values) {
            addCriterion("is_pricing_commit not in", values, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitBetween(String value1, String value2) {
            addCriterion("is_pricing_commit between", value1, value2, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsPricingCommitNotBetween(String value1, String value2) {
            addCriterion("is_pricing_commit not between", value1, value2, "isPricingCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitIsNull() {
            addCriterion("is_project_commit is null");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitIsNotNull() {
            addCriterion("is_project_commit is not null");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitEqualTo(String value) {
            addCriterion("is_project_commit =", value, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitNotEqualTo(String value) {
            addCriterion("is_project_commit <>", value, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitGreaterThan(String value) {
            addCriterion("is_project_commit >", value, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitGreaterThanOrEqualTo(String value) {
            addCriterion("is_project_commit >=", value, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitLessThan(String value) {
            addCriterion("is_project_commit <", value, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitLessThanOrEqualTo(String value) {
            addCriterion("is_project_commit <=", value, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitLike(String value) {
            addCriterion("is_project_commit like", value, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitNotLike(String value) {
            addCriterion("is_project_commit not like", value, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitIn(List<String> values) {
            addCriterion("is_project_commit in", values, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitNotIn(List<String> values) {
            addCriterion("is_project_commit not in", values, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitBetween(String value1, String value2) {
            addCriterion("is_project_commit between", value1, value2, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andIsProjectCommitNotBetween(String value1, String value2) {
            addCriterion("is_project_commit not between", value1, value2, "isProjectCommit");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("process_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("process_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(String value) {
            addCriterion("process_instance_id =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(String value) {
            addCriterion("process_instance_id <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(String value) {
            addCriterion("process_instance_id >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_instance_id >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(String value) {
            addCriterion("process_instance_id <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("process_instance_id <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLike(String value) {
            addCriterion("process_instance_id like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotLike(String value) {
            addCriterion("process_instance_id not like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<String> values) {
            addCriterion("process_instance_id in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<String> values) {
            addCriterion("process_instance_id not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(String value1, String value2) {
            addCriterion("process_instance_id between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(String value1, String value2) {
            addCriterion("process_instance_id not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeIsNull() {
            addCriterion("process_instance_code is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeIsNotNull() {
            addCriterion("process_instance_code is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeEqualTo(String value) {
            addCriterion("process_instance_code =", value, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeNotEqualTo(String value) {
            addCriterion("process_instance_code <>", value, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeGreaterThan(String value) {
            addCriterion("process_instance_code >", value, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("process_instance_code >=", value, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeLessThan(String value) {
            addCriterion("process_instance_code <", value, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeLessThanOrEqualTo(String value) {
            addCriterion("process_instance_code <=", value, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeLike(String value) {
            addCriterion("process_instance_code like", value, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeNotLike(String value) {
            addCriterion("process_instance_code not like", value, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeIn(List<String> values) {
            addCriterion("process_instance_code in", values, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeNotIn(List<String> values) {
            addCriterion("process_instance_code not in", values, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeBetween(String value1, String value2) {
            addCriterion("process_instance_code between", value1, value2, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceCodeNotBetween(String value1, String value2) {
            addCriterion("process_instance_code not between", value1, value2, "processInstanceCode");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameIsNull() {
            addCriterion("process_instance_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameIsNotNull() {
            addCriterion("process_instance_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameEqualTo(String value) {
            addCriterion("process_instance_name =", value, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameNotEqualTo(String value) {
            addCriterion("process_instance_name <>", value, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameGreaterThan(String value) {
            addCriterion("process_instance_name >", value, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_instance_name >=", value, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameLessThan(String value) {
            addCriterion("process_instance_name <", value, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameLessThanOrEqualTo(String value) {
            addCriterion("process_instance_name <=", value, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameLike(String value) {
            addCriterion("process_instance_name like", value, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameNotLike(String value) {
            addCriterion("process_instance_name not like", value, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameIn(List<String> values) {
            addCriterion("process_instance_name in", values, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameNotIn(List<String> values) {
            addCriterion("process_instance_name not in", values, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameBetween(String value1, String value2) {
            addCriterion("process_instance_name between", value1, value2, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceNameNotBetween(String value1, String value2) {
            addCriterion("process_instance_name not between", value1, value2, "processInstanceName");
            return (Criteria) this;
        }

        public Criteria andProjectRegionIsNull() {
            addCriterion("project_region is null");
            return (Criteria) this;
        }

        public Criteria andProjectRegionIsNotNull() {
            addCriterion("project_region is not null");
            return (Criteria) this;
        }

        public Criteria andProjectRegionEqualTo(String value) {
            addCriterion("project_region =", value, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionNotEqualTo(String value) {
            addCriterion("project_region <>", value, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionGreaterThan(String value) {
            addCriterion("project_region >", value, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionGreaterThanOrEqualTo(String value) {
            addCriterion("project_region >=", value, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionLessThan(String value) {
            addCriterion("project_region <", value, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionLessThanOrEqualTo(String value) {
            addCriterion("project_region <=", value, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionLike(String value) {
            addCriterion("project_region like", value, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionNotLike(String value) {
            addCriterion("project_region not like", value, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionIn(List<String> values) {
            addCriterion("project_region in", values, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionNotIn(List<String> values) {
            addCriterion("project_region not in", values, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionBetween(String value1, String value2) {
            addCriterion("project_region between", value1, value2, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectRegionNotBetween(String value1, String value2) {
            addCriterion("project_region not between", value1, value2, "projectRegion");
            return (Criteria) this;
        }

        public Criteria andProjectCenterIsNull() {
            addCriterion("project_center is null");
            return (Criteria) this;
        }

        public Criteria andProjectCenterIsNotNull() {
            addCriterion("project_center is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCenterEqualTo(String value) {
            addCriterion("project_center =", value, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterNotEqualTo(String value) {
            addCriterion("project_center <>", value, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterGreaterThan(String value) {
            addCriterion("project_center >", value, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterGreaterThanOrEqualTo(String value) {
            addCriterion("project_center >=", value, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterLessThan(String value) {
            addCriterion("project_center <", value, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterLessThanOrEqualTo(String value) {
            addCriterion("project_center <=", value, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterLike(String value) {
            addCriterion("project_center like", value, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterNotLike(String value) {
            addCriterion("project_center not like", value, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterIn(List<String> values) {
            addCriterion("project_center in", values, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterNotIn(List<String> values) {
            addCriterion("project_center not in", values, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterBetween(String value1, String value2) {
            addCriterion("project_center between", value1, value2, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectCenterNotBetween(String value1, String value2) {
            addCriterion("project_center not between", value1, value2, "projectCenter");
            return (Criteria) this;
        }

        public Criteria andProjectEbmIsNull() {
            addCriterion("project_ebm is null");
            return (Criteria) this;
        }

        public Criteria andProjectEbmIsNotNull() {
            addCriterion("project_ebm is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEbmEqualTo(String value) {
            addCriterion("project_ebm =", value, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmNotEqualTo(String value) {
            addCriterion("project_ebm <>", value, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmGreaterThan(String value) {
            addCriterion("project_ebm >", value, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmGreaterThanOrEqualTo(String value) {
            addCriterion("project_ebm >=", value, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmLessThan(String value) {
            addCriterion("project_ebm <", value, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmLessThanOrEqualTo(String value) {
            addCriterion("project_ebm <=", value, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmLike(String value) {
            addCriterion("project_ebm like", value, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmNotLike(String value) {
            addCriterion("project_ebm not like", value, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmIn(List<String> values) {
            addCriterion("project_ebm in", values, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmNotIn(List<String> values) {
            addCriterion("project_ebm not in", values, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmBetween(String value1, String value2) {
            addCriterion("project_ebm between", value1, value2, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andProjectEbmNotBetween(String value1, String value2) {
            addCriterion("project_ebm not between", value1, value2, "projectEbm");
            return (Criteria) this;
        }

        public Criteria andPricingRegionIsNull() {
            addCriterion("pricing_region is null");
            return (Criteria) this;
        }

        public Criteria andPricingRegionIsNotNull() {
            addCriterion("pricing_region is not null");
            return (Criteria) this;
        }

        public Criteria andPricingRegionEqualTo(String value) {
            addCriterion("pricing_region =", value, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionNotEqualTo(String value) {
            addCriterion("pricing_region <>", value, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionGreaterThan(String value) {
            addCriterion("pricing_region >", value, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionGreaterThanOrEqualTo(String value) {
            addCriterion("pricing_region >=", value, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionLessThan(String value) {
            addCriterion("pricing_region <", value, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionLessThanOrEqualTo(String value) {
            addCriterion("pricing_region <=", value, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionLike(String value) {
            addCriterion("pricing_region like", value, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionNotLike(String value) {
            addCriterion("pricing_region not like", value, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionIn(List<String> values) {
            addCriterion("pricing_region in", values, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionNotIn(List<String> values) {
            addCriterion("pricing_region not in", values, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionBetween(String value1, String value2) {
            addCriterion("pricing_region between", value1, value2, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingRegionNotBetween(String value1, String value2) {
            addCriterion("pricing_region not between", value1, value2, "pricingRegion");
            return (Criteria) this;
        }

        public Criteria andPricingCenterIsNull() {
            addCriterion("pricing_center is null");
            return (Criteria) this;
        }

        public Criteria andPricingCenterIsNotNull() {
            addCriterion("pricing_center is not null");
            return (Criteria) this;
        }

        public Criteria andPricingCenterEqualTo(String value) {
            addCriterion("pricing_center =", value, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterNotEqualTo(String value) {
            addCriterion("pricing_center <>", value, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterGreaterThan(String value) {
            addCriterion("pricing_center >", value, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterGreaterThanOrEqualTo(String value) {
            addCriterion("pricing_center >=", value, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterLessThan(String value) {
            addCriterion("pricing_center <", value, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterLessThanOrEqualTo(String value) {
            addCriterion("pricing_center <=", value, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterLike(String value) {
            addCriterion("pricing_center like", value, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterNotLike(String value) {
            addCriterion("pricing_center not like", value, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterIn(List<String> values) {
            addCriterion("pricing_center in", values, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterNotIn(List<String> values) {
            addCriterion("pricing_center not in", values, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterBetween(String value1, String value2) {
            addCriterion("pricing_center between", value1, value2, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingCenterNotBetween(String value1, String value2) {
            addCriterion("pricing_center not between", value1, value2, "pricingCenter");
            return (Criteria) this;
        }

        public Criteria andPricingEbmIsNull() {
            addCriterion("pricing_ebm is null");
            return (Criteria) this;
        }

        public Criteria andPricingEbmIsNotNull() {
            addCriterion("pricing_ebm is not null");
            return (Criteria) this;
        }

        public Criteria andPricingEbmEqualTo(String value) {
            addCriterion("pricing_ebm =", value, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmNotEqualTo(String value) {
            addCriterion("pricing_ebm <>", value, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmGreaterThan(String value) {
            addCriterion("pricing_ebm >", value, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmGreaterThanOrEqualTo(String value) {
            addCriterion("pricing_ebm >=", value, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmLessThan(String value) {
            addCriterion("pricing_ebm <", value, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmLessThanOrEqualTo(String value) {
            addCriterion("pricing_ebm <=", value, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmLike(String value) {
            addCriterion("pricing_ebm like", value, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmNotLike(String value) {
            addCriterion("pricing_ebm not like", value, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmIn(List<String> values) {
            addCriterion("pricing_ebm in", values, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmNotIn(List<String> values) {
            addCriterion("pricing_ebm not in", values, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmBetween(String value1, String value2) {
            addCriterion("pricing_ebm between", value1, value2, "pricingEbm");
            return (Criteria) this;
        }

        public Criteria andPricingEbmNotBetween(String value1, String value2) {
            addCriterion("pricing_ebm not between", value1, value2, "pricingEbm");
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

        public Criteria andAttribute12EqualTo(String value) {
            addCriterion("attribute12 =", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotEqualTo(String value) {
            addCriterion("attribute12 <>", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12GreaterThan(String value) {
            addCriterion("attribute12 >", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12GreaterThanOrEqualTo(String value) {
            addCriterion("attribute12 >=", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12LessThan(String value) {
            addCriterion("attribute12 <", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12LessThanOrEqualTo(String value) {
            addCriterion("attribute12 <=", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12Like(String value) {
            addCriterion("attribute12 like", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotLike(String value) {
            addCriterion("attribute12 not like", value, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12In(List<String> values) {
            addCriterion("attribute12 in", values, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotIn(List<String> values) {
            addCriterion("attribute12 not in", values, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12Between(String value1, String value2) {
            addCriterion("attribute12 between", value1, value2, "attribute12");
            return (Criteria) this;
        }

        public Criteria andAttribute12NotBetween(String value1, String value2) {
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

        public Criteria andAttribute13EqualTo(String value) {
            addCriterion("attribute13 =", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotEqualTo(String value) {
            addCriterion("attribute13 <>", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13GreaterThan(String value) {
            addCriterion("attribute13 >", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13GreaterThanOrEqualTo(String value) {
            addCriterion("attribute13 >=", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13LessThan(String value) {
            addCriterion("attribute13 <", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13LessThanOrEqualTo(String value) {
            addCriterion("attribute13 <=", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13Like(String value) {
            addCriterion("attribute13 like", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotLike(String value) {
            addCriterion("attribute13 not like", value, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13In(List<String> values) {
            addCriterion("attribute13 in", values, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotIn(List<String> values) {
            addCriterion("attribute13 not in", values, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13Between(String value1, String value2) {
            addCriterion("attribute13 between", value1, value2, "attribute13");
            return (Criteria) this;
        }

        public Criteria andAttribute13NotBetween(String value1, String value2) {
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

        public Criteria andAttribute14EqualTo(String value) {
            addCriterion("attribute14 =", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotEqualTo(String value) {
            addCriterion("attribute14 <>", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14GreaterThan(String value) {
            addCriterion("attribute14 >", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14GreaterThanOrEqualTo(String value) {
            addCriterion("attribute14 >=", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14LessThan(String value) {
            addCriterion("attribute14 <", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14LessThanOrEqualTo(String value) {
            addCriterion("attribute14 <=", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14Like(String value) {
            addCriterion("attribute14 like", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotLike(String value) {
            addCriterion("attribute14 not like", value, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14In(List<String> values) {
            addCriterion("attribute14 in", values, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotIn(List<String> values) {
            addCriterion("attribute14 not in", values, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14Between(String value1, String value2) {
            addCriterion("attribute14 between", value1, value2, "attribute14");
            return (Criteria) this;
        }

        public Criteria andAttribute14NotBetween(String value1, String value2) {
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

        public Criteria andAttribute15EqualTo(String value) {
            addCriterion("attribute15 =", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotEqualTo(String value) {
            addCriterion("attribute15 <>", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15GreaterThan(String value) {
            addCriterion("attribute15 >", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15GreaterThanOrEqualTo(String value) {
            addCriterion("attribute15 >=", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15LessThan(String value) {
            addCriterion("attribute15 <", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15LessThanOrEqualTo(String value) {
            addCriterion("attribute15 <=", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15Like(String value) {
            addCriterion("attribute15 like", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotLike(String value) {
            addCriterion("attribute15 not like", value, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15In(List<String> values) {
            addCriterion("attribute15 in", values, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotIn(List<String> values) {
            addCriterion("attribute15 not in", values, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15Between(String value1, String value2) {
            addCriterion("attribute15 between", value1, value2, "attribute15");
            return (Criteria) this;
        }

        public Criteria andAttribute15NotBetween(String value1, String value2) {
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

        public Criteria andAttribute16EqualTo(Double value) {
            addCriterion("attribute16 =", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotEqualTo(Double value) {
            addCriterion("attribute16 <>", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16GreaterThan(Double value) {
            addCriterion("attribute16 >", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16GreaterThanOrEqualTo(Double value) {
            addCriterion("attribute16 >=", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16LessThan(Double value) {
            addCriterion("attribute16 <", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16LessThanOrEqualTo(Double value) {
            addCriterion("attribute16 <=", value, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16In(List<Double> values) {
            addCriterion("attribute16 in", values, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotIn(List<Double> values) {
            addCriterion("attribute16 not in", values, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16Between(Double value1, Double value2) {
            addCriterion("attribute16 between", value1, value2, "attribute16");
            return (Criteria) this;
        }

        public Criteria andAttribute16NotBetween(Double value1, Double value2) {
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

        public Criteria andAttribute17EqualTo(Double value) {
            addCriterion("attribute17 =", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotEqualTo(Double value) {
            addCriterion("attribute17 <>", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17GreaterThan(Double value) {
            addCriterion("attribute17 >", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17GreaterThanOrEqualTo(Double value) {
            addCriterion("attribute17 >=", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17LessThan(Double value) {
            addCriterion("attribute17 <", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17LessThanOrEqualTo(Double value) {
            addCriterion("attribute17 <=", value, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17In(List<Double> values) {
            addCriterion("attribute17 in", values, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotIn(List<Double> values) {
            addCriterion("attribute17 not in", values, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17Between(Double value1, Double value2) {
            addCriterion("attribute17 between", value1, value2, "attribute17");
            return (Criteria) this;
        }

        public Criteria andAttribute17NotBetween(Double value1, Double value2) {
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
            addCriterionForJDBCDate("attribute18 =", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotEqualTo(Date value) {
            addCriterionForJDBCDate("attribute18 <>", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18GreaterThan(Date value) {
            addCriterionForJDBCDate("attribute18 >", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attribute18 >=", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18LessThan(Date value) {
            addCriterionForJDBCDate("attribute18 <", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("attribute18 <=", value, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18In(List<Date> values) {
            addCriterionForJDBCDate("attribute18 in", values, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotIn(List<Date> values) {
            addCriterionForJDBCDate("attribute18 not in", values, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18Between(Date value1, Date value2) {
            addCriterionForJDBCDate("attribute18 between", value1, value2, "attribute18");
            return (Criteria) this;
        }

        public Criteria andAttribute18NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("attribute18 not between", value1, value2, "attribute18");
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
     * land_head_ext_his 2018-08-11
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