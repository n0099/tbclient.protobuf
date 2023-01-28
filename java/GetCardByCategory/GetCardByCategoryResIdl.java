package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetCardByCategoryResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetCardByCategoryResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetCardByCategoryResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetCardByCategoryResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetCardByCategoryResIdl param1GetCardByCategoryResIdl) {
      super(param1GetCardByCategoryResIdl);
      if (param1GetCardByCategoryResIdl == null)
        return; 
      this.error = param1GetCardByCategoryResIdl.error;
      this.data = param1GetCardByCategoryResIdl.data;
    }
    
    public GetCardByCategoryResIdl build(boolean param1Boolean) {
      return new GetCardByCategoryResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
