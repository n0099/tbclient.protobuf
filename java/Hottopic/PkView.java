package Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PkView extends Message {
  public static final Integer DEFAULT_HAS_CLICKED;
  
  public static final String DEFAULT_PK_DESC = "";
  
  public static final String DEFAULT_PK_ICON = "";
  
  public static final String DEFAULT_PK_ICON_AFTER = "";
  
  public static final Integer DEFAULT_PK_INDEX;
  
  public static final Long DEFAULT_PK_NUM = Long.valueOf(0L);
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer has_clicked;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pk_desc;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String pk_icon;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String pk_icon_after;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer pk_index;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long pk_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_PK_INDEX = integer;
    DEFAULT_HAS_CLICKED = integer;
  }
  
  public PkView(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.pk_desc;
      if (str2 == null) {
        this.pk_desc = "";
      } else {
        this.pk_desc = str2;
      } 
      Long long_ = paramBuilder.pk_num;
      if (long_ == null) {
        this.pk_num = DEFAULT_PK_NUM;
      } else {
        this.pk_num = long_;
      } 
      Integer integer = paramBuilder.pk_index;
      if (integer == null) {
        this.pk_index = DEFAULT_PK_INDEX;
      } else {
        this.pk_index = integer;
      } 
      integer = paramBuilder.has_clicked;
      if (integer == null) {
        this.has_clicked = DEFAULT_HAS_CLICKED;
      } else {
        this.has_clicked = integer;
      } 
      String str1 = paramBuilder.pk_icon;
      if (str1 == null) {
        this.pk_icon = "";
      } else {
        this.pk_icon = str1;
      } 
      str = paramBuilder.pk_icon_after;
      if (str == null) {
        this.pk_icon_after = "";
      } else {
        this.pk_icon_after = str;
      } 
    } else {
      this.pk_desc = ((Builder)str).pk_desc;
      this.pk_num = ((Builder)str).pk_num;
      this.pk_index = ((Builder)str).pk_index;
      this.has_clicked = ((Builder)str).has_clicked;
      this.pk_icon = ((Builder)str).pk_icon;
      this.pk_icon_after = ((Builder)str).pk_icon_after;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1446001080, "Ltbclient/Hottopic/PkView;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1446001080, "Ltbclient/Hottopic/PkView;");
          return;
        } 
      } 
    } 
  }
}
