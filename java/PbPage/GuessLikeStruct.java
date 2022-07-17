package tbclient.PbPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GuessLikeThreadInfo;

public final class GuessLikeStruct extends Message {
  public static Interceptable $ic;
  
  public static final List<GuessLikeThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GuessLikeThreadInfo> thread_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public GuessLikeStruct(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<GuessLikeThreadInfo> list;
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
  
  public GuessLikeStruct(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1062284732, "Ltbclient/PbPage/GuessLikeStruct;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1062284732, "Ltbclient/PbPage/GuessLikeStruct;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<GuessLikeStruct> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<GuessLikeThreadInfo> thread_list;
    
    public String title;
    
    public Builder() {}
    
    public Builder(GuessLikeStruct param1GuessLikeStruct) {
      super(param1GuessLikeStruct);
      if (param1GuessLikeStruct == null)
        return; 
      this.title = param1GuessLikeStruct.title;
      this.thread_list = Message.copyOf(param1GuessLikeStruct.thread_list);
    }
    
    public GuessLikeStruct build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (GuessLikeStruct)interceptResult.objValue; 
      } 
      return new GuessLikeStruct(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
