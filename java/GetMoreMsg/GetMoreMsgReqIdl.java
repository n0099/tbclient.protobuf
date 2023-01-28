package tbclient.GetMoreMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetMoreMsgReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetMoreMsgReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMoreMsgReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMoreMsgReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetMoreMsgReqIdl param1GetMoreMsgReqIdl) {
      super(param1GetMoreMsgReqIdl);
      if (param1GetMoreMsgReqIdl == null)
        return; 
      this.data = param1GetMoreMsgReqIdl.data;
    }
    
    public GetMoreMsgReqIdl build(boolean param1Boolean) {
      return new GetMoreMsgReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
