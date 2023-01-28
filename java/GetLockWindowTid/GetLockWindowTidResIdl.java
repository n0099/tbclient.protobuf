package tbclient.GetLockWindowTid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetLockWindowTidResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetLockWindowTidResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetLockWindowTidResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetLockWindowTidResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetLockWindowTidResIdl param1GetLockWindowTidResIdl) {
      super(param1GetLockWindowTidResIdl);
      if (param1GetLockWindowTidResIdl == null)
        return; 
      this.error = param1GetLockWindowTidResIdl.error;
      this.data = param1GetLockWindowTidResIdl.data;
    }
    
    public GetLockWindowTidResIdl build(boolean param1Boolean) {
      return new GetLockWindowTidResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
