package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipBanner extends Message {
  public static final String DEFAULT_BUBBLE = "";
  
  public static final String DEFAULT_BUTTON_LABLE = "";
  
  public static final String DEFAULT_BUTTON_URL = "";
  
  public static final String DEFAULT_SUB_TITLE = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String bubble;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String button_lable;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String button_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String sub_title;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  public VipBanner(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.sub_title;
      if (str1 == null) {
        this.sub_title = "";
      } else {
        this.sub_title = str1;
      } 
      str1 = paramBuilder.button_lable;
      if (str1 == null) {
        this.button_lable = "";
      } else {
        this.button_lable = str1;
      } 
      str1 = paramBuilder.bubble;
      if (str1 == null) {
        this.bubble = "";
      } else {
        this.bubble = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.button_url;
      if (str == null) {
        this.button_url = "";
      } else {
        this.button_url = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.sub_title = ((Builder)str).sub_title;
      this.button_lable = ((Builder)str).button_lable;
      this.bubble = ((Builder)str).bubble;
      this.url = ((Builder)str).url;
      this.button_url = ((Builder)str).button_url;
    } 
  }
  
  public VipBanner(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipBanner> {
    public String bubble;
    
    public String button_lable;
    
    public String button_url;
    
    public String sub_title;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(VipBanner param1VipBanner) {
      super(param1VipBanner);
      if (param1VipBanner == null)
        return; 
      this.title = param1VipBanner.title;
      this.sub_title = param1VipBanner.sub_title;
      this.button_lable = param1VipBanner.button_lable;
      this.bubble = param1VipBanner.bubble;
      this.url = param1VipBanner.url;
      this.button_url = param1VipBanner.button_url;
    }
    
    public VipBanner build(boolean param1Boolean) {
      return new VipBanner(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
