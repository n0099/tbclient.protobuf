package GetTails;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static final String DEFAULT_ST_TYPE = "";
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String st_type;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.st_type;
      if (str == null) {
        this.st_type = "";
      } else {
        this.st_type = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.st_type = paramBuilder.st_type;
      this.common = paramBuilder.common;
    } 
  }
}
