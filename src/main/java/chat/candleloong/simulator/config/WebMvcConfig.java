package chat.candleloong.simulator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author Siberia.Hu
 * @date 2024/12/18
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 映射前端路径 以后只要客户端拿着 /simulator/... 的路径过来访问，就马上到类路径里面的 simulator里面去找内容出来展示。
        registry.addResourceHandler("/simulator/**").addResourceLocations("classpath:/simulator/");
    }
}
