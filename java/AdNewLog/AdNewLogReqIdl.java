package tbclient.AdNewLog;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdNewLogReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public AdNewLogReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AdNewLogReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AdNewLogReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(AdNewLogReqIdl param1AdNewLogReqIdl) {
      super(param1AdNewLogReqIdl);
      if (param1AdNewLogReqIdl == null)
        return; 
      this.data = param1AdNewLogReqIdl.data;
    }
    
    public AdNewLogReqIdl build(boolean param1Boolean) {
      return new AdNewLogReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
