package tbclient.GetUserFreeChance;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetUserFreeChanceReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetUserFreeChanceReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetUserFreeChanceReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetUserFreeChanceReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetUserFreeChanceReqIdl param1GetUserFreeChanceReqIdl) {
      super(param1GetUserFreeChanceReqIdl);
      if (param1GetUserFreeChanceReqIdl == null)
        return; 
      this.data = param1GetUserFreeChanceReqIdl.data;
    }
    
    public GetUserFreeChanceReqIdl build(boolean param1Boolean) {
      return new GetUserFreeChanceReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
