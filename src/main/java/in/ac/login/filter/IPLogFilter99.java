package in.ac.login.filter;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import jakarta.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class IPLogFilter99
 */
@SuppressWarnings("serial")
@WebFilter("/IPLogFilter99")
public class IPLogFilter99 extends HttpServlet implements Filter {
       
	

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		System.out.println(InetAddress.getLocalHost());
		filterChain.doFilter(request, response);
		
	}

}
