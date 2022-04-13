package PassFriend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
import tbclient.PassFriend.DataRes;

public final class PassFriendResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PassFriendResIdl(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
}
