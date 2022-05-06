package DecryptCode;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_TIEBA_CODE = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tieba_code;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      str = paramBuilder.tieba_code;
      if (str == null) {
        this.tieba_code = "";
      } else {
        this.tieba_code = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.tieba_code = ((Builder)str).tieba_code;
    } 
  }
}
