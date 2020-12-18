package com.toma.framework.lab02designpatternschainofresponsibility.dto;

/**
 * 处理对象
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/18
 */

public class Member {


    private MemberTypeEnum typeEnum;

    private String username;

    public Member() {
    }

    public Member(MemberTypeEnum typeEnum, String username) {
        this.typeEnum = typeEnum;
        this.username = username;
    }

    public MemberTypeEnum getTypeEnum() {
        return typeEnum;
    }

    public void setTypeEnum(MemberTypeEnum typeEnum) {
        this.typeEnum = typeEnum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
