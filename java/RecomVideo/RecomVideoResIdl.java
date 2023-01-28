package tbclient.RecomVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class RecomVideoResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public RecomVideoResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public RecomVideoResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecomVideoResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(RecomVideoResIdl param1RecomVideoResIdl) {
      super(param1RecomVideoResIdl);
      if (param1RecomVideoResIdl == null)
        return; 
      this.error = param1RecomVideoResIdl.error;
      this.data = param1RecomVideoResIdl.data;
    }
    
    public RecomVideoResIdl build(boolean param1Boolean) {
      return new RecomVideoResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
