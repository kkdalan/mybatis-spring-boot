package tk.mybatis.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.springboot.mapper.CountryMapper;
import tk.mybatis.springboot.model.Country;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CountryMapper countryMapper;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		countryMapper.selectAll();
	}

}
