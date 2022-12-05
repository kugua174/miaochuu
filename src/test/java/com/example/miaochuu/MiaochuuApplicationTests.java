package com.example.miaochuu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.UUID;

@SpringBootTest(classes = com.waveshare.MiaochuuApplication.class)
class MiaochuuApplicationTests {

    @Test
    void contextLoads() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("aaaaa"+sdf.format(System.currentTimeMillis()));
    }
    @Test
    void getUUID(){
        for (int i = 0; i < 10; i++) {
            System.out.println(UUID.randomUUID().toString());
        }
    }

}
