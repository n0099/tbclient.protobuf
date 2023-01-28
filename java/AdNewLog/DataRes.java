package tbclient.AdNewLog;

import com.squareup.wire.Message;

public final class DataRes extends Message {
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
