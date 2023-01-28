package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DeleteTailReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public DeleteTailReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public DeleteTailReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DeleteTailReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(DeleteTailReqIdl param1DeleteTailReqIdl) {
      super(param1DeleteTailReqIdl);
      if (param1DeleteTailReqIdl == null)
        return; 
      this.data = param1DeleteTailReqIdl.data;
    }
    
    public DeleteTailReqIdl build(boolean param1Boolean) {
      return new DeleteTailReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
