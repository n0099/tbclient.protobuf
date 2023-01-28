package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MoreTreasureTroveReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public MoreTreasureTroveReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public MoreTreasureTroveReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MoreTreasureTroveReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(MoreTreasureTroveReqIdl param1MoreTreasureTroveReqIdl) {
      super(param1MoreTreasureTroveReqIdl);
      if (param1MoreTreasureTroveReqIdl == null)
        return; 
      this.data = param1MoreTreasureTroveReqIdl.data;
    }
    
    public MoreTreasureTroveReqIdl build(boolean param1Boolean) {
      return new MoreTreasureTroveReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
