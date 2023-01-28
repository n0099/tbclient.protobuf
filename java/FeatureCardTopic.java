package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class FeatureCardTopic extends Message {
  public static final Integer DEFAULT_FLOOR;
  
  public static final List<FeatureCardTopicSubNode> DEFAULT_SUB_NODES;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<FeatureCardTopicSubNode> sub_nodes;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_FLOOR = integer;
    DEFAULT_SUB_NODES = Collections.emptyList();
  }
  
  public FeatureCardTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<FeatureCardTopicSubNode> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.floor;
      if (integer == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.sub_nodes;
      if (list == null) {
        this.sub_nodes = DEFAULT_SUB_NODES;
      } else {
        this.sub_nodes = Message.immutableCopyOf(list);
      } 
    } else {
      this.type = ((Builder)list).type;
      this.floor = ((Builder)list).floor;
      this.title = ((Builder)list).title;
      this.sub_nodes = Message.immutableCopyOf(((Builder)list).sub_nodes);
    } 
  }
  
  public FeatureCardTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FeatureCardTopic> {
    public Integer floor;
    
    public List<FeatureCardTopicSubNode> sub_nodes;
    
    public String title;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(FeatureCardTopic param1FeatureCardTopic) {
      super(param1FeatureCardTopic);
      if (param1FeatureCardTopic == null)
        return; 
      this.type = param1FeatureCardTopic.type;
      this.floor = param1FeatureCardTopic.floor;
      this.title = param1FeatureCardTopic.title;
      this.sub_nodes = Message.copyOf(param1FeatureCardTopic.sub_nodes);
    }
    
    public FeatureCardTopic build(boolean param1Boolean) {
      return new FeatureCardTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
