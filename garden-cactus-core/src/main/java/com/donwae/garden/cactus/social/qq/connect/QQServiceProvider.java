package com.donwae.garden.cactus.social.qq.connect;

import com.donwae.garden.cactus.social.qq.api.QQ;
import com.donwae.garden.cactus.social.qq.api.QQImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

/**
 * TODO
 *
 * @auther Jeremy
 * 2018/11/7 下午2:27
 */
public class QQServiceProvider extends AbstractOAuth2ServiceProvider<QQ> {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private String appId;

    private static final String URL_AUTHORIZE = "https://graph.qq.com/oauth2.0/authorize";

    private static final String URL_ACCESS_TOKEN = "https://graph.qq.com/oauth2.0/token";

    public QQServiceProvider(String appId, String appSecret) {
        super(new OAuth2Template(appId, appSecret, URL_AUTHORIZE, URL_ACCESS_TOKEN));
    }

    @Override
    public QQ getApi(String accessToken) {
        return new QQImpl(accessToken, appId);
    }
}
