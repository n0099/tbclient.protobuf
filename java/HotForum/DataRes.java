package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static final List<ForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ForumInfo> forum_info;
  
  @ProtoField(tag = 2)
  public final HotSearch hot_search;
  
  @ProtoField(tag = 3)
  public final HotTopic hot_topic;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ForumInfo> list = paramBuilder.forum_info;
      if (list == null) {
        this.forum_info = DEFAULT_FORUM_INFO;
      } else {
        this.forum_info = Message.immutableCopyOf(list);
      } 
      this.hot_search = paramBuilder.hot_search;
      this.hot_topic = paramBuilder.hot_topic;
    } else {
      this.forum_info = Message.immutableCopyOf(paramBuilder.forum_info);
      this.hot_search = paramBuilder.hot_search;
      this.hot_topic = paramBuilder.hot_topic;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ForumInfo> forum_info;
    
    public HotSearch hot_search;
    
    public HotTopic hot_topic;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.forum_info = Message.copyOf(param1DataRes.forum_info);
      this.hot_search = param1DataRes.hot_search;
      this.hot_topic = param1DataRes.hot_topic;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
