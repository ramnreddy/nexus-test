package nx.sc.test.controllers;

import nx.sc.test.dto.Request;
import nx.sc.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/nexus")
public class TestController {
    TestService testService;

}
