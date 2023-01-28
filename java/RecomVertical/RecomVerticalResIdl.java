package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class RecomVerticalResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public RecomVerticalResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public RecomVerticalResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecomVerticalResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(RecomVerticalResIdl param1RecomVerticalResIdl) {
      super(param1RecomVerticalResIdl);
      if (param1RecomVerticalResIdl == null)
        return; 
      this.error = param1RecomVerticalResIdl.error;
      this.data = param1RecomVerticalResIdl.data;
    }
    
    public RecomVerticalResIdl build(boolean param1Boolean) {
      return new RecomVerticalResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
