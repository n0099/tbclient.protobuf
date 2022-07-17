package tbclient.NewHottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final List<SpecialTopic> DEFAULT_SPECIAL_TOPIC = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2)
  public final PkModule pk_module;
  
  @ProtoField(tag = 9)
  public final RelateThread relate_thread;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<SpecialTopic> special_topic;
  
  @ProtoField(tag = 4)
  public final TimeLine time_line;
  
  @ProtoField(tag = 1)
  public final TopicDetail topic_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.topic_info = paramBuilder.topic_info;
      this.pk_module = paramBuilder.pk_module;
      this.time_line = paramBuilder.time_line;
      List<SpecialTopic> list = paramBuilder.special_topic;
      if (list == null) {
        this.special_topic = DEFAULT_SPECIAL_TOPIC;
      } else {
        this.special_topic = Message.immutableCopyOf(list);
      } 
      this.relate_thread = paramBuilder.relate_thread;
    } else {
      this.topic_info = paramBuilder.topic_info;
      this.pk_module = paramBuilder.pk_module;
      this.time_line = paramBuilder.time_line;
      this.special_topic = Message.immutableCopyOf(paramBuilder.special_topic);
      this.relate_thread = paramBuilder.relate_thread;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1996507932, "Ltbclient/NewHottopic/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1996507932, "Ltbclient/NewHottopic/DataRes;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public PkModule pk_module;
    
    public RelateThread relate_thread;
    
    public List<SpecialTopic> special_topic;
    
    public TimeLine time_line;
    
    public TopicDetail topic_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.topic_info = param1DataRes.topic_info;
      this.pk_module = param1DataRes.pk_module;
      this.time_line = param1DataRes.time_line;
      this.special_topic = Message.copyOf(param1DataRes.special_topic);
      this.relate_thread = param1DataRes.relate_thread;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
