package tbclient.GetBubbleByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final List<ThemeBubbleInMain> DEFAULT_BUBBLES = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBubbleInMain> bubbles;
  
  @ProtoField(tag = 1)
  public final ThemeRecommand recommend;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeBubbleInMain> list;
    if (paramBoolean == true) {
      this.recommend = paramBuilder.recommend;
      list = paramBuilder.bubbles;
      if (list == null) {
        this.bubbles = DEFAULT_BUBBLES;
      } else {
        this.bubbles = Message.immutableCopyOf(list);
      } 
    } else {
      this.recommend = ((Builder)list).recommend;
      this.bubbles = Message.immutableCopyOf(((Builder)list).bubbles);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ThemeBubbleInMain> bubbles;
    
    public ThemeRecommand recommend;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.recommend = param1DataRes.recommend;
      this.bubbles = Message.copyOf(param1DataRes.bubbles);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
