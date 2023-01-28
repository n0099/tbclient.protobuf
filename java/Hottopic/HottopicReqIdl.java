package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HottopicReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public HottopicReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public HottopicReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HottopicReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(HottopicReqIdl param1HottopicReqIdl) {
      super(param1HottopicReqIdl);
      if (param1HottopicReqIdl == null)
        return; 
      this.data = param1HottopicReqIdl.data;
    }
    
    public HottopicReqIdl build(boolean param1Boolean) {
      return new HottopicReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
