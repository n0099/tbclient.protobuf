package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LoopReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public LoopReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public LoopReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LoopReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(LoopReqIdl param1LoopReqIdl) {
      super(param1LoopReqIdl);
      if (param1LoopReqIdl == null)
        return; 
      this.data = param1LoopReqIdl.data;
    }
    
    public LoopReqIdl build(boolean param1Boolean) {
      return new LoopReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
