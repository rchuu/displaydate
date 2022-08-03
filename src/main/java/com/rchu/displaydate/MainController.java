package com.rchu.displaydate;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		SimpleDateFormat displayDate = new SimpleDateFormat("EEEEE, MMMM dd, yyyy");
		model.addAttribute("date", displayDate.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date();
		SimpleDateFormat displayTime = new SimpleDateFormat("hh:mm aa");
		model.addAttribute("time", displayTime.format(time));
		return "time.jsp";
	}
}