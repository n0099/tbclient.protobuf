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
import tbclient.ThreadModule;

public final class ThreadModule extends Message {
  public static final Long DEFAULT_MODULE_ID;
  
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Long DEFAULT_SHOW_NUM;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_INFO = Collections.emptyList();
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long module_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long show_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ThreadInfo> thread_info;
  
  static {
    DEFAULT_SHOW_NUM = long_;
  }
  
  public ThreadModule(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.module_id;
      if (long_1 == null) {
        this.module_id = DEFAULT_MODULE_ID;
      } else {
        this.module_id = long_1;
      } 
      String str = paramBuilder.module_name;
      if (str == null) {
        this.module_name = "";
      } else {
        this.module_name = str;
      } 
      List list = paramBuilder.thread_info;
      if (list == null) {
        this.thread_info = DEFAULT_THREAD_INFO;
      } else {
        this.thread_info = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.show_num;
      if (long_ == null) {
        this.show_num = DEFAULT_SHOW_NUM;
      } else {
        this.show_num = long_;
      } 
    } else {
      this.module_id = ((Builder)long_).module_id;
      this.module_name = ((Builder)long_).module_name;
      this.thread_info = Message.immutableCopyOf(((Builder)long_).thread_info);
      this.show_num = ((Builder)long_).show_num;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(876799291, "Ltbclient/ThreadModule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(876799291, "Ltbclient/ThreadModule;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_MODULE_ID = long_;
  }
}
