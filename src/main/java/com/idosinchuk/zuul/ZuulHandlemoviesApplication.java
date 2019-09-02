package com.idosinchuk.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.idosinchuk.zuul.filters.ErrorFilter;
import com.idosinchuk.zuul.filters.PostFilter;
import com.idosinchuk.zuul.filters.PreFilter;
import com.idosinchuk.zuul.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulHandlemoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulHandlemoviesApplication.class, args);
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
