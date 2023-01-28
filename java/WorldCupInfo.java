package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class WorldCupInfo extends Message {
  public static final String DEFAULT_AVATAR_TEAMFLAG_URL = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String avatar_teamflag_url;
  
  public WorldCupInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.avatar_teamflag_url;
      if (str == null) {
        this.avatar_teamflag_url = "";
      } else {
        this.avatar_teamflag_url = str;
      } 
    } else {
      this.avatar_teamflag_url = ((Builder)str).avatar_teamflag_url;
    } 
  }
  
  public WorldCupInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<WorldCupInfo> {
    public String avatar_teamflag_url;
    
    public Builder() {}
    
    public Builder(WorldCupInfo param1WorldCupInfo) {
      super(param1WorldCupInfo);
      if (param1WorldCupInfo == null)
        return; 
      this.avatar_teamflag_url = param1WorldCupInfo.avatar_teamflag_url;
    }
    
    public WorldCupInfo build(boolean param1Boolean) {
      return new WorldCupInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
