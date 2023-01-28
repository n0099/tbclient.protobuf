package tbclient.GetBgList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeBgProp;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final List<ThemeBgProp> DEFAULT_BGS = Collections.emptyList();
  
  public static final Integer DEFAULT_HASMORE;
  
  public static final Integer DEFAULT_IS_DEFAULT;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgProp> bgs;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer hasmore;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer is_default;
  
  @ProtoField(tag = 1)
  public final ThemeRecommand recommend;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_HASMORE = integer;
    DEFAULT_IS_DEFAULT = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.recommend = paramBuilder.recommend;
      List<ThemeBgProp> list = paramBuilder.bgs;
      if (list == null) {
        this.bgs = DEFAULT_BGS;
      } else {
        this.bgs = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.hasmore;
      if (integer1 == null) {
        this.hasmore = DEFAULT_HASMORE;
      } else {
        this.hasmore = integer1;
      } 
      integer = paramBuilder.is_default;
      if (integer == null) {
        this.is_default = DEFAULT_IS_DEFAULT;
      } else {
        this.is_default = integer;
      } 
    } else {
      this.recommend = ((Builder)integer).recommend;
      this.bgs = Message.immutableCopyOf(((Builder)integer).bgs);
      this.hasmore = ((Builder)integer).hasmore;
      this.is_default = ((Builder)integer).is_default;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public List<ThemeBgProp> bgs;
    
    public Integer hasmore;
    
    public Integer is_default;
    
    public ThemeRecommand recommend;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.recommend = param1DataRes.recommend;
      this.bgs = Message.copyOf(param1DataRes.bgs);
      this.hasmore = param1DataRes.hasmore;
      this.is_default = param1DataRes.is_default;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
