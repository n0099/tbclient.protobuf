package tbclient.Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecomPostTopic extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_RECOM_TITLE = "";
  
  public static final String DEFAULT_RECOM_TOPIC = "";
  
  public static final Long DEFAULT_UNIQ_TOPICID = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String recom_title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String recom_topic;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long uniq_topicid;
  
  public RecomPostTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.recom_title;
      if (str == null) {
        this.recom_title = "";
      } else {
        this.recom_title = str;
      } 
      str = paramBuilder.recom_topic;
      if (str == null) {
        this.recom_topic = "";
      } else {
        this.recom_topic = str;
      } 
      long_ = paramBuilder.uniq_topicid;
      if (long_ == null) {
        this.uniq_topicid = DEFAULT_UNIQ_TOPICID;
      } else {
        this.uniq_topicid = long_;
      } 
    } else {
      this.recom_title = ((Builder)long_).recom_title;
      this.recom_topic = ((Builder)long_).recom_topic;
      this.uniq_topicid = ((Builder)long_).uniq_topicid;
    } 
  }
  
  public RecomPostTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-901065659, "Ltbclient/Personalized/RecomPostTopic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-901065659, "Ltbclient/Personalized/RecomPostTopic;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<RecomPostTopic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String recom_title;
    
    public String recom_topic;
    
    public Long uniq_topicid;
    
    public Builder() {}
    
    public Builder(RecomPostTopic param1RecomPostTopic) {
      super(param1RecomPostTopic);
      if (param1RecomPostTopic == null)
        return; 
      this.recom_title = param1RecomPostTopic.recom_title;
      this.recom_topic = param1RecomPostTopic.recom_topic;
      this.uniq_topicid = param1RecomPostTopic.uniq_topicid;
    }
    
    public RecomPostTopic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RecomPostTopic)interceptResult.objValue; 
      } 
      return new RecomPostTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
