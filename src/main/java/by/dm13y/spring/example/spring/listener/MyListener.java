package by.dm13y.spring.example.spring.listener;

import by.dm13y.spring.example.spring.repository.MyRepository;
import by.dm13y.spring.example.spring.service.MyServices;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MyListener {
    private final MyServices myServices;
    private final MyRepository myRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void executeListener() {
        myServices.service();

        val result = myRepository.findAll();

        if (!result.iterator().hasNext()) {
            throw new IllegalStateException();
        }
    }

}
