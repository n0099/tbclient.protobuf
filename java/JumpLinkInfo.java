package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class JumpLinkInfo extends Message {
  public static final String DEFAULT_BACKGROUND_COLOR = "";
  
  public static final String DEFAULT_LINK_COLOR = "";
  
  public static final String DEFAULT_LINK_ICON = "";
  
  public static final String DEFAULT_LINK_TEXT = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_TITLE_COLOR = "";
  
  public static final String DEFAULT_TITLE_ICON = "";
  
  public static final String DEFAULT_TITLE_TEXT = "";
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String background_color;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String link_color;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_icon;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String link_text;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title_icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title_text;
  
  public JumpLinkInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title_icon;
      if (str1 == null) {
        this.title_icon = "";
      } else {
        this.title_icon = str1;
      } 
      str1 = paramBuilder.title_text;
      if (str1 == null) {
        this.title_text = "";
      } else {
        this.title_text = str1;
      } 
      str1 = paramBuilder.title_color;
      if (str1 == null) {
        this.title_color = "";
      } else {
        this.title_color = str1;
      } 
      str1 = paramBuilder.link_icon;
      if (str1 == null) {
        this.link_icon = "";
      } else {
        this.link_icon = str1;
      } 
      str1 = paramBuilder.link_text;
      if (str1 == null) {
        this.link_text = "";
      } else {
        this.link_text = str1;
      } 
      str1 = paramBuilder.link_color;
      if (str1 == null) {
        this.link_color = "";
      } else {
        this.link_color = str1;
      } 
      str1 = paramBuilder.link_url;
      if (str1 == null) {
        this.link_url = "";
      } else {
        this.link_url = str1;
      } 
      str = paramBuilder.background_color;
      if (str == null) {
        this.background_color = "";
      } else {
        this.background_color = str;
      } 
    } else {
      this.title_icon = ((Builder)str).title_icon;
      this.title_text = ((Builder)str).title_text;
      this.title_color = ((Builder)str).title_color;
      this.link_icon = ((Builder)str).link_icon;
      this.link_text = ((Builder)str).link_text;
      this.link_color = ((Builder)str).link_color;
      this.link_url = ((Builder)str).link_url;
      this.background_color = ((Builder)str).background_color;
    } 
  }
  
  public JumpLinkInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<JumpLinkInfo> {
    public String background_color;
    
    public String link_color;
    
    public String link_icon;
    
    public String link_text;
    
    public String link_url;
    
    public String title_color;
    
    public String title_icon;
    
    public String title_text;
    
    public Builder() {}
    
    public Builder(JumpLinkInfo param1JumpLinkInfo) {
      super(param1JumpLinkInfo);
      if (param1JumpLinkInfo == null)
        return; 
      this.title_icon = param1JumpLinkInfo.title_icon;
      this.title_text = param1JumpLinkInfo.title_text;
      this.title_color = param1JumpLinkInfo.title_color;
      this.link_icon = param1JumpLinkInfo.link_icon;
      this.link_text = param1JumpLinkInfo.link_text;
      this.link_color = param1JumpLinkInfo.link_color;
      this.link_url = param1JumpLinkInfo.link_url;
      this.background_color = param1JumpLinkInfo.background_color;
    }
    
    public JumpLinkInfo build(boolean param1Boolean) {
      return new JumpLinkInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
