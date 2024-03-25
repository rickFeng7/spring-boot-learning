package com.rick.springbatch.config;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fengrui
 * @date 2024/3/26
 */
@Service
public class ReportItemWriter implements ItemWriter<List<String>> {

    @Override
    public void write(List<? extends List<String>> items) throws Exception {
        items.forEach(item -> System.out.println("Writing item: " + item));
    }
}
