package nx.sc.test.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Request {
    @NotNull(message = "Only Integer Allowed")
    private Integer a;

    @NotNull(message = "Only Integer Allowed")
    private Integer b;
}
