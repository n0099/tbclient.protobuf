package tbclient.AddThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AddThreadReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public AddThreadReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AddThreadReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AddThreadReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(AddThreadReqIdl param1AddThreadReqIdl) {
      super(param1AddThreadReqIdl);
      if (param1AddThreadReqIdl == null)
        return; 
      this.data = param1AddThreadReqIdl.data;
    }
    
    public AddThreadReqIdl build(boolean param1Boolean) {
      return new AddThreadReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
