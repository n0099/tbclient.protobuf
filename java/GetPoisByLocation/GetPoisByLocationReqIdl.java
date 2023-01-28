package tbclient.GetPoisByLocation;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetPoisByLocationReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetPoisByLocationReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetPoisByLocationReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPoisByLocationReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetPoisByLocationReqIdl param1GetPoisByLocationReqIdl) {
      super(param1GetPoisByLocationReqIdl);
      if (param1GetPoisByLocationReqIdl == null)
        return; 
      this.data = param1GetPoisByLocationReqIdl.data;
    }
    
    public GetPoisByLocationReqIdl build(boolean param1Boolean) {
      return new GetPoisByLocationReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
