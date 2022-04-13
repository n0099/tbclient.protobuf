package GetRepostRecommendForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.SimpleForum;

public final class DataRes extends Message {
  public static final Integer DEFAULT_PRIV_THREAD;
  
  public static final String DEFAULT_RECOMMEND_EXT = "";
  
  public static final List<SimpleForum> DEFAULT_RECOMMEND_FORUM_LIST = Collections.emptyList();
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer priv_thread;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String recommend_ext;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<SimpleForum> recommend_forum_list;
  
  static {
    DEFAULT_PRIV_THREAD = Integer.valueOf(0);
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.recommend_forum_list;
      if (list == null) {
        this.recommend_forum_list = DEFAULT_RECOMMEND_FORUM_LIST;
      } else {
        this.recommend_forum_list = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.recommend_ext;
      if (str == null) {
        this.recommend_ext = "";
      } else {
        this.recommend_ext = str;
      } 
      integer = paramBuilder.priv_thread;
      if (integer == null) {
        this.priv_thread = DEFAULT_PRIV_THREAD;
      } else {
        this.priv_thread = integer;
      } 
    } else {
      this.recommend_forum_list = Message.immutableCopyOf(((Builder)integer).recommend_forum_list);
      this.recommend_ext = ((Builder)integer).recommend_ext;
      this.priv_thread = ((Builder)integer).priv_thread;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1857472016, "Ltbclient/GetRepostRecommendForum/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1857472016, "Ltbclient/GetRepostRecommendForum/DataRes;");
          return;
        } 
      } 
    } 
  }
}
