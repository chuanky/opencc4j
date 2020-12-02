package com.github.houbb.opencc4j.core;

import com.github.houbb.opencc4j.support.segment.Segment;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * 一个最简单的分词实现。
 * 注意：仅仅做演示，不可实际使用。
 * @author binbin.hou
 * @since 1.1.0
 */
public class FooSegment implements Segment {
    @Override
    public List<String> seg(String original) {
        return Arrays.asList(original, "测试");
    }

    @Test
    public void segTest() {
        FooSegment fooSegment = new FooSegment();
        List<String> segments = fooSegment.seg("分词");
        System.out.println(segments);
    }
}
