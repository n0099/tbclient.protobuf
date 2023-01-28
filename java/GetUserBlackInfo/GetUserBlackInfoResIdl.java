package tbclient.GetUserBlackInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetUserBlackInfoResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetUserBlackInfoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserBlackInfoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserBlackInfoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetUserBlackInfoResIdl param1GetUserBlackInfoResIdl) {
      super(param1GetUserBlackInfoResIdl);
      if (param1GetUserBlackInfoResIdl == null)
        return; 
      this.error = param1GetUserBlackInfoResIdl.error;
      this.data = param1GetUserBlackInfoResIdl.data;
    }
    
    public GetUserBlackInfoResIdl build(boolean param1Boolean) {
      return new GetUserBlackInfoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
