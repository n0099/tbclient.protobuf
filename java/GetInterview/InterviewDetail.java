package tbclient.GetInterview;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class InterviewDetail extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_ORDER_ID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final InterviewInfo answer;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long order_id;
  
  @ProtoField(tag = 1)
  public final InterviewInfo question;
  
  public InterviewDetail(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
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
  
  public InterviewDetail(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
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
  
  public static final class Builder extends Message.Builder<InterviewDetail> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public InterviewInfo answer;
    
    public Long order_id;
    
    public InterviewInfo question;
    
    public Builder() {}
    
    public Builder(InterviewDetail param1InterviewDetail) {
      super(param1InterviewDetail);
      if (param1InterviewDetail == null)
        return; 
      this.question = param1InterviewDetail.question;
      this.answer = param1InterviewDetail.answer;
      this.order_id = param1InterviewDetail.order_id;
    }
    
    public InterviewDetail build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (InterviewDetail)interceptResult.objValue; 
      } 
      return new InterviewDetail(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
