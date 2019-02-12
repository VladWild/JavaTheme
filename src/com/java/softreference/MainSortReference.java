package com.java.softreference;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainSortReference {
    public static void main(String[] args) {
        Map<String, SoftReference<SchedulingData>> schedulingDataMap = new HashMap<>();

        SoftReference<SchedulingData> schedulingDataSoftReference = new SoftReference<>(new SchedulingData(11));
        schedulingDataMap.put("1", schedulingDataSoftReference);
        SoftReference<SchedulingData> schedulingDataSoftReference2 = new SoftReference<>(new SchedulingData(22));
        schedulingDataMap.put("2", schedulingDataSoftReference2);

        List<SchedulingData> list = schedulingDataMap.values()
                .stream().map(SoftReference::get).collect(Collectors.toList());

        System.out.println(list);
    }
}

class SchedulingData {
    int i;

    public SchedulingData(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "SchedulingData{" +
                "i=" + i +
                '}';
    }
}

