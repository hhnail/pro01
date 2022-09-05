package cn.hhnail.demo.test;

import org.junit.Test;

import java.util.UUID;

public class UuidTest {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
    }

    @Test
    public void test(){
        System.out.println(UUID.randomUUID().toString());
    }
}
