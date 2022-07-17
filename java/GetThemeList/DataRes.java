package tbclient.GetThemeList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<ThemeCarousel> DEFAULT_CAROUSEL;
  
  public static final List<ThemeList> DEFAULT_THEME_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
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
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(209832153, "Ltbclient/GetThemeList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(209832153, "Ltbclient/GetThemeList/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
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
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
