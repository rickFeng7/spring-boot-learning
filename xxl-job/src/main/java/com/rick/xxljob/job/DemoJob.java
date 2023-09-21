package com.rick.xxljob.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.executor.XxlJobExecutor;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fengrui
 */
@Slf4j
@Component
@JobHandler("demoJobHandler")
public class DemoJob extends IJobHandler {

    private final AtomicInteger counts = new AtomicInteger();

    @Override
    public ReturnT<String> execute(String param) throws Exception {
        XxlJobExecutor.registJobHandler("demoJobHandler", new DemoJob());
        // 打印日志
        log.info("[execute][定时第 ({}) 次执行]", counts.incrementAndGet());
        // 返回执行成功
        return ReturnT.SUCCESS;
    }

}