package tbclient.HotForum;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class HotTopic extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final List<HotTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<HotTopicList> topic_list;
  
  public HotTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<HotTopicList> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.topic_list;
      if (list == null) {
        this.topic_list = DEFAULT_TOPIC_LIST;
      } else {
        this.topic_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.topic_list = Message.immutableCopyOf(((Builder)list).topic_list);
    } 
  }
  
  public HotTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2096446056, "Ltbclient/HotForum/HotTopic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2096446056, "Ltbclient/HotForum/HotTopic;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<HotTopic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String title;
    
    public List<HotTopicList> topic_list;
    
    public Builder() {}
    
    public Builder(HotTopic param1HotTopic) {
      super(param1HotTopic);
      if (param1HotTopic == null)
        return; 
      this.title = param1HotTopic.title;
      this.topic_list = Message.copyOf(param1HotTopic.topic_list);
    }
    
    public HotTopic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (HotTopic)interceptResult.objValue; 
      } 
      return new HotTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
