package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopicInfo extends Message {
  public static final String DEFAULT_DESC = "";
  
  public static final Integer DEFAULT_IS_HOT;
  
  public static final Integer DEFAULT_TAG;
  
  public static final Long DEFAULT_TOPIC_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_TOPIC_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_hot;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer tag;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String topic_name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_HOT = integer;
    DEFAULT_TAG = integer;
  }
  
  public TopicInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.topic_id;
      if (long_ == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_;
      } 
      String str = paramBuilder.topic_name;
      if (str == null) {
        this.topic_name = "";
      } else {
        this.topic_name = str;
      } 
      str = paramBuilder.desc;
      if (str == null) {
        this.desc = "";
      } else {
        this.desc = str;
      } 
      Integer integer1 = paramBuilder.is_hot;
      if (integer1 == null) {
        this.is_hot = DEFAULT_IS_HOT;
      } else {
        this.is_hot = integer1;
      } 
      integer = paramBuilder.tag;
      if (integer == null) {
        this.tag = DEFAULT_TAG;
      } else {
        this.tag = integer;
      } 
    } else {
      this.topic_id = ((Builder)integer).topic_id;
      this.topic_name = ((Builder)integer).topic_name;
      this.desc = ((Builder)integer).desc;
      this.is_hot = ((Builder)integer).is_hot;
      this.tag = ((Builder)integer).tag;
    } 
  }
  
  public TopicInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicInfo> {
    public String desc;
    
    public Integer is_hot;
    
    public Integer tag;
    
    public Long topic_id;
    
    public String topic_name;
    
    public Builder() {}
    
    public Builder(TopicInfo param1TopicInfo) {
      super(param1TopicInfo);
      if (param1TopicInfo == null)
        return; 
      this.topic_id = param1TopicInfo.topic_id;
      this.topic_name = param1TopicInfo.topic_name;
      this.desc = param1TopicInfo.desc;
      this.is_hot = param1TopicInfo.is_hot;
      this.tag = param1TopicInfo.tag;
    }
    
    public TopicInfo build(boolean param1Boolean) {
      return new TopicInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
