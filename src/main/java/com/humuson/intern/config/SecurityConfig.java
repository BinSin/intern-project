package com.humuson.intern.config;

import com.humuson.intern.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
class WebConfig implements WebMvcConfigurer {

    @Autowired
    private MyFilter myFilter;

    @Bean
    public FilterRegistrationBean<MyFilter> getFilterRegistrationBean() {
        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(myFilter);
        registrationBean.setOrder(Ordered.LOWEST_PRECEDENCE - 1);
        registrationBean.addUrlPatterns("/offers");
        return registrationBean;

    }
}