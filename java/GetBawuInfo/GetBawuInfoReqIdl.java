package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetBawuInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetBawuInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetBawuInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBawuInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetBawuInfoReqIdl param1GetBawuInfoReqIdl) {
      super(param1GetBawuInfoReqIdl);
      if (param1GetBawuInfoReqIdl == null)
        return; 
      this.data = param1GetBawuInfoReqIdl.data;
    }
    
    public GetBawuInfoReqIdl build(boolean param1Boolean) {
      return new GetBawuInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
