package tbclient.GetClientConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetClientConfigReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetClientConfigReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetClientConfigReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetClientConfigReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetClientConfigReqIdl param1GetClientConfigReqIdl) {
      super(param1GetClientConfigReqIdl);
      if (param1GetClientConfigReqIdl == null)
        return; 
      this.data = param1GetClientConfigReqIdl.data;
    }
    
    public GetClientConfigReqIdl build(boolean param1Boolean) {
      return new GetClientConfigReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
