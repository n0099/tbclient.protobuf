package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PbPageResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PbPageResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public PbPageResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbPageResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PbPageResIdl param1PbPageResIdl) {
      super(param1PbPageResIdl);
      if (param1PbPageResIdl == null)
        return; 
      this.error = param1PbPageResIdl.error;
      this.data = param1PbPageResIdl.data;
    }
    
    public PbPageResIdl build(boolean param1Boolean) {
      return new PbPageResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
