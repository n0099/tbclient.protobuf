package tbclient.PlaceOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PlaceOrderReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public PlaceOrderReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public PlaceOrderReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PlaceOrderReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(PlaceOrderReqIdl param1PlaceOrderReqIdl) {
      super(param1PlaceOrderReqIdl);
      if (param1PlaceOrderReqIdl == null)
        return; 
      this.data = param1PlaceOrderReqIdl.data;
    }
    
    public PlaceOrderReqIdl build(boolean param1Boolean) {
      return new PlaceOrderReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
