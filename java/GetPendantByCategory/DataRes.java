package tbclient.GetPendantByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final List<ThemePendantInMain> DEFAULT_PENDANT = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemePendantInMain> pendant;
  
  @ProtoField(tag = 1)
  public final ThemeRecommand recommend;
  
  static {
    DEFAULT_HAS_MORE = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.recommend = paramBuilder.recommend;
      List<ThemePendantInMain> list = paramBuilder.pendant;
      if (list == null) {
        this.pendant = DEFAULT_PENDANT;
      } else {
        this.pendant = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.recommend = ((Builder)integer).recommend;
      this.pendant = Message.immutableCopyOf(((Builder)integer).pendant);
      this.has_more = ((Builder)integer).has_more;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public Integer has_more;
    
    public List<ThemePendantInMain> pendant;
    
    public ThemeRecommand recommend;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.recommend = param1DataRes.recommend;
      this.pendant = Message.copyOf(param1DataRes.pendant);
      this.has_more = param1DataRes.has_more;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
