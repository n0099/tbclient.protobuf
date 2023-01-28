package tbclient.CheckPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CheckPostReqIdl extends Message {
  @ProtoField(tag = 1)
  public final ReqData data;
  
  public CheckPostReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public CheckPostReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<CheckPostReqIdl> {
    public ReqData data;
    
    public Builder() {}
    
    public Builder(CheckPostReqIdl param1CheckPostReqIdl) {
      super(param1CheckPostReqIdl);
      if (param1CheckPostReqIdl == null)
        return; 
      this.data = param1CheckPostReqIdl.data;
    }
    
    public CheckPostReqIdl build(boolean param1Boolean) {
      return new CheckPostReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
