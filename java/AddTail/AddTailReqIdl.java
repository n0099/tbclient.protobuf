package tbclient.AddTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddTailReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public AddTailReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AddTailReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddTailReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(AddTailReqIdl param1AddTailReqIdl) {
      super(param1AddTailReqIdl);
      if (param1AddTailReqIdl == null)
        return; 
      this.data = param1AddTailReqIdl.data;
    }
    
    public AddTailReqIdl build(boolean param1Boolean) {
      return new AddTailReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
