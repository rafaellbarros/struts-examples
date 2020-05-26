package br.com.developer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author  Rafael Barros <rafaelbarros.df@gmail.com>
 */

@SpringBootApplication
@ServletComponentScan
public class Struts2App extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(Struts2App.class);

    public static void main(String[] args) {
        SpringApplication.run(Struts2App.class, args);
        log.info("Started application at {}", "http://localhost:8080");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<Struts2App> applicationClass = Struts2App.class;
}


