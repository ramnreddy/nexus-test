package nx.sc.test.controllers;

import nx.sc.test.dto.Request;
import nx.sc.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping(value = "/sum")
    public String getSum(@Valid @RequestBody Request request) {
        return testService.getSum(request);
    }

}
