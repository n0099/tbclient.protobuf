package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecomVerticalReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public RecomVerticalReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public RecomVerticalReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecomVerticalReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(RecomVerticalReqIdl param1RecomVerticalReqIdl) {
      super(param1RecomVerticalReqIdl);
      if (param1RecomVerticalReqIdl == null)
        return; 
      this.data = param1RecomVerticalReqIdl.data;
    }
    
    public RecomVerticalReqIdl build(boolean param1Boolean) {
      return new RecomVerticalReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
