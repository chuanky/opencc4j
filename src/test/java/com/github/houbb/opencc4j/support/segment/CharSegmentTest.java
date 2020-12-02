package com.github.houbb.opencc4j.support.segment;

import com.github.houbb.heaven.support.instance.impl.Instances;
import com.github.houbb.opencc4j.support.segment.impl.CharSegment;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * 字符分词测试
 * @author binbin.hou
 * @since 1.1.0
 */
public class CharSegmentTest {

    @Test
    public void segTest() {
        final String original = "爱我中华";
        List<String> stringList = Instances.singleton(CharSegment.class).seg(original);
        System.out.println(stringList);
        Assert.assertEquals(4, stringList.size());
    }

}
