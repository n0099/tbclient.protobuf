package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.App;

public final class AdkillerAd extends Message {
  public static final Integer DEFAULT_CAN_CLOSE = Integer.valueOf(0);
  
  public static final String DEFAULT_GAME_URL = "";
  
  public static final String DEFAULT_TAG = "";
  
  @ProtoField(tag = 3)
  public final App app;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer can_close;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tag;
  
  public AdkillerAd(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.tag;
      if (str == null) {
        this.tag = "";
      } else {
        this.tag = str;
      } 
      str = paramBuilder.game_url;
      if (str == null) {
        this.game_url = "";
      } else {
        this.game_url = str;
      } 
      this.app = paramBuilder.app;
      integer = paramBuilder.can_close;
      if (integer == null) {
        this.can_close = DEFAULT_CAN_CLOSE;
      } else {
        this.can_close = integer;
      } 
    } else {
      this.tag = ((Builder)integer).tag;
      this.game_url = ((Builder)integer).game_url;
      this.app = ((Builder)integer).app;
      this.can_close = ((Builder)integer).can_close;
    } 
  }
  
  public AdkillerAd(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AdkillerAd> {
    public App app;
    
    public Integer can_close;
    
    public String game_url;
    
    public String tag;
    
    public Builder() {}
    
    public Builder(AdkillerAd param1AdkillerAd) {
      super(param1AdkillerAd);
      if (param1AdkillerAd == null)
        return; 
      this.tag = param1AdkillerAd.tag;
      this.game_url = param1AdkillerAd.game_url;
      this.app = param1AdkillerAd.app;
      this.can_close = param1AdkillerAd.can_close;
    }
    
    public AdkillerAd build(boolean param1Boolean) {
      return new AdkillerAd(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
