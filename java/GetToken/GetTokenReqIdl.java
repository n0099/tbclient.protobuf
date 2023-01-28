package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetTokenReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetTokenReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetTokenReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetTokenReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetTokenReqIdl param1GetTokenReqIdl) {
      super(param1GetTokenReqIdl);
      if (param1GetTokenReqIdl == null)
        return; 
      this.data = param1GetTokenReqIdl.data;
    }
    
    public GetTokenReqIdl build(boolean param1Boolean) {
      return new GetTokenReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
