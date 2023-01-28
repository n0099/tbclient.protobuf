package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetCardByCategoryReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetCardByCategoryReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetCardByCategoryReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetCardByCategoryReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetCardByCategoryReqIdl param1GetCardByCategoryReqIdl) {
      super(param1GetCardByCategoryReqIdl);
      if (param1GetCardByCategoryReqIdl == null)
        return; 
      this.data = param1GetCardByCategoryReqIdl.data;
    }
    
    public GetCardByCategoryReqIdl build(boolean param1Boolean) {
      return new GetCardByCategoryReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
