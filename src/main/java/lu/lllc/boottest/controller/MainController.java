package lu.lllc.boottest.controller;

import org.omg.CORBA.portable.ResponseHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import sun.security.provider.certpath.OCSPResponse;

@Controller
public class MainController {
	
	@RequestMapping("/controller")
	public String hello(){
		return "hello";
	}

	@RequestMapping(method = RequestMethod.POST, name = "/save")
	public String save(Object object){

		return "llego";
	}
}
