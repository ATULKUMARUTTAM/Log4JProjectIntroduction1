package com.atuluttam.Log4JProjectIntroduction1;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
@Service
public class GreetService {
public String wish()
{
    String wish=null;
    LocalDateTime date = LocalDateTime.now();
    int hour = date.getHour();
    if (hour < 12)
    {
        wish= "GOOD MORNINGG!!!";
    } else if (hour<14) {
        wish = "GOOD AFTERNOON!!!";
    } else if (hour<18) {
        wish =  "GOOD EVENING!!!";
    }
    else
        wish =  "GOOD NIGHT!!!";
    return wish;
}}
