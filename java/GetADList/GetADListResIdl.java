package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetADListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetADListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetADListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetADListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetADListResIdl param1GetADListResIdl) {
      super(param1GetADListResIdl);
      if (param1GetADListResIdl == null)
        return; 
      this.error = param1GetADListResIdl.error;
      this.data = param1GetADListResIdl.data;
    }
    
    public GetADListResIdl build(boolean param1Boolean) {
      return new GetADListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
