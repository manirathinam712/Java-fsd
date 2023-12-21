package com.simpli.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;

//@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		// Business logic

		String userId = request.getParameter("userid");

		if (userId != null) {			
			chain.doFilter(request, response);
		}else {
			out.println("No userId present. Request Blocked.");
		}
	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
	}

	@Override
	public void destroy() {

	}

}
