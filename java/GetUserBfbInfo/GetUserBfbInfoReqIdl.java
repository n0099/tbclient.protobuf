package tbclient.GetUserBfbInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetUserBfbInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetUserBfbInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserBfbInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserBfbInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetUserBfbInfoReqIdl param1GetUserBfbInfoReqIdl) {
      super(param1GetUserBfbInfoReqIdl);
      if (param1GetUserBfbInfoReqIdl == null)
        return; 
      this.data = param1GetUserBfbInfoReqIdl.data;
    }
    
    public GetUserBfbInfoReqIdl build(boolean param1Boolean) {
      return new GetUserBfbInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
