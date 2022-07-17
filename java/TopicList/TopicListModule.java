package tbclient.TopicList;

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
  
  public static final String DEFAULT_RULE_JUMP_URL = "";
  
  public static final String DEFAULT_TIPS = "";
  
  public static final List<TopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String module_title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String rule_jump_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tips;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<TopicList> topic_list;
  
  public TopicListModule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.module_title;
      if (str2 == null) {
        this.module_title = "";
      } else {
        this.module_title = str2;
      } 
      List<TopicList> list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.tips;
      if (str1 == null) {
        this.tips = "";
      } else {
        this.tips = str1;
      } 
      str = paramBuilder.rule_jump_url;
      if (str == null) {
        this.rule_jump_url = "";
      } else {
        this.rule_jump_url = str;
      } 
    } else {
      this.module_title = ((Builder)str).module_title;
      this.topic_list = Message.immutableCopyOf(((Builder)str).topic_list);
      this.tips = ((Builder)str).tips;
      this.rule_jump_url = ((Builder)str).rule_jump_url;
    } 
  }
  
  public TopicListModule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-625603570, "Ltbclient/TopicList/TopicListModule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-625603570, "Ltbclient/TopicList/TopicListModule;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<TopicListModule> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String module_title;
    
    public String rule_jump_url;
    
    public String tips;
    
    public List<TopicList> topic_list;
    
    public Builder() {}
    
    public Builder(TopicListModule param1TopicListModule) {
      super(param1TopicListModule);
      if (param1TopicListModule == null)
        return; 
      this.module_title = param1TopicListModule.module_title;
      this.topic_list = Message.copyOf(param1TopicListModule.topic_list);
      this.tips = param1TopicListModule.tips;
      this.rule_jump_url = param1TopicListModule.rule_jump_url;
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
