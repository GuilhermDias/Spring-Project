package com.alura.Screenmatch;

import com.alura.Models.DataSeries;
import com.alura.Service.APIconsumer;
import com.alura.Service.DataConverse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring start...");

		var apIconsumer = new APIconsumer();
		var json = apIconsumer.getData("http://www.omdbapi.com/?t=gilmore+girls&apikey=91871d5b");
		System.out.println(json);
		//json = apIconsumer.getData("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(json);
		DataConverse dataConverse = new DataConverse();
		DataSeries dataSeries = dataConverse.getData(json, DataSeries.class);
		System.out.println(dataSeries);
	}
}
