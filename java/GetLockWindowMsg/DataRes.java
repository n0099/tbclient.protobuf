package GetLockWindowMsg;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetLockWindowMsg.LockWindowThreadInfo;
import tbclient.User;

public final class DataRes extends Message {
  public static final String DEFAULT_PUBLISH_PIC = "";
  
  public static final String DEFAULT_PUBLISH_USER = "";
  
  @ProtoField(tag = 1)
  public final User author;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String publish_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String publish_user;
  
  @ProtoField(tag = 4)
  public final LockWindowThreadInfo thread_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.author = paramBuilder.author;
      String str = paramBuilder.publish_pic;
      if (str == null) {
        this.publish_pic = "";
      } else {
        this.publish_pic = str;
      } 
      str = paramBuilder.publish_user;
      if (str == null) {
        this.publish_user = "";
      } else {
        this.publish_user = str;
      } 
      this.thread_info = paramBuilder.thread_info;
    } else {
      this.author = paramBuilder.author;
      this.publish_pic = paramBuilder.publish_pic;
      this.publish_user = paramBuilder.publish_user;
      this.thread_info = paramBuilder.thread_info;
    } 
  }
}
