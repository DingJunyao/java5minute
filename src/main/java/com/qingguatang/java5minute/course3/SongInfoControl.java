package com.qingguatang.java5minute.course3;

import com.qingguatang.java5minute.course3.module.SongInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: com.qingguatang.java5minute.course3.SongInfoControl
 * Description: TODO
 *
 * @author DingJunyao
 * @version V1.0
 * @date 2018-07-10 22:43
 **/
@Controller
public class SongInfoControl {
    private static Map<String, SongInfo> songInfoMap = new HashMap<>();
    @RequestMapping(value = "/songinfo")
    public String index(String songId, ModelMap modelMap) {
        if(songId == null) {
            songId = "35847388";
        }
        SongInfo songInfo = songInfoMap.get(songId);
        modelMap.addAttribute("song", songInfo);
        return "index";
    }
    @RequestMapping(value = "/songinfo/get")
    @ResponseBody
    public SongInfo get(String songId) {
        SongInfo songInfo = songInfoMap.get(songId);
        return songInfo;
    }
    @PostConstruct
    public void init() {
        SongInfo songInfo = new SongInfo();
        songInfo.setId("35847388");
        songInfo.setName("Hello");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Hello");
        songInfo.setCommentCount(10);
        songInfo.setAlbumImg("http://p1.music.126.net/PrO7oPvnjvH4xdujdGbf2w==/1407374890649284.jpg");
        songInfo.setLyrics("Hello, it's me<br>你好吗 是我<br>I was wondering if after all these years you'd like to meet<br>我犹豫着要不要给你来电 不确定多年后你是否还愿相见<br>To go over everything<br>愿意闲聊寒暄 细数从前<br>They say that time's supposed to heal ya but I ain't done much healing<br>人们都说时间能治愈一切 但我却似乎没有更好一点<br>Hello, can you hear me<br>嘿 你在听吗<br>I'm in California dreaming about who we used to be<br>我还总能想起我们过去的种种美好<br>When we were younger and free<br>当时那年轻而向往自由的我们<br>I've forgotten how it felt before the world fell at our feet<br>我都快要忘了 但现实却让一切重现眼前<br>There's such a difference between us<br>我们之间的差距愈见明显<br>And a million miles<br>有如天差地别<br>Hello from the other side<br>我还是想打给你 即使相隔天边<br>I must've called a thousand times to tell you<br>即使打上千遍万遍我也想给你来电<br>I'm sorry, for everything that I've done<br>对我从前所有的一切说声抱歉<br>But when I call you never seem to be home<br>但我每次来电 似乎都是忙音不断没人接<br>Hello from the outside<br>但这相隔千里的来电<br>At least I can say that I've tried to tell you<br>至少能让我不留遗憾地告诉你<br>I'm sorry, for breaking your heart<br>抱歉我曾让你心碎成片<br>But it don't matter, it clearly doesn't tear you apart anymore<br>但值得庆幸 不会再有人让你悲痛欲绝<br>Hello, how are you<br>嗨 你最近还好吗<br>It's so typical of me to talk about myself<br>我已经习惯了自说自话帮你回答<br>I'm sorry, I hope that you're well<br>也希望你现在能好过一点<br>Did you ever make it out of that town<br>不知你是否已忘记那小城<br>Where nothing ever happened<br>那不再有故事发生的小城<br>It's no secret<br>毫无悬念<br>That the both of us are running out of time<br>我们都荒废了从前的那些时间<br>So hello from the other side<br>所以这来自远方的我的来电<br>I must've called a thousand times to tell you<br>即使打上千遍万遍我也想对你说<br>I'm sorry,<br>对我从前<br>for everything that I've done<br>所有的一切说声抱歉<br>But when I call you never seem to be home<br>但我每次来电 似乎都是忙音不断没人接<br>Hello from the outside<br>但这相隔千里的来电<br>At least I can say that I've tried to tell you<br>至少能让我不留遗憾地告诉你<br>I'm sorry, for breaking your heart<br>抱歉我曾让你心碎成片<br>But it don't matter<br>但值得庆幸<br>it clearly doesn't tear you apart anymore<br>不会再有人让你悲痛欲绝<br>but it won't<br>也不会再有<br>anymore<br>不会再有<br>anymore<br>不会再有<br>anymore<br>我们的从前<br>Hello from the other side<br>这来自远方的我的来电<br>I must've called a thousand times<br>即使打上千遍万遍<br>to tell you<br>我也想对你<br>I'm sorry,<br>说声抱歉<br>for everything that I've done<br>对我从前的一切说声抱歉<br>But when I call you never seem to be home<br>但我每次来电 似乎都是忙音不断没人接<br>Hello from the outside<br>但这相隔千里的来电<br>At least I can say that I've tried<br>至少能让我不留遗憾地<br>to tell you<br>告诉你<br>I'm sorry, for breaking your heart<br>抱歉我曾让你心碎成片<br>But it don't matter<br>但值得庆幸<br>it clearly doesn't tear you apart anymore<br>不会再有人让你悲痛欲绝");
        songInfoMap.put("35847388", songInfo);

        songInfo = new SongInfo();
        songInfo.setId("16435049");
        songInfo.setName("Someone Like You");
        songInfo.setSinger("Adele");
        songInfo.setAlbumName("Someone Like You");
        songInfo.setCommentCount(10);
        songInfo.setAlbumImg("http://p1.music.126.net/-g2ieFBmoy7T8crwFaAdxQ==/109951163077007716.jpg");
        songInfo.setLyrics("I heard<br>听说<br>That you are settled down<br>你已定下来<br>That you found a girl<br>找到了一个女孩<br>And your married now<br>现在结婚了<br>I heard<br>听说<br>That your dreams came true<br>你的梦想成真了<br>Guess she gave you things<br>看来她给了你<br>I didn't give to you<br>我没给的<br>Old friend<br>老友啊！<br>Why are you so shy<br>你干嘛那么害羞呢？<br>It ain't like you to hold back<br>支支吾吾或闪避眼神<br>Or hide from the light<br>这不像你啊<br>I hate to turn up out of the blue uninvited<br>我讨厌这种突如其来的场面<br>But I couldn't stay away I couldn't fight it<br>但我无法离开，无法抗拒<br>I had hoped you'd see my face and that you'd be reminded<br>我多希望你能看着我的脸 然后注意到<br>That for me, it isn't over<br>对我来说，一切还没结束啊<br>Never mind<br>放心吧！<br>I'll find someone like you<br>我会找到一个像你一样的人<br>I wish nothing but the best for you too<br>我也只是希望你一切顺利<br>Don't forget me I beg<br>我求你别忘了我<br>I'll remember you said<br>记得你说过<br>Sometimes it lasts in love<br>\"有时因爱而活<br>But sometimes it hurts instead<br>有时却也因它而受伤\"<br>Sometimes it lasts in love<br>\"有时因爱而活<br>But sometimes it hurts instead<br>有时却也因它而受伤\"<br>You know how the time flies<br>你知道时间过得多快<br>Only yesterday was the time of our lives<br>我们那些难忘时刻才在昨天<br>We were born and raised<br>我们就在夏雾里<br>In a summer haze<br>长大<br>Bound by the surprise<br>随着惊喜的往日美好时光<br>Of our glory days<br>而在一起<br>I hate to turn up out of the blue uninvited<br>我讨厌这种突如其来的场面<br>But I couldn't stay away I couldn't fight it<br>但我无法离开，无法抗拒<br>I had hoped you'd see my face and that you'd be reminded<br>我多希望你能看着我的脸 然后注意到<br>That for me, it isn't over<br>对我来说，一切还没结束啊<br>Never mind<br>放心吧！<br>I'll find someone like you<br>我会找到一个像你一样的人<br>I wish nothing but the best<br>我也只是希望你<br>For you too<br>一切顺利<br>Don't forget me I beg<br>我求你别忘了我<br>I'll remember you said<br>记得你说过<br>Sometimes it lasts in love<br>\"有时因爱而活<br>But sometimes it hurts instead<br>有时却也因它而受伤\"<br>Nothing compares<br>凡事比不上<br>No worries or cares<br>无忧无虑<br>Regrets and mistakes<br>但留在记忆中的<br>They're memories made<br>尽是懊悔与所犯的错<br>Who would have known<br>这个中<br>How bitter sweet<br>滋味<br>This would taste<br>谁知<br>Never mind<br>放心吧！<br>I'll find someone like you<br>我会找到一个像你一样的人<br>I wish nothing but the best<br>我也只是希望你<br>For you<br>一切顺利<br>Don't forget me I beg<br>我求你别忘了我<br>I'll remember you said<br>记得你说过<br>Sometimes it lasts in love<br>\"有时因爱而活<br>But sometimes it hurts instead<br>有时却也因它而受伤\"<br>Never mind<br>放心吧！<br>I'll find someone like you<br>我会找到一个像你一样的人<br>I wish nothing but the best<br>我也只是希望你<br>For you too<br>一切顺利<br>Don't forget me I beg<br>我求你别忘了我<br>I'll remember you said<br>记得你说过<br>Sometimes it lasts in love<br>\"有时因爱而活<br>But sometimes it hurts instead<br>有时却也因它而受伤\"<br>Sometimes it lasts in love<br>\"有时因爱而活<br>But sometimes it hurts instead<br>有时却也因它而受伤\"");        
        songInfoMap.put("16435049", songInfo);
    }
}
