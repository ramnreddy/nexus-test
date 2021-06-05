package nx.sc.test.service;

import nx.sc.test.dto.Request;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public String getSum(Request request) {
        Integer sum = request.getA() + request.getB() ;
        return sum.toString();
    }
}
