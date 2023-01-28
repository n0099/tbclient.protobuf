package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RealtimeReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public RealtimeReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public RealtimeReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RealtimeReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(RealtimeReqIdl param1RealtimeReqIdl) {
      super(param1RealtimeReqIdl);
      if (param1RealtimeReqIdl == null)
        return; 
      this.data = param1RealtimeReqIdl.data;
    }
    
    public RealtimeReqIdl build(boolean param1Boolean) {
      return new RealtimeReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
