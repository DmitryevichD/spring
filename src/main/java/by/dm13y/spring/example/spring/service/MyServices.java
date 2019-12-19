package by.dm13y.spring.example.spring.service;

import by.dm13y.spring.example.spring.entity.MyEntity;
import by.dm13y.spring.example.spring.repository.MyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

import static java.lang.Thread.sleep;

@Component
@RequiredArgsConstructor
public class MyServices {
    private final AsyncService asyncService;
    private final MyRepository myRepository;

    @Transactional
    public void service() {
        MyEntity myEntity = new MyEntity();
        myEntity.setId(1L);
        myRepository.save(myEntity);
        asyncService.executeAsync();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("====================================");
    }
}
