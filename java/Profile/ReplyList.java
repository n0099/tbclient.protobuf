package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReplyList extends Message {
  public static final Long DEFAULT_FRIEND_ID;
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final Integer DEFAULT_TIME;
  
  public static final Long DEFAULT_USER_ID;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long friend_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_FRIEND_ID = long_;
    DEFAULT_TIME = Integer.valueOf(0);
  }
  
  public ReplyList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      long_ = paramBuilder.friend_id;
      if (long_ == null) {
        this.friend_id = DEFAULT_FRIEND_ID;
      } else {
        this.friend_id = long_;
      } 
      String str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
      integer = paramBuilder.time;
      if (integer == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.friend_id = ((Builder)integer).friend_id;
      this.message = ((Builder)integer).message;
      this.time = ((Builder)integer).time;
    } 
  }
  
  public ReplyList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyList> {
    public Long friend_id;
    
    public String message;
    
    public Integer time;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(ReplyList param1ReplyList) {
      super(param1ReplyList);
      if (param1ReplyList == null)
        return; 
      this.user_id = param1ReplyList.user_id;
      this.friend_id = param1ReplyList.friend_id;
      this.message = param1ReplyList.message;
      this.time = param1ReplyList.time;
    }
    
    public ReplyList build(boolean param1Boolean) {
      return new ReplyList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
