package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetVipInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetVipInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetVipInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetVipInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetVipInfoReqIdl param1GetVipInfoReqIdl) {
      super(param1GetVipInfoReqIdl);
      if (param1GetVipInfoReqIdl == null)
        return; 
      this.data = param1GetVipInfoReqIdl.data;
    }
    
    public GetVipInfoReqIdl build(boolean param1Boolean) {
      return new GetVipInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
