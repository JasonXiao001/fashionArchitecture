package cn.jx.fashionarchitecture.domain.executor;

import rx.Scheduler;

/**
 *
 */

public interface PostExecutionThread {
    Scheduler getScheduler();
}
