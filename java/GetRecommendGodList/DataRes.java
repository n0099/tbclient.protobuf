package GetRecommendGodList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;

public final class DataRes extends Message {
  public static final Integer DEFAULT_CURRENT_PAGE;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final List<User> DEFAULT_RECOM_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer current_page;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> recom_user_list;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_CURRENT_PAGE = integer;
    DEFAULT_HAS_MORE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.recom_user_list;
      if (list == null) {
        this.recom_user_list = DEFAULT_RECOM_USER_LIST;
      } else {
        this.recom_user_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.current_page;
      if (integer1 == null) {
        this.current_page = DEFAULT_CURRENT_PAGE;
      } else {
        this.current_page = integer1;
      } 
      integer = paramBuilder.has_more;
      if (integer == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer;
      } 
    } else {
      this.recom_user_list = Message.immutableCopyOf(((Builder)integer).recom_user_list);
      this.current_page = ((Builder)integer).current_page;
      this.has_more = ((Builder)integer).has_more;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(662305226, "Ltbclient/GetRecommendGodList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(662305226, "Ltbclient/GetRecommendGodList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
