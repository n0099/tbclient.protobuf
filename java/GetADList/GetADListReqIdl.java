package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetADListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetADListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetADListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetADListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetADListReqIdl param1GetADListReqIdl) {
      super(param1GetADListReqIdl);
      if (param1GetADListReqIdl == null)
        return; 
      this.data = param1GetADListReqIdl.data;
    }
    
    public GetADListReqIdl build(boolean param1Boolean) {
      return new GetADListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
