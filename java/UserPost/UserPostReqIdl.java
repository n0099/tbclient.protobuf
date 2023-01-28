package tbclient.UserPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserPostReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public UserPostReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public UserPostReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserPostReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(UserPostReqIdl param1UserPostReqIdl) {
      super(param1UserPostReqIdl);
      if (param1UserPostReqIdl == null)
        return; 
      this.data = param1UserPostReqIdl.data;
    }
    
    public UserPostReqIdl build(boolean param1Boolean) {
      return new UserPostReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
