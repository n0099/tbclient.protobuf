package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarRankIcon extends Message {
  public static final String DEFAULT_ICON_LINK = "";
  
  public static final String DEFAULT_ICON_PIC_URL = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_link;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_pic_url;
  
  public StarRankIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon_pic_url;
      if (str1 == null) {
        this.icon_pic_url = "";
      } else {
        this.icon_pic_url = str1;
      } 
      str = paramBuilder.icon_link;
      if (str == null) {
        this.icon_link = "";
      } else {
        this.icon_link = str;
      } 
    } else {
      this.icon_pic_url = ((Builder)str).icon_pic_url;
      this.icon_link = ((Builder)str).icon_link;
    } 
  }
  
  public StarRankIcon(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<StarRankIcon> {
    public String icon_link;
    
    public String icon_pic_url;
    
    public Builder() {}
    
    public Builder(StarRankIcon param1StarRankIcon) {
      super(param1StarRankIcon);
      if (param1StarRankIcon == null)
        return; 
      this.icon_pic_url = param1StarRankIcon.icon_pic_url;
      this.icon_link = param1StarRankIcon.icon_link;
    }
    
    public StarRankIcon build(boolean param1Boolean) {
      return new StarRankIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
