package com.lss.jvmobv;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class JVMObserve {
    MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
    public void observe(){
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        long init = heapMemoryUsage.getInit();
        long max = heapMemoryUsage.getMax();
        long used = heapMemoryUsage.getUsed();
        System.out.println("init:"+bit2MB(init));
        System.out.println("max:"+bit2MB(max));
        System.out.println("used:"+bit2MB(used));
    }
    public double bit2MB(long l){
        return l/1024.0/1024.0;
    }
}
