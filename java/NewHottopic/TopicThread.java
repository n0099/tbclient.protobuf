package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class TopicThread extends Message {
  public static final Long DEFAULT_FEED_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_SOURCE;
  
  public static final Integer DEFAULT_USER_AGREE;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long feed_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer source;
  
  @ProtoField(tag = 2)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer user_agree;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_AGREE = integer;
    DEFAULT_SOURCE = integer;
  }
  
  public TopicThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.feed_id;
      if (long_ == null) {
        this.feed_id = DEFAULT_FEED_ID;
      } else {
        this.feed_id = long_;
      } 
      this.thread_info = paramBuilder.thread_info;
      Integer integer1 = paramBuilder.user_agree;
      if (integer1 == null) {
        this.user_agree = DEFAULT_USER_AGREE;
      } else {
        this.user_agree = integer1;
      } 
      integer = paramBuilder.source;
      if (integer == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = integer;
      } 
    } else {
      this.feed_id = ((Builder)integer).feed_id;
      this.thread_info = ((Builder)integer).thread_info;
      this.user_agree = ((Builder)integer).user_agree;
      this.source = ((Builder)integer).source;
    } 
  }
  
  public TopicThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TopicThread> {
    public Long feed_id;
    
    public Integer source;
    
    public ThreadInfo thread_info;
    
    public Integer user_agree;
    
    public Builder() {}
    
    public Builder(TopicThread param1TopicThread) {
      super(param1TopicThread);
      if (param1TopicThread == null)
        return; 
      this.feed_id = param1TopicThread.feed_id;
      this.thread_info = param1TopicThread.thread_info;
      this.user_agree = param1TopicThread.user_agree;
      this.source = param1TopicThread.source;
    }
    
    public TopicThread build(boolean param1Boolean) {
      return new TopicThread(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
