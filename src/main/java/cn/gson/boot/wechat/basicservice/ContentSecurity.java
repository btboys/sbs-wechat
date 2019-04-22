package cn.gson.boot.wechat.basicservice;

import cn.gson.boot.wechat.kernel.BaseClient;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : cn.gson.boot.wechat.basicservice</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年04月22日</li>
 * <li>@author     : ____′↘夏悸</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
public class ContentSecurity extends BaseClient {

    @Override
    public String getBaseUri() {
        return "https://api.weixin.qq.com/wxa/";
    }

    public String checkText(String text) {
        Map<String, Object> query = new HashMap<>(1);
        query.put("content", text);
        return this.httpPost("msg_sec_check", query);
    }
}
