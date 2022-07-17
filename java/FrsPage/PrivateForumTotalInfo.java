package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PrivateForumInfo;
import tbclient.PrivatePopInfo;

public final class PrivateForumTotalInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_PRIVATE_FORUM_TASKPERCENT = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5)
  public final HeadImgs head_imgs;
  
  @ProtoField(tag = 3)
  public final PrivateForumInfo private_forum_info;
  
  @ProtoField(tag = 2)
  public final PrivatePopInfo private_forum_popinfo;
  
  @ProtoField(tag = 1)
  public final PrivateForumShareinfo private_forum_shareinfo;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer private_forum_taskpercent;
  
  public PrivateForumTotalInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.private_forum_shareinfo = paramBuilder.private_forum_shareinfo;
      this.private_forum_popinfo = paramBuilder.private_forum_popinfo;
      this.private_forum_info = paramBuilder.private_forum_info;
      Integer integer = paramBuilder.private_forum_taskpercent;
      if (integer == null) {
        this.private_forum_taskpercent = DEFAULT_PRIVATE_FORUM_TASKPERCENT;
      } else {
        this.private_forum_taskpercent = integer;
      } 
      this.head_imgs = paramBuilder.head_imgs;
    } else {
      this.private_forum_shareinfo = paramBuilder.private_forum_shareinfo;
      this.private_forum_popinfo = paramBuilder.private_forum_popinfo;
      this.private_forum_info = paramBuilder.private_forum_info;
      this.private_forum_taskpercent = paramBuilder.private_forum_taskpercent;
      this.head_imgs = paramBuilder.head_imgs;
    } 
  }
  
  public PrivateForumTotalInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-989464118, "Ltbclient/FrsPage/PrivateForumTotalInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-989464118, "Ltbclient/FrsPage/PrivateForumTotalInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<PrivateForumTotalInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public HeadImgs head_imgs;
    
    public PrivateForumInfo private_forum_info;
    
    public PrivatePopInfo private_forum_popinfo;
    
    public PrivateForumShareinfo private_forum_shareinfo;
    
    public Integer private_forum_taskpercent;
    
    public Builder() {}
    
    public Builder(PrivateForumTotalInfo param1PrivateForumTotalInfo) {
      super(param1PrivateForumTotalInfo);
      if (param1PrivateForumTotalInfo == null)
        return; 
      this.private_forum_shareinfo = param1PrivateForumTotalInfo.private_forum_shareinfo;
      this.private_forum_popinfo = param1PrivateForumTotalInfo.private_forum_popinfo;
      this.private_forum_info = param1PrivateForumTotalInfo.private_forum_info;
      this.private_forum_taskpercent = param1PrivateForumTotalInfo.private_forum_taskpercent;
      this.head_imgs = param1PrivateForumTotalInfo.head_imgs;
    }
    
    public PrivateForumTotalInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PrivateForumTotalInfo)interceptResult.objValue; 
      } 
      return new PrivateForumTotalInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
