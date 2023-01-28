package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserPostPerm extends Message {
  public static final Integer DEFAULT_NOT_SHOW_HIDE_THREAD = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer not_show_hide_thread;
  
  public UserPostPerm(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      integer = paramBuilder.not_show_hide_thread;
      if (integer == null) {
        this.not_show_hide_thread = DEFAULT_NOT_SHOW_HIDE_THREAD;
      } else {
        this.not_show_hide_thread = integer;
      } 
    } else {
      this.not_show_hide_thread = ((Builder)integer).not_show_hide_thread;
    } 
  }
  
  public UserPostPerm(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserPostPerm> {
    public Integer not_show_hide_thread;
    
    public Builder() {}
    
    public Builder(UserPostPerm param1UserPostPerm) {
      super(param1UserPostPerm);
      if (param1UserPostPerm == null)
        return; 
      this.not_show_hide_thread = param1UserPostPerm.not_show_hide_thread;
    }
    
    public UserPostPerm build(boolean param1Boolean) {
      return new UserPostPerm(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
