package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrsPage.SignForum;
import tbclient.FrsPage.SignUser;

public final class SignInfo extends Message {
  @ProtoField(tag = 2)
  public final SignForum forum_info;
  
  @ProtoField(tag = 1)
  public final SignUser user_info;
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      this.forum_info = paramBuilder.forum_info;
    } else {
      this.user_info = paramBuilder.user_info;
      this.forum_info = paramBuilder.forum_info;
    } 
  }
}
