package tbclient.UnreadTip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UnreadTipReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public UnreadTipReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public UnreadTipReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UnreadTipReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(UnreadTipReqIdl param1UnreadTipReqIdl) {
      super(param1UnreadTipReqIdl);
      if (param1UnreadTipReqIdl == null)
        return; 
      this.data = param1UnreadTipReqIdl.data;
    }
    
    public UnreadTipReqIdl build(boolean param1Boolean) {
      return new UnreadTipReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
