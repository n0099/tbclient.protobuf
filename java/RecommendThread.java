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

public final class RecommendThread extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_POST_NUM;
  
  public static final List<String> DEFAULT_TERM_LIST;
  
  public static final Long DEFAULT_TID;
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long post_num;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
  public final List<String> term_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(207762431, "Ltbclient/RecommendThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(207762431, "Ltbclient/RecommendThread;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_TID = long_;
    DEFAULT_POST_NUM = long_;
    DEFAULT_TERM_LIST = Collections.emptyList();
  }
  
  public RecommendThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.tid;
      if (long_2 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_2;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      Long long_1 = paramBuilder.post_num;
      if (long_1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = long_1;
      } 
      list = paramBuilder.term_list;
      if (list == null) {
        this.term_list = DEFAULT_TERM_LIST;
      } else {
        this.term_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.tid = ((Builder)list).tid;
      this.title = ((Builder)list).title;
      this.post_num = ((Builder)list).post_num;
      this.term_list = Message.immutableCopyOf(((Builder)list).term_list);
    } 
  }
  
  public RecommendThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendThread> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long post_num;
    
    public List<String> term_list;
    
    public Long tid;
    
    public String title;
    
    public Builder() {}
    
    public Builder(RecommendThread param1RecommendThread) {
      super(param1RecommendThread);
      if (param1RecommendThread == null)
        return; 
      this.tid = param1RecommendThread.tid;
      this.title = param1RecommendThread.title;
      this.post_num = param1RecommendThread.post_num;
      this.term_list = Message.copyOf(param1RecommendThread.term_list);
    }
    
    public RecommendThread build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RecommendThread)interceptResult.objValue; 
      } 
      return new RecommendThread(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
