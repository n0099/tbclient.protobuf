package GetHotGod;

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
  public static final Integer DEFAULT_CUR_PAGE;
  
  public static final Integer DEFAULT_HAS_MORE;
  
  public static final List<Long> DEFAULT_HOT_UID_LIST;
  
  public static final List<Long> DEFAULT_RECOMMEND_UID_LIST;
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer cur_page;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.INT64)
  public final List<Long> hot_uid_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT64)
  public final List<Long> recommend_uid_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> user_list;
  
  static {
    DEFAULT_HOT_UID_LIST = Collections.emptyList();
    DEFAULT_RECOMMEND_UID_LIST = Collections.emptyList();
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_MORE = integer;
    DEFAULT_CUR_PAGE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.hot_uid_list;
      if (list == null) {
        this.hot_uid_list = DEFAULT_HOT_UID_LIST;
      } else {
        this.hot_uid_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.recommend_uid_list;
      if (list == null) {
        this.recommend_uid_list = DEFAULT_RECOMMEND_UID_LIST;
      } else {
        this.recommend_uid_list = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.has_more;
      if (integer1 == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = integer1;
      } 
      integer = paramBuilder.cur_page;
      if (integer == null) {
        this.cur_page = DEFAULT_CUR_PAGE;
      } else {
        this.cur_page = integer;
      } 
    } else {
      this.user_list = Message.immutableCopyOf(((Builder)integer).user_list);
      this.hot_uid_list = Message.immutableCopyOf(((Builder)integer).hot_uid_list);
      this.recommend_uid_list = Message.immutableCopyOf(((Builder)integer).recommend_uid_list);
      this.has_more = ((Builder)integer).has_more;
      this.cur_page = ((Builder)integer).cur_page;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-658506791, "Ltbclient/GetHotGod/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-658506791, "Ltbclient/GetHotGod/DataRes;");
          return;
        } 
      } 
    } 
  }
}
