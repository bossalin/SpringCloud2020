package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.*;

public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理信息1....CustomerBlockHandler----1");

    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理信息2....CustomerBlockHandler----2");

    }
}