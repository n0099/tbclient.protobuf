package Bigvip;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Bigvip.UserInfoBigVip;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final UserInfoBigVip user_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
    } else {
      this.user_info = paramBuilder.user_info;
    } 
  }
}
