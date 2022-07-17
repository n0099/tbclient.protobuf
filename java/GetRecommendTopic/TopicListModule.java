package tbclient.GetRecommendTopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class TopicListModule extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_MODULE_TITLE = "";
  
  public static final List<TopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String module_title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<TopicList> topic_list;
  
  public TopicListModule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<TopicList> list;
    if (paramBoolean == true) {
      String str = paramBuilder.module_title;
      if (str == null) {
        this.module_title = "";
      } else {
        this.module_title = str;
      } 
      list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.module_title = ((Builder)list).module_title;
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
    } 
  }
  
  public TopicListModule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1291508018, "Ltbclient/GetRecommendTopic/TopicListModule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1291508018, "Ltbclient/GetRecommendTopic/TopicListModule;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<TopicListModule> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String module_title;
    
    public List<TopicList> topic_list;
    
    public Builder() {}
    
    public Builder(TopicListModule param1TopicListModule) {
      super(param1TopicListModule);
      if (param1TopicListModule == null)
        return; 
      this.module_title = param1TopicListModule.module_title;
      this.topic_list = Message.copyOf(param1TopicListModule.topic_list);
    }
    
    public TopicListModule build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TopicListModule)interceptResult.objValue; 
      } 
      return new TopicListModule(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
