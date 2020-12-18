package com.toma.framework.lab02designpatternschainofresponsibility.handler;

import com.toma.framework.lab02designpatternschainofresponsibility.dto.Member;

/**
 * 基类处理器
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/18
 */
public abstract class BaseHandler {

   public BaseHandler handler;

    public BaseHandler(BaseHandler handler) {
        this.handler = handler;
    }

    public abstract void handlerMyMember(Member member);

}
