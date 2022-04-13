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
import tbclient.BookSummary;

public final class BookSummary extends Message {
  public static final List<BookInfo> DEFAULT_BOOK_LIST;
  
  public static final String DEFAULT_COVER = "";
  
  public static final Long DEFAULT_NUM = Long.valueOf(0L);
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<BookInfo> book_list;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String cover;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    DEFAULT_BOOK_LIST = Collections.emptyList();
  }
  
  public BookSummary(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.title;
      if (str2 == null) {
        this.title = "";
      } else {
        this.title = str2;
      } 
      Long long_ = paramBuilder.num;
      if (long_ == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = long_;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      List list = paramBuilder.book_list;
      if (list == null) {
        this.book_list = DEFAULT_BOOK_LIST;
      } else {
        this.book_list = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.cover;
      if (str == null) {
        this.cover = "";
      } else {
        this.cover = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.num = ((Builder)str).num;
      this.url = ((Builder)str).url;
      this.book_list = Message.immutableCopyOf(((Builder)str).book_list);
      this.cover = ((Builder)str).cover;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1522205368, "Ltbclient/BookSummary;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1522205368, "Ltbclient/BookSummary;");
          return;
        } 
      } 
    } 
  }
}
