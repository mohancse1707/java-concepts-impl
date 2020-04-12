package com.mohan.javasample.StringEqual;

public class CodePumpkinDemo {
    public static void main(String[] args) {
        ImmutableUser user = new ImmutableUser.UserBuilder("pumpkin", "password")
                                .firstName("Pumpkin")           
                                .lastName("PapaPumpkin")
                                .email("pumpkin@codepumpkin.com")
                                .build();
    }
}