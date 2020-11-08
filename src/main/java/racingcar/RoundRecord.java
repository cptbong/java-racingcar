package racingcar;

import java.util.LinkedHashMap;

public class RoundRecord {

    //입력 순서를 지키기 위해 LinkedHashMap 사용 강제화
    private LinkedHashMap<String, Integer> record;

    public RoundRecord(LinkedHashMap<String, Integer> record) {
        this.record = record;
    }

    public LinkedHashMap<String, Integer> getRecord() {
        return record;
    }
}