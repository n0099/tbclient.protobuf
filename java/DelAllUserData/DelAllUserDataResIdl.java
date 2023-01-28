package tbclient.DelAllUserData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class DelAllUserDataResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public DelAllUserDataResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public DelAllUserDataResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DelAllUserDataResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(DelAllUserDataResIdl param1DelAllUserDataResIdl) {
      super(param1DelAllUserDataResIdl);
      if (param1DelAllUserDataResIdl == null)
        return; 
      this.error = param1DelAllUserDataResIdl.error;
      this.data = param1DelAllUserDataResIdl.data;
    }
    
    public DelAllUserDataResIdl build(boolean param1Boolean) {
      return new DelAllUserDataResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
