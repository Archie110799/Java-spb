package com.example.trainning;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainningApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(TrainningApplication.class, args);
		// Helper helper = new Helper();
		// String url = "https://bigtruyen.net/one-piece-full-mau/";
		// Crawler crawler = new Crawler(url);
		// while (true) {
		// 	menu();
		// 	int choice = helper.getIntInRange(1, 3);
		// 	switch (choice) {
		// 		case 1:
		// 			crawler.GetListChap();
		// 			break;
		// 		case 2:
		// 			crawler.SaveChap();
		// 			break;
		// 		case 3:
		// 			return;
		// 	}
		// }

	}

	static void cr() {
		System.out.println("----- OnePiece -----");
		System.out.println("1. Get list Chap.");
		System.out.println("2. Dowload chap");
		System.out.println("3. Exit");
	}

	static void menu() {
		System.out.println("----- OnePiece -----");
		System.out.println("1. Get list Chap.");
		System.out.println("2. Dowload chap");
		System.out.println("3. Exit");
	}

}
