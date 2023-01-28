package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TbmallMonthIcon extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_MON = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String mon;
  
  public TbmallMonthIcon(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.mon;
      if (str1 == null) {
        this.mon = "";
      } else {
        this.mon = str1;
      } 
      str = paramBuilder.icon;
      if (str == null) {
        this.icon = "";
      } else {
        this.icon = str;
      } 
    } else {
      this.mon = ((Builder)str).mon;
      this.icon = ((Builder)str).icon;
    } 
  }
  
  public TbmallMonthIcon(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TbmallMonthIcon> {
    public String icon;
    
    public String mon;
    
    public Builder() {}
    
    public Builder(TbmallMonthIcon param1TbmallMonthIcon) {
      super(param1TbmallMonthIcon);
      if (param1TbmallMonthIcon == null)
        return; 
      this.mon = param1TbmallMonthIcon.mon;
      this.icon = param1TbmallMonthIcon.icon;
    }
    
    public TbmallMonthIcon build(boolean param1Boolean) {
      return new TbmallMonthIcon(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
