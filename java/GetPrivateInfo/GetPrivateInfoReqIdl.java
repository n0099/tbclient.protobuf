package tbclient.GetPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetPrivateInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public GetPrivateInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetPrivateInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPrivateInfoReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(GetPrivateInfoReqIdl param1GetPrivateInfoReqIdl) {
      super(param1GetPrivateInfoReqIdl);
      if (param1GetPrivateInfoReqIdl == null)
        return; 
      this.data = param1GetPrivateInfoReqIdl.data;
    }
    
    public GetPrivateInfoReqIdl build(boolean param1Boolean) {
      return new GetPrivateInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
