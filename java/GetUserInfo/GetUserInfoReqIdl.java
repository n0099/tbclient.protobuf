package tbclient.GetUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetUserInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetUserInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetUserInfoReqIdl param1GetUserInfoReqIdl) {
      super(param1GetUserInfoReqIdl);
      if (param1GetUserInfoReqIdl == null)
        return; 
      this.data = param1GetUserInfoReqIdl.data;
    }
    
    public GetUserInfoReqIdl build(boolean param1Boolean) {
      return new GetUserInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
