package tbclient.RedNotify;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class RedNotifyResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public RedNotifyResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public RedNotifyResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RedNotifyResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(RedNotifyResIdl param1RedNotifyResIdl) {
      super(param1RedNotifyResIdl);
      if (param1RedNotifyResIdl == null)
        return; 
      this.error = param1RedNotifyResIdl.error;
      this.data = param1RedNotifyResIdl.data;
    }
    
    public RedNotifyResIdl build(boolean param1Boolean) {
      return new RedNotifyResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
