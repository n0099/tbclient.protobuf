package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HotThreadListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public HotThreadListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public HotThreadListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotThreadListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(HotThreadListReqIdl param1HotThreadListReqIdl) {
      super(param1HotThreadListReqIdl);
      if (param1HotThreadListReqIdl == null)
        return; 
      this.data = param1HotThreadListReqIdl.data;
    }
    
    public HotThreadListReqIdl build(boolean param1Boolean) {
      return new HotThreadListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
