package tbclient.GetLockWindowMsg;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;

public final class LockWindowThreadInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Long DEFAULT_TID = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<PbContent> content;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer post_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_POST_NUM = Integer.valueOf(0);
  }
  
  public LockWindowThreadInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      List<PbContent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.post_num;
      if (integer == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer;
      } 
    } else {
      this.tid = ((Builder)integer).tid;
      this.title = ((Builder)integer).title;
      this.content = Message.immutableCopyOf(((Builder)integer).content);
      this.post_num = ((Builder)integer).post_num;
    } 
  }
  
  public LockWindowThreadInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(476703411, "Ltbclient/GetLockWindowMsg/LockWindowThreadInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(476703411, "Ltbclient/GetLockWindowMsg/LockWindowThreadInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<LockWindowThreadInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<PbContent> content;
    
    public Integer post_num;
    
    public Long tid;
    
    public String title;
    
    public Builder() {}
    
    public Builder(LockWindowThreadInfo param1LockWindowThreadInfo) {
      super(param1LockWindowThreadInfo);
      if (param1LockWindowThreadInfo == null)
        return; 
      this.tid = param1LockWindowThreadInfo.tid;
      this.title = param1LockWindowThreadInfo.title;
      this.content = Message.copyOf(param1LockWindowThreadInfo.content);
      this.post_num = param1LockWindowThreadInfo.post_num;
    }
    
    public LockWindowThreadInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (LockWindowThreadInfo)interceptResult.objValue; 
      } 
      return new LockWindowThreadInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
