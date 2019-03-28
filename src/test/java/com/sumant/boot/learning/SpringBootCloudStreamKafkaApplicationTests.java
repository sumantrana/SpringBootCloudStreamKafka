package com.sumant.boot.learning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.test.binder.MessageCollector;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCloudStreamKafkaApplicationTests {

//	@Autowired
//	private SpringBootCloudStreamKafkaApplication messageProcessor;
	
	@Autowired
	MessageCollector collector;
	
	@Autowired
	SumantChannels channels;
	
	
	@Test
	public void testMessageSentandRecieved() throws Exception {
	
		TestMessage testMessage = new TestMessage("Test Message", "Sumant");
		
		Message<TestMessage> theMessage = new GenericMessage<TestMessage>(testMessage);
		
		this.channels.output().send(theMessage);
		
		TimeUnit.SECONDS.sleep(5);
	}

}

