package kopo.poly.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class WeatherDTO {

    private String lat;

    private String lon;

    private double currentTemp;

    private List<WeatherDailyDTO> dailyList;
}
