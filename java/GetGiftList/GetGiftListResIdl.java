package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetGiftListResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetGiftListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetGiftListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetGiftListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetGiftListResIdl param1GetGiftListResIdl) {
      super(param1GetGiftListResIdl);
      if (param1GetGiftListResIdl == null)
        return; 
      this.data = param1GetGiftListResIdl.data;
      this.error = param1GetGiftListResIdl.error;
    }
    
    public GetGiftListResIdl build(boolean param1Boolean) {
      return new GetGiftListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
