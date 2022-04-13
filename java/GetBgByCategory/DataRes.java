package GetBgByCategory;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetBgByCategory.ThemeBgInMain;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final List<ThemeBgInMain> DEFAULT_BGS = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgInMain> bgs;
  
  @ProtoField(tag = 1)
  public final ThemeRecommand recommend;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
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
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-51020402, "Ltbclient/GetBgByCategory/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-51020402, "Ltbclient/GetBgByCategory/DataRes;");
          return;
        } 
      } 
    } 
  }
}
