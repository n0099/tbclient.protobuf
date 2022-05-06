package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class StarTaskInfo extends Message {
  public static final String DEFAULT_TASK_DESC = "";
  
  public static final String DEFAULT_TASK_SCORE_DESC = "";
  
  public static final Integer DEFAULT_TASK_STATUS = Integer.valueOf(0);
  
  public static final String DEFAULT_TASK_TITLE = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String task_desc;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String task_score_desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer task_status;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String task_title;
  
  public StarTaskInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.task_title;
      if (str == null) {
        this.task_title = "";
      } else {
        this.task_title = str;
      } 
      str = paramBuilder.task_desc;
      if (str == null) {
        this.task_desc = "";
      } else {
        this.task_desc = str;
      } 
      str = paramBuilder.task_score_desc;
      if (str == null) {
        this.task_score_desc = "";
      } else {
        this.task_score_desc = str;
      } 
      integer = paramBuilder.task_status;
      if (integer == null) {
        this.task_status = DEFAULT_TASK_STATUS;
      } else {
        this.task_status = integer;
      } 
    } else {
      this.task_title = ((Builder)integer).task_title;
      this.task_desc = ((Builder)integer).task_desc;
      this.task_score_desc = ((Builder)integer).task_score_desc;
      this.task_status = ((Builder)integer).task_status;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1368303571, "Ltbclient/FrsPage/StarTaskInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1368303571, "Ltbclient/FrsPage/StarTaskInfo;");
          return;
        } 
      } 
    } 
  }
}
