package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BigvipReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public BigvipReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public BigvipReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<BigvipReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(BigvipReqIdl param1BigvipReqIdl) {
      super(param1BigvipReqIdl);
      if (param1BigvipReqIdl == null)
        return; 
      this.data = param1BigvipReqIdl.data;
    }
    
    public BigvipReqIdl build(boolean param1Boolean) {
      return new BigvipReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
