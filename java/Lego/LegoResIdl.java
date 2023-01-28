package tbclient.Lego;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class LegoResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public LegoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public LegoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LegoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(LegoResIdl param1LegoResIdl) {
      super(param1LegoResIdl);
      if (param1LegoResIdl == null)
        return; 
      this.data = param1LegoResIdl.data;
      this.error = param1LegoResIdl.error;
    }
    
    public LegoResIdl build(boolean param1Boolean) {
      return new LegoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
