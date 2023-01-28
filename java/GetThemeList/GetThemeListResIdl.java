package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class GetThemeListResIdl extends Message {
  @ProtoField(tag = 1)
  public final DataRes data;
  
  @ProtoField(tag = 2)
  public final Error error;
  
  public GetThemeListResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } else {
      this.data = paramBuilder.data;
      this.error = paramBuilder.error;
    } 
  }
  
  public GetThemeListResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GetThemeListResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(GetThemeListResIdl param1GetThemeListResIdl) {
      super(param1GetThemeListResIdl);
      if (param1GetThemeListResIdl == null)
        return; 
      this.data = param1GetThemeListResIdl.data;
      this.error = param1GetThemeListResIdl.error;
    }
    
    public GetThemeListResIdl build(boolean param1Boolean) {
      return new GetThemeListResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
