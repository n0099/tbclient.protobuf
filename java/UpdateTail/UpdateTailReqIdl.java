package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UpdateTailReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public UpdateTailReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public UpdateTailReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UpdateTailReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(UpdateTailReqIdl param1UpdateTailReqIdl) {
      super(param1UpdateTailReqIdl);
      if (param1UpdateTailReqIdl == null)
        return; 
      this.data = param1UpdateTailReqIdl.data;
    }
    
    public UpdateTailReqIdl build(boolean param1Boolean) {
      return new UpdateTailReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
