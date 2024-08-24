package com.github.nazarageenko.GramToGram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication;

@SpringBootApplication
public class GramToGramApplication {
	public static void main(String[] args) {
		String botToken = "7262412312:AAE4lI_Z9M3FiAT6RAh5ERSjH-wUvK9-dzE";
		try (TelegramBotsLongPollingApplication botsApplication = new TelegramBotsLongPollingApplication()) {
			botsApplication.registerBot(botToken, new GramToGramTelegramBot(botToken));
			System.out.println("GramToGramTelegramBot successfully started!");
			Thread.currentThread().join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}