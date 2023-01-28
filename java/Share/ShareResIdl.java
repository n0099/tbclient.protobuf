package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ShareResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ShareResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ShareResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ShareResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ShareResIdl param1ShareResIdl) {
      super(param1ShareResIdl);
      if (param1ShareResIdl == null)
        return; 
      this.error = param1ShareResIdl.error;
      this.data = param1ShareResIdl.data;
    }
    
    public ShareResIdl build(boolean param1Boolean) {
      return new ShareResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
