package top.ytazwc.cloud;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 花木凋零成兰
 * @title TokenFilter
 * @date 2024-09-01 15:46
 * @package top.ytazwc.cloud
 * @description Zuul 过滤器
 */
@Component
public class TokenFilter extends ZuulFilter {

    // 过滤类型
    @Override
    public String filterType() {
        // 请求被路由之前执行
        return FilterConstants.PRE_TYPE;
    }

    // 指定路由优先级 数字越大 优先级越低
    @Override
    public int filterOrder() {
        return 1;
    }

    // 表示是否执行该过滤器 false-不执行 true-执行
    @Override
    public boolean shouldFilter() {
        return false;
    }

    // 过滤器核心部分逻辑
    @Override
    public Object run() throws ZuulException {
        // 获取请求上下文
        RequestContext context = RequestContext.getCurrentContext();
        // 获取 Servlet 对象
        HttpServletRequest request = context.getRequest();
        // 拦截请求设置响应
        context.getResponse().setContentType("application/json;charset=utf-8");
        // 拦截请求 可以根据实际业务需求来判断返回结果 true-放行; false-拦截
        context.setSendZuulResponse(false);
        // 响应体
        context.setResponseBody("返回结果");
        return null;
    }
}
