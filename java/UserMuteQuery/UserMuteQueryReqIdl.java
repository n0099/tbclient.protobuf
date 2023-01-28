package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserMuteQueryReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public UserMuteQueryReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public UserMuteQueryReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserMuteQueryReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(UserMuteQueryReqIdl param1UserMuteQueryReqIdl) {
      super(param1UserMuteQueryReqIdl);
      if (param1UserMuteQueryReqIdl == null)
        return; 
      this.data = param1UserMuteQueryReqIdl.data;
    }
    
    public UserMuteQueryReqIdl build(boolean param1Boolean) {
      return new UserMuteQueryReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
