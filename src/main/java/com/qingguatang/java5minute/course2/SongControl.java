package com.qingguatang.java5minute.course2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: com.qingguatang.java5minute.course2.SongControl
 * Description: TODO
 *
 * @author DingJunyao
 * @version V1.0
 * @date 2018-07-09 20:48
 **/
@Controller
public class SongControl {
    @RequestMapping(value = "/song")
    public String getSong(@RequestParam(name = "id", required = false) String songId){
        if(songId == null) {
            songId = "1";
        }
        if(songId.equals("1")) {
            return "course2/1.html";
        } else {
            return "course2/other.html";
        }
    }
}
