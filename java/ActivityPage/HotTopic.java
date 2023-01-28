package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomTopicList;

public final class HotTopic extends Message {
  public static final Integer DEFAULT_FLOOR_POSITION = Integer.valueOf(0);
  
  public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer floor_position;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecomTopicList> topic_list;
  
  public HotTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<RecomTopicList> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.floor_position;
      if (integer == null) {
        this.floor_position = DEFAULT_FLOOR_POSITION;
      } else {
        this.floor_position = integer;
      } 
      list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.floor_position = ((Builder)list).floor_position;
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
    } 
  }
  
  public HotTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotTopic> {
    public Integer floor_position;
    
    public List<RecomTopicList> topic_list;
    
    public Builder() {}
    
    public Builder(HotTopic param1HotTopic) {
      super(param1HotTopic);
      if (param1HotTopic == null)
        return; 
      this.floor_position = param1HotTopic.floor_position;
      this.topic_list = Message.copyOf(param1HotTopic.topic_list);
    }
    
    public HotTopic build(boolean param1Boolean) {
      return new HotTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
