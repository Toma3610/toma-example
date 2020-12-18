package com.toma.framework.lab02designpatternschainofresponsibility.dto;

/**
 * 用户类型枚举
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/18
 */
public enum MemberTypeEnum {
    FREE(1, "76人"),
    LAKERS(2, "湖人"),
    LONE_RANGER(3, "独行侠"),
    ;
    private final int type;
    private final String remark;
    MemberTypeEnum(int type, String remark) {
        this.type = type;
        this.remark = remark;
    }
    public int getType() { return type;}
    public String getRemark() { return remark;  }
}
