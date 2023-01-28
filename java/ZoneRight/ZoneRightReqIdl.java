package tbclient.ZoneRight;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ZoneRightReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ZoneRightReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ZoneRightReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ZoneRightReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ZoneRightReqIdl param1ZoneRightReqIdl) {
      super(param1ZoneRightReqIdl);
      if (param1ZoneRightReqIdl == null)
        return; 
      this.data = param1ZoneRightReqIdl.data;
    }
    
    public ZoneRightReqIdl build(boolean param1Boolean) {
      return new ZoneRightReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
