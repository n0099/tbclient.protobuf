package CheckRealName;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final String DEFAULT_OBJ_SOURCE = "";
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String obj_source;
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      str = paramBuilder.obj_source;
      if (str == null) {
        this.obj_source = "";
      } else {
        this.obj_source = str;
      } 
    } else {
      this.common = ((Builder)str).common;
      this.obj_source = ((Builder)str).obj_source;
    } 
  }
}
