package com.rick.springbatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BatchConfiguration {

    @Bean
    public ItemReader<String> reader() {
        return new ListItemReader<>(Arrays.asList("one", "two", "three"));
    }

    @Bean
    public ItemProcessor<String, String> processor() {
        return String::toUpperCase;
    }

    @Bean
    public ItemWriter<String> writer() {
        return items -> items.forEach(System.out::println);
    }

    @Bean
    public Step step(StepBuilderFactory stepBuilderFactory, ItemReader<String> reader,
                     ItemProcessor<String, String> processor, ItemWriter<String> writer) {
        return stepBuilderFactory.get("step")
                .<String, String>chunk(1)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    public Job job(JobBuilderFactory jobBuilderFactory, Step step) {
        return jobBuilderFactory.get("job")
                .start(step)
                .build();
    }
}