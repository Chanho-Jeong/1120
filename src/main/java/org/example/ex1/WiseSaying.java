package org.example.ex1;

import java.util.*;

public class WiseSaying {
    public static  String shuffleNumbers() {

        // 1~5의 숫자 리스트 생성
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        //숫자마다 글 삽입하기
        Map<Integer, String> mapping = new HashMap<>();
        mapping.put(1, "나는 비빔인간입니다");
        mapping.put(2, "아직 난 배고프다");
        mapping.put(3, "셋중 하나는 멍청이다");
        mapping.put(4, "개와 대화하려하지마라");
        mapping.put(5, "시간은 항상 없다");

        // 리스트 셔플
        Collections.shuffle(numbers);

        //하나뽑기
        int selectedNumber = numbers.get(0);

        //대사출력 - 여기부분 잘 이해 안감
        String result = selectedNumber+":"+mapping.get(selectedNumber);

        return result;

    }
}


