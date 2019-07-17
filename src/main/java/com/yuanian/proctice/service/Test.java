package com.yuanian.proctice.service;

public class Test {
    public static void main(String[] args) {
        TestInterface testInterface = message -> System.out.println("你输入的字符串为："+message);
        testInterface.say("sfasdfa");
    }
}
