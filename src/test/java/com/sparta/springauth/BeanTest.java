package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class BeanTest {

    @Autowired
    @Qualifier("pizza")
    Food food;
//    Food pizza;

//    @Autowired
//    Food chicken;

    @Test
    @DisplayName("테스트")
    // @Primary 와 @Qualifier 차이 및 우선순위 @Qualifier 좁은 지역 우선순위
    void test1(){
//        pizza.eat();
//        chicken.eat();
        food.eat();

    }
}
