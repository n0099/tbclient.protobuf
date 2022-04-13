package Userlike;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
import tbclient.Userlike.PostData;

public final class ConcernData extends Message {
  public static final Integer DEFAULT_RECOM_TYPE;
  
  public static final List<User> DEFAULT_RECOM_USER_LIST;
  
  public static final Integer DEFAULT_SOURCE;
  
  @ProtoField(tag = 2)
  public final PostData post_data;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer recom_type;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5)
  public final List<User> recom_user_list;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer source;
  
  @ProtoField(tag = 1)
  public final ThreadInfo thread_list;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1005888404, "Ltbclient/Userlike/ConcernData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1005888404, "Ltbclient/Userlike/ConcernData;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_RECOM_TYPE = integer;
    DEFAULT_SOURCE = integer;
    DEFAULT_RECOM_USER_LIST = Collections.emptyList();
  }
  
  public ConcernData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.thread_list = paramBuilder.thread_list;
      this.post_data = paramBuilder.post_data;
      Integer integer = paramBuilder.recom_type;
      if (integer == null) {
        this.recom_type = DEFAULT_RECOM_TYPE;
      } else {
        this.recom_type = integer;
      } 
      integer = paramBuilder.source;
      if (integer == null) {
        this.source = DEFAULT_SOURCE;
      } else {
        this.source = integer;
      } 
      list = paramBuilder.recom_user_list;
      if (list == null) {
        this.recom_user_list = DEFAULT_RECOM_USER_LIST;
      } else {
        this.recom_user_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.thread_list = ((Builder)list).thread_list;
      this.post_data = ((Builder)list).post_data;
      this.recom_type = ((Builder)list).recom_type;
      this.source = ((Builder)list).source;
      this.recom_user_list = Message.immutableCopyOf(((Builder)list).recom_user_list);
    } 
  }
}
