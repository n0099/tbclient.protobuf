package tbclient.GetTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetTagListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetTagListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetTagListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetTagListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetTagListResIdl param1GetTagListResIdl) {
      super(param1GetTagListResIdl);
      if (param1GetTagListResIdl == null)
        return; 
      this.error = param1GetTagListResIdl.error;
      this.data = param1GetTagListResIdl.data;
    }
    
    public GetTagListResIdl build(boolean param1Boolean) {
      return new GetTagListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
