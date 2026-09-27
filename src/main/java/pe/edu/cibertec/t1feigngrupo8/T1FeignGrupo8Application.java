package pe.edu.cibertec.t1feigngrupo8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "pe.edu.cibertec.t1feigngrupo8.restclient.iclient")
public class T1FeignGrupo8Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo8Application.class, args);
    }
}
