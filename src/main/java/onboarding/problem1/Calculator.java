package onboarding.problem1;

public class Calculator {

    public static int getEachNumber(int pageNumber) {
        int eachNumberBySum = 0;
        int eachNumberByMul = 1;

        /**
         * 공통 실행 코드 추출
         * else 키워드 제거
         */
        while (pageNumber != 0 && pageNumber != 400) {

            eachNumberBySum += pageNumber % 10;
            eachNumberByMul *= pageNumber % 10;

            pageNumber /= 10;
        }

        int result = eachNumberBySum > eachNumberByMul ? eachNumberBySum : eachNumberByMul ;

        return result;
    }
}


