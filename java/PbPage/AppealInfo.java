package PbPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AppealInfo extends Message {
  public static final String DEFAULT_APPEAL_URL = "";
  
  public static final String DEFAULT_SOURCE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String appeal_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String source;
  
  public AppealInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.source;
      if (str1 == null) {
        this.source = "";
      } else {
        this.source = str1;
      } 
      str = paramBuilder.appeal_url;
      if (str == null) {
        this.appeal_url = "";
      } else {
        this.appeal_url = str;
      } 
    } else {
      this.source = ((Builder)str).source;
      this.appeal_url = ((Builder)str).appeal_url;
    } 
  }
}
