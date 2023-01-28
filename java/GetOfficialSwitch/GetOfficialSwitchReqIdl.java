package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetOfficialSwitchReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetOfficialSwitchReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetOfficialSwitchReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetOfficialSwitchReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetOfficialSwitchReqIdl param1GetOfficialSwitchReqIdl) {
      super(param1GetOfficialSwitchReqIdl);
      if (param1GetOfficialSwitchReqIdl == null)
        return; 
      this.data = param1GetOfficialSwitchReqIdl.data;
    }
    
    public GetOfficialSwitchReqIdl build(boolean param1Boolean) {
      return new GetOfficialSwitchReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
