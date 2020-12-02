package com.github.houbb.opencc4j.support.data;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.opencc4j.model.data.DataInfo;
import com.github.houbb.opencc4j.support.data.impl.TSPhraseData;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public class TSPhraseDataTest {

    @Test
    public void singletonTest() {
        DataInfo dataInfo = Instances.singleton(TSPhraseData.class).data();
        for (String key : dataInfo.getDataMap().keySet()) {
            System.out.println(key + " : " + dataInfo.getDataMap().get(key));
        }
        Assert.assertEquals(273, dataInfo.getDataMap().size());
    }

}
