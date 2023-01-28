package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetAddressListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public GetAddressListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetAddressListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetAddressListReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(GetAddressListReqIdl param1GetAddressListReqIdl) {
      super(param1GetAddressListReqIdl);
      if (param1GetAddressListReqIdl == null)
        return; 
      this.data = param1GetAddressListReqIdl.data;
    }
    
    public GetAddressListReqIdl build(boolean param1Boolean) {
      return new GetAddressListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
