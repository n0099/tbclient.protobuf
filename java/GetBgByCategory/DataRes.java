package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final List<ThemeBgInMain> DEFAULT_BGS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgInMain> bgs;
  
  @ProtoField(tag = 1)
  public final ThemeRecommand recommend;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThemeBgInMain> list;
    if (paramBoolean == true) {
      this.recommend = paramBuilder.recommend;
      list = paramBuilder.bgs;
      if (list == null) {
        this.bgs = DEFAULT_BGS;
      } else {
        this.bgs = Message.immutableCopyOf(list);
      } 
    } else {
      this.recommend = ((Builder)list).recommend;
      this.bgs = Message.immutableCopyOf(((Builder)list).bgs);
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ThemeBgInMain> bgs;
    
    public ThemeRecommand recommend;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.recommend = param1DataRes.recommend;
      this.bgs = Message.copyOf(param1DataRes.bgs);
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
