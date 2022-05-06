package in.sj.eksDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping(produces = "text/JSON")
	public ResponseEntity<String> getGreetings(@PathVariable(required = false) String greet, @RequestParam(defaultValue = "World") String name) {
		if (null != greet) {
			ResponseEntity<String> response = new ResponseEntity<String>(greet + " " + name+ "!", HttpStatus.OK);
			return response;
		} else{
			return new ResponseEntity<>("Hello "+ name+"!" , HttpStatus.OK);
		}
	}
}
		