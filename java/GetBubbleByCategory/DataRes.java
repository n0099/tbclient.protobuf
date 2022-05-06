package GetBubbleByCategory;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetBubbleByCategory.ThemeBubbleInMain;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final List<ThemeBubbleInMain> DEFAULT_BUBBLES = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBubbleInMain> bubbles;
  
  @ProtoField(tag = 1)
  public final ThemeRecommand recommend;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.recommend = paramBuilder.recommend;
      list = paramBuilder.bubbles;
      if (list == null) {
        this.bubbles = DEFAULT_BUBBLES;
      } else {
        this.bubbles = Message.immutableCopyOf(list);
      } 
    } else {
      this.recommend = ((Builder)list).recommend;
      this.bubbles = Message.immutableCopyOf(((Builder)list).bubbles);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1014730727, "Ltbclient/GetBubbleByCategory/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1014730727, "Ltbclient/GetBubbleByCategory/DataRes;");
          return;
        } 
      } 
    } 
  }
}
