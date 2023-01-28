package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetMyGiftResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetMyGiftResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetMyGiftResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMyGiftResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetMyGiftResIdl param1GetMyGiftResIdl) {
      super(param1GetMyGiftResIdl);
      if (param1GetMyGiftResIdl == null)
        return; 
      this.data = param1GetMyGiftResIdl.data;
      this.error = param1GetMyGiftResIdl.error;
    }
    
    public GetMyGiftResIdl build(boolean param1Boolean) {
      return new GetMyGiftResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
