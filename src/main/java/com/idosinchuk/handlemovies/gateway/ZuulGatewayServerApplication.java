package com.idosinchuk.handlemovies.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.idosinchuk.handlemovies.gateway.filters.ErrorFilter;
import com.idosinchuk.handlemovies.gateway.filters.PostFilter;
import com.idosinchuk.handlemovies.gateway.filters.PreFilter;
import com.idosinchuk.handlemovies.gateway.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayServerApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
