package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetBgByCategoryResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetBgByCategoryResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetBgByCategoryResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBgByCategoryResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetBgByCategoryResIdl param1GetBgByCategoryResIdl) {
      super(param1GetBgByCategoryResIdl);
      if (param1GetBgByCategoryResIdl == null)
        return; 
      this.data = param1GetBgByCategoryResIdl.data;
      this.error = param1GetBgByCategoryResIdl.error;
    }
    
    public GetBgByCategoryResIdl build(boolean param1Boolean) {
      return new GetBgByCategoryResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
