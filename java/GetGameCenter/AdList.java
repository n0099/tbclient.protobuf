package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class AdList extends Message {
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String link_url;
  
  public AdList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.link_url;
      if (str1 == null) {
        this.link_url = "";
      } else {
        this.link_url = str1;
      } 
      str = paramBuilder.img_url;
      if (str == null) {
        this.img_url = "";
      } else {
        this.img_url = str;
      } 
    } else {
      this.link_url = ((Builder)str).link_url;
      this.img_url = ((Builder)str).img_url;
    } 
  }
  
  public AdList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<AdList> {
    public String img_url;
    
    public String link_url;
    
    public Builder() {}
    
    public Builder(AdList param1AdList) {
      super(param1AdList);
      if (param1AdList == null)
        return; 
      this.link_url = param1AdList.link_url;
      this.img_url = param1AdList.img_url;
    }
    
    public AdList build(boolean param1Boolean) {
      return new AdList(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
