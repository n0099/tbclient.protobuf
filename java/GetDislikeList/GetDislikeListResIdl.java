package tbclient.GetDislikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetDislikeListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetDislikeListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetDislikeListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetDislikeListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetDislikeListResIdl param1GetDislikeListResIdl) {
      super(param1GetDislikeListResIdl);
      if (param1GetDislikeListResIdl == null)
        return; 
      this.error = param1GetDislikeListResIdl.error;
      this.data = param1GetDislikeListResIdl.data;
    }
    
    public GetDislikeListResIdl build(boolean param1Boolean) {
      return new GetDislikeListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
