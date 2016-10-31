package com.erp.sjjy.house.model;

public class SeqTable {
    private String seqName;

    private Long currentValue;

    private Short increment;

    private String remark;

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName == null ? null : seqName.trim();
    }

    public Long getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
    }

    public Short getIncrement() {
        return increment;
    }

    public void setIncrement(Short increment) {
        this.increment = increment;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}