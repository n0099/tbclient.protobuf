package GetCardByCategory;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetCardByCategory.ThemeCardInMain;
import tbclient.ThemeRecommand;

public final class DataRes extends Message {
  public static final List<ThemeCardInMain> DEFAULT_CARDS = Collections.emptyList();
  
  public static final Integer DEFAULT_HAS_MORE = Integer.valueOf(0);
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThemeCardInMain> cards;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer has_more;
  
  @ProtoField(tag = 1)
  public final ThemeRecommand recommend;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.recommend = paramBuilder.recommend;
      List list = paramBuilder.cards;
      if (list == null) {
        this.cards = DEFAULT_CARDS;
      } else {
        this.cards = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.recommend = ((Builder)integer).recommend;
      this.cards = Message.immutableCopyOf(((Builder)integer).cards);
      this.has_more = ((Builder)integer).has_more;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1146802147, "Ltbclient/GetCardByCategory/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1146802147, "Ltbclient/GetCardByCategory/DataRes;");
          return;
        } 
      } 
    } 
  }
}
