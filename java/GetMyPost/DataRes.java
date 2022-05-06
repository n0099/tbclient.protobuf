package GetMyPost;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetMyPost.User_Info;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(tag = 2)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 1)
  public final User_Info user_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      this.thread_info = paramBuilder.thread_info;
      str = paramBuilder.partial_visible_toast;
      if (str == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str;
      } 
    } else {
      this.user_info = ((Builder)str).user_info;
      this.thread_info = ((Builder)str).thread_info;
      this.partial_visible_toast = ((Builder)str).partial_visible_toast;
    } 
  }
}
