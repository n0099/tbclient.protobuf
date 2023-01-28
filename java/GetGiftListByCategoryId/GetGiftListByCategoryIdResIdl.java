package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetGiftListByCategoryIdResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetGiftListByCategoryIdResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetGiftListByCategoryIdResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetGiftListByCategoryIdResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetGiftListByCategoryIdResIdl param1GetGiftListByCategoryIdResIdl) {
      super(param1GetGiftListByCategoryIdResIdl);
      if (param1GetGiftListByCategoryIdResIdl == null)
        return; 
      this.data = param1GetGiftListByCategoryIdResIdl.data;
      this.error = param1GetGiftListByCategoryIdResIdl.error;
    }
    
    public GetGiftListByCategoryIdResIdl build(boolean param1Boolean) {
      return new GetGiftListByCategoryIdResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
