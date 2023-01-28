package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FrsPageReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public FrsPageReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public FrsPageReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FrsPageReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(FrsPageReqIdl param1FrsPageReqIdl) {
      super(param1FrsPageReqIdl);
      if (param1FrsPageReqIdl == null)
        return; 
      this.data = param1FrsPageReqIdl.data;
    }
    
    public FrsPageReqIdl build(boolean param1Boolean) {
      return new FrsPageReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
