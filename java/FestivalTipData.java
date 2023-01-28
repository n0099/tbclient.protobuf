package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class FestivalTipData extends Message {
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final String DEFAULT_TEXT = "";
  
  @ProtoField(tag = 3)
  public final ThemeColorInfo background_color;
  
  @ProtoField(tag = 4)
  public final ThemeColorInfo font_color;
  
  @ProtoField(tag = 5)
  public final IconUrlInfo icon_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String text;
  
  public FestivalTipData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.text;
      if (str == null) {
        this.text = "";
      } else {
        this.text = str;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
      this.background_color = paramBuilder.background_color;
      this.font_color = paramBuilder.font_color;
      this.icon_url = paramBuilder.icon_url;
    } else {
      this.text = paramBuilder.text;
      this.jump_url = paramBuilder.jump_url;
      this.background_color = paramBuilder.background_color;
      this.font_color = paramBuilder.font_color;
      this.icon_url = paramBuilder.icon_url;
    } 
  }
  
  public FestivalTipData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<FestivalTipData> {
    public ThemeColorInfo background_color;
    
    public ThemeColorInfo font_color;
    
    public IconUrlInfo icon_url;
    
    public String jump_url;
    
    public String text;
    
    public Builder() {}
    
    public Builder(FestivalTipData param1FestivalTipData) {
      super(param1FestivalTipData);
      if (param1FestivalTipData == null)
        return; 
      this.text = param1FestivalTipData.text;
      this.jump_url = param1FestivalTipData.jump_url;
      this.background_color = param1FestivalTipData.background_color;
      this.font_color = param1FestivalTipData.font_color;
      this.icon_url = param1FestivalTipData.icon_url;
    }
    
    public FestivalTipData build(boolean param1Boolean) {
      return new FestivalTipData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
