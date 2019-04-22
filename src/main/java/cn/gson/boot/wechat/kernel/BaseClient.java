package cn.gson.boot.wechat.kernel;

import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : cn.gson.boot.wechat.kernel</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年04月22日</li>
 * <li>@author     : ____′↘夏悸</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public abstract class BaseClient {

    private RestTemplate restTemplate;

    public BaseClient() {
        this.restTemplate = new RestTemplate();
    }

    public String httpGet(String url, Map<String, Object> query) {
        return this.restTemplate.getForObject(this.getBaseUri() + url, String.class, query);
    }

    public String httpPost(String url, Map<String, Object> data) {
        return this.restTemplate.postForObject(this.getBaseUri() + url, data, String.class);
    }

    public String httpPost(String url, Map<String, Object> data, Map<String, Object> query) {
        return this.restTemplate.postForObject(this.getBaseUri() + url, data, String.class, query);
    }

    public abstract String getBaseUri();
}
