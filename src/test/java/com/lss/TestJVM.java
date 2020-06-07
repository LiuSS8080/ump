package com.lss;

import com.lss.jvmobv.JVMObserve;
import org.junit.Test;

public class TestJVM {
    @Test
    public void test1(){
        JVMObserve jvmObserve = new JVMObserve();
        jvmObserve.observe();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("max:"+jvmObserve.bit2MB(runtime.maxMemory()));
        System.out.println("totalMemory:"+jvmObserve.bit2MB(runtime.totalMemory()));
        System.out.println("freeMemory:"+jvmObserve.bit2MB(runtime.freeMemory()));
    }

}
