package sample;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping
	public String welcome() {
		return "this is get request";
	}
	@PostMapping
	public String postRequest() {
		return "this is get request";
	}
	@PutMapping
	public String putRequest() {
		return "this is get request";
	}
	@DeleteMapping
	public String deleteRequest() {
		return "this is get request";
	}
}
