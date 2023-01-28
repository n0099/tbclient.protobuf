package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserVideoChannelInfo extends Message {
  public static final Integer DEFAULT_FOLLOW_CHANNEL;
  
  public static final Integer DEFAULT_MAN_CHANNEL;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer follow_channel;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer man_channel;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MAN_CHANNEL = integer;
    DEFAULT_FOLLOW_CHANNEL = integer;
  }
  
  public UserVideoChannelInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.man_channel;
      if (integer1 == null) {
        this.man_channel = DEFAULT_MAN_CHANNEL;
      } else {
        this.man_channel = integer1;
      } 
      integer = paramBuilder.follow_channel;
      if (integer == null) {
        this.follow_channel = DEFAULT_FOLLOW_CHANNEL;
      } else {
        this.follow_channel = integer;
      } 
    } else {
      this.man_channel = ((Builder)integer).man_channel;
      this.follow_channel = ((Builder)integer).follow_channel;
    } 
  }
  
  public UserVideoChannelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserVideoChannelInfo> {
    public Integer follow_channel;
    
    public Integer man_channel;
    
    public Builder() {}
    
    public Builder(UserVideoChannelInfo param1UserVideoChannelInfo) {
      super(param1UserVideoChannelInfo);
      if (param1UserVideoChannelInfo == null)
        return; 
      this.man_channel = param1UserVideoChannelInfo.man_channel;
      this.follow_channel = param1UserVideoChannelInfo.follow_channel;
    }
    
    public UserVideoChannelInfo build(boolean param1Boolean) {
      return new UserVideoChannelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
