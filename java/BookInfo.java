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
import tbclient.BookTag;

public final class BookInfo extends Message {
  public static final String DEFAULT_AD_CODE = "";
  
  public static final String DEFAULT_AUTHOR = "";
  
  public static final String DEFAULT_AUTHOR_INTRO = "";
  
  public static final String DEFAULT_BIG_COVER = "";
  
  public static final String DEFAULT_BOOK_ID = "";
  
  public static final Integer DEFAULT_BOOK_SIZE;
  
  public static final Integer DEFAULT_BOOK_TYPE;
  
  public static final String DEFAULT_BOOK_VER = "";
  
  public static final String DEFAULT_CHAPTER_VER = "";
  
  public static final Integer DEFAULT_CHARGE_TYPE;
  
  public static final Integer DEFAULT_CLASS_ID;
  
  public static final String DEFAULT_CLASS_NAME = "";
  
  public static final String DEFAULT_COPYRIGHT = "";
  
  public static final String DEFAULT_COPYRIGHT_TEXT = "";
  
  public static final String DEFAULT_COVER = "";
  
  public static final String DEFAULT_CP_ID = "";
  
  public static final String DEFAULT_DISCOUNT_ICON = "";
  
  public static final String DEFAULT_DISCOUNT_RATIO = "";
  
  public static final Integer DEFAULT_DISCOUNT_TYPE;
  
  public static final String DEFAULT_DISCUSS = "";
  
  public static final Integer DEFAULT_FIRST_CHAPTER;
  
  public static final Long DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final String DEFAULT_FREE_INFO = "";
  
  public static final String DEFAULT_INTRO = "";
  
  public static final String DEFAULT_ISBN = "";
  
  public static final Integer DEFAULT_IS_BUY;
  
  public static final Integer DEFAULT_IS_FINISH;
  
  public static final Integer DEFAULT_MEMBER_SHOW_TYPE;
  
  public static final Integer DEFAULT_ORIGNAL_PRICE;
  
  public static final String DEFAULT_PAPER_PRICE = "";
  
  public static final Integer DEFAULT_PRICE;
  
  public static final String DEFAULT_PUBLISHER = "";
  
  public static final String DEFAULT_PUBLISH_TEXT = "";
  
  public static final String DEFAULT_PUBLISH_TIME = "";
  
  public static final String DEFAULT_PUBLISH_TYPE = "";
  
  public static final Integer DEFAULT_READ_COUNT;
  
  public static final Integer DEFAULT_SUB_CLASS_ID;
  
  public static final String DEFAULT_SUB_CLASS_NAME = "";
  
  public static final List<BookTag> DEFAULT_TAGS;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_TOTAL_CHAPTER;
  
  public static final Integer DEFAULT_TOTAL_PAGE;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  public static final Integer DEFAULT_WORDS;
  
  @ProtoField(tag = 20, type = Message.Datatype.STRING)
  public final String ad_code;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String author_intro;
  
  @ProtoField(tag = 31, type = Message.Datatype.STRING)
  public final String big_cover;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String book_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer book_size;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer book_type;
  
  @ProtoField(tag = 36, type = Message.Datatype.STRING)
  public final String book_ver;
  
  @ProtoField(tag = 37, type = Message.Datatype.STRING)
  public final String chapter_ver;
  
  @ProtoField(tag = 44, type = Message.Datatype.UINT32)
  public final Integer charge_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer class_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String class_name;
  
  @ProtoField(tag = 25, type = Message.Datatype.STRING)
  public final String copyright;
  
  @ProtoField(tag = 27, type = Message.Datatype.STRING)
  public final String copyright_text;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String cover;
  
  @ProtoField(tag = 41, type = Message.Datatype.STRING)
  public final String cp_id;
  
  @ProtoField(tag = 33, type = Message.Datatype.STRING)
  public final String discount_icon;
  
  @ProtoField(tag = 18, type = Message.Datatype.STRING)
  public final String discount_ratio;
  
  @ProtoField(tag = 32, type = Message.Datatype.UINT32)
  public final Integer discount_type;
  
  @ProtoField(tag = 40, type = Message.Datatype.STRING)
  public final String discuss;
  
  @ProtoField(tag = 43, type = Message.Datatype.UINT32)
  public final Integer first_chapter;
  
  @ProtoField(tag = 38, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 39, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 22, type = Message.Datatype.STRING)
  public final String free_info;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String intro;
  
  @ProtoField(tag = 21, type = Message.Datatype.UINT32)
  public final Integer is_buy;
  
  @ProtoField(tag = 19, type = Message.Datatype.UINT32)
  public final Integer is_finish;
  
  @ProtoField(tag = 24, type = Message.Datatype.STRING)
  public final String isbn;
  
  @ProtoField(tag = 45, type = Message.Datatype.UINT32)
  public final Integer member_show_type;
  
  @ProtoField(tag = 16, type = Message.Datatype.UINT32)
  public final Integer orignal_price;
  
  @ProtoField(tag = 42, type = Message.Datatype.STRING)
  public final String paper_price;
  
  @ProtoField(tag = 17, type = Message.Datatype.UINT32)
  public final Integer price;
  
  @ProtoField(tag = 26, type = Message.Datatype.STRING)
  public final String publish_text;
  
  @ProtoField(tag = 28, type = Message.Datatype.STRING)
  public final String publish_time;
  
  @ProtoField(tag = 29, type = Message.Datatype.STRING)
  public final String publish_type;
  
  @ProtoField(tag = 23, type = Message.Datatype.STRING)
  public final String publisher;
  
  @ProtoField(tag = 34, type = Message.Datatype.UINT32)
  public final Integer read_count;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer sub_class_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String sub_class_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 13)
  public final List<BookTag> tags;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 14, type = Message.Datatype.UINT32)
  public final Integer total_chapter;
  
  @ProtoField(tag = 35, type = Message.Datatype.UINT32)
  public final Integer total_page;
  
  @ProtoField(tag = 30, type = Message.Datatype.UINT32)
  public final Integer update_time;
  
  @ProtoField(tag = 15, type = Message.Datatype.UINT32)
  public final Integer words;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1907670586, "Ltbclient/BookInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1907670586, "Ltbclient/BookInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_BOOK_TYPE = integer;
    DEFAULT_CLASS_ID = integer;
    DEFAULT_SUB_CLASS_ID = integer;
    DEFAULT_BOOK_SIZE = integer;
    DEFAULT_TAGS = Collections.emptyList();
    DEFAULT_TOTAL_CHAPTER = integer;
    DEFAULT_WORDS = integer;
    DEFAULT_ORIGNAL_PRICE = integer;
    DEFAULT_PRICE = integer;
    DEFAULT_IS_FINISH = integer;
    DEFAULT_IS_BUY = integer;
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_DISCOUNT_TYPE = integer;
    DEFAULT_READ_COUNT = integer;
    DEFAULT_TOTAL_PAGE = integer;
    DEFAULT_FORUM_ID = Long.valueOf(0L);
    DEFAULT_FIRST_CHAPTER = integer;
    DEFAULT_CHARGE_TYPE = integer;
    DEFAULT_MEMBER_SHOW_TYPE = integer;
  }
  
  public BookInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str11 = paramBuilder.book_id;
      if (str11 == null) {
        this.book_id = "";
      } else {
        this.book_id = str11;
      } 
      str11 = paramBuilder.title;
      if (str11 == null) {
        this.title = "";
      } else {
        this.title = str11;
      } 
      str11 = paramBuilder.cover;
      if (str11 == null) {
        this.cover = "";
      } else {
        this.cover = str11;
      } 
      Integer integer10 = paramBuilder.book_type;
      if (integer10 == null) {
        this.book_type = DEFAULT_BOOK_TYPE;
      } else {
        this.book_type = integer10;
      } 
      integer10 = paramBuilder.class_id;
      if (integer10 == null) {
        this.class_id = DEFAULT_CLASS_ID;
      } else {
        this.class_id = integer10;
      } 
      String str10 = paramBuilder.class_name;
      if (str10 == null) {
        this.class_name = "";
      } else {
        this.class_name = str10;
      } 
      Integer integer9 = paramBuilder.sub_class_id;
      if (integer9 == null) {
        this.sub_class_id = DEFAULT_SUB_CLASS_ID;
      } else {
        this.sub_class_id = integer9;
      } 
      String str9 = paramBuilder.sub_class_name;
      if (str9 == null) {
        this.sub_class_name = "";
      } else {
        this.sub_class_name = str9;
      } 
      Integer integer8 = paramBuilder.book_size;
      if (integer8 == null) {
        this.book_size = DEFAULT_BOOK_SIZE;
      } else {
        this.book_size = integer8;
      } 
      String str8 = paramBuilder.intro;
      if (str8 == null) {
        this.intro = "";
      } else {
        this.intro = str8;
      } 
      str8 = paramBuilder.author;
      if (str8 == null) {
        this.author = "";
      } else {
        this.author = str8;
      } 
      str8 = paramBuilder.author_intro;
      if (str8 == null) {
        this.author_intro = "";
      } else {
        this.author_intro = str8;
      } 
      List list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
      Integer integer7 = paramBuilder.total_chapter;
      if (integer7 == null) {
        this.total_chapter = DEFAULT_TOTAL_CHAPTER;
      } else {
        this.total_chapter = integer7;
      } 
      integer7 = paramBuilder.words;
      if (integer7 == null) {
        this.words = DEFAULT_WORDS;
      } else {
        this.words = integer7;
      } 
      integer7 = paramBuilder.orignal_price;
      if (integer7 == null) {
        this.orignal_price = DEFAULT_ORIGNAL_PRICE;
      } else {
        this.orignal_price = integer7;
      } 
      integer7 = paramBuilder.price;
      if (integer7 == null) {
        this.price = DEFAULT_PRICE;
      } else {
        this.price = integer7;
      } 
      String str7 = paramBuilder.discount_ratio;
      if (str7 == null) {
        this.discount_ratio = "";
      } else {
        this.discount_ratio = str7;
      } 
      Integer integer6 = paramBuilder.is_finish;
      if (integer6 == null) {
        this.is_finish = DEFAULT_IS_FINISH;
      } else {
        this.is_finish = integer6;
      } 
      String str6 = paramBuilder.ad_code;
      if (str6 == null) {
        this.ad_code = "";
      } else {
        this.ad_code = str6;
      } 
      Integer integer5 = paramBuilder.is_buy;
      if (integer5 == null) {
        this.is_buy = DEFAULT_IS_BUY;
      } else {
        this.is_buy = integer5;
      } 
      String str5 = paramBuilder.free_info;
      if (str5 == null) {
        this.free_info = "";
      } else {
        this.free_info = str5;
      } 
      str5 = paramBuilder.publisher;
      if (str5 == null) {
        this.publisher = "";
      } else {
        this.publisher = str5;
      } 
      str5 = paramBuilder.isbn;
      if (str5 == null) {
        this.isbn = "";
      } else {
        this.isbn = str5;
      } 
      str5 = paramBuilder.copyright;
      if (str5 == null) {
        this.copyright = "";
      } else {
        this.copyright = str5;
      } 
      str5 = paramBuilder.publish_text;
      if (str5 == null) {
        this.publish_text = "";
      } else {
        this.publish_text = str5;
      } 
      str5 = paramBuilder.copyright_text;
      if (str5 == null) {
        this.copyright_text = "";
      } else {
        this.copyright_text = str5;
      } 
      str5 = paramBuilder.publish_time;
      if (str5 == null) {
        this.publish_time = "";
      } else {
        this.publish_time = str5;
      } 
      str5 = paramBuilder.publish_type;
      if (str5 == null) {
        this.publish_type = "";
      } else {
        this.publish_type = str5;
      } 
      Integer integer4 = paramBuilder.update_time;
      if (integer4 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer4;
      } 
      String str4 = paramBuilder.big_cover;
      if (str4 == null) {
        this.big_cover = "";
      } else {
        this.big_cover = str4;
      } 
      Integer integer3 = paramBuilder.discount_type;
      if (integer3 == null) {
        this.discount_type = DEFAULT_DISCOUNT_TYPE;
      } else {
        this.discount_type = integer3;
      } 
      String str3 = paramBuilder.discount_icon;
      if (str3 == null) {
        this.discount_icon = "";
      } else {
        this.discount_icon = str3;
      } 
      Integer integer2 = paramBuilder.read_count;
      if (integer2 == null) {
        this.read_count = DEFAULT_READ_COUNT;
      } else {
        this.read_count = integer2;
      } 
      integer2 = paramBuilder.total_page;
      if (integer2 == null) {
        this.total_page = DEFAULT_TOTAL_PAGE;
      } else {
        this.total_page = integer2;
      } 
      String str2 = paramBuilder.book_ver;
      if (str2 == null) {
        this.book_ver = "";
      } else {
        this.book_ver = str2;
      } 
      str2 = paramBuilder.chapter_ver;
      if (str2 == null) {
        this.chapter_ver = "";
      } else {
        this.chapter_ver = str2;
      } 
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      str1 = paramBuilder.discuss;
      if (str1 == null) {
        this.discuss = "";
      } else {
        this.discuss = str1;
      } 
      str1 = paramBuilder.cp_id;
      if (str1 == null) {
        this.cp_id = "";
      } else {
        this.cp_id = str1;
      } 
      str1 = paramBuilder.paper_price;
      if (str1 == null) {
        this.paper_price = "";
      } else {
        this.paper_price = str1;
      } 
      Integer integer1 = paramBuilder.first_chapter;
      if (integer1 == null) {
        this.first_chapter = DEFAULT_FIRST_CHAPTER;
      } else {
        this.first_chapter = integer1;
      } 
      integer1 = paramBuilder.charge_type;
      if (integer1 == null) {
        this.charge_type = DEFAULT_CHARGE_TYPE;
      } else {
        this.charge_type = integer1;
      } 
      integer = paramBuilder.member_show_type;
      if (integer == null) {
        this.member_show_type = DEFAULT_MEMBER_SHOW_TYPE;
      } else {
        this.member_show_type = integer;
      } 
    } else {
      this.book_id = ((Builder)integer).book_id;
      this.title = ((Builder)integer).title;
      this.cover = ((Builder)integer).cover;
      this.book_type = ((Builder)integer).book_type;
      this.class_id = ((Builder)integer).class_id;
      this.class_name = ((Builder)integer).class_name;
      this.sub_class_id = ((Builder)integer).sub_class_id;
      this.sub_class_name = ((Builder)integer).sub_class_name;
      this.book_size = ((Builder)integer).book_size;
      this.intro = ((Builder)integer).intro;
      this.author = ((Builder)integer).author;
      this.author_intro = ((Builder)integer).author_intro;
      this.tags = Message.immutableCopyOf(((Builder)integer).tags);
      this.total_chapter = ((Builder)integer).total_chapter;
      this.words = ((Builder)integer).words;
      this.orignal_price = ((Builder)integer).orignal_price;
      this.price = ((Builder)integer).price;
      this.discount_ratio = ((Builder)integer).discount_ratio;
      this.is_finish = ((Builder)integer).is_finish;
      this.ad_code = ((Builder)integer).ad_code;
      this.is_buy = ((Builder)integer).is_buy;
      this.free_info = ((Builder)integer).free_info;
      this.publisher = ((Builder)integer).publisher;
      this.isbn = ((Builder)integer).isbn;
      this.copyright = ((Builder)integer).copyright;
      this.publish_text = ((Builder)integer).publish_text;
      this.copyright_text = ((Builder)integer).copyright_text;
      this.publish_time = ((Builder)integer).publish_time;
      this.publish_type = ((Builder)integer).publish_type;
      this.update_time = ((Builder)integer).update_time;
      this.big_cover = ((Builder)integer).big_cover;
      this.discount_type = ((Builder)integer).discount_type;
      this.discount_icon = ((Builder)integer).discount_icon;
      this.read_count = ((Builder)integer).read_count;
      this.total_page = ((Builder)integer).total_page;
      this.book_ver = ((Builder)integer).book_ver;
      this.chapter_ver = ((Builder)integer).chapter_ver;
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.discuss = ((Builder)integer).discuss;
      this.cp_id = ((Builder)integer).cp_id;
      this.paper_price = ((Builder)integer).paper_price;
      this.first_chapter = ((Builder)integer).first_chapter;
      this.charge_type = ((Builder)integer).charge_type;
      this.member_show_type = ((Builder)integer).member_show_type;
    } 
  }
}
