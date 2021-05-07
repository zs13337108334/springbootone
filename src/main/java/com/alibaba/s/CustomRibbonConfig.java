package com.alibaba.s;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RibbonClients(value = {
        @RibbonClient(name = "product‐center", configuration = ProductCenterRibbonConfig.class),
        @RibbonClient(name = "pay‐center", configuration = PayCenterRibbonConfig.class)
})
public class CustomRibbonConfig {

}

@Configuration
class ProductCenterRibbonConfig {
    @Bean
    public IRule randomRule() {
        return new RandomRule();
    }
}

@Configuration
class PayCenterRibbonConfig {
    @Bean
    public IRule roundRobinRule() {
        return new RoundRobinRule();
    }

}

