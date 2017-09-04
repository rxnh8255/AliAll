#阿里云移动端服务

集成的阿里云的push服务.热修复服务

## Installing the plugin

1.在阿里控制台的移动推送中按照官方文档配置appkey和appsecret,服务端请参考[阿里移动推送文档](https://help.aliyun.com/document_detail/48038.html?spm=5176.doc30066.6.591.hYl0WZ "移动推送文档")
  热修复参考[阿里移动热修复文档](https://help.aliyun.com/document_detail/53240.html?spm=5176.2020520107.0.0.719a8383dmwNgw "热修复文档")

2.如果小米id和小米key是空的.可以填null
```
参数说明:
MIID        :   推送服务的小米ID,没有的话可以填null
MIKEY       :   推送服务的小米Key,没有的话可以填null
APPKEY      :   推送服务的阿里key,使用推送的话必填
APPSECRET   :   推送服务的阿里Secret,推送服务必填
ALIFIXIDSECRET: 热修复ID
ALIFIXAPPSECRET:热修复Secret
ALIFIXRSASECRET:热修复RSA

cordova plugin add cordova-plugin-alipush --variable MIID=your miid --variable MIKEY=your mikey --variable APPKEY=yourappkey  --variable APPSECRET=yourappsecret --variable ALIFIXIDSECRET=热修复ID --variable ALIFIXAPPSECRET=热修复idsecret --variable ALIFIXRSASECRET=热修复rsasecrest
```

3.application 查看一下属性 android:name="com.blanktrack.alipush.MyApplication",
    如果是其他的值,请在class里面添加
```java
import static com.blanktrack.aliall.PushPlugin.initCloudChannel;
import static com.blanktrack.aliall.PushPlugin.initHotfix;
@Override
public void onCreate() {
    super.onCreate();
    initHotfix(this);
    initCloudChannel(this);
}
```

## Using the plugin

使用init绑定帐号,根据该帐号单独推送消息给用户
```javascript
window.PushPlugin.init({account:'test'})
```

