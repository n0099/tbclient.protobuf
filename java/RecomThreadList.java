import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecomThreadList;
import tbclient.ThreadInfo;
import tbclient.User;

public final class RecomThreadList extends Message {
  public static final Long DEFAULT_CURRENT_PV;
  
  public static final String DEFAULT_RECOMMEND_DATE = "";
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
  
  public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long current_pv;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String recommend_date;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<User> user_list;
  
  static {
    DEFAULT_THREAD_LIST = Collections.emptyList();
    DEFAULT_CURRENT_PV = Long.valueOf(0L);
  }
  
  public RecomThreadList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      List list = paramBuilder.user_list;
      if (list == null) {
        this.user_list = DEFAULT_USER_LIST;
      } else {
        this.user_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.recommend_date;
      if (str == null) {
        this.recommend_date = "";
      } else {
        this.recommend_date = str;
      } 
      long_ = paramBuilder.current_pv;
      if (long_ == null) {
        this.current_pv = DEFAULT_CURRENT_PV;
      } else {
        this.current_pv = long_;
      } 
    } else {
      this.user_list = Message.immutableCopyOf(((Builder)long_).user_list);
      this.thread_list = Message.immutableCopyOf(((Builder)long_).thread_list);
      this.recommend_date = ((Builder)long_).recommend_date;
      this.current_pv = ((Builder)long_).current_pv;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1096534769, "Ltbclient/RecomThreadList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1096534769, "Ltbclient/RecomThreadList;");
          return;
        } 
      } 
    } 
  }
}
