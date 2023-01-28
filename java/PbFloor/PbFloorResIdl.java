package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class PbFloorResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public PbFloorResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public PbFloorResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbFloorResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(PbFloorResIdl param1PbFloorResIdl) {
      super(param1PbFloorResIdl);
      if (param1PbFloorResIdl == null)
        return; 
      this.error = param1PbFloorResIdl.error;
      this.data = param1PbFloorResIdl.data;
    }
    
    public PbFloorResIdl build(boolean param1Boolean) {
      return new PbFloorResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
