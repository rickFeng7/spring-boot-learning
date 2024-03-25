package com.rick.springbatch.config;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fengrui
 * @date 2024/3/26
 */
@Service
public class ReportItemReader implements ItemReader<List<String>> {

    @Override
    public List<String> read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return null;
    }
}
