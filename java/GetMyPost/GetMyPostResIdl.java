package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetMyPostResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetMyPostResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetMyPostResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetMyPostResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetMyPostResIdl param1GetMyPostResIdl) {
      super(param1GetMyPostResIdl);
      if (param1GetMyPostResIdl == null)
        return; 
      this.error = param1GetMyPostResIdl.error;
      this.data = param1GetMyPostResIdl.data;
    }
    
    public GetMyPostResIdl build(boolean param1Boolean) {
      return new GetMyPostResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
