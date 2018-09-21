package cn.entity;

import lombok.Data;

@Data
public class Main {
    private Integer id;
    private Integer district_id;
    private String monitor_time;
    private Integer pm10;
    private Integer pm25;
    private String monitoring_station;
    private String last_modify_time;
    private String name;


}
