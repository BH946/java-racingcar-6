package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.CarGenerator;
import racingcar.domain.NumberGenerator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        //input
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        CarGenerator cars = new CarGenerator();
        System.out.println("시도할 회수는 몇회인가요?");
        Integer count = Integer.parseInt(Console.readLine());

        //run
        System.out.println("\n실행 결과");
        for(int t=0; t<count; t++) {
            Integer[] randNums = NumberGenerator.createRandomNumbers(cars.getNames().length);
            racing(cars, randNums);
            for(int i=0; i<cars.getNames().length;i++) {
                System.out.println(cars.getNames()[i][0]+" : "+cars.getNames()[i][1]);
            }
            System.out.println();
        }

        //winner

    }

    public static void racing(CarGenerator cars, Integer[] randNums) {
        // 자동차 위치 update
        String[][] names = new String[cars.getNames().length][2];
        for(int i=0; i<cars.getNames().length; i++) {
            if(randNums[i] >=4) cars.getNames()[i][1] += "-";
        }
    }
}
