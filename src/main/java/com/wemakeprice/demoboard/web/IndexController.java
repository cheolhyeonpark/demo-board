package com.wemakeprice.demoboard.web;

import com.wemakeprice.demoboard.config.auth.dto.SessionUser;
import com.wemakeprice.demoboard.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/user")
    public String index(Model model) {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        if (user != null) {
            return user.getName();
        }
        return "null";
    }
}
