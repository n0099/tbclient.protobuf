package tbclient.RecomVideo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecomVideoReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public RecomVideoReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public RecomVideoReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecomVideoReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(RecomVideoReqIdl param1RecomVideoReqIdl) {
      super(param1RecomVideoReqIdl);
      if (param1RecomVideoReqIdl == null)
        return; 
      this.data = param1RecomVideoReqIdl.data;
    }
    
    public RecomVideoReqIdl build(boolean param1Boolean) {
      return new RecomVideoReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
