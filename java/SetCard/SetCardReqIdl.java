package tbclient.SetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SetCardReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SetCardReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SetCardReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetCardReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SetCardReqIdl param1SetCardReqIdl) {
      super(param1SetCardReqIdl);
      if (param1SetCardReqIdl == null)
        return; 
      this.data = param1SetCardReqIdl.data;
    }
    
    public SetCardReqIdl build(boolean param1Boolean) {
      return new SetCardReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
