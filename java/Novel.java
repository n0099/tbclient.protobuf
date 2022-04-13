import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Novel;

public final class Novel extends Message {
  public static final String DEFAULT_ANDROID_DETAIL_PARAMS = "";
  
  public static final String DEFAULT_ANDROID_LAST_CHARPTER_PARAMS = "";
  
  public static final String DEFAULT_ANDROID_LAST_READ_PARAMS = "";
  
  public static final String DEFAULT_AUTHOR = "";
  
  public static final String DEFAULT_AUTHOR_ID = "";
  
  public static final String DEFAULT_BOOK_ID = "";
  
  public static final String DEFAULT_BOOK_NAME = "";
  
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final String DEFAULT_GID = "";
  
  public static final String DEFAULT_IOS_DETAIL_PARAMS = "";
  
  public static final String DEFAULT_IOS_LAST_CHARPTER_PARAMS = "";
  
  public static final String DEFAULT_IOS_LAST_READ_PARAMS = "";
  
  public static final String DEFAULT_LAST_CHAPTER_ID = "";
  
  public static final String DEFAULT_LAST_CHAPTER_INDEX = "";
  
  public static final String DEFAULT_LAST_CHAPTER_PAGE_ID = "";
  
  public static final String DEFAULT_LAST_CHAPTER_TITLE = "";
  
  public static final String DEFAULT_LAST_CHAPTER_UPDATE_TIME = "";
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String android_detail_params;
  
  @ProtoField(tag = 15, type = Message.Datatype.STRING)
  public final String android_last_charpter_params;
  
  @ProtoField(tag = 16, type = Message.Datatype.STRING)
  public final String android_last_read_params;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String author;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String author_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String book_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String book_name;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String gid;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String ios_detail_params;
  
  @ProtoField(tag = 14, type = Message.Datatype.STRING)
  public final String ios_last_charpter_params;
  
  @ProtoField(tag = 17, type = Message.Datatype.STRING)
  public final String ios_last_read_params;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String last_chapter_id;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String last_chapter_index;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String last_chapter_page_id;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String last_chapter_title;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String last_chapter_update_time;
  
  public Novel(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.book_id;
      if (str1 == null) {
        this.book_id = "";
      } else {
        this.book_id = str1;
      } 
      str1 = paramBuilder.gid;
      if (str1 == null) {
        this.gid = "";
      } else {
        this.gid = str1;
      } 
      str1 = paramBuilder.book_name;
      if (str1 == null) {
        this.book_name = "";
      } else {
        this.book_name = str1;
      } 
      str1 = paramBuilder.author_id;
      if (str1 == null) {
        this.author_id = "";
      } else {
        this.author_id = str1;
      } 
      str1 = paramBuilder.author;
      if (str1 == null) {
        this.author = "";
      } else {
        this.author = str1;
      } 
      str1 = paramBuilder.description;
      if (str1 == null) {
        this.description = "";
      } else {
        this.description = str1;
      } 
      str1 = paramBuilder.last_chapter_id;
      if (str1 == null) {
        this.last_chapter_id = "";
      } else {
        this.last_chapter_id = str1;
      } 
      str1 = paramBuilder.last_chapter_index;
      if (str1 == null) {
        this.last_chapter_index = "";
      } else {
        this.last_chapter_index = str1;
      } 
      str1 = paramBuilder.last_chapter_title;
      if (str1 == null) {
        this.last_chapter_title = "";
      } else {
        this.last_chapter_title = str1;
      } 
      str1 = paramBuilder.last_chapter_page_id;
      if (str1 == null) {
        this.last_chapter_page_id = "";
      } else {
        this.last_chapter_page_id = str1;
      } 
      str1 = paramBuilder.last_chapter_update_time;
      if (str1 == null) {
        this.last_chapter_update_time = "";
      } else {
        this.last_chapter_update_time = str1;
      } 
      str1 = paramBuilder.ios_detail_params;
      if (str1 == null) {
        this.ios_detail_params = "";
      } else {
        this.ios_detail_params = str1;
      } 
      str1 = paramBuilder.android_detail_params;
      if (str1 == null) {
        this.android_detail_params = "";
      } else {
        this.android_detail_params = str1;
      } 
      str1 = paramBuilder.ios_last_charpter_params;
      if (str1 == null) {
        this.ios_last_charpter_params = "";
      } else {
        this.ios_last_charpter_params = str1;
      } 
      str1 = paramBuilder.android_last_charpter_params;
      if (str1 == null) {
        this.android_last_charpter_params = "";
      } else {
        this.android_last_charpter_params = str1;
      } 
      str1 = paramBuilder.android_last_read_params;
      if (str1 == null) {
        this.android_last_read_params = "";
      } else {
        this.android_last_read_params = str1;
      } 
      str = paramBuilder.ios_last_read_params;
      if (str == null) {
        this.ios_last_read_params = "";
      } else {
        this.ios_last_read_params = str;
      } 
    } else {
      this.book_id = ((Builder)str).book_id;
      this.gid = ((Builder)str).gid;
      this.book_name = ((Builder)str).book_name;
      this.author_id = ((Builder)str).author_id;
      this.author = ((Builder)str).author;
      this.description = ((Builder)str).description;
      this.last_chapter_id = ((Builder)str).last_chapter_id;
      this.last_chapter_index = ((Builder)str).last_chapter_index;
      this.last_chapter_title = ((Builder)str).last_chapter_title;
      this.last_chapter_page_id = ((Builder)str).last_chapter_page_id;
      this.last_chapter_update_time = ((Builder)str).last_chapter_update_time;
      this.ios_detail_params = ((Builder)str).ios_detail_params;
      this.android_detail_params = ((Builder)str).android_detail_params;
      this.ios_last_charpter_params = ((Builder)str).ios_last_charpter_params;
      this.android_last_charpter_params = ((Builder)str).android_last_charpter_params;
      this.android_last_read_params = ((Builder)str).android_last_read_params;
      this.ios_last_read_params = ((Builder)str).ios_last_read_params;
    } 
  }
}
