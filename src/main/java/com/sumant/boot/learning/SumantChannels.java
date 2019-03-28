package com.sumant.boot.learning;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SumantChannels {

	public static final String SUMANT_INPUT_1 = "sumant-input1";
	
	public static final String SUMANT_INPUT_2 = "sumant-input2";
	
	public static final String SUMANT_OUTPUT = "sumant-output";
	
	@Output(SumantChannels.SUMANT_OUTPUT)
	MessageChannel output();
	
	@Input(SumantChannels.SUMANT_INPUT_1)
	SubscribableChannel input1();

	@Input(SumantChannels.SUMANT_INPUT_2)
	SubscribableChannel input2();	
}
