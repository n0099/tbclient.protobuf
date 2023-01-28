package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetUserFreeChanceResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetUserFreeChanceResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetUserFreeChanceResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserFreeChanceResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetUserFreeChanceResIdl param1GetUserFreeChanceResIdl) {
      super(param1GetUserFreeChanceResIdl);
      if (param1GetUserFreeChanceResIdl == null)
        return; 
      this.data = param1GetUserFreeChanceResIdl.data;
      this.error = param1GetUserFreeChanceResIdl.error;
    }
    
    public GetUserFreeChanceResIdl build(boolean param1Boolean) {
      return new GetUserFreeChanceResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
