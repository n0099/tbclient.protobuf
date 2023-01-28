package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class MoreTreasureTroveResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public MoreTreasureTroveResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public MoreTreasureTroveResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MoreTreasureTroveResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(MoreTreasureTroveResIdl param1MoreTreasureTroveResIdl) {
      super(param1MoreTreasureTroveResIdl);
      if (param1MoreTreasureTroveResIdl == null)
        return; 
      this.error = param1MoreTreasureTroveResIdl.error;
      this.data = param1MoreTreasureTroveResIdl.data;
    }
    
    public MoreTreasureTroveResIdl build(boolean param1Boolean) {
      return new MoreTreasureTroveResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
