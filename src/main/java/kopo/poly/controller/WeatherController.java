package kopo.poly.controller;

import jakarta.servlet.http.HttpServletRequest;
import kopo.poly.dto.WeatherDTO;
import kopo.poly.service.IWeatherService;
import kopo.poly.util.CmmUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RequestMapping(value = "/weather")
@RequiredArgsConstructor
@RestController
public class WeatherController {

    private final IWeatherService weatherService;

    @GetMapping(value = "/getWeather")
    public WeatherDTO getWeather(HttpServletRequest request) throws Exception {

        log.info(this.getClass().getName() + ".getWeather Start");

        String lat = CmmUtil.nvl(request.getParameter("lat"));
        String lon = CmmUtil.nvl(request.getParameter("lon"));

        WeatherDTO pDTO = WeatherDTO.builder()
                .lat(lat)
                .lon(lon)
                .build();

        WeatherDTO rDTO = Optional.ofNullable(weatherService.getWeather(pDTO))
                .orElseGet(WeatherDTO::new);



        log.info(this.getClass().getName() + ".getWeather End");

        return rDTO;
    }


}
