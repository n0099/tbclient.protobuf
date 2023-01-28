package tbclient.SetUserBlack;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SetUserBlackReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SetUserBlackReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SetUserBlackReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetUserBlackReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SetUserBlackReqIdl param1SetUserBlackReqIdl) {
      super(param1SetUserBlackReqIdl);
      if (param1SetUserBlackReqIdl == null)
        return; 
      this.data = param1SetUserBlackReqIdl.data;
    }
    
    public SetUserBlackReqIdl build(boolean param1Boolean) {
      return new SetUserBlackReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
