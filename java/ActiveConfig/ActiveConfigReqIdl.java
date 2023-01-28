package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActiveConfigReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ActiveConfigReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ActiveConfigReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActiveConfigReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ActiveConfigReqIdl param1ActiveConfigReqIdl) {
      super(param1ActiveConfigReqIdl);
      if (param1ActiveConfigReqIdl == null)
        return; 
      this.data = param1ActiveConfigReqIdl.data;
    }
    
    public ActiveConfigReqIdl build(boolean param1Boolean) {
      return new ActiveConfigReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
