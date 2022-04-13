package GetPendantByCategory;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetPendantByCategory.ThemePendantInMain;
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
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.recommend = paramBuilder.recommend;
      List list = paramBuilder.pendant;
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
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1357127407, "Ltbclient/GetPendantByCategory/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1357127407, "Ltbclient/GetPendantByCategory/DataRes;");
          return;
        } 
      } 
    } 
  }
}
