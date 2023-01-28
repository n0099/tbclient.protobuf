package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PermissionList extends Message {
  public static final Integer DEFAULT_CHAT;
  
  public static final Integer DEFAULT_FOLLOW;
  
  public static final Integer DEFAULT_INTERACT;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer chat;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer follow;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer interact;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_FOLLOW = integer;
    DEFAULT_INTERACT = integer;
    DEFAULT_CHAT = integer;
  }
  
  public PermissionList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.follow;
      if (integer1 == null) {
        this.follow = DEFAULT_FOLLOW;
      } else {
        this.follow = integer1;
      } 
      integer1 = paramBuilder.interact;
      if (integer1 == null) {
        this.interact = DEFAULT_INTERACT;
      } else {
        this.interact = integer1;
      } 
      integer = paramBuilder.chat;
      if (integer == null) {
        this.chat = DEFAULT_CHAT;
      } else {
        this.chat = integer;
      } 
    } else {
      this.follow = ((Builder)integer).follow;
      this.interact = ((Builder)integer).interact;
      this.chat = ((Builder)integer).chat;
    } 
  }
  
  public PermissionList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PermissionList> {
    public Integer chat;
    
    public Integer follow;
    
    public Integer interact;
    
    public Builder() {}
    
    public Builder(PermissionList param1PermissionList) {
      super(param1PermissionList);
      if (param1PermissionList == null)
        return; 
      this.follow = param1PermissionList.follow;
      this.interact = param1PermissionList.interact;
      this.chat = param1PermissionList.chat;
    }
    
    public PermissionList build(boolean param1Boolean) {
      return new PermissionList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
