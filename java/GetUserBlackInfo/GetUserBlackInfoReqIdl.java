package tbclient.GetUserBlackInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetUserBlackInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetUserBlackInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserBlackInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserBlackInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetUserBlackInfoReqIdl param1GetUserBlackInfoReqIdl) {
      super(param1GetUserBlackInfoReqIdl);
      if (param1GetUserBlackInfoReqIdl == null)
        return; 
      this.data = param1GetUserBlackInfoReqIdl.data;
    }
    
    public GetUserBlackInfoReqIdl build(boolean param1Boolean) {
      return new GetUserBlackInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
