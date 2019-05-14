package lu.lllc.boottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
public class OtherController {
    @RequestMapping(method = RequestMethod.POST, name = "/save")
    public ExampleBody save(@RequestBody ExampleBody ex){
        System.out.println(ex.getName());
        return ex;
    }
}