package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignInfo extends Message {
  @ProtoField(tag = 2)
  public final SignForum forum_info;
  
  @ProtoField(tag = 1)
  public final SignUser user_info;
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      this.forum_info = paramBuilder.forum_info;
    } else {
      this.user_info = paramBuilder.user_info;
      this.forum_info = paramBuilder.forum_info;
    } 
  }
  
  public SignInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SignInfo> {
    public SignForum forum_info;
    
    public SignUser user_info;
    
    public Builder() {}
    
    public Builder(SignInfo param1SignInfo) {
      super(param1SignInfo);
      if (param1SignInfo == null)
        return; 
      this.user_info = param1SignInfo.user_info;
      this.forum_info = param1SignInfo.forum_info;
    }
    
    public SignInfo build(boolean param1Boolean) {
      return new SignInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
