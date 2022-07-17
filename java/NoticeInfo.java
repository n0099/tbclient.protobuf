package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NoticeInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_NOTICE = "";
  
  public static final Integer DEFAULT_PULLCOMMENTFREQUENCE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String notice;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer pullCommentFrequence;
  
  public NoticeInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.notice;
      if (str == null) {
        this.notice = "";
      } else {
        this.notice = str;
      } 
      integer = paramBuilder.pullCommentFrequence;
      if (integer == null) {
        this.pullCommentFrequence = DEFAULT_PULLCOMMENTFREQUENCE;
      } else {
        this.pullCommentFrequence = integer;
      } 
    } else {
      this.notice = ((Builder)integer).notice;
      this.pullCommentFrequence = ((Builder)integer).pullCommentFrequence;
    } 
  }
  
  public NoticeInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(909656619, "Ltbclient/NoticeInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(909656619, "Ltbclient/NoticeInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<NoticeInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String notice;
    
    public Integer pullCommentFrequence;
    
    public Builder() {}
    
    public Builder(NoticeInfo param1NoticeInfo) {
      super(param1NoticeInfo);
      if (param1NoticeInfo == null)
        return; 
      this.notice = param1NoticeInfo.notice;
      this.pullCommentFrequence = param1NoticeInfo.pullCommentFrequence;
    }
    
    public NoticeInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NoticeInfo)interceptResult.objValue; 
      } 
      return new NoticeInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
