package GetThemeList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetThemeList.ThemeCarousel;
import tbclient.GetThemeList.ThemeList;
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
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.theme_list;
      if (list == null) {
        this.theme_list = DEFAULT_THEME_LIST;
      } else {
        this.theme_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.carousel;
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
}
