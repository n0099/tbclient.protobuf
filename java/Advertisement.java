package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Advertisement extends Message {
  public static final String DEFAULT_ADVERTISEMENT_ID = "";
  
  public static final String DEFAULT_CLICK_STATISTICS_URL = "";
  
  public static final String DEFAULT_DEEPLINK = "";
  
  public static final String DEFAULT_DISPLAY_AD_ICON = "";
  
  public static final String DEFAULT_FLOATING_TEXT = "";
  
  public static final String DEFAULT_JUMP_LINK = "";
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final String DEFAULT_PIC = "";
  
  public static final String DEFAULT_PIC_CLICK = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final Long DEFAULT_TIME = Long.valueOf(0L);
  
  public static final String DEFAULT_VIEW_STATISTICS_URL = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String advertisement_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String click_statistics_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String deeplink;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String display_ad_icon;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String floating_text;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_link;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic_click;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long time;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String view_statistics_url;
  
  public Advertisement(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.time;
      if (long_ == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = long_;
      } 
      String str1 = paramBuilder.pic;
      if (str1 == null) {
        this.pic = "";
      } else {
        this.pic = str1;
      } 
      str1 = paramBuilder.pic_click;
      if (str1 == null) {
        this.pic_click = "";
      } else {
        this.pic_click = str1;
      } 
      str1 = paramBuilder.jump_link;
      if (str1 == null) {
        this.jump_link = "";
      } else {
        this.jump_link = str1;
      } 
      str1 = paramBuilder.advertisement_id;
      if (str1 == null) {
        this.advertisement_id = "";
      } else {
        this.advertisement_id = str1;
      } 
      str1 = paramBuilder.view_statistics_url;
      if (str1 == null) {
        this.view_statistics_url = "";
      } else {
        this.view_statistics_url = str1;
      } 
      str1 = paramBuilder.click_statistics_url;
      if (str1 == null) {
        this.click_statistics_url = "";
      } else {
        this.click_statistics_url = str1;
      } 
      str1 = paramBuilder.floating_text;
      if (str1 == null) {
        this.floating_text = "";
      } else {
        this.floating_text = str1;
      } 
      str1 = paramBuilder.deeplink;
      if (str1 == null) {
        this.deeplink = "";
      } else {
        this.deeplink = str1;
      } 
      str1 = paramBuilder.scheme;
      if (str1 == null) {
        this.scheme = "";
      } else {
        this.scheme = str1;
      } 
      str1 = paramBuilder.package_name;
      if (str1 == null) {
        this.package_name = "";
      } else {
        this.package_name = str1;
      } 
      str = paramBuilder.display_ad_icon;
      if (str == null) {
        this.display_ad_icon = "";
      } else {
        this.display_ad_icon = str;
      } 
    } else {
      this.time = ((Builder)str).time;
      this.pic = ((Builder)str).pic;
      this.pic_click = ((Builder)str).pic_click;
      this.jump_link = ((Builder)str).jump_link;
      this.advertisement_id = ((Builder)str).advertisement_id;
      this.view_statistics_url = ((Builder)str).view_statistics_url;
      this.click_statistics_url = ((Builder)str).click_statistics_url;
      this.floating_text = ((Builder)str).floating_text;
      this.deeplink = ((Builder)str).deeplink;
      this.scheme = ((Builder)str).scheme;
      this.package_name = ((Builder)str).package_name;
      this.display_ad_icon = ((Builder)str).display_ad_icon;
    } 
  }
  
  public Advertisement(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Advertisement> {
    public String advertisement_id;
    
    public String click_statistics_url;
    
    public String deeplink;
    
    public String display_ad_icon;
    
    public String floating_text;
    
    public String jump_link;
    
    public String package_name;
    
    public String pic;
    
    public String pic_click;
    
    public String scheme;
    
    public Long time;
    
    public String view_statistics_url;
    
    public Builder() {}
    
    public Builder(Advertisement param1Advertisement) {
      super(param1Advertisement);
      if (param1Advertisement == null)
        return; 
      this.time = param1Advertisement.time;
      this.pic = param1Advertisement.pic;
      this.pic_click = param1Advertisement.pic_click;
      this.jump_link = param1Advertisement.jump_link;
      this.advertisement_id = param1Advertisement.advertisement_id;
      this.view_statistics_url = param1Advertisement.view_statistics_url;
      this.click_statistics_url = param1Advertisement.click_statistics_url;
      this.floating_text = param1Advertisement.floating_text;
      this.deeplink = param1Advertisement.deeplink;
      this.scheme = param1Advertisement.scheme;
      this.package_name = param1Advertisement.package_name;
      this.display_ad_icon = param1Advertisement.display_ad_icon;
    }
    
    public Advertisement build(boolean param1Boolean) {
      return new Advertisement(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
