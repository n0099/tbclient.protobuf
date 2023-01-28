package tbclient.GeneralTabList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GeneralTabListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GeneralTabListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GeneralTabListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GeneralTabListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GeneralTabListReqIdl param1GeneralTabListReqIdl) {
      super(param1GeneralTabListReqIdl);
      if (param1GeneralTabListReqIdl == null)
        return; 
      this.data = param1GeneralTabListReqIdl.data;
    }
    
    public GeneralTabListReqIdl build(boolean param1Boolean) {
      return new GeneralTabListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
