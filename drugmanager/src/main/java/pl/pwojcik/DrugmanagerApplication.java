package pl.pwojcik;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import pl.pwojcik.repository.DrugRepository;

@SpringBootApplication
public class DrugmanagerApplication extends SpringBootServletInitializer implements CommandLineRunner{

	@Autowired
	DrugRepository drugRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DrugmanagerApplication.class, args);
	}
	
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(DrugmanagerApplication.class);
	}



	@Override
	public void run(String... arg0) throws Exception {
		
		//Drug drug = drugRepository.findByEan(100000391);
		System.out.println("Drugmanager application started at"+ new SimpleDateFormat("hh:mm:ss YYYY:MM:dd").format(Calendar.getInstance().getTime()));
	
		
	}
}
