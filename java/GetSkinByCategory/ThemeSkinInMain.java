package GetSkinByCategory;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeSkinPropMain;

public final class ThemeSkinInMain extends Message {
  public static final List<ThemeSkinPropMain> DEFAULT_PROPS = Collections.emptyList();
  
  public static final String DEFAULT_SKIN_CATEGORY = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeSkinPropMain> props;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String skin_category;
  
  public ThemeSkinInMain(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      String str = paramBuilder.skin_category;
      if (str == null) {
        this.skin_category = "";
      } else {
        this.skin_category = str;
      } 
      list = paramBuilder.props;
      if (list == null) {
        this.props = DEFAULT_PROPS;
      } else {
        this.props = Message.immutableCopyOf(list);
      } 
    } else {
      this.skin_category = ((Builder)list).skin_category;
      this.props = Message.immutableCopyOf(((Builder)list).props);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2002197160, "Ltbclient/GetSkinByCategory/ThemeSkinInMain;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2002197160, "Ltbclient/GetSkinByCategory/ThemeSkinInMain;");
          return;
        } 
      } 
    } 
  }
}
