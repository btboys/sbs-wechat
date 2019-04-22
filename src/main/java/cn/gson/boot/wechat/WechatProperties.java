package cn.gson.boot.wechat;

import cn.gson.boot.wechat.properties.MiniProgramProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : cn.gson.boot.wechat</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年04月22日</li>
 * <li>@author     : ____′↘夏悸</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@ConfigurationProperties(prefix = "sbs.wechat")
@Data
public class WechatProperties {

    private Map<String, MiniProgramProperties> miniProgram;

    private Map<String, MiniProgramProperties> officialAccount;

    private Map<String, MiniProgramProperties> openPlatform;

    private Map<String, MiniProgramProperties> payment;

    private Map<String, MiniProgramProperties> work;
}
