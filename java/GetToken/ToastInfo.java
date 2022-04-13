package GetToken;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ToastInfo extends Message {
  public static final String DEFAULT_BTNTEXT = "";
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final String DEFAULT_SHARETOKEN = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String btntext;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String sharetoken;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public ToastInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.message;
      if (str1 == null) {
        this.message = "";
      } else {
        this.message = str1;
      } 
      str1 = paramBuilder.btntext;
      if (str1 == null) {
        this.btntext = "";
      } else {
        this.btntext = str1;
      } 
      str = paramBuilder.sharetoken;
      if (str == null) {
        this.sharetoken = "";
      } else {
        this.sharetoken = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.message = ((Builder)str).message;
      this.btntext = ((Builder)str).btntext;
      this.sharetoken = ((Builder)str).sharetoken;
    } 
  }
}
