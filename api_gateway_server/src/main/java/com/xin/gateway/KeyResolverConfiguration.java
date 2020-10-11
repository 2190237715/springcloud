package com.xin.gateway;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-29 09:24
 */
@Configuration
public class KeyResolverConfiguration {
//    @Bean
    public KeyResolver pathKeyResolver() {
        return new KeyResolver() {
            public Mono<String> resolve(ServerWebExchange exchange) {
                return Mono.just(exchange.getRequest().getPath().toString());
            }

            ;
        };
    }

    @Bean
    public KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("userId"));
    }
}
