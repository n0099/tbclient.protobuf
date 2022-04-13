package GetToken;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_SHOUBAICUID = "";
  
  public static final String DEFAULT_TOKEN = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String shoubaicuid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String token;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.token;
      if (str1 == null) {
        this.token = "";
      } else {
        this.token = str1;
      } 
      str = paramBuilder.shoubaicuid;
      if (str == null) {
        this.shoubaicuid = "";
      } else {
        this.shoubaicuid = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.token = ((Builder)str).token;
      this.shoubaicuid = ((Builder)str).shoubaicuid;
    } 
  }
}
