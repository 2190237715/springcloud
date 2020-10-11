package com.xin.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.HttpServerConnection;
import org.apache.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-24 10:17
 */
@Component
public class LoginFilter extends ZuulFilter {
    /**
     * 过滤器类型
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 过滤器生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器业务逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        System.out.println("执行了过滤器");
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token =  request.getParameter("access-token");
        if (token==null){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(HttpStatus.SC_UNAUTHORIZED);
        }
        return null;
    }
}
