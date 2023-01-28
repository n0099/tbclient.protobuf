package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class ExcPbPageResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public ExcPbPageResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public ExcPbPageResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ExcPbPageResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(ExcPbPageResIdl param1ExcPbPageResIdl) {
      super(param1ExcPbPageResIdl);
      if (param1ExcPbPageResIdl == null)
        return; 
      this.data = param1ExcPbPageResIdl.data;
      this.error = param1ExcPbPageResIdl.error;
    }
    
    public ExcPbPageResIdl build(boolean param1Boolean) {
      return new ExcPbPageResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
