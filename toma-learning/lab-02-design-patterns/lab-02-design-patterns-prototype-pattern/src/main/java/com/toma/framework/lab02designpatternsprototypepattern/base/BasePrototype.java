package com.toma.framework.lab02designpatternsprototypepattern.base;

/**
 * 原型基础
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/26
 */
public abstract class BasePrototype implements Cloneable{
    private String id;
    protected String type;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
