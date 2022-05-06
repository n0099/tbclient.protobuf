package Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.ThreadInfo;

public final class HotThread extends Message {
  public static final String DEFAULT_HOT_TITLE = "";
  
  public static final Integer DEFAULT_IS_NEW_URL;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String hot_title;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_new_url;
  
  @ProtoField(tag = 3)
  public final Page page;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  static {
    DEFAULT_IS_NEW_URL = Integer.valueOf(0);
  }
  
  public HotThread(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.hot_title;
      if (str == null) {
        this.hot_title = "";
      } else {
        this.hot_title = str;
      } 
      List list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
      integer = paramBuilder.is_new_url;
      if (integer == null) {
        this.is_new_url = DEFAULT_IS_NEW_URL;
      } else {
        this.is_new_url = integer;
      } 
    } else {
      this.hot_title = ((Builder)integer).hot_title;
      this.thread_list = Message.immutableCopyOf(((Builder)integer).thread_list);
      this.page = ((Builder)integer).page;
      this.is_new_url = ((Builder)integer).is_new_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1598032007, "Ltbclient/Hottopic/HotThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1598032007, "Ltbclient/Hottopic/HotThread;");
          return;
        } 
      } 
    } 
  }
}
