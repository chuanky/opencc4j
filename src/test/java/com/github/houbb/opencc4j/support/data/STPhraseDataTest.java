package com.github.houbb.opencc4j.support.data;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.opencc4j.model.data.DataInfo;
import com.github.houbb.opencc4j.support.data.impl.STPhraseData;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class STPhraseDataTest {

    @Test
    public void singletonTest() {
        DataInfo dataInfo = Instances.singleton(STPhraseData.class).data();
        for (String key : dataInfo.getDataMap().keySet()) {
            System.out.println(key + " : " + dataInfo.getDataMap().get(key));
        }
        Assert.assertEquals(48933, dataInfo.getDataMap().size());
    }


}
