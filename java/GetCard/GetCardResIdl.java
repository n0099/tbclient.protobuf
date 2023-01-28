package tbclient.GetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetCardResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetCardResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetCardResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetCardResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetCardResIdl param1GetCardResIdl) {
      super(param1GetCardResIdl);
      if (param1GetCardResIdl == null)
        return; 
      this.error = param1GetCardResIdl.error;
      this.data = param1GetCardResIdl.data;
    }
    
    public GetCardResIdl build(boolean param1Boolean) {
      return new GetCardResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
