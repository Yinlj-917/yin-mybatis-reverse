package com.yin.reverse.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LandPointHisExample {
    /**
     * land_point_his
     */
    protected String orderByClause;

    /**
     * land_point_his
     */
    protected boolean distinct;

    /**
     * land_point_his
     */
    protected List<Criteria> oredCriteria;

    public LandPointHisExample() {
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
     * land_point_his 2018-08-11
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

        public Criteria andLngPointIsNull() {
            addCriterion("lng_point is null");
            return (Criteria) this;
        }

        public Criteria andLngPointIsNotNull() {
            addCriterion("lng_point is not null");
            return (Criteria) this;
        }

        public Criteria andLngPointEqualTo(Double value) {
            addCriterion("lng_point =", value, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointNotEqualTo(Double value) {
            addCriterion("lng_point <>", value, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointGreaterThan(Double value) {
            addCriterion("lng_point >", value, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointGreaterThanOrEqualTo(Double value) {
            addCriterion("lng_point >=", value, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointLessThan(Double value) {
            addCriterion("lng_point <", value, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointLessThanOrEqualTo(Double value) {
            addCriterion("lng_point <=", value, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointIn(List<Double> values) {
            addCriterion("lng_point in", values, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointNotIn(List<Double> values) {
            addCriterion("lng_point not in", values, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointBetween(Double value1, Double value2) {
            addCriterion("lng_point between", value1, value2, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLngPointNotBetween(Double value1, Double value2) {
            addCriterion("lng_point not between", value1, value2, "lngPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointIsNull() {
            addCriterion("lat_point is null");
            return (Criteria) this;
        }

        public Criteria andLatPointIsNotNull() {
            addCriterion("lat_point is not null");
            return (Criteria) this;
        }

        public Criteria andLatPointEqualTo(Double value) {
            addCriterion("lat_point =", value, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointNotEqualTo(Double value) {
            addCriterion("lat_point <>", value, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointGreaterThan(Double value) {
            addCriterion("lat_point >", value, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointGreaterThanOrEqualTo(Double value) {
            addCriterion("lat_point >=", value, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointLessThan(Double value) {
            addCriterion("lat_point <", value, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointLessThanOrEqualTo(Double value) {
            addCriterion("lat_point <=", value, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointIn(List<Double> values) {
            addCriterion("lat_point in", values, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointNotIn(List<Double> values) {
            addCriterion("lat_point not in", values, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointBetween(Double value1, Double value2) {
            addCriterion("lat_point between", value1, value2, "latPoint");
            return (Criteria) this;
        }

        public Criteria andLatPointNotBetween(Double value1, Double value2) {
            addCriterion("lat_point not between", value1, value2, "latPoint");
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

        public Criteria andLandNumIsNull() {
            addCriterion("land_num is null");
            return (Criteria) this;
        }

        public Criteria andLandNumIsNotNull() {
            addCriterion("land_num is not null");
            return (Criteria) this;
        }

        public Criteria andLandNumEqualTo(Long value) {
            addCriterion("land_num =", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumNotEqualTo(Long value) {
            addCriterion("land_num <>", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumGreaterThan(Long value) {
            addCriterion("land_num >", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumGreaterThanOrEqualTo(Long value) {
            addCriterion("land_num >=", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumLessThan(Long value) {
            addCriterion("land_num <", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumLessThanOrEqualTo(Long value) {
            addCriterion("land_num <=", value, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumIn(List<Long> values) {
            addCriterion("land_num in", values, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumNotIn(List<Long> values) {
            addCriterion("land_num not in", values, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumBetween(Long value1, Long value2) {
            addCriterion("land_num between", value1, value2, "landNum");
            return (Criteria) this;
        }

        public Criteria andLandNumNotBetween(Long value1, Long value2) {
            addCriterion("land_num not between", value1, value2, "landNum");
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

        public Criteria andAttribute9EqualTo(Double value) {
            addCriterion("attribute9 =", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotEqualTo(Double value) {
            addCriterion("attribute9 <>", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThan(Double value) {
            addCriterion("attribute9 >", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9GreaterThanOrEqualTo(Double value) {
            addCriterion("attribute9 >=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThan(Double value) {
            addCriterion("attribute9 <", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9LessThanOrEqualTo(Double value) {
            addCriterion("attribute9 <=", value, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9In(List<Double> values) {
            addCriterion("attribute9 in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotIn(List<Double> values) {
            addCriterion("attribute9 not in", values, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9Between(Double value1, Double value2) {
            addCriterion("attribute9 between", value1, value2, "attribute9");
            return (Criteria) this;
        }

        public Criteria andAttribute9NotBetween(Double value1, Double value2) {
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
     * land_point_his 2018-08-11
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