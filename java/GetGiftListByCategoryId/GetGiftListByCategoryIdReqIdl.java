package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetGiftListByCategoryIdReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetGiftListByCategoryIdReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetGiftListByCategoryIdReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetGiftListByCategoryIdReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetGiftListByCategoryIdReqIdl param1GetGiftListByCategoryIdReqIdl) {
      super(param1GetGiftListByCategoryIdReqIdl);
      if (param1GetGiftListByCategoryIdReqIdl == null)
        return; 
      this.data = param1GetGiftListByCategoryIdReqIdl.data;
    }
    
    public GetGiftListByCategoryIdReqIdl build(boolean param1Boolean) {
      return new GetGiftListByCategoryIdReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
