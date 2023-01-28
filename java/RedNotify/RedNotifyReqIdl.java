package tbclient.RedNotify;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RedNotifyReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public RedNotifyReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public RedNotifyReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RedNotifyReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(RedNotifyReqIdl param1RedNotifyReqIdl) {
      super(param1RedNotifyReqIdl);
      if (param1RedNotifyReqIdl == null)
        return; 
      this.data = param1RedNotifyReqIdl.data;
    }
    
    public RedNotifyReqIdl build(boolean param1Boolean) {
      return new RedNotifyReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
