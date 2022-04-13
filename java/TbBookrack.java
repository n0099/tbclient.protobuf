import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BookInfo;
import tbclient.TbBookrack;

public final class TbBookrack extends Message {
  public static final String DEFAULT_BOOKTOWN = "";
  
  public static final List<BookInfo> DEFAULT_BOOK_LIST;
  
  public static final String DEFAULT_ICON = "";
  
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_TIP = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<BookInfo> book_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String booktown;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer num;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String tip;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  static {
    DEFAULT_BOOK_LIST = Collections.emptyList();
  }
  
  public TbBookrack(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.booktown;
      if (str2 == null) {
        this.booktown = "";
      } else {
        this.booktown = str2;
      } 
      Integer integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
      List list = paramBuilder.book_list;
      if (list == null) {
        this.book_list = DEFAULT_BOOK_LIST;
      } else {
        this.book_list = Message.immutableCopyOf(list);
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.tip;
      if (str == null) {
        this.tip = "";
      } else {
        this.tip = str;
      } 
    } else {
      this.booktown = ((Builder)str).booktown;
      this.num = ((Builder)str).num;
      this.book_list = Message.immutableCopyOf(((Builder)str).book_list);
      this.title = ((Builder)str).title;
      this.icon = ((Builder)str).icon;
      this.tip = ((Builder)str).tip;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1292287235, "Ltbclient/TbBookrack;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1292287235, "Ltbclient/TbBookrack;");
          return;
        } 
      } 
    } 
  }
}
