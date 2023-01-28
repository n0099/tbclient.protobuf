package tbclient.GetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetBackgroundResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetBackgroundResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetBackgroundResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetBackgroundResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetBackgroundResIdl param1GetBackgroundResIdl) {
      super(param1GetBackgroundResIdl);
      if (param1GetBackgroundResIdl == null)
        return; 
      this.data = param1GetBackgroundResIdl.data;
      this.error = param1GetBackgroundResIdl.error;
    }
    
    public GetBackgroundResIdl build(boolean param1Boolean) {
      return new GetBackgroundResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
