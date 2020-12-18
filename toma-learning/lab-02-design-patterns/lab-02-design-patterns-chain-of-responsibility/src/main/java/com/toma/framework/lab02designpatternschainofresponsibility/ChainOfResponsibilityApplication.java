package com.toma.framework.lab02designpatternschainofresponsibility;

import com.toma.framework.lab02designpatternschainofresponsibility.concrete.ConcreteHandler1;
import com.toma.framework.lab02designpatternschainofresponsibility.concrete.ConcreteHandler2;
import com.toma.framework.lab02designpatternschainofresponsibility.concrete.ConcreteHandler3;
import com.toma.framework.lab02designpatternschainofresponsibility.dto.Member;
import com.toma.framework.lab02designpatternschainofresponsibility.dto.MemberTypeEnum;
import com.toma.framework.lab02designpatternschainofresponsibility.handler.BaseHandler;

/**
 * 程序入口
 *
 * @author QiuQN
 * @version 1.0
 * @since 2020/12/18
 */
public class ChainOfResponsibilityApplication {


    public static void main(String[] args) {
        BaseHandler concreteHandler1 = new ConcreteHandler1(null);
        BaseHandler concreteHandler2 = new ConcreteHandler2(concreteHandler1);
        BaseHandler concreteHandler3 = new ConcreteHandler3(concreteHandler2);

        Member toma = new Member(MemberTypeEnum.FREE, "Harden");
        Member james = new Member(MemberTypeEnum.LAKERS, "James");
        Member polo = new Member(MemberTypeEnum.LONE_RANGER, "Paul");
        concreteHandler3.handlerMyMember(toma);
    }
}
