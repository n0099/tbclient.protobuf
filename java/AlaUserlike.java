package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AlaUserlike extends Message {
  @ProtoField(tag = 2)
  public final AlaLiveInfo ala_live_info;
  
  @ProtoField(tag = 1)
  public final User user;
  
  public AlaUserlike(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.user = paramBuilder.user;
      this.ala_live_info = paramBuilder.ala_live_info;
    } else {
      this.user = paramBuilder.user;
      this.ala_live_info = paramBuilder.ala_live_info;
    } 
  }
  
  public AlaUserlike(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AlaUserlike> {
    public AlaLiveInfo ala_live_info;
    
    public User user;
    
    public Builder() {}
    
    public Builder(AlaUserlike param1AlaUserlike) {
      super(param1AlaUserlike);
      if (param1AlaUserlike == null)
        return; 
      this.user = param1AlaUserlike.user;
      this.ala_live_info = param1AlaUserlike.ala_live_info;
    }
    
    public AlaUserlike build(boolean param1Boolean) {
      return new AlaUserlike(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
