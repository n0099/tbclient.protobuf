package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Badges extends Message {
  public static final Integer DEFAULT_BADGE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_BADGE_URL = "";
  
  public static final String DEFAULT_WEBVIEW = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer badge_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String badge_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String webview;
  
  public Badges(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.badge_id;
      if (integer == null) {
        this.badge_id = DEFAULT_BADGE_ID;
      } else {
        this.badge_id = integer;
      } 
      String str1 = paramBuilder.badge_url;
      if (str1 == null) {
        this.badge_url = "";
      } else {
        this.badge_url = str1;
      } 
      str = paramBuilder.webview;
      if (str == null) {
        this.webview = "";
      } else {
        this.webview = str;
      } 
    } else {
      this.badge_id = ((Builder)str).badge_id;
      this.badge_url = ((Builder)str).badge_url;
      this.webview = ((Builder)str).webview;
    } 
  }
  
  public Badges(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Badges> {
    public Integer badge_id;
    
    public String badge_url;
    
    public String webview;
    
    public Builder() {}
    
    public Builder(Badges param1Badges) {
      super(param1Badges);
      if (param1Badges == null)
        return; 
      this.badge_id = param1Badges.badge_id;
      this.badge_url = param1Badges.badge_url;
      this.webview = param1Badges.webview;
    }
    
    public Badges build(boolean param1Boolean) {
      return new Badges(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
