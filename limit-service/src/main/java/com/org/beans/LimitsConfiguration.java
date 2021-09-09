package com.org.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("limit-service")
@Component
public class LimitsConfiguration {
	
	private int min;
	private int max;
	
	public LimitsConfiguration(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public LimitsConfiguration() {
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	

}
