package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class RecommendBook extends Message {
  public static final String DEFAULT_BOOK_ID = "";
  
  public static final List<String> DEFAULT_DESC;
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final String DEFAULT_LINK_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String book_id;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
  public final List<String> desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String link_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer type;
  
  static {
    DEFAULT_DESC = Collections.emptyList();
  }
  
  public RecommendBook(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.book_id;
      if (str1 == null) {
        this.book_id = "";
      } else {
        this.book_id = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.image;
      if (str1 == null) {
        this.image = "";
      } else {
        this.image = str1;
      } 
      List list = paramBuilder.desc;
      if (list == null) {
        this.desc = DEFAULT_DESC;
      } else {
        this.desc = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.link_url;
      if (str == null) {
        this.link_url = "";
      } else {
        this.link_url = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.book_id = ((Builder)str).book_id;
      this.title = ((Builder)str).title;
      this.image = ((Builder)str).image;
      this.desc = Message.immutableCopyOf(((Builder)str).desc);
      this.link_url = ((Builder)str).link_url;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1071563641, "Ltbclient/FrsPage/RecommendBook;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1071563641, "Ltbclient/FrsPage/RecommendBook;");
          return;
        } 
      } 
    } 
  }
}
