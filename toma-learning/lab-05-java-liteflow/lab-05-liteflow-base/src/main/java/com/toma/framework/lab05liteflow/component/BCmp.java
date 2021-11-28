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
@Component("b")
public class BCmp extends NodeComponent {

    Logger log = LoggerFactory.getLogger(BCmp.class);

    @Override
    public void process() throws Exception {
        Thread.sleep(1000);
        log.info("开始执行 BCmp");

    }
}
