package com.myorg.ecomm.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@EnableSwagger2
public class Application {

    @Value("${server.port}")
    private int port;


    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }

    /**
     * Enables Docket Configuration Builder for Swagger 2 Generation.
     * 
     * <pre>
     * 
     * Upon launch of the service, please use below links to navigate to Swagger UI and api-docs respectively. 
     * 
     * Please refer to ach-management-service's controller for swagger annotations on the controller.
     * 
     * 1. Swagger UI: http://localhost:9900/swagger-ui.html
     * 2. API Docs: http://localhost:9900/v2/api-docs
     * 
     * </pre>
     * 
     * @return
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.myorg.ecomm.sample.controller"))
                .paths(PathSelectors.any()).build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Microservice Skeleton")
                .license("Proprietary")
                .version("1.0")
                .build();
    }
}
