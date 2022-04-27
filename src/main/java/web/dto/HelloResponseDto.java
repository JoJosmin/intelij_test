package web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.junit.runner.RunWith;

@RunWith(SpringRunner.class)
public class HelloResponseDto {
    private final String name = "test";
    private final int amount = 1000;

}
