package tbclient.PbFloor;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbFloorReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public PbFloorReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public PbFloorReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbFloorReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(PbFloorReqIdl param1PbFloorReqIdl) {
      super(param1PbFloorReqIdl);
      if (param1PbFloorReqIdl == null)
        return; 
      this.data = param1PbFloorReqIdl.data;
    }
    
    public PbFloorReqIdl build(boolean param1Boolean) {
      return new PbFloorReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
