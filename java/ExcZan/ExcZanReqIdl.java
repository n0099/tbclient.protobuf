package tbclient.ExcZan;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExcZanReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ExcZanReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ExcZanReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ExcZanReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ExcZanReqIdl param1ExcZanReqIdl) {
      super(param1ExcZanReqIdl);
      if (param1ExcZanReqIdl == null)
        return; 
      this.data = param1ExcZanReqIdl.data;
    }
    
    public ExcZanReqIdl build(boolean param1Boolean) {
      return new ExcZanReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
