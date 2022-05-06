package PassFriend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PassFriend.friendInfo;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final friendInfo friend_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.friend_info = paramBuilder.friend_info;
    } else {
      this.friend_info = paramBuilder.friend_info;
    } 
  }
}
