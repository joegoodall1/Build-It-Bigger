package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.support.v4.util.Pair;
import android.test.ApplicationTestCase;
import android.text.TextUtils;

import java.util.concurrent.CountDownLatch;


public class ApplicationTest extends ApplicationTestCase<Application> {
    String mJsonString = null;
    Exception mError = null;
    CountDownLatch signal = null;

    public ApplicationTest() {
        super(Application.class);
    }

    @Override
    protected void setUp() throws Exception {
        signal = new CountDownLatch(1);
    }

    @Override
    protected void tearDown() throws Exception {
        signal.countDown();
    }

    public void testStringTask() throws InterruptedException {
        new EndpointsAsyncTask().execute((Runnable) new Pair<Context, String>(getContext(), "Manfred"));
        signal.await();
        assertNull(mError);
        assertFalse(TextUtils.isEmpty(mJsonString));


    }

}