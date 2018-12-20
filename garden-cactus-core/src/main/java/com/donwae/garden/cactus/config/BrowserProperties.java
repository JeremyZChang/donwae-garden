package com.donwae.garden.cactus.config;

import com.donwae.garden.cactus.entity.enums.LoginType;

/**
 * Browser项目配置类
 * @auther Jeremy
 * 2018/10/31 下午5:01
 */
public class BrowserProperties {
    // 默认登陆页面
    private String loginPage = "/signin.html";
    // 默认登陆方式
    private LoginType loginType = LoginType.JSON;

    public String getLoginPage() {
        return loginPage;
    }

    public LoginType getLoginType() {
        return loginType;
    }

    public void setLoginType(LoginType loginType) {
        this.loginType = loginType;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
}
