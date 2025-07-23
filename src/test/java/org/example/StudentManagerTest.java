package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
class StudentManagerTest {
    private  StudentManager manager;
    @BeforeEach
    void setupAll(){
        System.out.println("String Student manager tests");
    }
    @BeforeEach
    void setup(){
        manager=new StudentManager("Alice",80,90,86);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test finished");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("All tests done.");
    }
}