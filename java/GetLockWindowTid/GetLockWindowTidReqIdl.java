package tbclient.GetLockWindowTid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetLockWindowTidReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetLockWindowTidReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetLockWindowTidReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetLockWindowTidReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetLockWindowTidReqIdl param1GetLockWindowTidReqIdl) {
      super(param1GetLockWindowTidReqIdl);
      if (param1GetLockWindowTidReqIdl == null)
        return; 
      this.data = param1GetLockWindowTidReqIdl.data;
    }
    
    public GetLockWindowTidReqIdl build(boolean param1Boolean) {
      return new GetLockWindowTidReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
