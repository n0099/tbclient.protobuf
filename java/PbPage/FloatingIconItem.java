package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FloatingIconItem extends Message {
  public static final String DEFAULT_CLICK_STATISTICS_URL = "";
  
  public static final String DEFAULT_DEEPLINK = "";
  
  public static final String DEFAULT_DISPLAY_AD_ICON = "";
  
  public static final String DEFAULT_FLOAT_TYPE = "";
  
  public static final String DEFAULT_FOLD_LOTTIE = "";
  
  public static final String DEFAULT_FOLD_NAME = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_PACKAGE_NAME = "";
  
  public static final String DEFAULT_SCHEME = "";
  
  public static final String DEFAULT_UNFOLD_LOTTIE = "";
  
  public static final String DEFAULT_UNFOLD_NAME = "";
  
  public static final String DEFAULT_URL = "";
  
  public static final String DEFAULT_VIEW_STATISTICS_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String click_statistics_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String deeplink;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String display_ad_icon;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String float_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String fold_lottie;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String fold_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String package_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String scheme;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String unfold_lottie;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String unfold_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String view_statistics_url;
  
  public FloatingIconItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
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
      str1 = paramBuilder.fold_lottie;
      if (str1 == null) {
        this.fold_lottie = "";
      } else {
        this.fold_lottie = str1;
      } 
      str1 = paramBuilder.unfold_lottie;
      if (str1 == null) {
        this.unfold_lottie = "";
      } else {
        this.unfold_lottie = str1;
      } 
      str1 = paramBuilder.float_type;
      if (str1 == null) {
        this.float_type = "";
      } else {
        this.float_type = str1;
      } 
      str1 = paramBuilder.fold_name;
      if (str1 == null) {
        this.fold_name = "";
      } else {
        this.fold_name = str1;
      } 
      str1 = paramBuilder.unfold_name;
      if (str1 == null) {
        this.unfold_name = "";
      } else {
        this.unfold_name = str1;
      } 
      str = paramBuilder.display_ad_icon;
      if (str == null) {
        this.display_ad_icon = "";
      } else {
        this.display_ad_icon = str;
      } 
    } else {
      this.url = ((Builder)str).url;
      this.icon_url = ((Builder)str).icon_url;
      this.view_statistics_url = ((Builder)str).view_statistics_url;
      this.click_statistics_url = ((Builder)str).click_statistics_url;
      this.deeplink = ((Builder)str).deeplink;
      this.scheme = ((Builder)str).scheme;
      this.package_name = ((Builder)str).package_name;
      this.fold_lottie = ((Builder)str).fold_lottie;
      this.unfold_lottie = ((Builder)str).unfold_lottie;
      this.float_type = ((Builder)str).float_type;
      this.fold_name = ((Builder)str).fold_name;
      this.unfold_name = ((Builder)str).unfold_name;
      this.display_ad_icon = ((Builder)str).display_ad_icon;
    } 
  }
  
  public FloatingIconItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FloatingIconItem> {
    public String click_statistics_url;
    
    public String deeplink;
    
    public String display_ad_icon;
    
    public String float_type;
    
    public String fold_lottie;
    
    public String fold_name;
    
    public String icon_url;
    
    public String package_name;
    
    public String scheme;
    
    public String unfold_lottie;
    
    public String unfold_name;
    
    public String url;
    
    public String view_statistics_url;
    
    public Builder() {}
    
    public Builder(FloatingIconItem param1FloatingIconItem) {
      super(param1FloatingIconItem);
      if (param1FloatingIconItem == null)
        return; 
      this.url = param1FloatingIconItem.url;
      this.icon_url = param1FloatingIconItem.icon_url;
      this.view_statistics_url = param1FloatingIconItem.view_statistics_url;
      this.click_statistics_url = param1FloatingIconItem.click_statistics_url;
      this.deeplink = param1FloatingIconItem.deeplink;
      this.scheme = param1FloatingIconItem.scheme;
      this.package_name = param1FloatingIconItem.package_name;
      this.fold_lottie = param1FloatingIconItem.fold_lottie;
      this.unfold_lottie = param1FloatingIconItem.unfold_lottie;
      this.float_type = param1FloatingIconItem.float_type;
      this.fold_name = param1FloatingIconItem.fold_name;
      this.unfold_name = param1FloatingIconItem.unfold_name;
      this.display_ad_icon = param1FloatingIconItem.display_ad_icon;
    }
    
    public FloatingIconItem build(boolean param1Boolean) {
      return new FloatingIconItem(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
