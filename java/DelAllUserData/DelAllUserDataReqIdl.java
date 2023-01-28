package tbclient.DelAllUserData;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DelAllUserDataReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public DelAllUserDataReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public DelAllUserDataReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DelAllUserDataReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(DelAllUserDataReqIdl param1DelAllUserDataReqIdl) {
      super(param1DelAllUserDataReqIdl);
      if (param1DelAllUserDataReqIdl == null)
        return; 
      this.data = param1DelAllUserDataReqIdl.data;
    }
    
    public DelAllUserDataReqIdl build(boolean param1Boolean) {
      return new DelAllUserDataReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
