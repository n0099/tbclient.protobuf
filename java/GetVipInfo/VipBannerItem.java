package GetVipInfo;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipBannerItem extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public VipBannerItem(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.desc;
      if (str1 == null) {
        this.desc = "";
      } else {
        this.desc = str1;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
    } else {
      this.img_url = ((Builder)str).img_url;
      this.title = ((Builder)str).title;
      this.desc = ((Builder)str).desc;
      this.link = ((Builder)str).link;
    } 
  }
}
