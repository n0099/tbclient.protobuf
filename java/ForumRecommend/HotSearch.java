package ForumRecommend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ForumRecommend.SearchValue;

public final class HotSearch extends Message {
  public static final String DEFAULT_SEARCH_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String search_title;
  
  @ProtoField(tag = 2)
  public final SearchValue search_value;
  
  public HotSearch(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.search_title;
      if (str == null) {
        this.search_title = "";
      } else {
        this.search_title = str;
      } 
      this.search_value = paramBuilder.search_value;
    } else {
      this.search_title = paramBuilder.search_title;
      this.search_value = paramBuilder.search_value;
    } 
  }
}
