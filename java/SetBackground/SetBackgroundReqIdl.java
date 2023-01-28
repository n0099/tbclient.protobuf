package tbclient.SetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SetBackgroundReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public SetBackgroundReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public SetBackgroundReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SetBackgroundReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(SetBackgroundReqIdl param1SetBackgroundReqIdl) {
      super(param1SetBackgroundReqIdl);
      if (param1SetBackgroundReqIdl == null)
        return; 
      this.data = param1SetBackgroundReqIdl.data;
    }
    
    public SetBackgroundReqIdl build(boolean param1Boolean) {
      return new SetBackgroundReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
