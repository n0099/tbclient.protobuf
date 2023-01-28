package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserPkReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public UserPkReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public UserPkReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserPkReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(UserPkReqIdl param1UserPkReqIdl) {
      super(param1UserPkReqIdl);
      if (param1UserPkReqIdl == null)
        return; 
      this.data = param1UserPkReqIdl.data;
    }
    
    public UserPkReqIdl build(boolean param1Boolean) {
      return new UserPkReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
