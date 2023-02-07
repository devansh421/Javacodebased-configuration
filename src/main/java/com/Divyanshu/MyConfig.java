package com.Divyanshu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig 
{
	@Bean(value = "b1")
	public AA method1() 
	{
		return new AA();
	}
	@Bean
	public BB method2() 
	{
		return new BB();
	}
	@Bean
	public CC method3() 
	{
		return new CC();
	}
}
