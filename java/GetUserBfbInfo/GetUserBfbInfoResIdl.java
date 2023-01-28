package tbclient.GetUserBfbInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetUserBfbInfoResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetUserBfbInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserBfbInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserBfbInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetUserBfbInfoResIdl param1GetUserBfbInfoResIdl) {
      super(param1GetUserBfbInfoResIdl);
      if (param1GetUserBfbInfoResIdl == null)
        return; 
      this.error = param1GetUserBfbInfoResIdl.error;
      this.data = param1GetUserBfbInfoResIdl.data;
    }
    
    public GetUserBfbInfoResIdl build(boolean param1Boolean) {
      return new GetUserBfbInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
