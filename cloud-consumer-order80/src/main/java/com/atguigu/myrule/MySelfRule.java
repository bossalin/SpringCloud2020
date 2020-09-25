package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzq on 2020/9/21.
 * 不能放到@ComponentScan所扫描的当前包以及子包下，默认为SpringBootApplication包下
 */
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义随机
    }
}
