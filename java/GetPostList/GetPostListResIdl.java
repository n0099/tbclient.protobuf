package tbclient.GetPostList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetPostListResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetPostListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetPostListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetPostListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetPostListResIdl param1GetPostListResIdl) {
      super(param1GetPostListResIdl);
      if (param1GetPostListResIdl == null)
        return; 
      this.error = param1GetPostListResIdl.error;
      this.data = param1GetPostListResIdl.data;
    }
    
    public GetPostListResIdl build(boolean param1Boolean) {
      return new GetPostListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
