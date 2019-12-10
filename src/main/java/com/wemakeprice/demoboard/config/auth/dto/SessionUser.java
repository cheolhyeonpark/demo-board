package com.wemakeprice.demoboard.config.auth.dto;

import com.wemakeprice.demoboard.domain.user.User;

public class SessionUser {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
