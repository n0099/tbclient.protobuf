package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CheckRealNameReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public CheckRealNameReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public CheckRealNameReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CheckRealNameReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(CheckRealNameReqIdl param1CheckRealNameReqIdl) {
      super(param1CheckRealNameReqIdl);
      if (param1CheckRealNameReqIdl == null)
        return; 
      this.data = param1CheckRealNameReqIdl.data;
    }
    
    public CheckRealNameReqIdl build(boolean param1Boolean) {
      return new CheckRealNameReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
