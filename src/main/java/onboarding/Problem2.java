package onboarding;

import java.util.Iterator;
import java.util.LinkedList;

import static onboarding.problem2.Returner.returnLinkedList;
import static onboarding.problem2.Tester.testingDuplicate;

public class Problem2 {
    public static String solution(String cryptogram) {

        String result = "";

        LinkedList<String> linkedList = new LinkedList<>();

        // 문자열 저장을 순회
        for (int i = 0; i < cryptogram.length(); i++) {
            Character c = cryptogram.charAt(i);
            Character d = cryptogram.charAt(i + 1);

            // 중복 여부 == true시 삭제
            if (c == d) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.deleteCharAt(c);
                stringBuilder.deleteCharAt(d);

            }

            // 삭제후 남은 문자 저장
            for (String character : linkedList) {
                linkedList.add(character);
            }


            // linkedList에 저장된 값 문자열로 전달
            Iterator<String> stringIterator = returnLinkedList(linkedList);

        }

        return result;

    }
}


