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
import tbclient.ThemeBgProp;

public final class ThemeBgInMain extends Message {
  public static final String DEFAULT_BG_CATEGORY = "";
  
  public static final List<ThemeBgProp> DEFAULT_PROPS = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String bg_category;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgProp> props;
  
  public ThemeBgInMain(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.bg_category;
      if (str == null) {
        this.bg_category = "";
      } else {
        this.bg_category = str;
      } 
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.bg_category = ((Builder)list).bg_category;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1088111640, "Ltbclient/GetBgByCategory/ThemeBgInMain;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1088111640, "Ltbclient/GetBgByCategory/ThemeBgInMain;");
          return;
        } 
      } 
    } 
  }
}
