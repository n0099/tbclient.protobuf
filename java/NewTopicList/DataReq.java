package NewTopicList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_CALL_FROM = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String call_from;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      str = paramBuilder.call_from;
      if (str == null) {
        this.call_from = "";
      } else {
        this.call_from = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.call_from = ((Builder)str).call_from;
    } 
  }
}
