package com.steamcat.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * @ClassName LoginFilter
 * @Description TODO
 * @Author Administrator
 * @Data 下午 10:10
 * @Version 1.0
 **/
@Component
public class LoginFilter extends ZuulFilter {
    /*
     * 四种类型
     * pre 路由之前执行
     * routing 路由请求时调用
     * post routing error过滤器之后调用
     * error 处理请求时发声错误调用
    **/
    @Override
    public String filterType() {
        return "pre";
    }

    /*
     * 越小越先执行
     **/
    @Override
    public int filterOrder() {
        return 0;
    }

    /*
     * true为执行，false不执行
     **/
    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
