package sk.upjs.ics.novotnyr.springmvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("sk.upjs.ics.novotnyr.springmvc")
public class WebApplicationContext {
	/*
	 *  nothing to do here,
	 *  all beans are autodiscovered
	 */
}
