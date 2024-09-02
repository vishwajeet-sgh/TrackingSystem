package com.track.trackingSystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.track.trackingSystem.utils.TrackingNumberGenerator;

@Configuration
public class ApplicationConfiguration {

	 @Bean
	 TrackingNumberGenerator trackingNumberGenerator() {
			return new TrackingNumberGenerator();
	}
}
