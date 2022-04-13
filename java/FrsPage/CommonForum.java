package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CommonForum extends Message {
  public static final String DEFAULT_COMMON_FORUM = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String common_forum;
  
  public CommonForum(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.common_forum;
      if (str == null) {
        this.common_forum = "";
      } else {
        this.common_forum = str;
      } 
    } else {
      this.common_forum = ((Builder)str).common_forum;
    } 
  }
}
