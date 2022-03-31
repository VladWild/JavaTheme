package com.java.new_packege;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*Thread thread = new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println(Thread.currentThread().getName() + " " + i++);
            }
        });
        thread.start();

        Thread.sleep(2000);

        thread.interrupt();

        Thread.sleep(10000);*/


    }

    static class Service {

        ResponseDto dscdc() {
            UserService userService = new UserService();

            List<User> users = userService.get();

            List<List<User>> results = new ArrayList<>();
            for (int age = 20; age <= 100; age += 10) {

                int finalAge = age;
                List<User> collect = users.stream().filter(u -> u.getAge() < finalAge)
                        .collect(Collectors.toList());
                results.add(collect);
            }
            return new ResponseDto(results);
        }
    }

    static class ResponseDto {

        public ResponseDto(List<List<User>> results) {

        }
    }

    static class UserService {

        public List<User> get() {
            return new ArrayList<>();
        }
    }

    static class User {
int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
