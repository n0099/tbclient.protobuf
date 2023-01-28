package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ProfileReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public ProfileReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public ProfileReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ProfileReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(ProfileReqIdl param1ProfileReqIdl) {
      super(param1ProfileReqIdl);
      if (param1ProfileReqIdl == null)
        return; 
      this.data = param1ProfileReqIdl.data;
    }
    
    public ProfileReqIdl build(boolean param1Boolean) {
      return new ProfileReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
