package IncrForumAccessCount;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.FrequentlyForumInfo;

public final class DataRes extends Message {
  @ProtoField(tag = 1)
  public final FrequentlyForumInfo frequently_forum_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      this.frequently_forum_info = paramBuilder.frequently_forum_info;
    } else {
      this.frequently_forum_info = paramBuilder.frequently_forum_info;
    } 
  }
}
