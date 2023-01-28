package tbclient.GetThemeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final List<ThemeCarousel> DEFAULT_CAROUSEL;
  
  public static final List<ThemeList> DEFAULT_THEME_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeCarousel> carousel;
  
  @ProtoField(tag = 3)
  public final ThemeRecommand recommend;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThemeList> theme_list;
  
  static {
    DEFAULT_CAROUSEL = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      List<ThemeList> list1 = paramBuilder.theme_list;
      if (list1 == null) {
        this.theme_list = DEFAULT_THEME_LIST;
      } else {
        this.theme_list = Message.immutableCopyOf(list1);
      } 
      List<ThemeCarousel> list = paramBuilder.carousel;
      if (list == null) {
        this.carousel = DEFAULT_CAROUSEL;
      } else {
        this.carousel = Message.immutableCopyOf(list);
      } 
      this.recommend = paramBuilder.recommend;
    } else {
      this.theme_list = Message.immutableCopyOf(paramBuilder.theme_list);
      this.carousel = Message.immutableCopyOf(paramBuilder.carousel);
      this.recommend = paramBuilder.recommend;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ThemeCarousel> carousel;
    
    public ThemeRecommand recommend;
    
    public List<ThemeList> theme_list;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.theme_list = Message.copyOf(param1DataRes.theme_list);
      this.carousel = Message.copyOf(param1DataRes.carousel);
      this.recommend = param1DataRes.recommend;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
