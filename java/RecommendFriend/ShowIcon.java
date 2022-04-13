package RecommendFriend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ShowIcon extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public ShowIcon(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.icon = ((Builder)str).icon;
      this.name = ((Builder)str).name;
      this.url = ((Builder)str).url;
    } 
  }
}
