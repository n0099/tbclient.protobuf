package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetPendantByCategoryReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetPendantByCategoryReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetPendantByCategoryReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPendantByCategoryReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetPendantByCategoryReqIdl param1GetPendantByCategoryReqIdl) {
      super(param1GetPendantByCategoryReqIdl);
      if (param1GetPendantByCategoryReqIdl == null)
        return; 
      this.data = param1GetPendantByCategoryReqIdl.data;
    }
    
    public GetPendantByCategoryReqIdl build(boolean param1Boolean) {
      return new GetPendantByCategoryReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
