package cn.gson.boot.wechat;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

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
@Configuration
@EnableConfigurationProperties({WechatProperties.class})
@ConditionalOnWebApplication
public class SpringBootWechatAutoConfiguration {

}
