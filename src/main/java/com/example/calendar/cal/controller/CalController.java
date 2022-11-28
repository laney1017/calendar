package com.example.calendar.cal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Calendar;

@RestController
public class CalController {
    private ArrayList<Calendar> calList = new ArrayList<>();

    // 1. GET방식의 /all/schedule  요청으로 할 일의 ArrayList<Calendar> 을 JSON Ajax방식으로 화면으로 가져 갑니다.
    @GetMapping("/all/schedule")
    public ArrayList<Calendar> allSchedule() {
        return calList;
    }

    // 2. GET방식의 /put/schedule 요청으로 할 일을 등록합니다,
    // 파라미터로는 title,date을 String 형태로 넘겨 줍니다. 등록이 완료된 후에 1번과 같은 응답을 주세요.
    @GetMapping("/put/schedule")
    public ArrayList<Calendar> putSchedule(Calendar cal) {
        calList.add(cal);
        return calList;
    }
}
