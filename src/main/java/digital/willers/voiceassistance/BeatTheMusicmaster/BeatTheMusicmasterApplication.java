package digital.willers.voiceassistance.BeatTheMusicmaster;

import digital.willers.voiceassistance.BeatTheMusicmaster.controller.AlexaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AlexaConfiguration.class)
public class BeatTheMusicmasterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
        System.out.println("-----SPRING BOOT START-----");
		SpringApplication.run(BeatTheMusicmasterApplication.class, args);
	}
}
