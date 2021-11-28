package com.toma.framework.lab05liteflow.component;

import com.toma.framework.lab05liteflow.slot.BaseSlot;
import com.yomahub.liteflow.core.NodeComponent;
import com.yomahub.liteflow.entity.data.Slot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Toma
 * @version 1.0
 * @since 2021/11/28
 */
@Component("c")
public class CCmp extends NodeComponent {

    Logger log = LoggerFactory.getLogger(CCmp.class);

    @Override
    public void process() throws Exception {
        BaseSlot slot = getSlot();
        slot.setData("val", "a");
        log.info("开始执行 CCmp");
    }
}
