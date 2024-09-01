package top.ytazwc.cloud;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 花木凋零成兰
 * @title RouterFilter
 * @date 2024-09-01 15:56
 * @package top.ytazwc.cloud
 * @description 配置动态路由
 */
@Component
public class RouterFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 注册动态路由
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        // 注册服务名
        context.put(FilterConstants.SERVICE_ID_KEY, "service-provider");
        // 注册请求路径
        context.put(FilterConstants.REQUEST_URI_KEY, "/user/1");
        // 在配置文件中注释静态路由 在配置动态路由
        return null;
    }
}
