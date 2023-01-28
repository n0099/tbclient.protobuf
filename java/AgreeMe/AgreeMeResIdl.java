package tbclient.AgreeMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class AgreeMeResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public AgreeMeResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public AgreeMeResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AgreeMeResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(AgreeMeResIdl param1AgreeMeResIdl) {
      super(param1AgreeMeResIdl);
      if (param1AgreeMeResIdl == null)
        return; 
      this.error = param1AgreeMeResIdl.error;
      this.data = param1AgreeMeResIdl.data;
    }
    
    public AgreeMeResIdl build(boolean param1Boolean) {
      return new AgreeMeResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
