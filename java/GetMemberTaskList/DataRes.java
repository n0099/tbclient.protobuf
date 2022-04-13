package GetMemberTaskList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetMemberTaskList.ImgInfo;
import tbclient.GetMemberTaskList.PointTaskInfo;
import tbclient.GetMemberTaskList.UserPointInfo;

public final class DataRes extends Message {
  public static final List<ImgInfo> DEFAULT_IMG_LIST;
  
  public static final List<PointTaskInfo> DEFAULT_TASK_LIST = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ImgInfo> img_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PointTaskInfo> task_list;
  
  @ProtoField(tag = 3)
  public final UserPointInfo user_point_info;
  
  static {
    DEFAULT_IMG_LIST = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.task_list;
      if (list == null) {
        this.task_list = DEFAULT_TASK_LIST;
      } else {
        this.task_list = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.img_list;
      if (list == null) {
        this.img_list = DEFAULT_IMG_LIST;
      } else {
        this.img_list = Message.immutableCopyOf(list);
      } 
      this.user_point_info = paramBuilder.user_point_info;
    } else {
      this.task_list = Message.immutableCopyOf(paramBuilder.task_list);
      this.img_list = Message.immutableCopyOf(paramBuilder.img_list);
      this.user_point_info = paramBuilder.user_point_info;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1165465589, "Ltbclient/GetMemberTaskList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1165465589, "Ltbclient/GetMemberTaskList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
