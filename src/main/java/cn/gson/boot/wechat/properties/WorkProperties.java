package cn.gson.boot.wechat.properties;

import lombok.Data;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : 企业微信配置</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年04月22日</li>
 * <li>@author     : ____′↘夏悸</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Data
public class WorkProperties {

    private boolean isDefault = false;
    
    private String corpId;

    private String agentId;

    private String secret;
}
