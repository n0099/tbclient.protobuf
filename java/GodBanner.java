package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class GodBanner extends Message {
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic_url;
  
  public GodBanner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      str1 = paramBuilder.link_url;
      if (str1 == null) {
        this.link_url = "";
      } else {
        this.link_url = str1;
      } 
      str = paramBuilder.intro;
      if (str == null) {
        this.intro = "";
      } else {
        this.intro = str;
      } 
    } else {
      this.pic_url = ((Builder)str).pic_url;
      this.link_url = ((Builder)str).link_url;
      this.intro = ((Builder)str).intro;
    } 
  }
  
  public GodBanner(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<GodBanner> {
    public String intro;
    
    public String link_url;
    
    public String pic_url;
    
    public Builder() {}
    
    public Builder(GodBanner param1GodBanner) {
      super(param1GodBanner);
      if (param1GodBanner == null)
        return; 
      this.pic_url = param1GodBanner.pic_url;
      this.link_url = param1GodBanner.link_url;
      this.intro = param1GodBanner.intro;
    }
    
    public GodBanner build(boolean param1Boolean) {
      return new GodBanner(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
