package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DecryptCodeReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public DecryptCodeReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public DecryptCodeReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DecryptCodeReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(DecryptCodeReqIdl param1DecryptCodeReqIdl) {
      super(param1DecryptCodeReqIdl);
      if (param1DecryptCodeReqIdl == null)
        return; 
      this.data = param1DecryptCodeReqIdl.data;
    }
    
    public DecryptCodeReqIdl build(boolean param1Boolean) {
      return new DecryptCodeReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
