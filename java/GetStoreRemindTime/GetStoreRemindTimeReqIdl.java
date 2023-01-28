package tbclient.GetStoreRemindTime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetStoreRemindTimeReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetStoreRemindTimeReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetStoreRemindTimeReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetStoreRemindTimeReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetStoreRemindTimeReqIdl param1GetStoreRemindTimeReqIdl) {
      super(param1GetStoreRemindTimeReqIdl);
      if (param1GetStoreRemindTimeReqIdl == null)
        return; 
      this.data = param1GetStoreRemindTimeReqIdl.data;
    }
    
    public GetStoreRemindTimeReqIdl build(boolean param1Boolean) {
      return new GetStoreRemindTimeReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
