package tbclient.CheckRealName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class CheckRealNameResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public CheckRealNameResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public CheckRealNameResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CheckRealNameResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(CheckRealNameResIdl param1CheckRealNameResIdl) {
      super(param1CheckRealNameResIdl);
      if (param1CheckRealNameResIdl == null)
        return; 
      this.error = param1CheckRealNameResIdl.error;
      this.data = param1CheckRealNameResIdl.data;
    }
    
    public CheckRealNameResIdl build(boolean param1Boolean) {
      return new CheckRealNameResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
