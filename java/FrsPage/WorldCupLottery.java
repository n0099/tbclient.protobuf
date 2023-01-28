package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WorldCupLottery extends Message {
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  public WorldCupLottery(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.url = ((Builder)str).url;
    } 
  }
  
  public WorldCupLottery(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WorldCupLottery> {
    public String url;
    
    public Builder() {}
    
    public Builder(WorldCupLottery param1WorldCupLottery) {
      super(param1WorldCupLottery);
      if (param1WorldCupLottery == null)
        return; 
      this.url = param1WorldCupLottery.url;
    }
    
    public WorldCupLottery build(boolean param1Boolean) {
      return new WorldCupLottery(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
