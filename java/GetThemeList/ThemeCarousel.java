package GetThemeList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThemeCarousel extends Message {
  public static final String DEFAULT_ACTIVE_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String active_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic_url;
  
  public ThemeCarousel(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      str = paramBuilder.active_url;
      if (str == null) {
        this.active_url = "";
      } else {
        this.active_url = str;
      } 
    } else {
      this.pic_url = ((Builder)str).pic_url;
      this.active_url = ((Builder)str).active_url;
    } 
  }
}
