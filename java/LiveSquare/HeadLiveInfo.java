package tbclient.LiveSquare;

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

public final class HeadLiveInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BITMAP_WH_RATIO = "";
  
  public static final List<ThreadInfo> DEFAULT_HEAD_LIVE = Collections.emptyList();
  
  public static final List<String> DEFAULT_HEAD_PIC = Collections.emptyList();
  
  public static final Integer DEFAULT_IS_SET = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bitmap_wh_ratio;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> head_live;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> head_pic;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_set;
  
  public HeadLiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ThreadInfo> list1 = paramBuilder.head_live;
      if (list1 == null) {
        this.head_live = DEFAULT_HEAD_LIVE;
      } else {
        this.head_live = Message.immutableCopyOf(list1);
      } 
      List<String> list = paramBuilder.head_pic;
      if (list == null) {
        this.head_pic = DEFAULT_HEAD_PIC;
      } else {
        this.head_pic = Message.immutableCopyOf(list);
      } 
      String str = paramBuilder.bitmap_wh_ratio;
      if (str == null) {
        this.bitmap_wh_ratio = "";
      } else {
        this.bitmap_wh_ratio = str;
      } 
      integer = paramBuilder.is_set;
      if (integer == null) {
        this.is_set = DEFAULT_IS_SET;
      } else {
        this.is_set = integer;
      } 
    } else {
      this.head_live = Message.immutableCopyOf(((Builder)integer).head_live);
      this.head_pic = Message.immutableCopyOf(((Builder)integer).head_pic);
      this.bitmap_wh_ratio = ((Builder)integer).bitmap_wh_ratio;
      this.is_set = ((Builder)integer).is_set;
    } 
  }
  
  public HeadLiveInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-464209371, "Ltbclient/LiveSquare/HeadLiveInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-464209371, "Ltbclient/LiveSquare/HeadLiveInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<HeadLiveInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String bitmap_wh_ratio;
    
    public List<ThreadInfo> head_live;
    
    public List<String> head_pic;
    
    public Integer is_set;
    
    public Builder() {}
    
    public Builder(HeadLiveInfo param1HeadLiveInfo) {
      super(param1HeadLiveInfo);
      if (param1HeadLiveInfo == null)
        return; 
      this.head_live = Message.copyOf(param1HeadLiveInfo.head_live);
      this.head_pic = Message.copyOf(param1HeadLiveInfo.head_pic);
      this.bitmap_wh_ratio = param1HeadLiveInfo.bitmap_wh_ratio;
      this.is_set = param1HeadLiveInfo.is_set;
    }
    
    public HeadLiveInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (HeadLiveInfo)interceptResult.objValue; 
      } 
      return new HeadLiveInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
