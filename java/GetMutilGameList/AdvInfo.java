package GetMutilGameList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdvInfo extends Message {
  public static final String DEFAULT_AD_LINK_ANDROID = "";
  
  public static final String DEFAULT_AD_LINK_IOS = "";
  
  public static final String DEFAULT_AD_LINK_WEBVIEW = "";
  
  public static final String DEFAULT_AD_PIC = "";
  
  public static final String DEFAULT_GAME_ID = "";
  
  public static final String DEFAULT_GAME_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String ad_link_android;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String ad_link_ios;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String ad_link_webview;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String ad_pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String game_name;
  
  public AdvInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.game_name;
      if (str1 == null) {
        this.game_name = "";
      } else {
        this.game_name = str1;
      } 
      str1 = paramBuilder.game_id;
      if (str1 == null) {
        this.game_id = "";
      } else {
        this.game_id = str1;
      } 
      str1 = paramBuilder.ad_link_android;
      if (str1 == null) {
        this.ad_link_android = "";
      } else {
        this.ad_link_android = str1;
      } 
      str1 = paramBuilder.ad_link_webview;
      if (str1 == null) {
        this.ad_link_webview = "";
      } else {
        this.ad_link_webview = str1;
      } 
      str1 = paramBuilder.ad_link_ios;
      if (str1 == null) {
        this.ad_link_ios = "";
      } else {
        this.ad_link_ios = str1;
      } 
      str = paramBuilder.ad_pic;
      if (str == null) {
        this.ad_pic = "";
      } else {
        this.ad_pic = str;
      } 
    } else {
      this.game_name = ((Builder)str).game_name;
      this.game_id = ((Builder)str).game_id;
      this.ad_link_android = ((Builder)str).ad_link_android;
      this.ad_link_webview = ((Builder)str).ad_link_webview;
      this.ad_link_ios = ((Builder)str).ad_link_ios;
      this.ad_pic = ((Builder)str).ad_pic;
    } 
  }
}
