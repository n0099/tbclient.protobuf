package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ElectionInfoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ElectionInfoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ElectionInfoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ElectionInfoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ElectionInfoReqIdl param1ElectionInfoReqIdl) {
      super(param1ElectionInfoReqIdl);
      if (param1ElectionInfoReqIdl == null)
        return; 
      this.data = param1ElectionInfoReqIdl.data;
    }
    
    public ElectionInfoReqIdl build(boolean param1Boolean) {
      return new ElectionInfoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
