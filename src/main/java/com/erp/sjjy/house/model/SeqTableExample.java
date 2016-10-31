package com.erp.sjjy.house.model;

import com.boot.common.page.PageParam;
import java.util.ArrayList;
import java.util.List;

public class SeqTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected PageParam page;

    public SeqTableExample() {
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

    public void setPage(PageParam page) {
        this.page=page;
    }

    public PageParam getPage() {
        return page;
    }

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

        public Criteria andSeqNameIsNull() {
            addCriterion("SEQ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSeqNameIsNotNull() {
            addCriterion("SEQ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNameEqualTo(String value) {
            addCriterion("SEQ_NAME =", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotEqualTo(String value) {
            addCriterion("SEQ_NAME <>", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameGreaterThan(String value) {
            addCriterion("SEQ_NAME >", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_NAME >=", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLessThan(String value) {
            addCriterion("SEQ_NAME <", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLessThanOrEqualTo(String value) {
            addCriterion("SEQ_NAME <=", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLike(String value) {
            addCriterion("SEQ_NAME like", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotLike(String value) {
            addCriterion("SEQ_NAME not like", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameIn(List<String> values) {
            addCriterion("SEQ_NAME in", values, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotIn(List<String> values) {
            addCriterion("SEQ_NAME not in", values, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameBetween(String value1, String value2) {
            addCriterion("SEQ_NAME between", value1, value2, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotBetween(String value1, String value2) {
            addCriterion("SEQ_NAME not between", value1, value2, "seqName");
            return (Criteria) this;
        }

        public Criteria andCurrentValueIsNull() {
            addCriterion("CURRENT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentValueIsNotNull() {
            addCriterion("CURRENT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentValueEqualTo(Long value) {
            addCriterion("CURRENT_VALUE =", value, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueNotEqualTo(Long value) {
            addCriterion("CURRENT_VALUE <>", value, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueGreaterThan(Long value) {
            addCriterion("CURRENT_VALUE >", value, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_VALUE >=", value, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueLessThan(Long value) {
            addCriterion("CURRENT_VALUE <", value, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_VALUE <=", value, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueIn(List<Long> values) {
            addCriterion("CURRENT_VALUE in", values, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueNotIn(List<Long> values) {
            addCriterion("CURRENT_VALUE not in", values, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueBetween(Long value1, Long value2) {
            addCriterion("CURRENT_VALUE between", value1, value2, "currentValue");
            return (Criteria) this;
        }

        public Criteria andCurrentValueNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_VALUE not between", value1, value2, "currentValue");
            return (Criteria) this;
        }

        public Criteria andIncrementIsNull() {
            addCriterion("INCREMENT is null");
            return (Criteria) this;
        }

        public Criteria andIncrementIsNotNull() {
            addCriterion("INCREMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementEqualTo(Short value) {
            addCriterion("INCREMENT =", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementNotEqualTo(Short value) {
            addCriterion("INCREMENT <>", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementGreaterThan(Short value) {
            addCriterion("INCREMENT >", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementGreaterThanOrEqualTo(Short value) {
            addCriterion("INCREMENT >=", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementLessThan(Short value) {
            addCriterion("INCREMENT <", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementLessThanOrEqualTo(Short value) {
            addCriterion("INCREMENT <=", value, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementIn(List<Short> values) {
            addCriterion("INCREMENT in", values, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementNotIn(List<Short> values) {
            addCriterion("INCREMENT not in", values, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementBetween(Short value1, Short value2) {
            addCriterion("INCREMENT between", value1, value2, "increment");
            return (Criteria) this;
        }

        public Criteria andIncrementNotBetween(Short value1, Short value2) {
            addCriterion("INCREMENT not between", value1, value2, "increment");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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