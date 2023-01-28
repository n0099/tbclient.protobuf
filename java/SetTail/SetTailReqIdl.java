package tbclient.SetTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SetTailReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public SetTailReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SetTailReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetTailReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(SetTailReqIdl param1SetTailReqIdl) {
      super(param1SetTailReqIdl);
      if (param1SetTailReqIdl == null)
        return; 
      this.data = param1SetTailReqIdl.data;
    }
    
    public SetTailReqIdl build(boolean param1Boolean) {
      return new SetTailReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
