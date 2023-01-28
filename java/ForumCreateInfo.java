package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumCreateInfo extends Message {
  public static final String DEFAULT_CAN_CREATE_ERRDATA = "";
  
  public static final Integer DEFAULT_CAN_CREATE_ERRNO;
  
  public static final Integer DEFAULT_IS_CAN_CREATE;
  
  public static final Integer DEFAULT_IS_SHOW_CREATE;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String can_create_errdata;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer can_create_errno;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_can_create;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_show_create;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_SHOW_CREATE = integer;
    DEFAULT_IS_CAN_CREATE = integer;
    DEFAULT_CAN_CREATE_ERRNO = integer;
  }
  
  public ForumCreateInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_show_create;
      if (integer == null) {
        this.is_show_create = DEFAULT_IS_SHOW_CREATE;
      } else {
        this.is_show_create = integer;
      } 
      integer = paramBuilder.is_can_create;
      if (integer == null) {
        this.is_can_create = DEFAULT_IS_CAN_CREATE;
      } else {
        this.is_can_create = integer;
      } 
      integer = paramBuilder.can_create_errno;
      if (integer == null) {
        this.can_create_errno = DEFAULT_CAN_CREATE_ERRNO;
      } else {
        this.can_create_errno = integer;
      } 
      str = paramBuilder.can_create_errdata;
      if (str == null) {
        this.can_create_errdata = "";
      } else {
        this.can_create_errdata = str;
      } 
    } else {
      this.is_show_create = ((Builder)str).is_show_create;
      this.is_can_create = ((Builder)str).is_can_create;
      this.can_create_errno = ((Builder)str).can_create_errno;
      this.can_create_errdata = ((Builder)str).can_create_errdata;
    } 
  }
  
  public ForumCreateInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumCreateInfo> {
    public String can_create_errdata;
    
    public Integer can_create_errno;
    
    public Integer is_can_create;
    
    public Integer is_show_create;
    
    public Builder() {}
    
    public Builder(ForumCreateInfo param1ForumCreateInfo) {
      super(param1ForumCreateInfo);
      if (param1ForumCreateInfo == null)
        return; 
      this.is_show_create = param1ForumCreateInfo.is_show_create;
      this.is_can_create = param1ForumCreateInfo.is_can_create;
      this.can_create_errno = param1ForumCreateInfo.can_create_errno;
      this.can_create_errdata = param1ForumCreateInfo.can_create_errdata;
    }
    
    public ForumCreateInfo build(boolean param1Boolean) {
      return new ForumCreateInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
