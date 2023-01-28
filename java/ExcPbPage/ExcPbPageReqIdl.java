package tbclient.ExcPbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExcPbPageReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ExcPbPageReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ExcPbPageReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ExcPbPageReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ExcPbPageReqIdl param1ExcPbPageReqIdl) {
      super(param1ExcPbPageReqIdl);
      if (param1ExcPbPageReqIdl == null)
        return; 
      this.data = param1ExcPbPageReqIdl.data;
    }
    
    public ExcPbPageReqIdl build(boolean param1Boolean) {
      return new ExcPbPageReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
