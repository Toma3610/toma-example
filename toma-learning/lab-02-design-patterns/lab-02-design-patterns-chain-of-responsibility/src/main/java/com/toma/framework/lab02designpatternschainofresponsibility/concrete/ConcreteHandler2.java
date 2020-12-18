package com.toma.framework.lab02designpatternschainofresponsibility.concrete;

import com.toma.framework.lab02designpatternschainofresponsibility.dto.Member;
import com.toma.framework.lab02designpatternschainofresponsibility.dto.MemberTypeEnum;
import com.toma.framework.lab02designpatternschainofresponsibility.handler.BaseHandler;

/**
 * 处理器2
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/18
 */
public class ConcreteHandler2 extends BaseHandler {
    public ConcreteHandler2(BaseHandler handler) {
        super(handler);
    }
    @Override
    public void handlerMyMember(Member member) {
        if (member.getTypeEnum() == MemberTypeEnum.LAKERS) {
            System.out.println(MemberTypeEnum.LAKERS.getRemark() + ":" + member.getUsername());
            return;
        }
        if (this.handler != null) {
            this.handler.handlerMyMember(member);
        }
    }
}
