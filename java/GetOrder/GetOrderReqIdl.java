package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetOrderReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetOrderReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public static final class Builder extends Message.Builder<GetOrderReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetOrderReqIdl param1GetOrderReqIdl) {
      super(param1GetOrderReqIdl);
      if (param1GetOrderReqIdl == null)
        return; 
      this.data = param1GetOrderReqIdl.data;
    }
    
    public GetOrderReqIdl build(boolean param1Boolean) {
      return new GetOrderReqIdl(this, param1Boolean);
    }
  }
}
