package com.toma.framework.lab05liteflow;

import com.toma.framework.lab05liteflow.component.ACmp;
import com.toma.framework.lab05liteflow.slot.BaseSlot;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.entity.data.DefaultSlot;
import com.yomahub.liteflow.entity.data.LiteflowResponse;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ApplicationTests {

    Logger log = LoggerFactory.getLogger(ApplicationTests.class);

    @Resource
    private FlowExecutor flowExecutor;

    @Test
    void contextLoads() throws Exception {
//        LiteflowResponse<DefaultSlot> execute2Resp =
//                this.flowExecutor.execute2Resp("chain1", "abc");
//        log.info("同步执行 同一条件下执行:{}", execute2Resp);
//
//        DefaultSlot chain2 = this.flowExecutor.execute("chain2", "");
//        log.info("同步执行 分拆条件:{}", chain2);

//        DefaultSlot chainSync1 = this.flowExecutor.execute("chainSync1", "");
//        log.info("异步执行 同一条件:{}", chainSync1);

//        DefaultSlot chainSyncGroup1 = this.flowExecutor.execute("chainSyncGroup1", "");
//        log.info("异步执行 并行组:{}", chainSyncGroup1);

        LiteflowResponse<BaseSlot> chainOneEnd = this.flowExecutor.execute2Resp("chainOneEnd", "我是 liteFlow", BaseSlot.class);
        log.info("异步执行结束再执行后面的组件:{}", chainOneEnd);
    }


}
