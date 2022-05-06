package GetUserByTiebaUid;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final User user;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
    } else {
      this.user = paramBuilder.user;
    } 
  }
}
