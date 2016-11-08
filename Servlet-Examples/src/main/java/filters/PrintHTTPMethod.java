package filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Xavi Torrens
 */
public class PrintHTTPMethod implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.print(servletRequest.getProtocol());

        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
