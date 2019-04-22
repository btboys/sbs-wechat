package cn.gson.boot.wechat.properties;

import lombok.Data;

/**
 * <p>****************************************************************************</p>
 * <p><b>Copyright © 2010-2019 soho team All Rights Reserved<b></p>
 * <ul style="margin:15px;">
 * <li>Description : 微信支付配置</li>
 * <li>Version     : 1.0</li>
 * <li>Creation    : 2019年04月22日</li>
 * <li>@author     : ____′↘夏悸</li>
 * </ul>
 * <p>****************************************************************************</p>
 */
@Data
public class PaymentProperties {

    private boolean sandbox = false;
    private boolean isDefault = false;
    private String mchId;
    private String key;
    private String certPath;
    private String keyPath;
    private String notifyUrl;
}
