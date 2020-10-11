package com.xin.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-27 09:27
 */
@Component
public class LoginFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        System.out.println("已执行");
//        String token = exchange.getRequest().getQueryParams().getFirst("access-token");
//        if (null == token) {
//            System.out.println("认证失败");
//            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//            return exchange.getResponse().setComplete();
//        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
