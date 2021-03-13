package racingcar;

import racingcar.car.Inputs;
import racingcar.car.NextStepCars;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Racing {
    Random random;
    Inputs inputs;

    public Racing() {
        this.random = new Random();
    }

    /**
     * 입력값들 받는다.
     * @return Scanner를 통한 입력값들
     * @param q1
     * @param q2
     */
    private void startQuestion(String q1, String q2) {
        InputView inputView = new InputView();
        String carNames = inputView.questionStart(q1);
        String attempt = inputView.questionStart(q2);
        this.inputs = new Inputs(carNames, Integer.parseInt(attempt));
//        return Arrays.asList(carNames, attempt);
    }

    /**
     * 레이싱 시작
     * @param q1 시도횟수질문
     * @param q2 자동차명질문
     */
    public void start(String q1, String q2) {
        startQuestion(q1, q2);

//        String carList = inputs.get(0);
//        int forwartCount = Integer.parseInt(inputs.get(1));

        NextStepCars nextStepCars = new NextStepCars(this.inputs);
        int forwartCount = this.inputs.getForwartCount();

        for (int i = 0; i < forwartCount; i++) {
            nextStepCars.move(random);
            nextStepCars.solveResult();
        }

        nextStepCars.solveWinner();
    }
}
