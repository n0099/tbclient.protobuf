package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ZoneRightResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public ZoneRightResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public ZoneRightResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ZoneRightResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ZoneRightResIdl param1ZoneRightResIdl) {
      super(param1ZoneRightResIdl);
      if (param1ZoneRightResIdl == null)
        return; 
      this.error = param1ZoneRightResIdl.error;
      this.data = param1ZoneRightResIdl.data;
    }
    
    public ZoneRightResIdl build(boolean param1Boolean) {
      return new ZoneRightResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
