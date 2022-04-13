package GetInterview;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetInterview.InterviewInfo;

public final class InterviewDetail extends Message {
  public static final Long DEFAULT_ORDER_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 2)
  public final InterviewInfo answer;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long order_id;
  
  @ProtoField(tag = 1)
  public final InterviewInfo question;
  
  public InterviewDetail(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.question = paramBuilder.question;
      this.answer = paramBuilder.answer;
      long_ = paramBuilder.order_id;
      if (long_ == null) {
        this.order_id = DEFAULT_ORDER_ID;
      } else {
        this.order_id = long_;
      } 
    } else {
      this.question = ((Builder)long_).question;
      this.answer = ((Builder)long_).answer;
      this.order_id = ((Builder)long_).order_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-379564157, "Ltbclient/GetInterview/InterviewDetail;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-379564157, "Ltbclient/GetInterview/InterviewDetail;");
          return;
        } 
      } 
    } 
  }
}
