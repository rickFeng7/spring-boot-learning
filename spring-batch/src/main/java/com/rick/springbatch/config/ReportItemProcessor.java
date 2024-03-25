package com.rick.springbatch.config;

import org.springframework.batch.item.ItemProcessor;

import java.util.List;

/**
 * @author fengrui
 * @date 2024/3/26
 */
public class ReportItemProcessor implements ItemProcessor<List<String>, List<String>> {

    @Override
    public List<String> process(List<String> item) throws Exception {
        return null;
    }
}
