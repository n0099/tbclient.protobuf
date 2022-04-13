package GetUserBfbInfo;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.UserBfbInfo;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final UserBfbInfo bfb;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.bfb = paramBuilder.bfb;
    } else {
      this.bfb = paramBuilder.bfb;
    } 
  }
}
