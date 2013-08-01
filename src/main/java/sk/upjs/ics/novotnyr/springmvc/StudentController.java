package sk.upjs.ics.novotnyr.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@RequestMapping("/student/1")
	@ResponseBody
	public String get() {
		return "Janko Mrkvička";
	}
}