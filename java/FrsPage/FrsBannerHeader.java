package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

public final class FrsBannerHeader extends Message {
  public static final String DEFAULT_CONTENT1 = "";
  
  public static final String DEFAULT_CONTENT2 = "";
  
  public static final String DEFAULT_ICON_URL = "";
  
  public static final String DEFAULT_JUMP_LINK = "";
  
  public static final String DEFAULT_JUMP_TIPS = "";
  
  public static final String DEFAULT_TYPE = "";
  
  @ProtoField(tag = 7)
  public final ThemeColorInfo background_color;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String content1;
  
  @ProtoField(tag = 4)
  public final ThemeColorInfo content1_color;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String content2;
  
  @ProtoField(tag = 5)
  public final ThemeColorInfo content2_color;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String icon_url;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String jump_link;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String jump_tips;
  
  @ProtoField(tag = 6)
  public final ThemeColorInfo jump_tips_color;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String type;
  
  public FrsBannerHeader(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.icon_url;
      if (str1 == null) {
        this.icon_url = "";
      } else {
        this.icon_url = str1;
      } 
      str1 = paramBuilder.content1;
      if (str1 == null) {
        this.content1 = "";
      } else {
        this.content1 = str1;
      } 
      str1 = paramBuilder.content2;
      if (str1 == null) {
        this.content2 = "";
      } else {
        this.content2 = str1;
      } 
      this.content1_color = paramBuilder.content1_color;
      this.content2_color = paramBuilder.content2_color;
      this.jump_tips_color = paramBuilder.jump_tips_color;
      this.background_color = paramBuilder.background_color;
      str1 = paramBuilder.jump_tips;
      if (str1 == null) {
        this.jump_tips = "";
      } else {
        this.jump_tips = str1;
      } 
      str1 = paramBuilder.jump_link;
      if (str1 == null) {
        this.jump_link = "";
      } else {
        this.jump_link = str1;
      } 
      str = paramBuilder.type;
      if (str == null) {
        this.type = "";
      } else {
        this.type = str;
      } 
    } else {
      this.icon_url = ((Builder)str).icon_url;
      this.content1 = ((Builder)str).content1;
      this.content2 = ((Builder)str).content2;
      this.content1_color = ((Builder)str).content1_color;
      this.content2_color = ((Builder)str).content2_color;
      this.jump_tips_color = ((Builder)str).jump_tips_color;
      this.background_color = ((Builder)str).background_color;
      this.jump_tips = ((Builder)str).jump_tips;
      this.jump_link = ((Builder)str).jump_link;
      this.type = ((Builder)str).type;
    } 
  }
  
  public FrsBannerHeader(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FrsBannerHeader> {
    public ThemeColorInfo background_color;
    
    public String content1;
    
    public ThemeColorInfo content1_color;
    
    public String content2;
    
    public ThemeColorInfo content2_color;
    
    public String icon_url;
    
    public String jump_link;
    
    public String jump_tips;
    
    public ThemeColorInfo jump_tips_color;
    
    public String type;
    
    public Builder() {}
    
    public Builder(FrsBannerHeader param1FrsBannerHeader) {
      super(param1FrsBannerHeader);
      if (param1FrsBannerHeader == null)
        return; 
      this.icon_url = param1FrsBannerHeader.icon_url;
      this.content1 = param1FrsBannerHeader.content1;
      this.content2 = param1FrsBannerHeader.content2;
      this.content1_color = param1FrsBannerHeader.content1_color;
      this.content2_color = param1FrsBannerHeader.content2_color;
      this.jump_tips_color = param1FrsBannerHeader.jump_tips_color;
      this.background_color = param1FrsBannerHeader.background_color;
      this.jump_tips = param1FrsBannerHeader.jump_tips;
      this.jump_link = param1FrsBannerHeader.jump_link;
      this.type = param1FrsBannerHeader.type;
    }
    
    public FrsBannerHeader build(boolean param1Boolean) {
      return new FrsBannerHeader(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
