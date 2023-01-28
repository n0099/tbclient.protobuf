package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserManChannelInfo extends Message {
  public static final Integer DEFAULT_FOLLOW_CHANNEL;
  
  public static final Integer DEFAULT_MAN_CHANNEL;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer follow_channel;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer man_channel;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MAN_CHANNEL = integer;
    DEFAULT_FOLLOW_CHANNEL = integer;
  }
  
  public UserManChannelInfo(Builder paramBuilder, boolean paramBoolean) {
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
  
  public UserManChannelInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserManChannelInfo> {
    public Integer follow_channel;
    
    public Integer man_channel;
    
    public Builder() {}
    
    public Builder(UserManChannelInfo param1UserManChannelInfo) {
      super(param1UserManChannelInfo);
      if (param1UserManChannelInfo == null)
        return; 
      this.man_channel = param1UserManChannelInfo.man_channel;
      this.follow_channel = param1UserManChannelInfo.follow_channel;
    }
    
    public UserManChannelInfo build(boolean param1Boolean) {
      return new UserManChannelInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
