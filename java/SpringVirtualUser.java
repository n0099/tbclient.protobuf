package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SpringVirtualUser extends Message {
  public static final Integer DEFAULT_IS_VIRTUAL = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer is_virtual;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public SpringVirtualUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_virtual;
      if (integer == null) {
        this.is_virtual = DEFAULT_IS_VIRTUAL;
      } else {
        this.is_virtual = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.is_virtual = ((Builder)str).is_virtual;
      this.url = ((Builder)str).url;
    } 
  }
  
  public SpringVirtualUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SpringVirtualUser> {
    public Integer is_virtual;
    
    public String url;
    
    public Builder() {}
    
    public Builder(SpringVirtualUser param1SpringVirtualUser) {
      super(param1SpringVirtualUser);
      if (param1SpringVirtualUser == null)
        return; 
      this.is_virtual = param1SpringVirtualUser.is_virtual;
      this.url = param1SpringVirtualUser.url;
    }
    
    public SpringVirtualUser build(boolean param1Boolean) {
      return new SpringVirtualUser(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
