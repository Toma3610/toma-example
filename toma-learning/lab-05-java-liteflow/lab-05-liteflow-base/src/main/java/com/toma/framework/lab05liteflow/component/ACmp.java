package com.toma.framework.lab05liteflow.component;

import com.yomahub.liteflow.core.NodeComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/11/28
 */
@Component("a")
public class ACmp extends NodeComponent {

    Logger log = LoggerFactory.getLogger(ACmp.class);

    @Override
    public void process() throws Exception {

//        log.info("{}",1/0);
        log.info("开始执行 ACmp");
        String tag = this.getTag();
        log.info("获取到的标签:{}", tag);
    }
}
