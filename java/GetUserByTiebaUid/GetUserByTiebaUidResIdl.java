package tbclient.GetUserByTiebaUid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetUserByTiebaUidResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetUserByTiebaUidResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserByTiebaUidResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserByTiebaUidResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetUserByTiebaUidResIdl param1GetUserByTiebaUidResIdl) {
      super(param1GetUserByTiebaUidResIdl);
      if (param1GetUserByTiebaUidResIdl == null)
        return; 
      this.error = param1GetUserByTiebaUidResIdl.error;
      this.data = param1GetUserByTiebaUidResIdl.data;
    }
    
    public GetUserByTiebaUidResIdl build(boolean param1Boolean) {
      return new GetUserByTiebaUidResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
