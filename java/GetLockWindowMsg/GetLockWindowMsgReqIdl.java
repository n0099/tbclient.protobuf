package tbclient.GetLockWindowMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetLockWindowMsgReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetLockWindowMsgReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetLockWindowMsgReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetLockWindowMsgReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetLockWindowMsgReqIdl param1GetLockWindowMsgReqIdl) {
      super(param1GetLockWindowMsgReqIdl);
      if (param1GetLockWindowMsgReqIdl == null)
        return; 
      this.data = param1GetLockWindowMsgReqIdl.data;
    }
    
    public GetLockWindowMsgReqIdl build(boolean param1Boolean) {
      return new GetLockWindowMsgReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
