package hexlet.code.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        // SpringApplication.run(AppApplication.class, args);
        SpringApplication application = new SpringApplication(AppApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

}
