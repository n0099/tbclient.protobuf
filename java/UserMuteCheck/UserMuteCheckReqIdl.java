package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserMuteCheckReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public UserMuteCheckReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public UserMuteCheckReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserMuteCheckReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(UserMuteCheckReqIdl param1UserMuteCheckReqIdl) {
      super(param1UserMuteCheckReqIdl);
      if (param1UserMuteCheckReqIdl == null)
        return; 
      this.data = param1UserMuteCheckReqIdl.data;
    }
    
    public UserMuteCheckReqIdl build(boolean param1Boolean) {
      return new UserMuteCheckReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
