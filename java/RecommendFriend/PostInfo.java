package RecommendFriend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PostInfo extends Message {
  public static final String DEFAULT_COMMON_POST_PIC = "";
  
  public static final String DEFAULT_LARGE_POST_PIC = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String common_post_pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String large_post_pic;
  
  public PostInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.common_post_pic;
      if (str1 == null) {
        this.common_post_pic = "";
      } else {
        this.common_post_pic = str1;
      } 
      str = paramBuilder.large_post_pic;
      if (str == null) {
        this.large_post_pic = "";
      } else {
        this.large_post_pic = str;
      } 
    } else {
      this.common_post_pic = ((Builder)str).common_post_pic;
      this.large_post_pic = ((Builder)str).large_post_pic;
    } 
  }
}
