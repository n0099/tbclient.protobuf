package tbclient.SetPendant;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SetPendantReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SetPendantReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SetPendantReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetPendantReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SetPendantReqIdl param1SetPendantReqIdl) {
      super(param1SetPendantReqIdl);
      if (param1SetPendantReqIdl == null)
        return; 
      this.data = param1SetPendantReqIdl.data;
    }
    
    public SetPendantReqIdl build(boolean param1Boolean) {
      return new SetPendantReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
