package tbclient.PushThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PushThreadReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public PushThreadReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public PushThreadReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PushThreadReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(PushThreadReqIdl param1PushThreadReqIdl) {
      super(param1PushThreadReqIdl);
      if (param1PushThreadReqIdl == null)
        return; 
      this.data = param1PushThreadReqIdl.data;
    }
    
    public PushThreadReqIdl build(boolean param1Boolean) {
      return new PushThreadReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
