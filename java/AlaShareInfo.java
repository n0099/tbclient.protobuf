package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaShareInfo extends Message {
  public static final String DEFAULT_CONTENT = "";
  
  public static final Long DEFAULT_RECORD_TID;
  
  public static final Integer DEFAULT_SHARE_COUNT;
  
  public static final Integer DEFAULT_SHARE_USER_COUNT;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long record_tid;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer share_count;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer share_user_count;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_SHARE_USER_COUNT = integer;
    DEFAULT_SHARE_COUNT = integer;
    DEFAULT_RECORD_TID = Long.valueOf(0L);
  }
  
  public AlaShareInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
      Integer integer = paramBuilder.share_user_count;
      if (integer == null) {
        this.share_user_count = DEFAULT_SHARE_USER_COUNT;
      } else {
        this.share_user_count = integer;
      } 
      integer = paramBuilder.share_count;
      if (integer == null) {
        this.share_count = DEFAULT_SHARE_COUNT;
      } else {
        this.share_count = integer;
      } 
      long_ = paramBuilder.record_tid;
      if (long_ == null) {
        this.record_tid = DEFAULT_RECORD_TID;
      } else {
        this.record_tid = long_;
      } 
    } else {
      this.content = ((Builder)long_).content;
      this.share_user_count = ((Builder)long_).share_user_count;
      this.share_count = ((Builder)long_).share_count;
      this.record_tid = ((Builder)long_).record_tid;
    } 
  }
  
  public AlaShareInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaShareInfo> {
    public String content;
    
    public Long record_tid;
    
    public Integer share_count;
    
    public Integer share_user_count;
    
    public Builder() {}
    
    public Builder(AlaShareInfo param1AlaShareInfo) {
      super(param1AlaShareInfo);
      if (param1AlaShareInfo == null)
        return; 
      this.content = param1AlaShareInfo.content;
      this.share_user_count = param1AlaShareInfo.share_user_count;
      this.share_count = param1AlaShareInfo.share_count;
      this.record_tid = param1AlaShareInfo.record_tid;
    }
    
    public AlaShareInfo build(boolean param1Boolean) {
      return new AlaShareInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
