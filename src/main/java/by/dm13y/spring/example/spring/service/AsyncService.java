package by.dm13y.spring.example.spring.service;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import static java.lang.Thread.sleep;

@Component
public class AsyncService {

    @Async
    public void executeAsync() {
        System.out.println("Listener executed");
        throw new RuntimeException();
    }
}
