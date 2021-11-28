package com.toma.framework.lab05liteflow.component;

import com.toma.framework.lab05liteflow.slot.BaseSlot;
import com.yomahub.liteflow.core.NodeComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/11/28
 */
@Component("d")
public class DCmp extends NodeComponent {

    Logger log = LoggerFactory.getLogger(DCmp.class);

    @Override
    public void process() throws Exception {
        log.info("开始执行 DCmp");
        BaseSlot slot = getSlot();
        String val = slot.getData("val");
        log.info("传递获取值:{}", val);
    }

    @Override
    public boolean isAccess() {
        log.info("进入DCmp 组件");
        return super.isAccess();
    }
}
