package LiveSquare;

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
  public static final String DEFAULT_BITMAP_WH_RATIO = "";
  
  public static final List<ThreadInfo> DEFAULT_HEAD_LIVE = Collections.emptyList();
  
  public static final List<String> DEFAULT_HEAD_PIC = Collections.emptyList();
  
  public static final Integer DEFAULT_IS_SET = Integer.valueOf(0);
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String bitmap_wh_ratio;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> head_live;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
  public final List<String> head_pic;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer is_set;
  
  public HeadLiveInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List list = paramBuilder.head_live;
      if (list == null) {
        this.head_live = DEFAULT_HEAD_LIVE;
      } else {
        this.head_live = Message.immutableCopyOf(list);
      } 
      list = paramBuilder.head_pic;
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
}
