package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PbPageReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public PbPageReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public PbPageReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PbPageReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(PbPageReqIdl param1PbPageReqIdl) {
      super(param1PbPageReqIdl);
      if (param1PbPageReqIdl == null)
        return; 
      this.data = param1PbPageReqIdl.data;
    }
    
    public PbPageReqIdl build(boolean param1Boolean) {
      return new PbPageReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
