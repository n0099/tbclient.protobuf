package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumActiveInfo extends Message {
  public static final String DEFAULT_FORUM_BRIEF = "";
  
  public static final String DEFAULT_FORUM_SHARE_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_brief;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_share_url;
  
  public ForumActiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.forum_brief;
      if (str1 == null) {
        this.forum_brief = "";
      } else {
        this.forum_brief = str1;
      } 
      str = paramBuilder.forum_share_url;
      if (str == null) {
        this.forum_share_url = "";
      } else {
        this.forum_share_url = str;
      } 
    } else {
      this.forum_brief = ((Builder)str).forum_brief;
      this.forum_share_url = ((Builder)str).forum_share_url;
    } 
  }
}
