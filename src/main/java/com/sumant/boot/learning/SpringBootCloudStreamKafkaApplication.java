package com.sumant.boot.learning;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.util.MimeTypeUtils;

@SpringBootApplication
@EnableBinding(SumantChannels.class)
public class SpringBootCloudStreamKafkaApplication {

	@Autowired
	private SumantChannels channels;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudStreamKafkaApplication.class, args);
	}
	
//	@StreamListener(SumantChannels.SUMANT_INPUT)
//	public void processMessage( Message message ) {
//		System.out.println( message.toString() );
//		sendMessage(message);
//	}
//	
//
//    public void sendMessage(final Message message) {
//    	
//        MessageChannel messageChannel = channels.output();
//        
//        messageChannel.send(MessageBuilder
//                .withPayload(message)
//                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
//                .build());
//        
//        System.out.println( "Message Sent to output channel" );
//        
//    }
	
	@StreamListener(target = SumantChannels.SUMANT_INPUT)
	@SendTo(SumantChannels.SUMANT_OUTPUT)
	public TestMessage processMessage(TestMessage message) {
		return message;
	}
	

}

