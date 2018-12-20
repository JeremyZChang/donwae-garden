package com.donwae.garden.cactus.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Security配置类
 * @auther Jeremy
 * 2018/10/31 下午5:02
 */
@ConfigurationProperties(prefix = "cactus.security" )
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
