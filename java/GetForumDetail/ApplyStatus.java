package GetForumDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ApplyStatus extends Message {
  public static final Integer DEFAULT_FDIR_NEXT_APPLY_TIME;
  
  public static final Integer DEFAULT_IS_AVATAR_APPLYING;
  
  public static final Integer DEFAULT_IS_DESC_APPLYING;
  
  public static final Integer DEFAULT_IS_FDIR_APPLYING;
  
  public static final Integer DEFAULT_NEXT_AVATAR_APPLY_TIME;
  
  public static final Integer DEFAULT_NEXT_DESC_APPLY_TIME;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer fdir_next_apply_time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_avatar_applying;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_desc_applying;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer is_fdir_applying;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer next_avatar_apply_time;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer next_desc_apply_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2030741564, "Ltbclient/GetForumDetail/ApplyStatus;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2030741564, "Ltbclient/GetForumDetail/ApplyStatus;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_AVATAR_APPLYING = integer;
    DEFAULT_IS_DESC_APPLYING = integer;
    DEFAULT_NEXT_AVATAR_APPLY_TIME = integer;
    DEFAULT_NEXT_DESC_APPLY_TIME = integer;
    DEFAULT_IS_FDIR_APPLYING = integer;
    DEFAULT_FDIR_NEXT_APPLY_TIME = integer;
  }
  
  public ApplyStatus(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.is_avatar_applying;
      if (integer1 == null) {
        this.is_avatar_applying = DEFAULT_IS_AVATAR_APPLYING;
      } else {
        this.is_avatar_applying = integer1;
      } 
      integer1 = paramBuilder.is_desc_applying;
      if (integer1 == null) {
        this.is_desc_applying = DEFAULT_IS_DESC_APPLYING;
      } else {
        this.is_desc_applying = integer1;
      } 
      integer1 = paramBuilder.next_avatar_apply_time;
      if (integer1 == null) {
        this.next_avatar_apply_time = DEFAULT_NEXT_AVATAR_APPLY_TIME;
      } else {
        this.next_avatar_apply_time = integer1;
      } 
      integer1 = paramBuilder.next_desc_apply_time;
      if (integer1 == null) {
        this.next_desc_apply_time = DEFAULT_NEXT_DESC_APPLY_TIME;
      } else {
        this.next_desc_apply_time = integer1;
      } 
      integer1 = paramBuilder.is_fdir_applying;
      if (integer1 == null) {
        this.is_fdir_applying = DEFAULT_IS_FDIR_APPLYING;
      } else {
        this.is_fdir_applying = integer1;
      } 
      integer = paramBuilder.fdir_next_apply_time;
      if (integer == null) {
        this.fdir_next_apply_time = DEFAULT_FDIR_NEXT_APPLY_TIME;
      } else {
        this.fdir_next_apply_time = integer;
      } 
    } else {
      this.is_avatar_applying = ((Builder)integer).is_avatar_applying;
      this.is_desc_applying = ((Builder)integer).is_desc_applying;
      this.next_avatar_apply_time = ((Builder)integer).next_avatar_apply_time;
      this.next_desc_apply_time = ((Builder)integer).next_desc_apply_time;
      this.is_fdir_applying = ((Builder)integer).is_fdir_applying;
      this.fdir_next_apply_time = ((Builder)integer).fdir_next_apply_time;
    } 
  }
}
