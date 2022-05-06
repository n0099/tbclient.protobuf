import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ForumArIno;

public final class ForumArIno extends Message {
  public static final String DEFAULT_ANIMATION_URL = "";
  
  public static final Integer DEFAULT_AR_ID;
  
  public static final Integer DEFAULT_AR_TYPE;
  
  public static final String DEFAULT_SUSPENSION_URL = "";
  
  public static final Integer DEFAULT_SWITCH;
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer _switch;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String animation_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer ar_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer ar_type;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String suspension_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(450417337, "Ltbclient/ForumArIno;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(450417337, "Ltbclient/ForumArIno;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SWITCH = integer;
    DEFAULT_AR_ID = integer;
    DEFAULT_AR_TYPE = integer;
  }
  
  public ForumArIno(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder._switch;
      if (integer == null) {
        this._switch = DEFAULT_SWITCH;
      } else {
        this._switch = integer;
      } 
      integer = paramBuilder.ar_id;
      if (integer == null) {
        this.ar_id = DEFAULT_AR_ID;
      } else {
        this.ar_id = integer;
      } 
      integer = paramBuilder.ar_type;
      if (integer == null) {
        this.ar_type = DEFAULT_AR_TYPE;
      } else {
        this.ar_type = integer;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.animation_url;
      if (str1 == null) {
        this.animation_url = "";
      } else {
        this.animation_url = str1;
      } 
      str = paramBuilder.suspension_url;
      if (str == null) {
        this.suspension_url = "";
      } else {
        this.suspension_url = str;
      } 
    } else {
      this._switch = ((Builder)str)._switch;
      this.ar_id = ((Builder)str).ar_id;
      this.ar_type = ((Builder)str).ar_type;
      this.title = ((Builder)str).title;
      this.animation_url = ((Builder)str).animation_url;
      this.suspension_url = ((Builder)str).suspension_url;
    } 
  }
}
