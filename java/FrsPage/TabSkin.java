package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TabSkin extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_ICON_NIGHT = "";
  
  public static final Integer DEFAULT_TAB_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_night;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  public TabSkin(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tab_id;
      if (integer == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer;
      } 
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.icon_night;
      if (str == null) {
        this.icon_night = "";
      } else {
        this.icon_night = str;
      } 
    } else {
      this.tab_id = ((Builder)str).tab_id;
      this.icon = ((Builder)str).icon;
      this.icon_night = ((Builder)str).icon_night;
    } 
  }
  
  public TabSkin(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TabSkin> {
    public String icon;
    
    public String icon_night;
    
    public Integer tab_id;
    
    public Builder() {}
    
    public Builder(TabSkin param1TabSkin) {
      super(param1TabSkin);
      if (param1TabSkin == null)
        return; 
      this.tab_id = param1TabSkin.tab_id;
      this.icon = param1TabSkin.icon;
      this.icon_night = param1TabSkin.icon_night;
    }
    
    public TabSkin build(boolean param1Boolean) {
      return new TabSkin(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
