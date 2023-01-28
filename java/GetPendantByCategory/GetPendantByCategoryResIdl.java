package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetPendantByCategoryResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetPendantByCategoryResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetPendantByCategoryResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPendantByCategoryResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetPendantByCategoryResIdl param1GetPendantByCategoryResIdl) {
      super(param1GetPendantByCategoryResIdl);
      if (param1GetPendantByCategoryResIdl == null)
        return; 
      this.error = param1GetPendantByCategoryResIdl.error;
      this.data = param1GetPendantByCategoryResIdl.data;
    }
    
    public GetPendantByCategoryResIdl build(boolean param1Boolean) {
      return new GetPendantByCategoryResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
