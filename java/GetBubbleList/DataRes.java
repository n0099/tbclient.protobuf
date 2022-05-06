package GetBubbleList;

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
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final List<ThemeBgProp> DEFAULT_BUBBLES = Collections.emptyList();
  
  public static final Integer DEFAULT_HASMORE;
  
  public static final Integer DEFAULT_IS_DEFAULT;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeBgProp> bubbles;
  
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
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.recommend = paramBuilder.recommend;
      List list = paramBuilder.bubbles;
      if (list == null) {
        this.bubbles = DEFAULT_BUBBLES;
      } else {
        this.bubbles = Message.immutableCopyOf(list);
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
      this.bubbles = Message.immutableCopyOf(((Builder)integer).bubbles);
      this.hasmore = ((Builder)integer).hasmore;
      this.is_default = ((Builder)integer).is_default;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(548080094, "Ltbclient/GetBubbleList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(548080094, "Ltbclient/GetBubbleList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
