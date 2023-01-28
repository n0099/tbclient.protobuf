package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeTailInUser;

public final class ResData extends Message {
  public static final List<ColorInfo> DEFAULT_COLORLIST;
  
  public static final String DEFAULT_DEFAULT_COLOR = "";
  
  public static final List<TailInfo> DEFAULT_TAILLIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ColorInfo> colorList;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String default_color;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<TailInfo> tailList;
  
  @ProtoField(tag = 4)
  public final ThemeTailInUser tail_style;
  
  static {
    DEFAULT_COLORLIST = Collections.emptyList();
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<TailInfo> list1 = paramBuilder.tailList;
      if (list1 == null) {
        this.tailList = DEFAULT_TAILLIST;
      } else {
        this.tailList = Message.immutableCopyOf(list1);
      } 
      List<ColorInfo> list = paramBuilder.colorList;
      if (list == null) {
        this.colorList = DEFAULT_COLORLIST;
      } else {
        this.colorList = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.default_color;
      if (str == null) {
        this.default_color = "";
      } else {
        this.default_color = str;
      } 
      this.tail_style = paramBuilder.tail_style;
    } else {
      this.tailList = Message.immutableCopyOf(paramBuilder.tailList);
      this.colorList = Message.immutableCopyOf(paramBuilder.colorList);
      this.default_color = paramBuilder.default_color;
      this.tail_style = paramBuilder.tail_style;
    } 
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ResData> {
    public List<ColorInfo> colorList;
    
    public String default_color;
    
    public List<TailInfo> tailList;
    
    public ThemeTailInUser tail_style;
    
    public Builder() {}
    
    public Builder(ResData param1ResData) {
      super(param1ResData);
      if (param1ResData == null)
        return; 
      this.tailList = Message.copyOf(param1ResData.tailList);
      this.colorList = Message.copyOf(param1ResData.colorList);
      this.default_color = param1ResData.default_color;
      this.tail_style = param1ResData.tail_style;
    }
    
    public ResData build(boolean param1Boolean) {
      return new ResData(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
