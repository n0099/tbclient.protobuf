package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GetThemeListReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public GetThemeListReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public GetThemeListReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetThemeListReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(GetThemeListReqIdl param1GetThemeListReqIdl) {
      super(param1GetThemeListReqIdl);
      if (param1GetThemeListReqIdl == null)
        return; 
      this.data = param1GetThemeListReqIdl.data;
    }
    
    public GetThemeListReqIdl build(boolean param1Boolean) {
      return new GetThemeListReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
