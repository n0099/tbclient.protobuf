package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TopNotice extends Message {
  public static final String DEFAULT_AUTHOR = "";
  
  public static final Integer DEFAULT_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TITLE_LINK = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title_link;
  
  public TopNotice(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.title_link;
      if (str == null) {
        this.title_link = "";
      } else {
        this.title_link = str;
      } 
      str = paramBuilder.author;
      if (str == null) {
        this.author = "";
      } else {
        this.author = str;
      } 
      integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.title_link = ((Builder)integer).title_link;
      this.author = ((Builder)integer).author;
      this.id = ((Builder)integer).id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(61085489, "Ltbclient/FrsPage/TopNotice;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(61085489, "Ltbclient/FrsPage/TopNotice;");
          return;
        } 
      } 
    } 
  }
}
