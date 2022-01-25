package com.spring.elk.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LogScheduler {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 20000)
	public void reportCurrentTime() {
		Date date = new Date();
		
		log.info("----------------LOG START-----------------");

		log.info("Author : htyesilyurt@gmail.com - The time is now {}", dateFormat.format(date));

		log.info("----------------LOG FINISH-----------------");
	}
}
