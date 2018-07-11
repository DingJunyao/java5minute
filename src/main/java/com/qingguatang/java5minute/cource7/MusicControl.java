package com.qingguatang.java5minute.cource7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: com.qingguatang.java5minute.cource7.MusicControl
 * Description: TODO
 *
 * @author DingJunyao
 * @version V1.0
 * @date 2018-07-11 13:31
 **/
@Controller
public class MusicControl {
    private static final Map<String, String> musics = new HashMap<>();
    @RequestMapping(value = "/song/music")
    @ResponseBody
    public String getMusicSrc(String songId) {
        return musics.get(songId);
    }
    @PostConstruct
    public void init() {
        musics.put("35847388", "http://m10.music.126.net/20180711135420/eb316a3d474e7e011d01076d92027ea0/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");
        musics.put("16435049", "http://m10.music.126.net/20180711141908/9a64c22f3133513612da7d8700ece8dd/ymusic/0cce/0768/52ed/db86bd40d6ba02bc4dc09cc942216662.mp3");
    }
}
