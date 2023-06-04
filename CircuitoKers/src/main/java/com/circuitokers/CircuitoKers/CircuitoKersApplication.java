package com.circuitokers.CircuitoKers;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircuitoKersApplication {
	
	/*@Bean(name="conversionService")
	ConversionService conversionService(){
	    ConversionServiceFactoryBean factory = new ConversionServiceFactoryBean();
	    Set<Converter<?, ?>> convSet = new HashSet<Converter<?, ?>>();
	    convSet.add(new CocheConverter()); 
	    convSet.add(new CircuitoConverter()); 
	    factory.setConverters(convSet);
	    factory.afterPropertiesSet();
	    return factory.getObject();
	}*/
	

	public static void main(String[] args) {
		SpringApplication.run(CircuitoKersApplication.class, args);
	}

}
