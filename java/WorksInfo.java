package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class WorksInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_WORKS = Integer.valueOf(0);
  
  public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_works;
  
  @ProtoField(tag = 3)
  public final VideoTags tag_list;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<RecomTopicList> topic_list;
  
  public WorksInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_works;
      if (integer == null) {
        this.is_works = DEFAULT_IS_WORKS;
      } else {
        this.is_works = integer;
      } 
      List<RecomTopicList> list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
      this.tag_list = paramBuilder.tag_list;
    } else {
      this.is_works = paramBuilder.is_works;
      this.topic_list = Message.immutableCopyOf(paramBuilder.topic_list);
      this.tag_list = paramBuilder.tag_list;
    } 
  }
  
  public WorksInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1278378837, "Ltbclient/WorksInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1278378837, "Ltbclient/WorksInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<WorksInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_works;
    
    public VideoTags tag_list;
    
    public List<RecomTopicList> topic_list;
    
    public Builder() {}
    
    public Builder(WorksInfo param1WorksInfo) {
      super(param1WorksInfo);
      if (param1WorksInfo == null)
        return; 
      this.is_works = param1WorksInfo.is_works;
      this.topic_list = Message.copyOf(param1WorksInfo.topic_list);
      this.tag_list = param1WorksInfo.tag_list;
    }
    
    public WorksInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (WorksInfo)interceptResult.objValue; 
      } 
      return new WorksInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
