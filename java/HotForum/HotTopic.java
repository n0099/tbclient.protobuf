package tbclient.HotForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HotTopic extends Message {
  public static final String DEFAULT_TITLE = "";
  
  public static final List<HotTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<HotTopicList> topic_list;
  
  public HotTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<HotTopicList> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
    } 
  }
  
  public HotTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotTopic> {
    public String title;
    
    public List<HotTopicList> topic_list;
    
    public Builder() {}
    
    public Builder(HotTopic param1HotTopic) {
      super(param1HotTopic);
      if (param1HotTopic == null)
        return; 
      this.title = param1HotTopic.title;
      this.topic_list = Message.copyOf(param1HotTopic.topic_list);
    }
    
    public HotTopic build(boolean param1Boolean) {
      return new HotTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
