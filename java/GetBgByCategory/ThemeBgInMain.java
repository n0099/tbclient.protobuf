package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;

public final class ThemeBgInMain extends Message {
  public static final String DEFAULT_BG_CATEGORY = "";
  
  public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bg_category;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgProp> props;
  
  public ThemeBgInMain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeBgProp> list;
    if (paramBoolean == true) {
      String str = paramBuilder.bg_category;
      if (str == null) {
        this.bg_category = "";
      } else {
        this.bg_category = str;
      } 
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.bg_category = ((Builder)list).bg_category;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  public ThemeBgInMain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeBgInMain> {
    public String bg_category;
    
    public List<ThemeBgProp> props;
    
    public Builder() {}
    
    public Builder(ThemeBgInMain param1ThemeBgInMain) {
      super(param1ThemeBgInMain);
      if (param1ThemeBgInMain == null)
        return; 
      this.bg_category = param1ThemeBgInMain.bg_category;
      this.props = Message.copyOf(param1ThemeBgInMain.props);
    }
    
    public ThemeBgInMain build(boolean param1Boolean) {
      return new ThemeBgInMain(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
