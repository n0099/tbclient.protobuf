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
import tbclient.ThreadInfo;

public final class SpecialTopic extends Message {
  public static Interceptable $ic;
  
  public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ThreadInfo> thread_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public SpecialTopic(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ThreadInfo> list;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      list = paramBuilder.thread_list;
      if (list == null) {
        this.thread_list = DEFAULT_THREAD_LIST;
      } else {
        this.thread_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.title = ((Builder)list).title;
      this.thread_list = Message.immutableCopyOf(((Builder)list).thread_list);
    } 
  }
  
  public SpecialTopic(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(567296174, "Ltbclient/NewHottopic/SpecialTopic;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(567296174, "Ltbclient/NewHottopic/SpecialTopic;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<SpecialTopic> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ThreadInfo> thread_list;
    
    public String title;
    
    public Builder() {}
    
    public Builder(SpecialTopic param1SpecialTopic) {
      super(param1SpecialTopic);
      if (param1SpecialTopic == null)
        return; 
      this.title = param1SpecialTopic.title;
      this.thread_list = Message.copyOf(param1SpecialTopic.thread_list);
    }
    
    public SpecialTopic build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SpecialTopic)interceptResult.objValue; 
      } 
      return new SpecialTopic(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
