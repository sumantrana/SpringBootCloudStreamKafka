package com.sumant.boot.learning;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SumantChannels {

	public static final String SUMANT_INPUT = "sumant-input";
	
	public static final String SUMANT_OUTPUT = "sumant-output";
	
	@Output(SumantChannels.SUMANT_OUTPUT)
	MessageChannel output();
	
	@Input(SumantChannels.SUMANT_INPUT)
	SubscribableChannel input();

}
