package com.sumant.boot.learning;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(SumantChannels.class)
public class SpringBootCloudStreamKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudStreamKafkaApplication.class, args);
	}
	
	
	@StreamListener(target = SumantChannels.SUMANT_INPUT_1)
	public void processMessage1(TestMessage message) {
		System.out.println( message.toString() );
	}
	
	@StreamListener(target = SumantChannels.SUMANT_INPUT_2)
	public void processMessage2(TestMessage message) {
		System.out.println( message.toString() );
	}
}

