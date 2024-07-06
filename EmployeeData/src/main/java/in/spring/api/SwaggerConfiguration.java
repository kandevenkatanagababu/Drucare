package in.spring.api;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfiguration 
{
	
	@Bean
	public OpenAPI defineOpenApi()
	{
		Server server=new Server();
		server.setUrl("http://localhost:8094");
		server.setDescription("Our API Description");
		
		Contact contact =new Contact();
		contact.setEmail("kandevenkatanagabau@gmail.com");
		contact.setName("K venkat");
		
		Info info=new Info();
		info.title("Employee Management API");
		info.version("1.0");
		info.description("Expose endpoints to  manage employees");
		info.contact(contact);
		
		return new OpenAPI().info(info).servers(List.of(server));
		
		
		
	}
	
}
