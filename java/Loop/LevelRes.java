package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class LevelRes extends Message {
  @ProtoField(tag = 1)
  public final LevelPop pop;
  
  public LevelRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.pop = paramBuilder.pop;
    } else {
      this.pop = paramBuilder.pop;
    } 
  }
  
  public LevelRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<LevelRes> {
    public LevelPop pop;
    
    public Builder() {}
    
    public Builder(LevelRes param1LevelRes) {
      super(param1LevelRes);
      if (param1LevelRes == null)
        return; 
      this.pop = param1LevelRes.pop;
    }
    
    public LevelRes build(boolean param1Boolean) {
      return new LevelRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
