package tbclient.GetUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetUserInfoResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetUserInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetUserInfoResIdl param1GetUserInfoResIdl) {
      super(param1GetUserInfoResIdl);
      if (param1GetUserInfoResIdl == null)
        return; 
      this.error = param1GetUserInfoResIdl.error;
      this.data = param1GetUserInfoResIdl.data;
    }
    
    public GetUserInfoResIdl build(boolean param1Boolean) {
      return new GetUserInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
