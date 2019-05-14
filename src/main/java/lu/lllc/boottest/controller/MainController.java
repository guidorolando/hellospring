package lu.lllc.boottest.controller;

import org.omg.CORBA.portable.ResponseHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.security.provider.certpath.OCSPResponse;

@Controller
public class MainController {
	
	@RequestMapping("/controller")
	public String hello(){
		return "hello";
	}
}
