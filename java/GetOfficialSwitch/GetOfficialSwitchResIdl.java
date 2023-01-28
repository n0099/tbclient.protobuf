package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetOfficialSwitchResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public GetOfficialSwitchResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public GetOfficialSwitchResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetOfficialSwitchResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetOfficialSwitchResIdl param1GetOfficialSwitchResIdl) {
      super(param1GetOfficialSwitchResIdl);
      if (param1GetOfficialSwitchResIdl == null)
        return; 
      this.error = param1GetOfficialSwitchResIdl.error;
      this.data = param1GetOfficialSwitchResIdl.data;
    }
    
    public GetOfficialSwitchResIdl build(boolean param1Boolean) {
      return new GetOfficialSwitchResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
