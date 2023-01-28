package tbclient.GetBubbleByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;

public final class ThemeBubbleInMain extends Message {
  public static final String DEFAULT_BUBBLE_CATEGORY = "";
  
  public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bubble_category;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgProp> props;
  
  public ThemeBubbleInMain(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeBgProp> list;
    if (paramBoolean == true) {
      String str = paramBuilder.bubble_category;
      if (str == null) {
        this.bubble_category = "";
      } else {
        this.bubble_category = str;
      } 
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.bubble_category = ((Builder)list).bubble_category;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  public ThemeBubbleInMain(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThemeBubbleInMain> {
    public String bubble_category;
    
    public List<ThemeBgProp> props;
    
    public Builder() {}
    
    public Builder(ThemeBubbleInMain param1ThemeBubbleInMain) {
      super(param1ThemeBubbleInMain);
      if (param1ThemeBubbleInMain == null)
        return; 
      this.bubble_category = param1ThemeBubbleInMain.bubble_category;
      this.props = Message.copyOf(param1ThemeBubbleInMain.props);
    }
    
    public ThemeBubbleInMain build(boolean param1Boolean) {
      return new ThemeBubbleInMain(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
