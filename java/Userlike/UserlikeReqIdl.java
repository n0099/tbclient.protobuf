package tbclient.Userlike;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserlikeReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public UserlikeReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public UserlikeReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserlikeReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(UserlikeReqIdl param1UserlikeReqIdl) {
      super(param1UserlikeReqIdl);
      if (param1UserlikeReqIdl == null)
        return; 
      this.data = param1UserlikeReqIdl.data;
    }
    
    public UserlikeReqIdl build(boolean param1Boolean) {
      return new UserlikeReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
