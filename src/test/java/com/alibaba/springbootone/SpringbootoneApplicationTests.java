package com.alibaba.springbootone;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootoneApplicationTests {

    private static boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()-> {
            while(flag) {
            }
        }).start();
        Thread.sleep(2000);
        new Thread(() -> {
            flag = false;
            System.out.println("修改了共享变量flag的值");
        }).start();
    }

}
