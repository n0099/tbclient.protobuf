package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CloseAdReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public CloseAdReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public CloseAdReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CloseAdReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(CloseAdReqIdl param1CloseAdReqIdl) {
      super(param1CloseAdReqIdl);
      if (param1CloseAdReqIdl == null)
        return; 
      this.data = param1CloseAdReqIdl.data;
    }
    
    public CloseAdReqIdl build(boolean param1Boolean) {
      return new CloseAdReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
