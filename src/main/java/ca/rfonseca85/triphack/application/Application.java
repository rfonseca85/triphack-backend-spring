package ca.rfonseca85.triphack.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import ca.rfonseca85.triphack.service.AmadeusService;

@SpringBootApplication
@ComponentScan
public class Application {


	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {


			AmadeusService amadeusService = new AmadeusService();
			amadeusService.getFlightLowFare();
			
//			QuoteDTO quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", QuoteDTO.class);
//			log.info(quote.toString());
		};
	}
}