package CompleteTask;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_COMPELETE_ID = "";
  
  public static final String DEFAULT_SHOUBAICUID = "";
  
  public static final String DEFAULT_TOKEN = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String compelete_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String shoubaicuid;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String token;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      String str1 = paramBuilder.shoubaicuid;
      if (str1 == null) {
        this.shoubaicuid = "";
      } else {
        this.shoubaicuid = str1;
      } 
      str1 = paramBuilder.compelete_id;
      if (str1 == null) {
        this.compelete_id = "";
      } else {
        this.compelete_id = str1;
      } 
      str = paramBuilder.token;
      if (str == null) {
        this.token = "";
      } else {
        this.token = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.shoubaicuid = ((Builder)str).shoubaicuid;
      this.compelete_id = ((Builder)str).compelete_id;
      this.token = ((Builder)str).token;
    } 
  }
}
