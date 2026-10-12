package springmvc_ecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "springmvc_ecommerce.controller,springmvc_ecommerce.configuration.dao")
@EnableWebMvc
public class WebMvcConfig {
	
	@Bean
	public ModelAndView modelandview() {
		return new ModelAndView();
	}
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
	 InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
	 internalResourceViewResolver.setSuffix(".jsp");
	 return internalResourceViewResolver;
 }
}
