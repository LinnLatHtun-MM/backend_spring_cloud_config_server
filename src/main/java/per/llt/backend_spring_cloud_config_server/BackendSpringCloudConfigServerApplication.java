package per.llt.backend_spring_cloud_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // Enable Config Server
public class BackendSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendSpringCloudConfigServerApplication.class, args);
    }

}
