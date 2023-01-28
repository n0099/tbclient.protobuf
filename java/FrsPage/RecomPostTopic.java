package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecomPostTopic extends Message {
  public static final String DEFAULT_RECOM_TITLE = "";
  
  public static final String DEFAULT_RECOM_TOPIC = "";
  
  public static final Long DEFAULT_UNIQ_TOPICID = Long.valueOf(0L);
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String recom_title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String recom_topic;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long uniq_topicid;
  
  public RecomPostTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.recom_title;
      if (str == null) {
        this.recom_title = "";
      } else {
        this.recom_title = str;
      } 
      str = paramBuilder.recom_topic;
      if (str == null) {
        this.recom_topic = "";
      } else {
        this.recom_topic = str;
      } 
      long_ = paramBuilder.uniq_topicid;
      if (long_ == null) {
        this.uniq_topicid = DEFAULT_UNIQ_TOPICID;
      } else {
        this.uniq_topicid = long_;
      } 
    } else {
      this.recom_title = ((Builder)long_).recom_title;
      this.recom_topic = ((Builder)long_).recom_topic;
      this.uniq_topicid = ((Builder)long_).uniq_topicid;
    } 
  }
  
  public RecomPostTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecomPostTopic> {
    public String recom_title;
    
    public String recom_topic;
    
    public Long uniq_topicid;
    
    public Builder() {}
    
    public Builder(RecomPostTopic param1RecomPostTopic) {
      super(param1RecomPostTopic);
      if (param1RecomPostTopic == null)
        return; 
      this.recom_title = param1RecomPostTopic.recom_title;
      this.recom_topic = param1RecomPostTopic.recom_topic;
      this.uniq_topicid = param1RecomPostTopic.uniq_topicid;
    }
    
    public RecomPostTopic build(boolean param1Boolean) {
      return new RecomPostTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
