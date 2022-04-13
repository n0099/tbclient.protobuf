package GetSuggestionByAddrName;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_ADDR_NAME = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String addr_name;
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.addr_name;
      if (str == null) {
        this.addr_name = "";
      } else {
        this.addr_name = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.addr_name = paramBuilder.addr_name;
      this.common = paramBuilder.common;
    } 
  }
}
