package com.toma.framework.lab05liteflow.component;

import com.toma.framework.lab05liteflow.slot.BaseSlot;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeCondComponent;
import com.yomahub.liteflow.entity.data.Slot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 动态路由节点选择
 *
 * @author Toma
 * @version 1.0
 * @since 2021/11/28
 */
@LiteflowComponent("switch")
public class SwitchDynamicNodeCmp extends NodeCondComponent {
    Logger log = LoggerFactory.getLogger(SwitchDynamicNodeCmp.class);

    @Override
    public String processCond() throws Exception {
        BaseSlot slot = getSlot();
        String val = slot.getData("val");
        log.info("动态选择节点:{}", val);
        return val;
    }
}
