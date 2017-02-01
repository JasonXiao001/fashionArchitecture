package cn.jx.fashionarchitecture;

import javax.inject.Inject;
import javax.inject.Singleton;

import cn.jx.fashionarchitecture.domain.executor.PostExecutionThread;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

/**
 *
 */

@Singleton
public class UIThread implements PostExecutionThread{

    @Inject
    UIThread() {}

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
