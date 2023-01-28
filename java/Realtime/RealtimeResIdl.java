package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class RealtimeResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public RealtimeResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public RealtimeResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RealtimeResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(RealtimeResIdl param1RealtimeResIdl) {
      super(param1RealtimeResIdl);
      if (param1RealtimeResIdl == null)
        return; 
      this.error = param1RealtimeResIdl.error;
      this.data = param1RealtimeResIdl.data;
    }
    
    public RealtimeResIdl build(boolean param1Boolean) {
      return new RealtimeResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
