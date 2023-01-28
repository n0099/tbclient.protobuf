package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetOrderResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetOrderResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public static final class Builder extends Message.Builder<GetOrderResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetOrderResIdl param1GetOrderResIdl) {
      super(param1GetOrderResIdl);
      if (param1GetOrderResIdl == null)
        return; 
      this.data = param1GetOrderResIdl.data;
      this.error = param1GetOrderResIdl.error;
    }
    
    public GetOrderResIdl build(boolean param1Boolean) {
      return new GetOrderResIdl(this, param1Boolean);
    }
  }
}
