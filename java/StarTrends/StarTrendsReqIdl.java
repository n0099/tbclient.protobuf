package tbclient.StarTrends;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarTrendsReqIdl extends Message {
  @ProtoField(tag = 1)
  public final DataReq data;
  
  public StarTrendsReqIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.data = paramBuilder.data;
    } else {
      this.data = paramBuilder.data;
    } 
  }
  
  public StarTrendsReqIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarTrendsReqIdl> {
    public DataReq data;
    
    public Builder() {}
    
    public Builder(StarTrendsReqIdl param1StarTrendsReqIdl) {
      super(param1StarTrendsReqIdl);
      if (param1StarTrendsReqIdl == null)
        return; 
      this.data = param1StarTrendsReqIdl.data;
    }
    
    public StarTrendsReqIdl build(boolean param1Boolean) {
      return new StarTrendsReqIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
