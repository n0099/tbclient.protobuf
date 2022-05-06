package GetTails;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetTails.ColorInfo;
import tbclient.GetTails.TailInfo;

public final class ResData extends Message {
  public static final List<ColorInfo> DEFAULT_COLORLIST;
  
  public static final String DEFAULT_DEFAULT_COLOR = "";
  
  public static final List<TailInfo> DEFAULT_TAILLIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ColorInfo> colorList;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String default_color;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<TailInfo> tailList;
  
  static {
    DEFAULT_COLORLIST = Collections.emptyList();
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      List list = paramBuilder.tailList;
      if (list == null) {
        this.tailList = DEFAULT_TAILLIST;
      } else {
        this.tailList = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.colorList;
      if (list == null) {
        this.colorList = DEFAULT_COLORLIST;
      } else {
        this.colorList = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.default_color;
      if (str == null) {
        this.default_color = "";
      } else {
        this.default_color = str;
      } 
    } else {
      this.tailList = Message.immutableCopyOf(((Builder)str).tailList);
      this.colorList = Message.immutableCopyOf(((Builder)str).colorList);
      this.default_color = ((Builder)str).default_color;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1748054807, "Ltbclient/GetTails/ResData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1748054807, "Ltbclient/GetTails/ResData;");
          return;
        } 
      } 
    } 
  }
}
