package tbclient.StarTrends;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

public final class StarTrendsResIdl extends Message {
  @ProtoField(tag = 2)
  public final DataRes data;
  
  @ProtoField(tag = 1)
  public final Error error;
  
  public StarTrendsResIdl(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } else {
      this.error = paramBuilder.error;
      this.data = paramBuilder.data;
    } 
  }
  
  public StarTrendsResIdl(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarTrendsResIdl> {
    public DataRes data;
    
    public Error error;
    
    public Builder() {}
    
    public Builder(StarTrendsResIdl param1StarTrendsResIdl) {
      super(param1StarTrendsResIdl);
      if (param1StarTrendsResIdl == null)
        return; 
      this.error = param1StarTrendsResIdl.error;
      this.data = param1StarTrendsResIdl.data;
    }
    
    public StarTrendsResIdl build(boolean param1Boolean) {
      return new StarTrendsResIdl(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
