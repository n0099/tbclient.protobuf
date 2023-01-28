package tbclient.AgreeMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AgreeMeReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public AgreeMeReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public AgreeMeReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AgreeMeReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(AgreeMeReqIdl param1AgreeMeReqIdl) {
      super(param1AgreeMeReqIdl);
      if (param1AgreeMeReqIdl == null)
        return; 
      this.data = param1AgreeMeReqIdl.data;
    }
    
    public AgreeMeReqIdl build(boolean param1Boolean) {
      return new AgreeMeReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
