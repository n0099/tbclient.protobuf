package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VitalityInfo extends Message {
  @ProtoField(tag = 1)
  public final FrequentlyForumInfo frequently_forum_info;
  
  public VitalityInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.frequently_forum_info = paramBuilder.frequently_forum_info;
    } else {
      this.frequently_forum_info = paramBuilder.frequently_forum_info;
    } 
  }
  
  public VitalityInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VitalityInfo> {
    public FrequentlyForumInfo frequently_forum_info;
    
    public Builder() {}
    
    public Builder(VitalityInfo param1VitalityInfo) {
      super(param1VitalityInfo);
      if (param1VitalityInfo == null)
        return; 
      this.frequently_forum_info = param1VitalityInfo.frequently_forum_info;
    }
    
    public VitalityInfo build(boolean param1Boolean) {
      return new VitalityInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
