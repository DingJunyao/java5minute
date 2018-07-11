package com.qingguatang.java5minute.course4;

import com.qingguatang.java5minute.course4.module.Comment;
import com.qingguatang.java5minute.course5.CommentPostControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: com.qingguatang.java5minute.course4.CommentControl
 * Description: TODO
 *
 * @author DingJunyao
 * @version V1.0
 * @date 2018-07-10 23:16
 **/
@Controller
public class CommentControl {
    @Autowired
    private CommentPostControl commentPostControl;
    @RequestMapping(value = "/comments")
    private String comments(ModelMap modelMap){
        List<Comment> comments = commentPostControl.getComments("35847388");
        modelMap.addAttribute("comments", comments);
        return "comments";
    }
}
